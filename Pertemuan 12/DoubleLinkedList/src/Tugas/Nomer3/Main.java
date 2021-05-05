/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas.Nomer3;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Main {
    static void menu(){
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("===================================================");
    }
    public static void main(String args[]) throws Exception{
        Scanner sc=new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        DLLQueue dll=new DLLQueue();
        int pilih;
        do{
            menu();
            System.out.print("Masukkan Pilhan Menu : ");
            pilih=sc.nextInt();
            switch (pilih){
                case 1:{
                    System.out.println("=============================");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-----------------------------");
                    System.out.println("Nomor Antrian :");
                    String no = sc1.nextLine();
                    System.out.println("Nama Penerima :");
                    String nama = sc1.nextLine();
                    dll.Enqueue(no, nama);
                    break;
                }
                case 2:{
                    dll.getDataFront();
                    dll.Dequeue();
                    dll.print();
                    System.out.println("Sisa Antrian : "+dll.size());
                    break;
                }
                case 3:{
                    dll.print();
                    System.out.println("Sisa Antrian : "+dll.size());
                    break;
                }
                default:
                    if(pilih>4||pilih<0){
                        System.out.println("Pilihan salah!");
                    }
                    break;
            }
            System.out.println("");
        } while(pilih != 4 && pilih != 0);
    }
}
