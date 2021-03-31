/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoalNomerTiga;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Array2DMain {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris : ");
        int x = sc.nextInt();
        System.out.print("Masukkan jumlah kolom : ");
        int y = sc.nextInt();
        int Array2D[][] = new int [x][y];
        
        for(int i = 0; i<x; i++){
            for(int j = 0; j<y; j++){
                System.out.print("Masukkan nilai pada array ke-["+i+"]["+j+"] : ");
                Array2D[i][j] = sc.nextInt();
            }
        }
        System.out.println("");
        Array2D arr = new Array2D(Array2D, x, y);
        System.out.println("Tampilan nilai array : ");
        arr.tampilAll();
        System.out.print("Masukkan nilai yang ingin dicari : ");
        int cari = sc.nextInt();
        int posisi = arr.FindSeqSearch(cari);
        if(posisi == -1){
            System.out.println("Maaf data tidak ditemukan!!!");
        }
    }
}
