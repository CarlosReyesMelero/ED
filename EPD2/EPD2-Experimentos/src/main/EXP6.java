/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.util.*;
/**
 *
 * @author carlo
 */
public class EXP6 {

    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        Set<String> s;
        l.add("yo");
        l.add("soy");
        l.add("yo");
        l.add("tu");
        l.add("eres");
        l.add("tu");
        System.out.println("l: " + l);
        s = new HashSet<>(l);
        System.out.println("s: " + s);
    }
}
