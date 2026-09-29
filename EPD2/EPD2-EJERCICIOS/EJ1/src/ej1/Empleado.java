/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

/**
 *
 * @author carlo
 */
public class Empleado {
    
    private String nombre;
    private String apellidos;
    private int edad;
    private int sueldo;
    private IFecha fechaDeIncorporacion;

    public Empleado() {
    }

    public Empleado(String nombre, String apellidos, int edad, int sueldo, IFecha fechaDeIncorporacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sueldo = sueldo;
        this.fechaDeIncorporacion = fechaDeIncorporacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public IFecha getFechaDeIncorporacion() {
        return fechaDeIncorporacion;
    }

    public void setFechaDeIncorporacion(IFecha fechaDeIncorporacion) {
        this.fechaDeIncorporacion = fechaDeIncorporacion;
    }

    
    

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", sueldo=" + sueldo + ", fechaDeIncorporacion=" + fechaDeIncorporacion + '}';
    }
    
    public int compareTo(Empleado o) {
        
        Empleado e =(Empleado)o;
         
        // Comparamos los apellidos
        int comparacionApellidos = this.apellidos.compareTo(e.getApellidos());
        
        // Si los apellidos son exactamente iguales (da 0), desempatamos por el nombre
        if (comparacionApellidos == 0) {
            comparacionApellidos = this.nombre.compareTo(e.getNombre());
        }
         
        return comparacionApellidos;
    }
}
