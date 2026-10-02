/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package epd2.p10;

import java.util.Objects;

/**
 *
 * @author carlo
 */
public class Asignatura implements IAsignatura{
    private String nombre;
    private String curso;

    public Asignatura(String nombre, String curso) {
        this.nombre = nombre;
        this.curso = curso;
    }

    @Override
    public String getCurso() {
        return curso;    
    }

    @Override
    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        hash = 37 * hash + Objects.hashCode(this.curso);
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
        final Asignatura other = (Asignatura) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.curso, other.curso);
    }

    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", curso=" + curso + '}';
    }
    
    
}
