/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ej1;

/**
 *
 * @author carlo
 */
public interface IAlumno {
    public String getNombre();
    public void setNombre(String nombre);
    public String getApellidos();
    public void setApellidos(String apellidos);
    public String getDNI();
    public void setDNI(String dni);
    
    public int getEdad();
    public void setEdad(int edad);

    @Override
    public String toString();
    
    
    
}
