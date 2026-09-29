import java.util.*;

public class Experimento1 {

    public static void main(String[] args) {
        
        // Se declara el tipo generico (Integer = va contener numeros enteros y a la derecha se instancia la clase concreta
        Collection<Integer> collectionEnteros = new ArrayList<>();      

        // Uso de size() para ver los elementos que hay guardados
        // Uso de isEmpty() para ver se ha añadido o no algo
        System.out.println("La colección tiene " + collectionEnteros.size() + " elementos");
        if (collectionEnteros.isEmpty()) {
            System.out.println("La colección está vacía");
        }

        // Se añade elementos a la coleccion, en cada vuelta se calcula ix3 y se añade (0,3,6,9 y 12)
        for (int i = 0; i < 5; i++) // Añadimos elementos a la colección
        {
            collectionEnteros.add(i * 3);
        }
        
        // Se calcula el tamaño de la coleccion con size()
        System.out.println("La colección tiene " + collectionEnteros.size() + " elementos");

        // Se imprime los elementos de la coleccion
        System.out.println("La colección contiene: " + collectionEnteros);
    }
}
