/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package epd2.p10;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author carlo
 */
public class EPD2P10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Alumnos gestion = new Alumnos();
        
        IAsignatura ed = new Asignatura("Estructura de datos", "2º");
        IAsignatura ia = new Asignatura("Inteligencia artificial", "3º");
        IAsignatura alg = new Asignatura("Algebra", "1º");

        
        IAlumno alumno1 = new Alumno("Javi Reyes", "99999999Y");
        IAlumno alumno2 = new Alumno("Laura Perez", "88888888A");
        
        
        alumno1.añadirMatriculada(ed);
        alumno1.añadirMatriculada(ia);
        alumno1.añadirAprobada(alg);
        
        alumno2.añadirMatriculada(ia);
        alumno2.añadirAprobada(ia);
        
        gestion.añadirAlumno(alumno1);
        gestion.añadirAlumno(alumno2);
        
        System.out.println("===PROBANDO EL SISTEMA DE GESTION===");
        
        System.out.println("\n ALUMNOS SIN NINGUNA ASIGNATURA APROBADA");
        System.out.println(gestion.getNingunaAprobada());
        
        System.out.println("\n ALUMNOS MATRICULADOS EN IA");
        System.out.println(gestion.getMatriculado(ia));
        
        System.out.println("\n ALUMNOS APROBADOS EN IA");
        System.out.println(gestion.getAprobados(ia));
        
        Set<IAsignatura> conjuntoAsignaturas = new HashSet<>();
        conjuntoAsignaturas.add(ed);
        conjuntoAsignaturas.add(ia);
        
        
        System.out.println("\n ALUMNOS MATRICULADOS EN TODAS LAS ASIGNATURAS (ED, IA");
        System.out.println(gestion.getMatriculadoEnTodas(conjuntoAsignaturas));
        
        
        
        
    }
    
}
