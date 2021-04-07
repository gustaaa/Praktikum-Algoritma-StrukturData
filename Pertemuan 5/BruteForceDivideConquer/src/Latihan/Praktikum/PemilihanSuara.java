/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan.Praktikum;

/**
 *
 * @author Asus
 */
public class PemilihanSuara {
    public int jumlah;
    public String kandidat[];

    PemilihanSuara(int jumlah) {
        this.jumlah = jumlah;
        this.kandidat = new String[jumlah];
    }

    public int CalonArr(String[] nama, int awal, int length, int hasil) {
        int middle = length / 2;
        int kiri = middle - 1;
        int kanan = length - 1;
        int test = rekursifDC(nama, awal, hasil, kanan, kiri, middle);
        return test;
    }

    public int rekursifDC(String[] nama, int awal, int hasil, int kanan, int kiri, int middle) {
        if (kanan == (kiri + 1) && kiri == (awal + 1)) {
            return hasil;
        } else {
            if (awal != kiri) {
                if (nama[awal].equalsIgnoreCase(nama[kiri])) {
                    return hasil = awal;
                } else {
                    return rekursifDC(nama, awal, hasil, kanan, (kiri - 1), middle);
                }
            } else {
                if (nama[middle].equalsIgnoreCase(nama[kanan])) {
                    return hasil = middle;
                } else {
                    return rekursifDC(nama, middle, hasil, (kanan - 1), kiri, middle);
                }
            }
        }
    }
}
