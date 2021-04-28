/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas.NomerTiga;

/**
 *
 * @author Asus
 */
public class MataKuliahMain {
       public static void main(String[] args) {
        MataKuliah mk = new MataKuliah();
        mk.print();
        mk.addLast("Bahasa");
        mk.print();
        mk.addFirst("Multimedia");
        mk.print();
        mk.insertAfter("Multimedia", "Algoritma");
        mk.print();
        mk.insertBefore("Algoritma", "Statistika");
        mk.print();
        mk.insertAfter("Algoritma", "Matematika");
        mk.print();
        mk.insertAt(4, "Basis Data");
        mk.print();
        mk.insertAfter("Basis Data", "Komputer");
        mk.print();
        mk.insertBefore("Bahasa", "Android");
        mk.print();
    }
}
