
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class soal4 {
     public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
         int x = menu();
    if (x == 1){
        System.out.println("||---Menghitung Luas Lingkaran---||");
        System.out.print("\tMasukkan jari-jari lingkaran : ");
        int jari = input.nextInt();
        System.out.print("\tLuas Lingkaran dengan jari-jari "+jari+" adalah " + luasLing(jari));
    }else if(x == 2){
        System.out.println("||---Menghitung Luas Persegi Panjang---||");
        System.out.print("\tMasukkan panjang : ");
        int pjg = input.nextInt();
        System.out.println("\tMasukkan lebar : ");
        int lbr = input.nextInt();
        System.out.println("\tLuas Persegi Panjang dengan panjang "+pjg+" dan lebar "+lbr+" adalah "+luasPP(pjg,lbr));
    }else if(x == 3){
        System.out.println("||---Menghitung Luas Segitiga---||");
        System.out.print("\tMasukkan alas : ");
        int alas = input.nextInt();
        System.out.print("\tMasukkan tinggi : ");
        int tgg = input.nextInt();
        System.out.println("\tLuas Segitiga dengan alas "+alas+" dan tinggi "+tgg+" adalah "+luasSegitiga(alas,tgg));
    }else{
        System.out.println("\tInput Menu Yang Anda Masukkan Salah");
        System.out.println("\tApakah anda ingin memilih menu lagi? (1= yes; 0=no)");
        int lagi = input.nextInt();
        if(lagi==1){
            menu();
        }else{
            System.out.println("-------------STOP------------");
        }
    }
    }
     
    static int menu(){
        Scanner input = new Scanner (System.in);
        System.out.println("|||||-------------------------------|||||");
         System.out.println("\\==========MENU PILIHAN LUAS==========//");
         System.out.println("|||||-------------------------------|||||");
         System.out.println("\t1. Hitung Luas Lingkaran");
         System.out.println("\t2. Hitung Luas Persegi Panjang");
         System.out.println("\t3. Hitung Luas Segitiga");
         System.out.print("\tMasukkan pilihanmu : ");
        int pilih = input.nextInt();
        return pilih;
    }
     static float luasLing(int a){
         float phi, L;
         phi = (float) 3.14;
         L = (a*a)*phi;
         return L;
                  
     }
     static int luasPP(int p, int l){
        int luas = p * l;
        return luas;
    }
     static int luasSegitiga(int a, int t){
        int l = (a * t)/2;
        return l;
    }
}
