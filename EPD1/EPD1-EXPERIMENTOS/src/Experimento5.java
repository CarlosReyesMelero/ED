/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

public class Experimento5 {

    public static void main(String[] args) {
        Collection c = new ArrayList();                         // Creamos la coleccion
        Iterator it;                                            // Referencia al iterador
        for (int i = 1; i <= 11; i++)                           // Rellenamos la coleccion
        {
            c.add(i);
        }
        it = c.iterator();                                      // Obtenemos un iterador para la colección
        Integer j = 0;
        while (it.hasNext()) {                                  // Mientras haya más elementos
            Integer i = (Integer) it.next();                    // Sacamos el elemento y lo metemos en i
            if (it.hasNext()) {                                 // Si hay un elemento mas
                j = (Integer) it.next();                        // se guarda en j
            } else {
                j = 0;                                          // Si no hay mas, j = 0
            }
            System.out.println(i.intValue() + j.intValue());    // Imprimimos la suma

        }
    }
}

/**
IMPORTANTE: La condición while (it.hasNext()) te da permiso para usar un único it.next() de forma segura. 
Si el enunciado de un examen te pide comparar elementos adyacentes o saltar de dos en dos, 
cada vez que escribas un next() adicional dentro del mismo bucle, deberás rodearlo obligatoriamente 
con un if (it.hasNext()) para evitar que el código reviente al quedarse sin elementos.
**/
