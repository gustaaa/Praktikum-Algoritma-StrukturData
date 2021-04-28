/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas.NomerDua;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.print();
        l.addFirst('c');
        l.print();
        l.addLast('e');
        l.print();
        l.addFirst('a');
        l.print();
        l.insertAfter('a', 'b');
        l.print();
        l.insertAt(3, 'd');
        l.print();       
    }
}
