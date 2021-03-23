/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NomerSatu;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class MainTiket {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan banyak elemen : ");
        int n = sc.nextInt();
        Tiket [] tkt = new Tiket[n];
        TiketService list = new TiketService();
        Tiket x1 = new Tiket ("Garuda", 1709100, "Jakarta", "Denpasar");
        Tiket x2 = new Tiket ("Garuda", 1210800, "Jakarta", "Lombok");
        Tiket x3 = new Tiket ("Garuda", 786200, "Jakarta", "Semarang");
        Tiket x4 = new Tiket ("Lion Air", 558600, "Jakarta", "Denpasar");
        Tiket x5 = new Tiket ("Lion Air", 547600, "Jakarta", "Lombok");
        Tiket x6 = new Tiket ("Lion Air", 350700, "Jakarta", "Semarang");
        Tiket x7 = new Tiket ("Air Asia", 552712, "Jakarta", "Denpasar");
        Tiket x8 = new Tiket ("Air Asia", 541373, "Jakarta", "Lombok");
        Tiket x9 = new Tiket ("Air Asia", 350700, "Jakarta", "Semarang");
        
        list.tambah(x1);
        list.tambah(x2);
        list.tambah(x3);
        list.tambah(x4);
        list.tambah(x5);
        list.tambah(x6);
        list.tambah(x7);
        list.tambah(x8);
        list.tambah(x9);
        
        System.out.println("\n''''''''''''''''''''''''''''''''''''");
        System.out.println("|        Proses Sorting Data       |");
        System.out.println("|Menggunakan Bubble, Selection Sort|");
        System.out.println("''''''''''''''''''''''''''''''''''''");
        
        System.out.println("\nData sebelum dilakukan Sorting");
        list.tampilAll();
        
        System.out.println("\n____________________________________");
        System.out.println("  | Menggunakan Bubble Sort | \n");
        list.bubbleSort();
        list.tampilAll();
        
        System.out.println("\n____________________________________");
        System.out.println("  | Menggunakan Selection Sort | \n");
        list.selectionSort();
        list.tampilAll();
    }
}
