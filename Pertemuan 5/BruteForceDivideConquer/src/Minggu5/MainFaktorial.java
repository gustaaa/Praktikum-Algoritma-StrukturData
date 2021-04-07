/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu5;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class MainFaktorial {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("=============================================================");
       System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
       int elemen = sc.nextInt();
       
       Faktorial [] fk = new Faktorial[elemen];
       for(int i = 0; i < elemen; i++){
           fk[i] = new Faktorial();
           System.out.print("Masukkan nilai data ke- "+(i+1)+" : ");
           fk[i].nilai = sc.nextInt();
           
       }
        System.out.println("============================================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        double waktuAwal = System.currentTimeMillis();
        for(int i = 0; i < elemen; i++){
           double waktuAkhir = System.currentTimeMillis();
           double eksekusi = waktuAwal - waktuAkhir;
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialBF(fk[i].nilai));
            System.out.println("Pengecekan waktu awal : "+waktuAwal/1000+ " second");
            System.out.println("Pengecekan waktu akhir : "+waktuAkhir/1000+" second");
            System.out.println("Pengecekan Interval Waktu (Akhir-Awal) : "+eksekusi+" second");
        }
        
        System.out.println("============================================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        double Awal = System.currentTimeMillis();
        for(int i = 0; i < elemen; i++){
            double Akhir = System.currentTimeMillis();
            double eksekusi = Awal - Akhir;
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialDC(fk[i].nilai));
            System.out.println("Pengecekan waktu awal : "+Awal/1000+ " second");
            System.out.println("Pengecekan waktu akhir : "+Akhir/1000+" second");
            System.out.println("Pengecekan Interval Waktu (Akhir-Awal) : "+eksekusi+" second");     
        }
        System.out.println("============================================================");  
    }   
}
