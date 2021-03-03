/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan.Praktikum.NomerLima;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double jumlah = 0, rata = 0;
        
        System.out.println("::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("| \t\tData Mahasiswa\t\t |");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::");
        
        System.out.print("Banyak Mahasiswa\t : ");
        int n = sc.nextInt();
        Mahasiswa [] mahaArray = new Mahasiswa [n];
        for (int i = 0; i < mahaArray.length; i++){
            mahaArray[i] = new Mahasiswa();
            System.out.println("Masukkan data mahasiswa ke "+(i+1));
            System.out.print("Masukkan Nama Mahasiswa\t : ");
            mahaArray[i].nama = sc.next();
            System.out.print("Masukkan NIM\t\t : ");
            mahaArray[i].NIM = sc.nextInt();
            System.out.print("Masukkan jenis kelamin\t : ");
            mahaArray[i].jenisKelamin = sc.next().charAt(0);
            System.out.print("Masukkan IPK\t\t : ");
            mahaArray[i].ipk = sc.nextDouble(); 
        }
        System.out.println();
        System.out.println("__________________________________________");
        for (int i = 0; i < mahaArray.length; i++){
            System.out.println("Data mahasiswa ke "+(i+1));
            System.out.println("Nama Mahasiswa\t\t : "+mahaArray[i].nama);
            System.out.println("NIM Mahasiswa\t\t : "+mahaArray[i].NIM);
            System.out.println("Jenis kelamin\t\t : "+mahaArray[i].jenisKelamin);
            System.out.println("IPK\t\t\t : "+mahaArray[i].ipk);
            if(n > 1){
                jumlah += mahaArray[i].ipk;
                rata = jumlah /(i+1); 
            }
        }
        System.out.println("Rata-rata IPK Mahasiswa  : "+rata);
    }
}
