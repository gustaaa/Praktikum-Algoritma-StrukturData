/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas.Nomer3;

/**
 *
 * @author Asus
 */
public class Node {
    String no, nama;
    Node prev, next;
    
    Node(Node prev, Node next, String... data){
        this.prev = prev;
        this.no = data[0];
        this.nama = data[1];
        this.next = next;
    }
}
