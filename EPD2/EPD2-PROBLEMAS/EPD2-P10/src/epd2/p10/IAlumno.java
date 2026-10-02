/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package epd2.p10;

import java.util.*;

/**
 *
 * @author carlo
 */
public interface IAlumno {
    
    public String getDNI();
    public void setDNI(String dni);
    public String getNombre();
    public void setNombre(String nombre);
    
    public Set<IAsignatura> getAprobadas();
    public boolean añadirAprobada(IAsignatura asignatura);
    public boolean eliminarAprobada(IAsignatura asignatura);
    public void borrarTodasAprobadas();
    
    public Set<IAsignatura> getMatriculadas();
    public boolean añadirMatriculada(IAsignatura asignatura);
    public boolean eliminarMatriculada(IAsignatura asignatura);
    public void borrarMatriculadas();
    
    
    
}
