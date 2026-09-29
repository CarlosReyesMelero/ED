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
public class EXP5 {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        Iterator<Integer> it;
        for (int i = 5; i >= 1; i--) {
            l.add(i);
            s.add(i);
        }
         /*
        for (int i = 1; i <= 1; i++) {
            l.add(i);
            s.add(i);
        }
        */
        
        it = l.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("-------------------");
        it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
