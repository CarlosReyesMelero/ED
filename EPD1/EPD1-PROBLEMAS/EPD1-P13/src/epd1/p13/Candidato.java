
package epd1.p13;

/**
 *
 * @author carlo
 */
public class Candidato implements ICandidatos {
    
    private String nombre;
    private double altura;
    private double peso;

    public Candidato(String nombre, double altura, double peso) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
    }


    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public double getAltura() {
        return this.altura;
    }

    @Override
    public double getPeso() {
        return this.peso;
    }
    
}
