/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repasoprimerparcial;

/**
 *
 * @author carlo
 */
public interface IEjemplar {
    
    String getTitulo();
    void setTitulo(String titulo);
    
    String getAutor();
    void setAutor(String autor);
    
    int getAnioPublicacion();
    void setAnioPublicacion(int anioPublicacion);
    
    String getFormato();
    void setFormato(String formato);
    
    int getNumeroPaginas();
    void setNumeroPaginas(int numeroPaginas);
    
    String getEditorial();
    void setEditorial(String editorail);
    
    int getNumeroPrestamos();
    void setNumeroPrestamos(int numeroPrestamos);     
    
}
