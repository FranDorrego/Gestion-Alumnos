package universidad.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidad.Entidades.*;

public class InscripcionData {

    private Connection con = null;
    private MateriaData matData;
    private AlumnoData aluData;

    public InscripcionData() {
        con = Conexion.getConexion();
        matData = new MateriaData();
        aluData = new AlumnoData();
    }

    public void guardarInscripcion(Inscripcion insc) {
        String sql = "insert into inscripcion(nota,idAlumno,idMat,estado)"
                + "values(?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3, insc.getMateria().getIdMateria());
            ps.setBoolean(4, insc.isEstado());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                insc.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se cargo la inscripcion de forma exitosa");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
    }

    public List<Inscripcion> obtenerInscripcion() {
        String sql = "SELECT* FROM inscripcion WHERE estado = 1";
        ArrayList<Inscripcion> inscripciones = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Inscripcion inscr = new Inscripcion();
                inscr.setIdInscripcion(rs.getInt("idInscripto"));
                inscr.setNota(rs.getDouble("nota"));
                inscr.getAlumno().setIdAlumno(rs.getInt("idAlumno"));
                inscr.getMateria().setIdMateria(rs.getInt("idMat"));
                inscr.setEstado(true);

                inscripciones.add(inscr);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inscripciones");
        }
        return inscripciones;
    }

    public List<Inscripcion> obtenerInscripcionPorAlumno(int id) {
        String sql = "SELECT * , if(inscripcion.nota > 0, inscripcion.nota , null) as nota1 FROM inscripcion JOIN materias ON materias.idMateria = inscripcion.idMat WHERE idAlumno = ? and inscripcion.estado = 1";
        ArrayList<Inscripcion> inscripciones = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Inscripcion inscr = new Inscripcion();
                inscr.setIdInscripcion(rs.getInt("idInscripto"));
                inscr.setNota(rs.getDouble("nota1"));
                inscr.getAlumno().setIdAlumno(id);
                inscr.getMateria().setIdMateria(rs.getInt("idMat"));
                inscr.getMateria().setNombre( rs.getString("nomMat") );
                inscr.setEstado(true);

                inscripciones.add(inscr);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inscripciones");
        }
        return inscripciones;
    }

    public List<Materia> obstenerMateriasCursadas(int id) {
        String sql = "SELECT inscripcion.idMat, nomMat, año FROM inscripcion JOIN materias"
                + " ON(inscripcion.idMat = materias.idMateria) WHERE inscripcion.idAlumno = ? and inscripcion.estado = 1";
        ArrayList<Materia> materias = new ArrayList<Materia>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("inscripcion.idMat"));
                materia.setNombre(rs.getString("nomMat"));
                materia.setAnioMateria(rs.getInt("año"));

                materias.add(materia);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener inscripciones " + ex.getMessage());
        }
        return materias;
    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {

        String sql = "UPDATE inscripcion SET estado = 0 WHERE estado = 1 and idAlumno =" + idAlumno + " and idMat=" + idMateria;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            int exito = ps.executeUpdate();
            if (exito != 0) {
                JOptionPane.showMessageDialog(null, "Inscripción eliminada");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar la inscripción");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripciones");
        }
    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        String sql = "UPDATE inscripcion SET nota ='" + nota + "' WHERE idAlumno=" + idAlumno + " and idMat=" + idMateria;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se ha modificado la nota exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar la nota");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripciones");
        }
    }

    public List<Alumno> obtenerAlumnosXMateria(int idMateria) {
        String sql = "SELECT alumno.* FROM alumno JOIN inscripcion ON(alumno.idAlumno = inscripcion.idAlumno) WHERE inscripcion.idMat = " + idMateria;
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Alumno alumno;
            while (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setfNac(rs.getDate("fechadn").toLocalDate());
                alumno.setActivo(true);

                alumnos.add(alumno);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla alumnos");
        }
        return alumnos;
    }

    public List<Materia> optenerMateriasNOCurasdas(int idAlumno) {
        
        // Hay que testear esto 12/09
        String sql = "SELECT * \n"
                + "from materias as m\n"
                + "WHERE m.idMateria not in (SELECT idMat FROM inscripcion WHERE idAlumno = ? and inscripcion.estado = 1)";

        ArrayList<Materia> materias = new ArrayList<Materia>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno); // tuve que setear el id acá porque si no me daba error 
            ResultSet rs = ps.executeQuery();
            Materia materia;
            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria")); // esto estaba mal, entaban trayendo id de inscripcion.idMat
                materia.setNombre(rs.getString("nomMat"));
                materia.setAnioMateria(rs.getInt("año"));
                materias.add(materia);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener inscripciones " + ex.getMessage());
        }
        return materias;
    }
}
