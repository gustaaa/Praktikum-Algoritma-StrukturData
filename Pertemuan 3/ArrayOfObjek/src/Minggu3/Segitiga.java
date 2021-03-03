/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu3;

/**
 *
 * @author Asus
 */
public class Segitiga {
    public int alas;
    public int tinggi;
    
    public Segitiga(int a, int t){
       alas = a;
       tinggi = t;
    }
    
    public int hitungLuas(){
        int L = (alas*tinggi)/2;
        return L;
        
    }
    public int hitungKeliling(){
        int K = alas+tinggi+alas;
        return K;
        
    }
}
