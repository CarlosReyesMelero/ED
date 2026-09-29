/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1;

/**
 *
 * @author carlo
 */
public class EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IGrupoAlumnos grupo = new GrupoAlumnos();
        
        // Añadimos alumnos mezclando edades
        grupo.add(new Alumno("Juan", "Pérez", "1111A", 25));
        grupo.add(new Alumno("Ana", "López", "2222B", 35));   // Mayor de 30
        grupo.add(new Alumno("Luis", "García", "3333C", 20));
        grupo.add(new Alumno("Marta", "Díaz", "4444D", 42));  // Mayor de 30
        
        System.out.println("=== GRUPO ORIGINAL ===");
        grupo.imprimir();
        
        // Ejecutamos el borrado
        grupo.eliminarMayoresDe();
        
        System.out.println("\n=== GRUPO TRAS ELIMINAR MAYORES DE 30 ===");
        grupo.imprimir(); // Solo deberían quedar Juan y Luis
    }
    
}
