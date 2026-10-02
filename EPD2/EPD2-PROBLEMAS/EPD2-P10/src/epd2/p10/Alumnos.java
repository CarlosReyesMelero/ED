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
public class Alumnos implements IAlumnos {

    private Set<IAlumno> alumnos;

    public Alumnos() {
        this.alumnos = new HashSet();
    }

    public Set<IAlumno> getAlumnos() {
        return alumnos;
    }

    public boolean añadirAlumno(IAlumno alumno) {
        return this.alumnos.add(alumno);
    }

    public boolean eliminarAlumno(IAlumno alumno) {
        return this.alumnos.remove(alumno);
    }

    public void borrarAlumnos() {
        this.alumnos.clear();
    }

    public Set<IAlumno> getNingunaAprobada() {
        Set<IAlumno> ningunaAprobada = new HashSet<>();
        Iterator<IAlumno> it = this.alumnos.iterator();
        while (it.hasNext()) {
            IAlumno alumno = it.next();

            if (alumno.getAprobadas().isEmpty()) {
                ningunaAprobada.add(alumno);
            }
        }
        return ningunaAprobada;
    }

    public Set<IAlumno> getMatriculado(IAsignatura asignatura) {
        Set<IAlumno> matriculadoEn = new HashSet<>();
        Iterator<IAlumno> it = this.alumnos.iterator();
        while (it.hasNext()) {
            IAlumno alumno = it.next();

            if (alumno.getMatriculadas().contains(asignatura)) {
                matriculadoEn.add(alumno);
            }
        }
        return matriculadoEn;
    }

    public Set<IAlumno> getMatriculadoEnTodas(Set<IAsignatura> asignaturas) {
        Set<IAlumno> matriculadoEnTodas = new HashSet<>();
        Iterator<IAlumno> it = this.alumnos.iterator();
        
        
        while (it.hasNext()) {
            IAlumno alumno = it.next();

            if (alumno.getMatriculadas().containsAll(asignaturas)) {
                matriculadoEnTodas.add(alumno);
            }
        }
        return matriculadoEnTodas;
    }
    
    public Set<IAlumno> getNoMatriculado(IAsignatura asignatura) {
        Set<IAlumno> noMatriculadoEn = new HashSet<>();
        Iterator<IAlumno> it = this.alumnos.iterator();
        while (it.hasNext()) {
            IAlumno alumno = it.next();

            if (!alumno.getMatriculadas().contains(asignatura)) {
                noMatriculadoEn.add(alumno);
            }
        }
        return noMatriculadoEn;
    }
    
    
    public Set<IAlumno> getNoMatriculadoEnNinguna(Set<IAsignatura> asignaturas) {
        Set<IAlumno> noMatriculadoEnNinguna = new HashSet<>();
        Iterator<IAlumno> it = this.alumnos.iterator();
        
        
        while (it.hasNext()) {
            IAlumno alumno = it.next();

            if (!alumno.getMatriculadas().containsAll(asignaturas)) {
                noMatriculadoEnNinguna.add(alumno);
            }
        }
        return noMatriculadoEnNinguna;
    }

    public Set<IAlumno> getAprobados(IAsignatura asignatura){
        Set<IAlumno> aprobadoAsignatura = new HashSet<>();
        Iterator<IAlumno> it = this.alumnos.iterator();
        
        while(it.hasNext()){
            IAlumno alumno = it.next();
            
            if(alumno.getAprobadas().contains(asignatura)){
                aprobadoAsignatura.add(alumno);
            }
        }
        return aprobadoAsignatura;
    }
    
    public Set<IAlumno> getAprobados(Set<IAsignatura> asignaturas){
        Set<IAlumno> aprobadoTodasAsignatura = new HashSet<>();
        Iterator<IAlumno> it = this.alumnos.iterator();
        
        while(it.hasNext()){
            IAlumno alumno = it.next();
            
            if(alumno.getAprobadas().containsAll(asignaturas)){
                aprobadoTodasAsignatura.add(alumno);
            }
        }
        return aprobadoTodasAsignatura;
    }
    
    public Set<IAlumno> getNoAprobados(IAsignatura asignatura){
        Set<IAlumno> noAprobadoAsignatura = new HashSet<>();
        Iterator<IAlumno> it = this.alumnos.iterator();
        
        while(it.hasNext()){
            IAlumno alumno = it.next();
            
            if(!alumno.getAprobadas().contains(asignatura)){
                noAprobadoAsignatura.add(alumno);
            }
        }
        return noAprobadoAsignatura;
    }
    
    public Set<IAlumno> getNoAprobados(Set<IAsignatura> asignaturas){
        Set<IAlumno> noAprobadoNinguna = new HashSet<>();
        Iterator<IAlumno> it = this.alumnos.iterator();
        
        while(it.hasNext()){
            IAlumno alumno = it.next();
            
            if(!alumno.getAprobadas().containsAll(asignaturas)){
                noAprobadoNinguna.add(alumno);
            }
        }
        return noAprobadoNinguna;
    }
    
    public Set<IAlumno> getMatriculadosYAprobados(Set<IAsignatura> asignaturasMatriculadas, Set<IAsignatura> asignaturasAprobadas){

        Set<IAlumno> matriculadosYAprobados = new HashSet<>();
        
        Iterator<IAlumno> it = this.alumnos.iterator();
        
        while(it.hasNext()){
            IAlumno alumno = it.next();
            
            if(alumno.getMatriculadas().containsAll(asignaturasMatriculadas) && alumno.getAprobadas().containsAll(asignaturasAprobadas)){
                matriculadosYAprobados.add(alumno);
            }
        
        }
        
        return matriculadosYAprobados;
    }
    
    
}
