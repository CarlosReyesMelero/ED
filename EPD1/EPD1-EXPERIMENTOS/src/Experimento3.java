/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import poo.io.IO;

public class Experimento3 {

    public static void main(String args[]) {
        
        // Declaramos una coleccion dinamica de enteros
        Collection<Integer> c = new ArrayList<>();
        //int[] v; Aqui queremos un array de numeros simples pero daria problema en v = c.toArray()
        
        // Array tradicional de objetos
        Object[] v;
        
        // Variable para guardar la cantidad de datos
        int elementos;
        
        // Pedimos la cantidad de datos y la recogemos con IO.readNumber()
        System.out.println("Introduzca el número de datos: ");
        elementos = (int) IO.readNumber();
        
        // Llenamos la coleccion pidiendole al usuario el valor y añadiendolo 
        // con add((int) IO.readNumber())
        for (int i = 0; i < elementos; i++) {
            System.out.println("Elemento " + (i + 1) + ": ");
            c.add((int) IO.readNumber());
        }
        //v = new Integer[c.size()];
        
        // Extraemos cada dato de la coleccion y se agrupa en el array con toArray()
        v = c.toArray();
        
        // Se imprimen los datos, indicando el numero del elemento y su valor
        for (int i = 0; i < v.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + v[i].toString());
        }
    }
        
   /* public static void main(String args[]) {
        Collection c = new ArrayList();
        int[] v;
        int elementos;
        System.out.println("Introduzca el número de datos: ");
        elementos = (int) IO.readLine();
        for (int i = 0; i < elementos; i++) {
            System.out.println("Elemento " + (i + 1) + ": ");
            c.add((int) IO.readNumber());
        }
        v = c.toArray();
        for (int i = 0; i < v.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + v[i].toString());
        }
    }*/
}
