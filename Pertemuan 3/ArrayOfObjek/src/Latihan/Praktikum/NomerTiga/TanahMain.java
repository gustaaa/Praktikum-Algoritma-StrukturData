/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan.Praktikum.NomerTiga;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class TanahMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("------------------------------------");
        System.out.println("|       Menghitung Luas Tanah      |");
        System.out.println("------------------------------------");
        
        int max=0, posisi = 1;
        System.out.print("Banyak Tanah\t : ");
        int N = sc.nextInt();
        Tanah [] tArray = new Tanah[N];
        for(int i = 0; i < tArray.length; i++){
            tArray[i] = new Tanah();
            System.out.println("Tanah ke\t : " +(i+1));
            System.out.print("Panjang Tanah\t : " );
            tArray[i].panjang = sc.nextInt();
            System.out.print("Lebar Tanah\t : ");
            tArray[i].lebar = sc.nextInt();  
        }
        System.out.println();
        System.out.println("____________________________________");
        for (int i = 0; i < tArray.length; i++){
           System.out.println("Luas Tanah "+(i+1)+ "\t : "+ tArray[i].hitungLuas()+" m2");
           if (tArray[i].hitungLuas() > max){
               max = tArray[i].hitungLuas();
               posisi = i+1;               
            }   
        }
        System.out.println("Tanah Terluas\t : Tanah ke "+posisi);
        System.out.println("Luas Tanah "+posisi+" \t: "+max+" m2");
    }

}
