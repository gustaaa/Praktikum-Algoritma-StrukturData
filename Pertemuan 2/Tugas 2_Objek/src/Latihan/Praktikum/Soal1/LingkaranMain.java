/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan.Praktikum.Soal1;

/**
 *
 * @author Asus
 */
public class LingkaranMain {
    public static void main(String[] args) {
        Lingkaran hitung = new Lingkaran();
        hitung.PHI = 3.14;
        hitung.r = 10;
        double Luas = hitung.hitungLuas();
        double Kel = hitung.hitungKeliling();
        System.out.println("---------------------------------------------------");
        System.out.println(" ===== Menghitung Luas dan Keliling Segitiga ===== ");
        System.out.println("---------------------------------------------------");
        System.out.println("Jari-jari Lingkaran\t : "+hitung.r);
        System.out.println("Phi Lingkaran\t\t : "+hitung.PHI);
        System.out.println("Luas Lingkaran\t\t : "+ Luas);
        System.out.println("Keliling Lingkaran\t : "+Kel);
    }
}
