/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package epd2.p10;

import java.util.Set;

/**
 *
 * @author carlo
 */
interface IAlumnos {
    
    public Set<IAlumno> getAlumnos();
    public boolean añadirAlumno(IAlumno alumno);
    public boolean eliminarAlumno(IAlumno alumno);
    public void borrarAlumnos();
    
}
