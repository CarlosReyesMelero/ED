/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoprimerparcial;

import java.util.Objects;

/**
 *
 * @author carlo
 */
public class Ejemplar implements Comparable<Ejemplar>, IEjemplar{
    
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String formato;
    private int numeroPaginas;
    private String editorial;
    private int numeroPrestamos;

    public Ejemplar() {
    }

    public Ejemplar(String titulo, String autor, int anioPublicacion, String formato, int numeroPaginas, String editorial, int numeroPrestamos) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.formato = formato;
        this.numeroPaginas = numeroPaginas;
        this.editorial = editorial;
        this.numeroPrestamos = numeroPrestamos;
    }

    
    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    @Override
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public String getFormato() {
        return formato;
    }

    @Override
    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String getEditorial() {
        return editorial;
    }

    @Override
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public int getNumeroPrestamos() {
        return numeroPrestamos;
    }

    @Override
    public void setNumeroPrestamos(int numeroPrestamos) {
        this.numeroPrestamos = numeroPrestamos;
    }

    @Override
    public int compareTo(Ejemplar o) {
        return this.titulo.compareTo(o.titulo);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.titulo);
        hash = 53 * hash + Objects.hashCode(this.autor);
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
        final Ejemplar other = (Ejemplar) obj;
        if(!Objects.equals(this.titulo, other.titulo)){
            return false;
        }
        
        return Objects.equals(this.autor, other.autor);
    }

    @Override
    public String toString() {
        return "Ejemplar{" + "titulo=" + titulo + ", autor=" + autor + ", anioPublicacion=" + anioPublicacion + ", formato=" + formato + ", numeroPaginas=" + numeroPaginas + ", editorial=" + editorial + ", numeroPrestamos=" + numeroPrestamos + '}';
    }

}
