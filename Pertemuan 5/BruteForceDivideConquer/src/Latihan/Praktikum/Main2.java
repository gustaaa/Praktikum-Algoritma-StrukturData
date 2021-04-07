/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan.Praktikum;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("| \t\tData Mahasiswa\t\t |");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::");
        
        System.out.print("Banyak Mahasiswa\t : ");
        int n = sc.nextInt();
        NilaiAlgoritma2[] mahaArray = new NilaiAlgoritma2[n];
        for (int i = 0; i < mahaArray.length; i++){
            mahaArray[i] = new NilaiAlgoritma2();
            System.out.println("Masukkan data mahasiswa ke "+(i+1));
            System.out.print("Masukkan Nama Mahasiswa\t : ");
            mahaArray[i].namaMhs = sc.next();
            System.out.print("Masukkan Nilai Tugas\t : ");
            mahaArray[i].nilaiTugas = sc.nextInt();
            System.out.print("Masukkan Nilai Kuis\t : ");
            mahaArray[i].nilaiKuis = sc.nextInt();
            System.out.print("Masukkan Nilai UTS\t : ");
            mahaArray[i].nilaiUTS = sc.nextInt();
            System.out.print("Masukkan Nilai UAS\t : ");
            mahaArray[i].nilaiUAS = sc.nextInt(); 
        }
        System.out.println();
        System.out.println("__________________________________________");
        for (int i = 0; i < mahaArray.length; i++){
            System.out.println("Data mahasiswa ke "+(i+1));
            System.out.println("Nama Mahasiswa\t\t : "+mahaArray[i].namaMhs);
            System.out.println("Nilai Tugas\t\t : "+mahaArray[i].nilaiTugas);
            System.out.println("Nilai Kuis\t\t : "+mahaArray[i].nilaiKuis);
            System.out.println("Nilai UTS\t\t : "+mahaArray[i].nilaiUTS);
            System.out.println("Nilai UAS\t\t : "+mahaArray[i].nilaiUAS);
            System.out.println("Total Nilai\t\t : "+mahaArray[i].hitungTotalNilai(mahaArray[i].nilaiTugas, mahaArray[i].nilaiKuis, mahaArray[i].nilaiUTS, mahaArray[i].nilaiUAS));
          
        }
    }
}
