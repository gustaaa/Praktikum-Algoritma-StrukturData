/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan.Praktikum.NomerSatu;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class RuangMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("===========================================");
        System.out.println("|  Menghitung Volume dan Luas Permukaan  |");
        System.out.println("|\t\t Bangun Ruang\t\t |");
        System.out.println("===========================================");
        
        System.out.print("| Banyak Kubus\t\t : ");
        int n = sc.nextInt();
        Kubus [] kbArray = new Kubus[n]; 
        Tabung [] tbArray = new Tabung[2];
        tbArray[0] = new Tabung ((float) 3.14, 10, 50);
        tbArray[1] = new Tabung ((float) 3.14, 20, 50);
        for (int i = 0; i < kbArray.length; i++){
            kbArray[i] = new Kubus (0);
            System.out.println("| Kubus ke "+(i+1));
            System.out.print("| Masukkan sisi kubus\t : ");
            kbArray[i].sisi = sc.nextInt();
            System.out.println("| Volume Kubus\t\t : "+kbArray[i].hitungVolume());
            System.out.println("| Luas Permukaan Kubus   : "+kbArray[i].hitungLuas());
        }
        System.out.println("-------------------------------------------");  
        System.out.println("| Banyak Tabung\t\t : 2");
        for (int j = 0; j < 2; j++){
            System.out.println("| Tabung ke "+(j+1));
            System.out.println("| Phi Tabung\t\t : "+ tbArray[j].phi);
            System.out.println("| Jari-jari Tabung\t : "+tbArray[j].jari);
            System.out.println("| Tinggi Tabung\t\t : "+tbArray[j].tinggi);
            System.out.println("| Volume Tabung\t\t : "+tbArray[j].hitungVolume());
            System.out.println("| Luas permukaan Tabung  : "+tbArray[j].hitungLuas());
        }
        System.out.println("-------------------------------------------");
        System.out.print("Banyak Bola\t\t : ");
        n = sc.nextInt();
        Bola [] blArray = new Bola [n];
        for (int k = 0; k < blArray.length; k++){
            blArray [k] = new Bola(0, 0);
            System.out.println("Bola ke "+(k+1));
            System.out.print("Masukkan phi\t\t : ");
            blArray[k].phi = sc.nextFloat();
            System.out.print("Masukkan jari-jari bola  : ");
            blArray[k].jari = sc.nextInt();
            System.out.println("Volume Bola\t\t : "+blArray[k].hitungVolume());
            System.out.println("Luas Permukaan Bola\t : "+blArray[k].hitungLuas());
        }
    }    
}
