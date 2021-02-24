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
public class Barang {
    Barang(){
        
    }
    Barang(String nm, int hs, int jmlh){
        nama = nm;
        hargaSatuan = hs;
        jumlah = jmlh;
    }
    String nama;
    int hargaSatuan, jumlah;
    int hitungHargaTotal(){
        int total = hargaSatuan*jumlah;
        return total;        
    }
    int hitungDiskon(){
        int disc;
        int H = hitungHargaTotal();
        if (H > 100000){
            disc = (H*10)/100;
        }else if(H >= 50000){
            disc = (H*5)/100;
        }else{
            disc = 0;
        }
        return disc;        
    }
    int hitungHargaBayar(){
        int bayar = hitungHargaTotal()-hitungDiskon();
        return bayar;        
    }
    void tampil(){
        System.out.println("------------------------------------");
        System.out.println(" ===== Bukti Pembelian Barang ===== ");
        System.out.println("------------------------------------");
        System.out.println("Nama Barang\t\t\t : "+nama);
        System.out.println("Harga per satuan\t\t : "+hargaSatuan);
        System.out.println("Banyak Barang\t\t\t : "+jumlah);
        System.out.println("Harga Total\t\t\t : "+hitungHargaTotal());
        System.out.println("Diskon yang diterima\t\t : "+hitungDiskon());
        System.out.println("Harga yang harus dibayar\t : "+hitungHargaBayar());
    }
    
}
