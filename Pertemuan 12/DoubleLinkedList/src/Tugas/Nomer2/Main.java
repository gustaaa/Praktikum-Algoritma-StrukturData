/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas.Nomer2;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Main {
    static void menu(){
        System.out.println("****************************");
        System.out.println("   DATA BUKU PERPUSTAKAAN   ");
        System.out.println("****************************");
        System.out.println("\n1. Entry Judul Buku ");
        System.out.println("2. Ambil Buku Teratas");
        System.out.println("3. Cek Judul Buku Teratas");
        System.out.println("4. Info Semua Judul Buku");
        System.out.println("5. Keluar");
        System.out.println("\n****************************");
    }
    public static void main(String args[]) throws Exception{
        Scanner sc=new Scanner(System.in);
        Scanner sc1 = new Scanner (System.in);
        DLLStack dll=new DLLStack();
        int pilih;
        do{
            menu();
            System.out.print("Masukkan Pilhan Menu : ");
            pilih=sc.nextInt();
            switch (pilih){
                case 1:{
                    System.out.println("--------------------");
                    System.out.println("Masukkan Judul Buku ");
                    System.out.println("--------------------");
                    String a = sc1.nextLine();
                    dll.push(a);
                    break;
                }
                case 2:{
                    dll.pop();
                    System.out.println("---------------------------------");
                    System.out.println("Tumpukan teratas berhasil diambil");
                    System.out.println("---------------------------------");
                    break;
                }
                case 3:{
                    System.out.println("----------------");
                    System.out.println("Cek Buku Teratas");
                    System.out.println("----------------\n"+dll.peek());                    
                    break;
                }
                case 4:{
                    System.out.println("------------------------");
                    System.out.println("Cetak Seluruh Judul Buku");
                    System.out.println("------------------------");
                    dll.print();
                    break;
                }
                default:
                    if(pilih>5&&pilih<0){
                        System.out.println("Pilihan salah!");
                    }
                    break;
            }
            System.out.println("");
        } while(pilih != 5 && pilih != 0);
    }
}
