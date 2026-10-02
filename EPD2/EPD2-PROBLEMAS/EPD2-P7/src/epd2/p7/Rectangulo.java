/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package epd2.p7;

/**
 *
 * @author carlo
 */
public class Rectangulo implements IRectangulo, Comparable<IRectangulo> {
    
    private double largo;
    private double ancho;
    private double area;

    public Rectangulo(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
    
    

    @Override
    public double getLargo() {
        return largo;
    }

    @Override
    public double getAncho() {
        return ancho;
    }

    @Override
    public double getArea() {
        return largo * ancho;
    }

    @Override
    public int compareTo(IRectangulo o) {
        double miArea = getArea();
        double areaRival = o.getArea();
        
        return Double.compare(miArea, areaRival);       
    }
    
}
