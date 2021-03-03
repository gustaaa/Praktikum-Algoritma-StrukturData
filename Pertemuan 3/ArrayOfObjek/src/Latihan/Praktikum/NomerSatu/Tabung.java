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
public class Tabung {
    public float jari;
    public float tinggi;
    public float phi;
    
    public Tabung(float p, float r, float t){
        phi = p;
        jari = r;
        tinggi = t;
    }
    public float hitungLuas(){
        float L = 2*phi*jari*(jari+tinggi);
        return L;
        
    }
    public float hitungVolume(){
        float V = phi*jari*jari*tinggi;
        return V;
        
    }
}
