package UniversidadMain;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import universidad.Entidades.*;
import universidad.AccesoADatos.Conexion;
import universidad.AccesoADatos.InscripcionData;

public class UniversidadG5 {

    public static void main(String[] args) {
        
         
////        Alumno juan = new Alumno(3,123123123,"Juan Pedro","Luna",LocalDate.of(1980, 4, 25),true);
//        AlumnoData alu = new AlumnoData();
////        alu.guardarAlumno(juan);
////        alu.modificarAlumno(juan);
////       alu.eliminarAlumno(3);
////        Alumno alumnoEncontrado = alu.buscarAlumnoPorId(3);
////        System.out.println(alumnoEncontrado);
//        
////        for (Alumno arg : alu.listarAlumnos()) {
////            System.out.println(arg.getDni());
////            System.out.println(arg.getApellido());
////        }
//        
//        Materia materia1 = new Materia("Lengua", 2, true);
//        Materia materia2 = new Materia("Matematica", 3, true);
//        Materia materia3 = new Materia("RRSS", 1, true);
//        Materia materia4 = new Materia("Sociales", 1, true);
//        
//        
//        MateriaData consultaMaterias = new MateriaData();
//        
//        
//        consultaMaterias.guardarMateria(materia1);
//        consultaMaterias.guardarMateria(materia2);
//        consultaMaterias.guardarMateria(materia3);
//        consultaMaterias.guardarMateria(materia4);
////        
////        
//        consultaMaterias.eliminarMateria(materia2.getIdMateria());

       /* InscripcionData inscripciones = new InscripcionData();
        
        ArrayList<Materia> materias = (ArrayList<Materia>) inscripciones.optenerMateriasNOCurasdas(9);
        
        for (Materia materia : materias) {
            System.out.println(materia); 
        }*/ // COMENTE ESTO**
        
        
//        InscripcionData inscripcion = new InscripcionData();
//        List<Materia> materias = inscripcion.optenerMateriasNOCurasdas(10);
//        for (Materia materia : materias) {
//            System.out.println(materia.getIdMateria());
//        // era apra probar lo de cargar materias no cursadas porque no andaba xd
//        }
                
      
    }
    
}
