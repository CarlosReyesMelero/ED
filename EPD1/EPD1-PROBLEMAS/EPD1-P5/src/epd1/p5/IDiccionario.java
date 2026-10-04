/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package epd1.p5;

/**
 *
 * @author carlo
 */
public interface IDiccionario {
    
    boolean incluirEntrada(Entrada e);
    boolean eliminarEntrada(String palabraABorrar);
    String buscarDefinicion(String palabraABuscar);
    
}
