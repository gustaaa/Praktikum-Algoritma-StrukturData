/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NomerDua;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class MainLeague {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan banyak elemen : ");
        int n = sc.nextInt();
        PremierLeague[] pl = new PremierLeague[n];
        PremierLeagueService list = new PremierLeagueService();
        PremierLeague t1 = new PremierLeague("AFC Bournemouth", 29, -18, 27);
        PremierLeague t2 = new PremierLeague("Arsenal", 28, 4, 40);
        PremierLeague t3 = new PremierLeague("Aston Villa", 27, -18, 25);
        PremierLeague t4 = new PremierLeague("Brigthon & Hove Albion", 29, -8,29);
        PremierLeague t5 = new PremierLeague("Burnley", 29, -6, 39);
        PremierLeague t6 = new PremierLeague("Chelsea", 29, 7, 43);
        PremierLeague t7 = new PremierLeague("Crystal Palace", 29, -6, 39);
        PremierLeague t8 = new PremierLeague("Everton", 29, -6, 37);
        PremierLeague t9 = new PremierLeague("Leicester", 28, 26, 50);
        PremierLeague t10 = new PremierLeague("Liverpool", 29, 45, 83);
        PremierLeague t11 = new PremierLeague("Manchester City", 27, 39, 57);
        PremierLeague t12 = new PremierLeague("Manchester United", 28, 12, 42);
        PremierLeague t13 = new PremierLeague("Newcastle United", 29, -16, 35);
        PremierLeague t14 = new PremierLeague("Norwich City", 29, -27, 21);
        PremierLeague t15 = new PremierLeague("Sheffiel United", 28, 5, 43);
        PremierLeague t16 = new PremierLeague("Southampton", 29, -17, 38);
        PremierLeague t17 = new PremierLeague("Tottenham Hotspur", 29, 7, 41);
        PremierLeague t18 = new PremierLeague("Watford", 29, -17, 27);
        PremierLeague t19 = new PremierLeague("West Ham United", 29, -15, 27);
        PremierLeague t20 = new PremierLeague("Wolverhampton Wanderers", 29, 7, 43);
        
        list.tambah(t1);
        list.tambah(t2);
        list.tambah(t3);
        list.tambah(t4);
        list.tambah(t5);
        list.tambah(t6);
        list.tambah(t7);
        list.tambah(t8);
        list.tambah(t9);
        list.tambah(t10);
        list.tambah(t11);
        list.tambah(t12);
        list.tambah(t13);
        list.tambah(t14);
        list.tambah(t15);
        list.tambah(t16);
        list.tambah(t17);
        list.tambah(t18);
        list.tambah(t19);
        list.tambah(t20);
        
        System.out.println("\n''''''''''''''''''''''''''''''''''''");
        System.out.println("|        Proses Sorting Data       |");
        System.out.println("|    Menggunakan Insertion Sort    |");
        System.out.println("''''''''''''''''''''''''''''''''''''");
        System.out.println("\nData sebelum dilakukan Sorting");
        list.tampilAll();
        
        System.out.println("\n_____________________________________");
        System.out.println("| Proses Sorting Secara Ascending | \n");
        list.insertionSort(true);
        list.tampilAll();
        
        System.out.println("\n_____________________________________");
        System.out.println("| Proses Sorting Secara Descending | \n");
        list.insertionSort(false);
        list.tampilAll();
    }
}
