/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan.Praktikum;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class PemilihanSuaraMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("|\t\tData Pemilihan Suara\t  |");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::");
        System.out.print("Masukkan Banyak Suara : ");
        int jumlah = sc.nextInt();
        PemilihanSuara test = new PemilihanSuara(jumlah);
        sc.nextLine();
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan Nama/Suara ke-" + (i + 1) + " = ");
            test.kandidat[i] = sc.nextLine();
        }
        int hasil = test.CalonArr(test.kandidat, 0, jumlah, 0);
        System.out.println("Mayoritas jumlah suara adalah : " + test.kandidat[hasil]);
    }
}
