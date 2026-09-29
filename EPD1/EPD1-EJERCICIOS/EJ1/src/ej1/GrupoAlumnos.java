/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

import java.util.*;

/**
 *
 * @author carlo
 */
public class GrupoAlumnos implements IGrupoAlumnos {
    
    private Collection<IAlumno> coleccion;
    
    public GrupoAlumnos(){
        this.coleccion = new ArrayList<>();
    }

    @Override
    public Collection<IAlumno> getColeccion() {
        return coleccion;
    }

    @Override
    public void imprimir() {
        Iterator<IAlumno> it = coleccion.iterator();
        while(it.hasNext()){
            System.out.println(it.next().toString());
        }
    }

    @Override
    public boolean add(IAlumno alumno) {
        if(!coleccion.contains(alumno)){
            coleccion.add(alumno);
            return true;
        }
        return false;
    }
    
    public void eliminarMayoresDe() {
        Iterator<IAlumno> it = coleccion.iterator();
        while (it.hasNext()) {
            IAlumno alumno = it.next();
            if (alumno.getEdad() > 30) {
                it.remove(); // Borrado seguro (Experimento 6)
            }
        }
    }
    
    public static IGrupoAlumnos obtenerGrupoPrueba(){
        Scanner sc = new Scanner(System.in);
        IGrupoAlumnos grupo = new GrupoAlumnos();
        
        System.out.print("¿Cuántos alumnos formarán el grupo de prueba?: ");
        int numeroAlumnos = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer de entrada
        
        // Referenciará a un grupo de alumnos formado por un número determinado de alumnos elegidos por el usuario[cite: 12]
        for (int i = 0; i < numeroAlumnos; i++) {
            System.out.println("\n--- Datos del alumno " + (i + 1) + " ---");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Apellidos: ");
            String apellidos = sc.nextLine();
            System.out.print("DNI: ");
            String dni = sc.nextLine();
            System.out.print("edad: ");
            int edad = sc.nextInt();
            
            Alumno nuevoAlumno = new Alumno(nombre, apellidos, dni, edad);
            
            // Para su implementación ayúdese del método add del apartado anterior[cite: 12]
            boolean exito = grupo.add(nuevoAlumno);
            if (!exito) {
                System.out.println("[!] El alumno con DNI " + dni + " ya existe en la colección. No se ha añadido.");
            }
        }
        return grupo;
    }
    
    
}
