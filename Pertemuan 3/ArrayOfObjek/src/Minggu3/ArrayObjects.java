/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu3;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class ArrayObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        PersegiPanjang [][] ppArray = new PersegiPanjang[m][n];
        
        for(int i = 0; i < ppArray.length; i++){
            for(int j = 0; j < ppArray.length; j++){
            ppArray[i][j] = new PersegiPanjang();
            System.out.println("Persegi panjang ke "+i);
            System.out.print("Masukkan panjang : ");
            ppArray[i][j].panjang = sc.nextInt();
            System.out.print("Masukkan lebar : ");
            ppArray[i][j].lebar = sc.nextInt();
            }
        }
        for(int i = 0; i < ppArray.length; i++){
            for(int j = 0; j < ppArray.length; j++){
            System.out.println("Persegi Panjang ke "+i);
            System.out.println("panjang : "+ppArray[i][j].panjang+" ,lebar : "+ppArray[i][j].lebar);
            }
        }
               
    }
}
