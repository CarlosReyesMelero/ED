/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ej1;

/**
 *
 * @author carlo
 */
public interface IEmpleado {    
    public String getNombre();
    public String setNombre(String nombre);
    public String getApellidos();
    public String setApellidos(String apellidos);
    public int getEdad();
    public int setEdad(int edad);
    public float getSueldo();
    public float setSueldo(float sueldo);
    public IFecha getfechaDeIncorporacion();
    public IFecha setfechaDeIncorporacion(IFecha fechaDeIncorporacion);
    
    
}
