/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package epd1.p5;

import java.util.Objects;

/**
 *
 * @author carlo
 */

public class Entrada implements IEntrada{
    
    private String palabra;
    private String definicion;

    public Entrada(String palabra, String definicion) {
        this.palabra = palabra;
        this.definicion = definicion;
    }

    @Override
    public String getPalabra() {
        return palabra;
    }

    @Override
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public String getDefinicion() {
        return definicion;
    }

    @Override
    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.palabra);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Entrada other = (Entrada) obj;
        if (!Objects.equals(this.palabra, other.palabra)) {
            return false;
        }
        return Objects.equals(this.definicion, other.definicion);
    }

    @Override
    public String toString() {
        return palabra + ": " + definicion;
    }
    
    
    
    
    
}
