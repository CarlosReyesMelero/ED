/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author carlo
 */


public class EXP3A {
    
    

    private int numero;

    public EXP3A() {
        this.numero = (int) Math.round(Math.random() * 100);
    }

    public int getNumero() {
        return numero;
    }

    public int compareTo(Object o) {
        EXP3A n = (EXP3A) o;
        if (this.numero == n.numero) {
            return 0;
        } else if (this.numero < n.numero) {
            return -1;
        } else {
            return 1;
        }
    }

    public String toString() {
        return String.valueOf(numero);

    }
}