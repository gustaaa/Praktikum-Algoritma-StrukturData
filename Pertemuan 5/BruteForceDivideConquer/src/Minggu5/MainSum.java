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
public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Program Menghitung Keuntungan Total (Satuan juta, Misal 5.9)");
        System.out.print("Masukkan jumlah perusahaan");
        int elm = sc.nextInt();
        System.out.print("Masukkan jumlah bulan");
        int n =sc.nextInt();
        Sum sm = new Sum(elm, n);
        System.out.println("--------------------------------------------------------------------");
        for(int i = 0; i < sm.elemen; i++){
            for(int j = 0; i<n; j++){
            System.out.println("Masukkan untung perusahaan ke- "+(i+1)+" dan bulan ke- "+(j+1)+" = ");
            sm.keuntungan[i][j] = sc.nextDouble();
            }
        }
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama "+sm.elemen+" bulan adalah "+sm.totalBF(sm.keuntungan));
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Algoritma Divide and Conquer");
        //System.out.println("Total keuntungan perusahaan selama "+sm.elemen+" bulan adalah "+sm.totalDC(sm.keuntungan, 0, sm.elemen-1));    
    }
}
