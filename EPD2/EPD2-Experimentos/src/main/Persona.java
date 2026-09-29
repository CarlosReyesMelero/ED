/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author carlo
 */
public class Persona implements IPersona {

    private int edad;

    public Persona(int edad) {
        setEdad(edad);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String toString() {
        return String.valueOf(edad);
    }
    
    public int compareTo(IPersona p1){
        return this.edad - p1.getEdad();
    }


}
