/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas.NomerEmpat;

/**
 *
 * @author Asus
 */
public class Nasabah {
    String nama;
    String alamat;
    String rek;
    
    public Nasabah(String no, String nm, String al){
        nama = nm;
        alamat = al;
        rek = no;
    }
    public String getRek (){
        return this.rek;
    }
    
    //ambil nilai nim
    public String getAlamat(){
        return this.alamat;
    }
    
    //ambil nilai nama
    public String getNama(){
        return this.nama;
    }
    
    //cetak di format dalam bentuk string
    public String toString (){
        return String.format("%s\t| %.6s\t| %s\t|\n", rek, nama, alamat);
    }
}
