/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ej1;
import java.util.*;

/**
 *
 * @author carlo
 */
public interface IGrupoAlumnos {
    
    public Collection<IAlumno> getColeccion();
    public void imprimir();
    public boolean add(IAlumno alumno);
    public void eliminarMayoresDe();
    
}
