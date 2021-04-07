
import Minggu5.Pangkat;
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
public class MainPangkat {

    private static String ulang;
    private static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==============================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihituung : ");
        int elemen = sc.nextInt();
        Pangkat[] png = new Pangkat[elemen];
        int n[] = new int[elemen];
        int p[] = new int[elemen];
        for(int i = 0; i < elemen; i++){            
            System.out.print("Masukkan nilai yang akan dipangkat ke- "+(i+1)+" : ");
            n[i] = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat ke- "+(i+1)+" : ");
            p[i] = sc.nextInt();
            png[i] = new Pangkat(n[i], p[i]);
        }
        do{
            int x = menuUtama();
            if (x == 1){
                System.out.println("==============================================");
                System.out.println("Hasil Pangkat dengan Brute Force");
                for(int i = 0; i < elemen; i++){
                System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }   
            }else if(x == 2){
                System.out.println("==============================================");
                System.out.println("Hasil Pangkat dengan Divide and Conquer");
                for(int i = 0; i < elemen; i++){
                System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
            }else{
                System.out.println("Anda Keluar Dari Perhitungan");
            }
        System.out.println("==============================================");
        System.out.println();
        System.out.print("Apakah Anda Ingin Memilih Menu Lainnya (Y/T) ?  ");
        sc.nextLine();
        ulang = sc.nextLine();                    
        }while(ulang.equalsIgnoreCase("y"));
        n++;
    }
    static Scanner sc = new Scanner(System.in);   
    static int menuUtama(){             
        int menu;
        System.out.println("||==========================================================================||");
        System.out.println("\t\t\t       MENU UTAMA HITUNG PANGKAT");
        System.out.println("||==========================================================================||");
        System.out.println(" 1. Menu Hitung Brute Force");
        System.out.println(" 2. Menu Hitung Divide Conquer");
        System.out.println(" 3. Menu Keluar");
        System.out.println(" Silahkan pilih salah satu menu : ");
        System.out.print(" -->> ");
        menu = sc.nextInt();
        return menu;
    }
}
