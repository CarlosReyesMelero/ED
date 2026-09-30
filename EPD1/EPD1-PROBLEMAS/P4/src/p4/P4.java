/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p4;

/**
 *
 * @author carlo
 */
public class P4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // 1. Instanciamos el objeto principal
        ColeccionEnteros ce = new ColeccionEnteros();
        
        // 2. Datos de pruebas
        ce.getColecion().add(1);
        ce.getColecion().add(-2);
        ce.getColecion().add(3);
        ce.getColecion().add(-5);
        ce.getColecion().add(3);
        ce.getColecion().add(8);
        ce.getColecion().add(10);
        
        // 3. Probamos el metodo auxiliar de imprimir
        ce.imprimir();
        
        // 4. Probamos el metodo a evaluar
        System.out.println("Caso 1(exito): " + ce.coincideSumaElementos(0));
        System.out.println("Caso 2(fallo): " + ce.coincideSumaElementos(7));
        
        
    }
    
}
