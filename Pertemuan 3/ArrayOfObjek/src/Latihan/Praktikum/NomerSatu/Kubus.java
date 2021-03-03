/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan.Praktikum.NomerSatu;

/**
 *
 * @author Asus
 */
public class Kubus {
    public int sisi;
    
    public Kubus (int s){
        sisi = s;
    }
    public int hitungVolume(){
        int V = sisi*sisi*sisi;
        return V;        
    }
    public int hitungLuas(){
        int L = 6*sisi*sisi;
        return L;
        
    }
}
