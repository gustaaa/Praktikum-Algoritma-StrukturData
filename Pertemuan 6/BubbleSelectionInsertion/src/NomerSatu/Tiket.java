/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NomerSatu;

/**
 *
 * @author Asus
 */
public class Tiket {
    String maskapai, asal, tujuan;
    int harga;
    
    Tiket(String m,int h, String a, String t){
        maskapai = m;
        harga = h;
        asal = a;
        tujuan = t;

    }
    void tampil(){
        System.out.println("Nama maskapai\t\t : "+maskapai);
        System.out.println("Asal Penerbangan\t : "+asal);
        System.out.println("Tujuan Penerbangan\t : "+tujuan);
        System.out.println("Harga Tiket\t\t : Rp. "+harga);
    }
}
