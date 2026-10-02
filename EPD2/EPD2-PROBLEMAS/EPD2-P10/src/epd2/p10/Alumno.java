/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package epd2.p10;

import java.util.*;

/**
 *
 * @author carlo
 */
public class Alumno implements  IAlumno {
    
    private String nombre;
    private String dni;
    private Set<IAsignatura> aprobadas;
    private Set<IAsignatura> matriculadas;

    public Alumno(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.aprobadas = new HashSet();
        this.matriculadas = new HashSet();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return dni;
    }

    public void setDNI(String dni) {
        this.dni = dni;
    }
    
    public Set<IAsignatura> getAprobadas(){
        return this.aprobadas;
    }
    
    public Set<IAsignatura> getMatriculadas(){
        return this.matriculadas;
    }
    
    public boolean añadirAprobada(IAsignatura asignatura){
        return this.aprobadas.add(asignatura);
    }
    
    public boolean eliminarAprobada(IAsignatura asignatura){
        return this.aprobadas.remove(asignatura);
    }
    
    public void borrarTodasAprobadas(){
        this.aprobadas.clear();
    }
    
    public boolean añadirMatriculada(IAsignatura asignatura){
        return this.matriculadas.add(asignatura);
    }
    
    public boolean eliminarMatriculada(IAsignatura asignatura){
        return this.matriculadas.remove(asignatura);
    }
    
    public void borrarMatriculadas(){
        this.matriculadas.clear();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.dni);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        return Objects.equals(this.dni, other.dni);
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", dni=" + dni + ", asignaturas matriculadas=" + matriculadas + ", asignaturas aprobadas=" + aprobadas + '}';
    }
}
