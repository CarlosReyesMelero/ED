/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package epd1.p13;

import java.util.*;

/**
 *
 * @author carlo
 */
public class EPD1P13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // 1. Creamos la coleccion
        Collection<ICandidatos> lista = new ArrayList<>();
        
        // 2. Creamos los candidatos
        Candidato c1 = new Candidato("Carlos", 1.70, 58.8);
        lista.add(c1);
        
        Candidato c2 = new Candidato("Javi", 1.50, 50.8);
        lista.add(c2);
        
        Candidato c3 = new Candidato("Pau", 1.60, 90.0);
        lista.add(c3);
        
        Candidato c4 = new Candidato("Fran", 1.80, 65.5);
        lista.add(c4);

        // 4. Invocamos el metodo y comprobamos los resultados
        eliminarCandidato(lista);
        System.out.println("Candidatos que pasan el corte");
        for(ICandidatos p : lista){
            System.out.println(p.getNombre());
        }
        
    }
    
    // 3. Metodo asociado a la clase
    public static void eliminarCandidato(Collection<ICandidatos> candidato){
        
        // Obtenemos el iterador de la coleccion
        Iterator<ICandidatos> it = candidato.iterator();
        
        // Recorremos todos los elementos
        while(it.hasNext()){
            // Extraemos el objeto actual y pasamos al siguiente
            ICandidatos piloto = it.next();
            // Comprobamos segun el corte dado
            if(piloto.getAltura() > 1.75 || piloto.getPeso() >= 70.00 ){
                // Eliminamos en caso de no pasar el corte
                it.remove();
            }
        }
    }
    
}
