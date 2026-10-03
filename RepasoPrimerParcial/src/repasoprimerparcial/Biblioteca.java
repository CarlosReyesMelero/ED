/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoprimerparcial;

import java.util.*;

/**
 *
 * @author carlo
 */
public class Biblioteca {

    private List<Ejemplar> listaEjemplares;

    public Biblioteca() {
        this.listaEjemplares = new ArrayList<>();
    }

    
    
    public Biblioteca(List<Ejemplar> listaEjemplares) {
        this.listaEjemplares = listaEjemplares;
    }

    public boolean anadirEjemplar(Ejemplar ejemplar) {
        if (!listaEjemplares.contains(ejemplar)) {
            listaEjemplares.add(ejemplar);
            return true;
        }
        return false;
    }

    public boolean eliminarEjejmplar(Ejemplar ejemplar) {
        return listaEjemplares.remove(ejemplar);
    }

    public void mostrarEjemplaresOrdenados(){
        if ( listaEjemplares.isEmpty()){
            System.out.println("No hay ejemplares en la biblioteca");
            return;
        }
        
        List<Ejemplar> listaOrdenada = new ArrayList<>(listaEjemplares);
        Collections.sort(listaOrdenada);
        
        for (int i = 0; i < listaOrdenada.size(); i++) {
            System.out.println(listaOrdenada.get(i));
        }
    }
    
    public void mostrarLibrosPorAutor(String autorBuscado){
        boolean encontrado = false;
        System.out.println("\n === LIBROS DEL AUTOR: " + autorBuscado + " ===");
        Iterator<Ejemplar> it = listaEjemplares.iterator();
        
        while(it.hasNext()){
            Ejemplar e = it.next();
            if(e.getAutor().equalsIgnoreCase(autorBuscado)){
                System.out.println(e);
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("Este autor no tiene ningun libro");
        }
    }
    
    public Ejemplar getEjemplarMayorPrestamos(){
        if ( listaEjemplares.isEmpty()) return null;
        
        return Collections.max(listaEjemplares, new Comparator<Ejemplar>() {
            @Override
            public int compare(Ejemplar o1, Ejemplar o2) {
                return Integer.compare(o1.getNumeroPrestamos(), o2.getNumeroPrestamos());
            }
        });
    }
    
    public Ejemplar getEjemplarMenorPaginas(){
        if( listaEjemplares.isEmpty() ) return null;
        
        return Collections.min(listaEjemplares, new Comparator<Ejemplar>() {
            @Override
            public int compare(Ejemplar o1, Ejemplar o2) {
                return Integer.compare(o1.getNumeroPaginas(), o2.getNumeroPaginas());
            }
        });
    }
    
    public int getTotalPrestamos(){
        int total = 0;
        Iterator<Ejemplar> it = listaEjemplares.iterator();
        
        while(it.hasNext()){
            Ejemplar e = it.next();
            total += e.getNumeroPrestamos();
        }
        return total;
    }
    
}
