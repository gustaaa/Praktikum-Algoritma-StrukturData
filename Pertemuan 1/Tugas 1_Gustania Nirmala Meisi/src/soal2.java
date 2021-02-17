/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class soal2 {
    public static void main(String[] args) {
        int bulan, tahun, lama, uang, bunga, saldo, banyakBunga;
        uang = 1000000;
        saldo = 1500000;
        banyakBunga = saldo - uang;
        bunga = (1000000*2)/100;
        lama = banyakBunga/bunga;
        tahun = lama/12;
        bulan = lama%12;
        System.out.println("---------------------------------------------------------");
        System.out.println("//========== RIWAYAT TRANSAKSI REKENING ANDA ==========\\");
        System.out.println("---------------------------------------------------------");
        System.out.println("Saldo awal\t\t : Rp. "+uang);
        System.out.println("Saldo Akhir\t\t : Rp. "+ saldo);
        System.out.println("Banyak Bunga\t\t : Rp. "+banyakBunga);
        System.out.println("Lama Menabung\t\t : "+tahun+ " Tahun "+bulan+ " Bulan");
    }
}
