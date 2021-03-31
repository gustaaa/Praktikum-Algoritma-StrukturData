/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu7;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        PencarianMhs data = new PencarianMhs();
        //jumMhs = 5;
        //modifikasi program
        System.out.print("Masukkan jumlah mahasiswa yang ingin didata : ");
        int jumMhs = s.nextInt();
        
        System.out.println("---------------------------------");
        System.out.println("Masukkan data mahasiswa");
        for(int i = 0; i < jumMhs; i++){
            System.out.println("-------------");
            System.out.println("Nim\t: ");
            int nim = s.nextInt();
            System.out.println("Nama\t: ");
            String nama = s1.nextLine();
            System.out.println("Umur\t: ");
            int umur = s.nextInt();
            System.out.println("IPK\t: ");
            double ipk = s.nextDouble();
            
            Mahasiswa m = new Mahasiswa (nim, nama, umur, ipk);
            data.tambah(m);
        }
        System.out.println("---------------------------------");
        System.out.println("Data keseluruhan mahasiswa : ");        
        //data.tampilAll();
       
        System.out.println("Data mahasiswa yang sudah diurutkan : ");
        data.tampilAll();
        System.out.println("_________________________________");
        System.out.println("_________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan nim mahasiwa yang dicari");
        System.out.println("NIM : ");
        int cari = s.nextInt();
        System.out.println("Menggunakan sequential search");
        int posisi = data.FindSeqSearch(cari);        
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
        
        System.out.println("=================================");
        System.out.println("Menggunakan binary search");
        posisi = data.FindBinarySearch(cari, 0, jumMhs-1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}
