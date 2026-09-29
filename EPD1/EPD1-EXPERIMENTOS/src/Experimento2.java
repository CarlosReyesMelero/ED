/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

public class Experimento2 {

    public static void main(String[] args) {
        
        // Coleccion que almacena enteros
        Collection <Integer> c = new ArrayList<>();
        
        // Coleccion que almacena textos
        Collection <String> d = new ArrayList<>();
        
        // Declaram un iteratos especializado en numeros, sin inicializarla
        Iterator<Integer> it;
        
        // Se añade elemenos a ambas colecciones
        for (int i = 0; i < 5; i++) {
            c.add(i * 3);
            d.add(String.valueOf(3.1416 * i));
        }
        
        // Imprimimos el contenido de cada coleccion
        System.out.println("La colección c contiene: " + c);
        System.out.println("La colección d contiene: " + d);
        
        // Ahora si inicializamos el iterador, se coloca antes del primer elemento de c y sirve para recorrer de forma segura la coleccion
        it=c.iterator();
        
        // Comprobamos que queden elementos en la coleccion, cuando llega al ultimo devuelve FALSE y se para
        while(it.hasNext())
        {
            // Añade en d el valor de c, convirtiendo el tipo a String y apuntando al siguiente (it.next())
            d.add(String.valueOf(it.next()));
        }
        
        /*d.addAll(c);*/
        // Conserva en la colección únicamente los elementos que también existan
        // en la colección  asada por parámetro (intersección) y borra el resto
        d.retainAll(d);         
        System.out.println("Despues de d.addAll(c) la colección d contiene: " + d);
        
        // Se intenta hacer la intersección entre d y c (dejar en d solo los elementos
        // que también estén en c). Solo muestra los de c ya que los de d no estan en c
        d.retainAll(c);
        System.out.println("Despues de d.retainAll(c) la colección d contiene: " + d);
        
        // Elimina de d cualquier elemento que coincida con alguno de los 
        // presentes en c (diferencia o resta de conjuntos).
        d.removeAll(c);
        System.out.println("Despues de d.removeAll(c) la colección d contiene: " + d);
        
      
    }
}
