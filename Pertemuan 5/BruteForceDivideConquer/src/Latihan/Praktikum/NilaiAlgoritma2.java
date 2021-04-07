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
public class NilaiAlgoritma2 {
    public String namaMhs;
    public int nilaiTugas;
    public int nilaiKuis;
    public int nilaiUTS;
    public int nilaiUAS;
    public double total;
    public double rata[];
    double avg = 0;
    
    NilaiAlgoritma2(){
        
    }   
    double hitungTotalNilai(int tugas, int kuis, int uts, int uas){
        this.total = (tugas*30)/100 + (kuis*20)/100 + (uts*20)/100 + (uas*30)/100;
        return total;
    }
}
