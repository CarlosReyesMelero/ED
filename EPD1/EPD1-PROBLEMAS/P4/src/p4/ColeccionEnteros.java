/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p4;

import java.util.*;

/**
 *
 * @author carlo
 */
public class ColeccionEnteros implements IColeccionEnteros {

    private Collection<Integer> coleccion;

    public ColeccionEnteros() {
        this.coleccion = new ArrayList<Integer>();
    }

    @Override
    public void imprimir() {
        // Instanciamos el iterador 
        Iterator<Integer> it = this.coleccion.iterator();
        
        // Bucle que mientras haya un numero despues en la coleccion, se imprima el numero y pase al siguiente
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    @Override
    public int coincideSumaElementos(int x) {
    int suma = 0;      // Acumulador de la suma de los primeros elementos
    int contador = 0;  // Contador de elementos procesados consecutivamente
    
    // Obtenemos el iterador para recorrer la colección secuencialmente
    Iterator<Integer> it = this.coleccion.iterator();
    
    // Recorremos la colección mientras queden elementos disponibles
    while (it.hasNext()) {
        // Acumulamos el valor del siguiente entero y actualizamos el contador
        suma += it.next();
        contador++;
        
        // Si la suma acumulada coincide con el valor objetivo x,
        // devolvemos inmediatamente el número de elementos sumados
        if (suma == x) {
            return contador;
        }
    }
    
    // Si se recorre toda la colección sin alcanzar la suma exacta, se devuelve -1
    return -1;
}

    @Override
    public Collection<Integer> getColecion() {
        return coleccion;    
    }

}
