/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

public class Experimento6 {

    public static void main(String[] args) {
        Collection c = new ArrayList();
        Iterator it;                                                // Referencia al iterador
        for (int i = 1; i <= 10; i++)                               // Rellenamos la coleccion del 1 al 10
        {
            c.add(i);
        }
        it = c.iterator();                                          // Obtenemos un iterador para la colección
        while (it.hasNext()) {                                      // Mientras haya más elementos
            Integer i = (Integer) it.next();                        // Extraemos el numero al que referenciamos
            if (i.intValue() % 2 == 0 || i.intValue() % 3 == 0) {   // Si es par o multiplo de 3
                it.remove();                                        // Si se cumple -> se borra
            }
           /* if (i.intValue() % 3 == 0) {
                it.remove();
            }*/
        }
        it = c.iterator();                                          // Obtenemos un iterador para la colección
        while (it.hasNext())                                        // Mientras haya más elementos
        {
            System.out.println((Integer) it.next());                // Imprimimos el siguiente elemento
        }
    }
}

// IMPORTANTE: cada vez que se ejecute it.next() solo se puede llamar a it.remove() una sola vez
/** Siempre que necesites borrar elementos bajo múltiples criterios, debes agrupar todas las condiciones 
en un único if utilizando operadores lógicos como el || (O lógico), garantizando así que la orden de borrado 
solo se procese una vez por cada avance del iterador.
**/