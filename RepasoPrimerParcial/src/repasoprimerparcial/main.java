/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasoprimerparcial;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);
        int op;
        
        do{
            System.out.println("\n 1.Añadir | 2.Eliminar | 3.Listar | 4.Autor | 5.Max prestamos | 6.Min paginas | 7.Total prestamos | 8.Salir");
            System.out.println("Elige una opcion: ");
            op = sc.nextInt();
            sc.nextLine();
            
            switch (op){
                case 1:
                System.out.print("Titulo, Autor, Anio, Formato, Paginas, Editorial, Prestamos: ");
                    biblioteca.anadirEjemplar(new Ejemplar(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.next(), sc.nextInt(), sc.next(), sc.nextInt()));
                    sc.nextLine(); // Limpiar tras leer enteros
                    break;
                case 2:
                    System.out.print("Titulo y Autor a borrar: ");
                    Ejemplar d = new Ejemplar(); d.setTitulo(sc.nextLine()); d.setAutor(sc.nextLine());
                    biblioteca.eliminarEjejmplar(d);
                    break;
                case 3:
                    biblioteca.mostrarEjemplaresOrdenados();
                    break;
                case 4:
                    System.out.print("Autor: ");
                    biblioteca.mostrarLibrosPorAutor(sc.nextLine());
                    break;
                case 5:
                    System.out.println(biblioteca.getEjemplarMayorPrestamos());
                    break;
                case 6:
                    System.out.println(biblioteca.getEjemplarMenorPaginas());
                    break;
                case 7:
                    System.out.println("Total prestamos: " + biblioteca.getTotalPrestamos());
                    break;
            }
        } while (op != 8);
        } 
}
    
