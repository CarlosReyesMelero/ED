/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author carlo
 */
import java.util.*;

public class EXP4 {

    public static void main(String[] args) {
        Collection c = new ArrayList();
        for (int i = 0; i < 5; i++) {
            c.add(new Persona(i * 10));
        }
        System.out.println("Edades: " + c);
        System.out.println("Maxima edad: " + Collections.max(c));
        System.out.println("Minima edad: " + Collections.min(c));
    }
}
