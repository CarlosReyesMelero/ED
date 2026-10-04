/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package epd1.p5;

/**
 *
 * @author carlo
 */
public class EPD1P5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Diccionario miDiccionario = new Diccionario();
        
        Entrada ent1 = new Entrada("Clase", "Plantilla para crear objeto");
        Entrada ent2 = new Entrada("Iterator", "Objeto para recorrer colecciones");
        Entrada ent3 = new Entrada("Java", "Lenguaje de programacion orientado a objetos");
        
        miDiccionario.incluirEntrada(ent1);
        miDiccionario.incluirEntrada(ent2);
        miDiccionario.incluirEntrada(ent3);
        
        miDiccionario.incluirEntrada(new Entrada("Java", "Definicion de prueba"));
        
        System.out.println("Definicion de ITERATOR: " + miDiccionario.buscarDefinicion("Iterator"));
        System.out.println("Definicion de Python: " + miDiccionario.buscarDefinicion("Python"));
        
        
        System.out.println("\n Borrando la palabra 'Clase': ...");
        miDiccionario.eliminarEntrada("Clase");
        
        System.out.println("Definicion de 'Clase' tras borrrarla: " + miDiccionario.buscarDefinicion("Clase"));
        
    }
    
}
