/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.*;

/**
 *
 * @author carlo
 */
public class EXP7 {

    public static void main(String[] args) {
        String[] palabras = {"en", "un", "lugar", "de", "la", "mancha"};
        SortedSet<String> ss = new TreeSet();
        for (int i = 0; i < palabras.length; i++) {
            ss.add(palabras[i]);
        }
        System.out.println("ss: " + ss);
        System.out.println("Primera palabra: " + ss.first());
        System.out.println("Última palabra: " + ss.last());
        System.out.println("Palabras entre la letra g y la r: " + ss.subSet("g", "r"));
        System.out.println("Palabras desde la palabra \"lugar\" : " + ss.tailSet("lugar"));
        System.out.println("Palabras hasta la palabra \"lugar\" : " + ss.headSet("lugar"));
    }

}
