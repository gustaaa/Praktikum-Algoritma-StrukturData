/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan.Praktikum.Soal3;

/**
 *
 * @author Asus
 */
public class BarangMain {
    public static void main(String[] args) {
        Barang brg = new Barang();
        brg.nama = "Jam Tangan";
        brg.hargaSatuan = 75000;
        brg.jumlah = 5;
        brg.tampil();
        Barang b1 = new Barang ("TV", 2500000, 3);
        b1.tampil();
    }
}
