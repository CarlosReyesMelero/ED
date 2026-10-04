/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package epd1.p5;

import java.util.*;

/**
 *
 * @author carlo
 */
public class Diccionario implements IDiccionario{
    
    private Collection<Entrada> entradas;

    public Diccionario() {
        this.entradas = new ArrayList<>();
    }
    
    @Override
    public boolean incluirEntrada(Entrada e) {
        if(!entradas.contains(e)){
            return entradas.add(e);
        }
        return false;
    }

    @Override
    public boolean eliminarEntrada(String palabraABorrar) {
        Iterator<Entrada> it = entradas.iterator();
        
        while(it.hasNext()){
            Entrada e = it.next();
            if(e.getPalabra().equalsIgnoreCase(palabraABorrar)){
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public String buscarDefinicion(String palabraABuscar) {
        Iterator<Entrada> it = entradas.iterator();
        
        while(it.hasNext()){
            Entrada e = it.next();
            if(e.getPalabra().equalsIgnoreCase(palabraABuscar)){
                it.remove();
                return e.getDefinicion();
            }
        }
        return "Palabra no encontrada";
    }
    
    
}
