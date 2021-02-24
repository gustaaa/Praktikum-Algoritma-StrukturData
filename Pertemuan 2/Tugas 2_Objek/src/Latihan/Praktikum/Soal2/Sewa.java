/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan.Praktikum.Soal2;

/**
 *
 * @author Asus
 */
public class Sewa {
    String nama, namaGame;
    int id, hari, harga;
    
    int hitungBayar(int hr, int hrg){
        int bayar = hari*harga;
        return bayar;
    }
    void tampil(){
        System.out.println("------------------------------------");
        System.out.println("==== Bukti Persewaan Video Game ====");
        System.out.println("------------------------------------");
        System.out.println("Nama Member\t\t\t : "+nama);
        System.out.println("ID Member\t\t\t : "+id);
        System.out.println("Nama Game\t\t\t : "+namaGame);
        System.out.println("Lama Peminjaman\t\t : "+hari+" hari");
        System.out.println("Harga Sewa per hari\t\t : "+harga);
        System.out.println("Harga Sewa yang harus dibayar\t : "+hitungBayar(hari, harga));
    }
}
