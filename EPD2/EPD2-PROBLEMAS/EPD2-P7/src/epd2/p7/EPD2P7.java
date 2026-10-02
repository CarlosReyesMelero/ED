/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package epd2.p7;

import java.util.*;

/**
 *
 * @author carlo
 */
public class EPD2P7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Rectangulo> lista = new ArrayList<>();
        
        lista.add(new Rectangulo(5,2));
        lista.add(new Rectangulo(5,5));
        lista.add(new Rectangulo(5,3));
        lista.add(new Rectangulo(3,4));
        lista.add(new Rectangulo(4,2));
        lista.add(new Rectangulo(6,4));
        lista.add(new Rectangulo(2,2));
        
        
        System.out.println("--- ORDEN NATURAL ---");
        Collections.sort(lista);
        
        for (int i = 0; i < lista.size(); i++) {
            Rectangulo r = lista.get(i);
            System.out.println("Largo: " + r.getLargo() + "| Ancho: " + r.getAncho() + "| Area: " + r.getArea());
        }
        
        
        System.out.println("--- ORDEN LARGO -> ANCHO ---");
        Collections.sort(lista, new ComparadorLargoAncho());
        for (int i = 0; i < lista.size(); i++) {
            Rectangulo r = lista.get(i);
            System.out.println("Largo: " + r.getLargo() + "| Ancho: " + r.getAncho() + "| Area: " + r.getArea());
        }
        
        System.out.println("--- ORDEN ANCHO -> LARGO ---");
        Collections.sort(lista, new ComparadorAnchoLargo());
        for (int i = 0; i < lista.size(); i++) {
            Rectangulo r = lista.get(i);
            System.out.println("Largo: " + r.getLargo() + "| Ancho: " + r.getAncho() + "| Area: " + r.getArea());
        }
        
        
        
    }
    
}
