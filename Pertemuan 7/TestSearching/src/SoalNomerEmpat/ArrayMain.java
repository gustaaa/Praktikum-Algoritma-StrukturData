/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoalNomerEmpat;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class ArrayMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array : ");
        int el = sc.nextInt();
        ArrayService array = new ArrayService(el);
        System.out.println("______________________________________________\n");
        System.out.println("*****Input nilai*****");
        for(int i =0; i < el; i++){
            System.out.print("Nilai ke- "+i+" : ");
            int n = sc.nextInt();
            Array a = new Array(n);
            array.tambah(a);
        }
        System.out.println("");
        System.out.println("----------------------------------------------");
        System.out.println("************ Data Nilai Seluruhnya ***********");
        System.out.println("----------------------------------------------");
        array.tampil();
        System.out.println("");
        System.out.println("______________________________________________\n");
        System.out.print("Masukkan nilai yang dicari : ");
        int cari = sc.nextInt();
        System.out.println("---------------------------------------------\n");
        System.out.println("Binary Search");
        int posisi = array.FindBinarySearch(cari, 0, el-1);
    }
}
