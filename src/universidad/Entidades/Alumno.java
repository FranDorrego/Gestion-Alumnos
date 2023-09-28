/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.Entidades;

import java.time.LocalDate;

/**
 *
 * @author VILLORD
 */
public class Alumno {
    private int idAlumno;
    private int dni;
    private String nombre;
    private String apellido;
    private boolean activo;
    private LocalDate fNac;
    
    
    public Alumno(){}

    public Alumno(int idAlumno, int dni, String nombre, String apellido, LocalDate fNac, boolean  activo) {
        this.idAlumno = idAlumno;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.activo = activo;
        this.fNac = fNac;
    }

    public Alumno(int dni, String nombre, String apellido, LocalDate fNac, boolean activo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.activo = activo;
        this.fNac = fNac;
        
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public LocalDate getfNac() {
        return fNac;
    }

    public void setfNac(LocalDate fNac) {
        this.fNac = fNac;
    }

    @Override
    public String toString() {
        return   "DNI: " + dni + " | Nombre: " + nombre + " | Apellido: " + apellido;
    }
    
    public void suts(){
        System.out.println("actualizado");
    }
    
}
