/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan.Praktikum.NomerDua;

import java.util.Scanner;

/**
 *

 * @author Asus
 */
public class LuasTanahMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("''''''''''''''''''''''''''''''''''''");
        System.out.println("|       Menghitung Luas Tanah      |");
        System.out.println("''''''''''''''''''''''''''''''''''''");
        
        System.out.print("Banyak Tanah\t : ");
        int N = sc.nextInt();
        LuasTanah [] ppArray = new LuasTanah[N];
        for(int i = 0; i < ppArray.length; i++){
            ppArray[i] = new LuasTanah();
            System.out.println("Tanah ke\t : " +(i+1));
            System.out.print("Panjang Tanah\t : " );
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Lebar Tanah\t : ");
            ppArray[i].lebar = sc.nextInt();             
        }
        for (int i = 0; i < ppArray.length; i++){
           System.out.println("Luas Tanah "+(i+1)+ "\t : "+ ppArray[i].hitungLuas()+" m2");           
        }        
    }
}
