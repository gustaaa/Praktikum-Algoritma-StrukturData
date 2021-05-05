/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas.Nomer4;

/**
 *
 * @author Asus
 */
public class Node {
    Object dt;
    String nim, nama;
    double ipk;
    Node prev, next;
    Node(Node prev, Node next,double ipk, String... data){
        this.prev = prev;
        this.ipk = ipk;
        this.nim = data[0];
        this.nama = data[1];
        this.next = next;
    }
}
