/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.*;

/**
 *
 * @author carlo
 */
public class EXP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos las dos listas
        List<Integer> l, m;
        l = new ArrayList<Integer>();
        m = new ArrayList<Integer>();
        
        // Añadimos del 1 al 5 en la lista l
        for (int i = 0; i < 5; i++) {
            l.add(i);
        }
        
        m.addAll(l);
        
        System.out.println("Lista l: " + l);
        
        // Copiamos l en m
        Collections.copy(m, l);
        System.out.println("Lista m: " + m);
        
        // Da un error porque la lista m no esta inicializada, por lo que tenemos que añadir la linea "m.addAll(l)"
    }

}
