/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package epd2.p7;

import java.util.Comparator;

/**
 *
 * @author carlo
 */
public class ComparadorLargoAncho implements Comparator<IRectangulo>{
    
    public int compare(IRectangulo r1, IRectangulo r2){
        
        int resultadoLargo = Double.compare(r1.getLargo(), r2.getLargo());
        
        if(resultadoLargo != 0){
            return resultadoLargo;          
        }
        return Double.compare(r1.getAncho(), r2.getAncho());
    }
    
}
