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
public class Main {
    public static void main(String[] args) {
        Nasabah mhs1 = new Nasabah ("200232114465", "Annisa H ", "Malang");
        Nasabah mhs2 = new Nasabah ("200231002145", "Hamidah D ", "Jember");
        Nasabah mhs3 = new Nasabah ("200212654433", "Ariani P  ", "Bandung");
        Nasabah mhs4 = new Nasabah ("200212432672", "Banu Af ", "Jakarta");
        Nasabah mhs5 = new Nasabah ("200211896543", "Sinar B", "Blitar");
  
        LinkedList ssl = new LinkedList();
        ssl.buatNode(mhs1);
        ssl.buatNode(mhs2);
        ssl.buatNode(mhs3);
        ssl.buatNode(mhs4);
        ssl.cetak("NOREK\t\t| Nama\t\t| Alamat\t|");
        System.out.println("Dimasukkan data baru ");
        ssl.sisip(mhs5, mhs2);
        ssl.cetak("NOREK\t\t| Nama\t\t| Alamat\t|");
        ssl.hapusDiDepan();
        ssl.cetak("NOREK\t\t| Nama\t\t| Alamat\t|");
        ssl.hapusData(mhs5);
        ssl.cetak("NOREK\t\t| Nama\t\t| Alamat\t|");

    }
}
