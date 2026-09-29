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
public class EXP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        for (int i = 5; i >= 0; i--) {
            l.add(i * 10);
        }
        System.out.println("Lista: " + l);
        Collections.sort(l);                                                    // Linea AÑADIDA
        int posicion = Collections.binarySearch(l, 20);                         // Para que binarySearch() funciones la lista debe estar ordenada
        if (posicion >= 0) {
            System.out.println("El 20 está en la posición " + posicion + " de la lista");
        } else {
            System.out.println("No está el número 20 en la lista");
        }
        
        System.out.println("El elemento maximo es: " + Collections.max(l));
        System.out.println("El elemento maximo es: " + Collections.min(l));
    }

}
