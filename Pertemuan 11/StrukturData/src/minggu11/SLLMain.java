/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu11;

/**
 *
 * @author Asus
 */
public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList s = new SingleLinkedList();
        System.out.println("Praktikum 1");
        s.print();
        s.addFirst(890);
        s.print();
        s.addLast(760);
        s.print();
        s.addFirst(700);
        s.print();
        s.insertAfter(700, 999);
        s.print();
        s.insertAt(3, 833);
        s.print();
        
        System.out.println("\nPraktikum 2");
        System.out.println("Data pada indeks ke-1="+s.getData(1));
        System.out.println("Data 3 berada pada indeks ke-"+s.indexOf(760));
        
        s.remove(999);
        s.print();
        s.removeAt(0);
        s.print();
        s.removeFirst();
        s.print();
        s.removeLast();
        s.print();
    }
}
