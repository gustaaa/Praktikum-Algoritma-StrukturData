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
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double jumlah = 0;
        double rata = 0;
        System.out.println("::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("| \t\tData Mahasiswa\t\t |");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::");
        
        System.out.print("Banyak Mahasiswa\t : ");
        int n = sc.nextInt();
        NilaiAlgoritma3[] mahaArray = new NilaiAlgoritma3[n];
        NilaiAlgoritma3 alg = new NilaiAlgoritma3();
        for (int i = 0; i < mahaArray.length; i++){
            mahaArray[i] = new NilaiAlgoritma3();
            System.out.println("Masukkan data mahasiswa ke "+(i+1));
            System.out.print("Masukkan Nama Mahasiswa\t : ");
            mahaArray[i].nama = sc.next();
            System.out.print("Masukkan Nilai Tugas\t : ");
            mahaArray[i].tugas = sc.nextInt();
            System.out.print("Masukkan Nilai Kuis\t : ");
            mahaArray[i].kuis = sc.nextInt();
            System.out.print("Masukkan Nilai UTS\t : ");
            mahaArray[i].UTS = sc.nextInt();
            System.out.print("Masukkan Nilai UAS\t : ");
            mahaArray[i].UAS = sc.nextInt(); 
        }
        System.out.println();
        System.out.println("__________________________________________");
        for (int i = 0; i < mahaArray.length; i++){
            System.out.println("Data mahasiswa ke "+(i+1));
            System.out.println("Nama Mahasiswa\t\t : "+mahaArray[i].nama);
            System.out.println("Total Nilai\t\t : "+mahaArray[i].hitungTotalNilai(mahaArray[i].tugas, mahaArray[i].kuis, mahaArray[i].UTS, mahaArray[i].UAS));          
            if(n > 1){
                jumlah += mahaArray[i].hitungTotalNilai(mahaArray[i].tugas, mahaArray[i].kuis, mahaArray[i].UTS, mahaArray[i].UAS);
                rata = jumlah /(i+1); 
            }
        }
        System.out.println("Rata-rata nilai seluruh mahasiswa : "+rata);
        
    }
}
