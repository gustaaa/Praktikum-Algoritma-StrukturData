/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu5;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan banyak elemen : ");
        int n = sc.nextInt();
        Mahasiswa[] mhs = new Mahasiswa[n];
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa m1 = new Mahasiswa ("Nusa", 2017, 25, 3);
        Mahasiswa m2 = new Mahasiswa ("Rara", 2012, 19, 4);
        Mahasiswa m3 = new Mahasiswa ("Dompu", 2018, 19, 3.5);
        Mahasiswa m4 = new Mahasiswa ("Abdul", 2017, 23, 2);
        Mahasiswa m5 = new Mahasiswa ("Ummi", 2019, 21, 3.75);
    
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);
        
        System.out.println("Data mahasiswa sebelum sorting");
        list.tampil();
        
        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampil();
        
        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.selectionSort();
        list.tampil();
        
        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        //list.insertionSort();
        list.insertionSort(true);
        list.tampil();
    }
}
