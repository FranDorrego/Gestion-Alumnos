package universidad.Entidades;

public class Inscripcion {
   private int idInscripcion;
   private Alumno alumno;
   private Materia materia;
   private double nota;
   private boolean estado;
    
    public Inscripcion(){
        alumno = new Alumno();
        materia = new Materia();
    }

    public Inscripcion(int idInscripcion, Alumno alumno, Materia materia, double nota, boolean estado) {
        this.idInscripcion = idInscripcion;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
        this.estado = estado;
    }

    public Inscripcion(Alumno alumno, Materia materia, double nota, boolean estado) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
        this.estado = estado;
    }

    public Inscripcion(double nota) {
        this.nota = nota;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "idInscripcion=" + idInscripcion + ", alumno=" + alumno + ", materia=" + materia + ", nota=" + nota + ", estado=" + estado + '}';
    }
    
    
    
}
