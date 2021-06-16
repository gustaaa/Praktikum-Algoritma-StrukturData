/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Asus
 */
public class ListMahasiswa {
    List<Mahasiswa> mahasiswas = new ArrayList<>();
    public void tambah(Mahasiswa... mahasiswa){
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }
    public void hapus(int index){
        mahasiswas.remove(index);
    }
    public void update(int index, Mahasiswa mhs){
        mahasiswas.set(index, mhs);
    }
    public void tampil(){
        mahasiswas.stream().forEach(mhs -> {
            System.out.println(""+ mhs.toString());
        });
    }
    int BinarySearch(String nim){
        for(int i = 0; i < mahasiswas.size(); i++){
            if (nim.equals(mahasiswas.get(i).nim)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        ListMahasiswa la = new ListMahasiswa();
        Mahasiswa n = new Mahasiswa ("201234", "Noureen", "0201xx1");
        Mahasiswa n1 = new Mahasiswa ("201235", "Akhleema", "021xx2");
        Mahasiswa n2 = new Mahasiswa ("201236", "Shannum", "021xx3");
        //menambahkan objek mahasiswa
        la.tambah(n, n1, n2);
        //menampilkan list mahasiswa
        la.tampil();
        //update mahasiswa
        la.update(la.BinarySearch("201235"), new Mahasiswa ("201235", "Akhleema", "021xx2"));
        System.out.println("");
        la.tampil();
    }
}
