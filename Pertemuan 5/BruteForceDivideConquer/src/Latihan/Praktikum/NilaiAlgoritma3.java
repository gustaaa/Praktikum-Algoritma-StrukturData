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
public class NilaiAlgoritma3 {
    public String nama;
    public int tugas;
    public int kuis;
    public int UTS;
    public int UAS;
    public double total;
    public double rata[];
    double avg = 0;
    
    NilaiAlgoritma3(){
        
    }   
    double hitungTotalNilai(int tugas, int kuis, int uts, int uas){
        this.total = (tugas*30)/100 + (kuis*20)/100 + (uts*20)/100 + (uas*30)/100;
        return total;
    }
    void hitungTotalRata(double rata){
        avg += rata;
        //return avg;
    }
}
