/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan.Praktikum.Soal1;

/**
 *
 * @author Asus
 */
public class Lingkaran {
    double PHI, r;
    double hitungLuas(){
        double L = (r*r)*PHI;
        return L;
        
    }
    double hitungKeliling(){
        double K = (2*r)*PHI;
        return K;
        
    }
    
}
