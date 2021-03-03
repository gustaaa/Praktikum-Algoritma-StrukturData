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
public class Bola {
    public float jari;
    public float phi;
    
    public Bola (float p, float r){
        phi = p;
        jari = r;
    }
    public float hitungLuas(){
        float L = 4*phi*jari*jari;
        return L;
        
    }
    public float hitungVolume(){
        float V = (4/3)*phi*jari*jari*jari;
        return V;
        
    }
}
