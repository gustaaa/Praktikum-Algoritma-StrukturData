/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Asus
 */
public class LoopCollection {
    public static void main(String[] args) {
        List<String> fruits = new Stack<>();
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.add("Strawberry");
        fruits.add("Mango");
        fruits.add("Guava");
        fruits.add("Avocado");
        
        for (String fruit : fruits){
            System.out.printf("%s ", fruit);
        }
        
        System.out.println("\n" + fruits.toString());
        
        /*while (!fruits.isEmpty()){
          System.out.printf("%s ",fruits);
        }*/
        System.out.println();
        System.out.println("-------------------------------------------------");
        //fruits.push("Melon");
        //fruits.push("Durian");
        System.out.println();
        for(Iterator<String> it = fruits.iterator(); it.hasNext();){
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }
        System.out.println("");
        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });
        System.out.println("");
        for(int i = 0; i < fruits.size(); i++){
            System.out.printf("%s ", fruits.get(i));
        }
    }
}
