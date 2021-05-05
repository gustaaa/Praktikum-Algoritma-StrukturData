/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas.Nomer4;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Main {
    static void menu(){
        System.out.println("===================================================");
        System.out.println("PROGRAM PENGOLAHAN ANGKA DENGAN DOUBLY LINKED LIST");
        System.out.println("===================================================");
        System.out.println("1. Tambah Head");
        System.out.println("2. Tambah Tail");
        System.out.println("3. Tambah Data");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari");
        System.out.println("9. Urut");
        System.out.println("10. Keluar");
        System.out.println("===================================================");
    }
    public static void main(String args[]) throws Exception{
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        Mahasiswa dll=new Mahasiswa();
        int pilih;
        do{
            menu();
            System.out.print("Masukkan Pilhan Menu : ");
            pilih=sc.nextInt();
            switch (pilih){
                case 1:{
                    System.out.println("Masukkan Data Posisi Awal");
                    System.out.println("Data Node : ");
                    System.out.print("NIM : ");
                    String nim = sc1.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc1.nextLine();
                    System.out.print("IPK : ");
                    double ipk = sc.nextDouble();
                    dll.addFirst(nim, nama, ipk);
                    break;
                }
                case 2:{
                    System.out.print("Masukkan Data Posisi Akhir");
                    System.out.println("Data Node : ");
                    System.out.print("NIM : ");
                    String nim = sc1.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc1.nextLine();
                    System.out.print("IPK : ");
                    double ipk = sc.nextDouble();
                    dll.addLast(nim, nama, ipk);
                    break;
                }
                case 3:{
                    System.out.println("Masukkan Data Posisi Tertentu");
                    System.out.println("Data Node : ");
                    System.out.print("NIM : ");
                    String nim = sc1.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc1.nextLine();
                    System.out.print("IPK : ");
                    double ipk = sc.nextDouble();
                    System.out.print("Alamat Pointer : ");
                    int b = sc.nextInt();
                    dll.add(nim, nama, ipk, b);
                    break;
                }
                case 4:{
                    dll.removeFirst();
                    System.out.println("Data Pertama Berhasil Di Hapus");
                    break;
                }
                case 5:{
                    dll.removeLast();
                    System.out.println("Data Terakhir Berhasil Di Hapus");
                    break;
                }
                case 6:{
                    System.out.println("Masukkan indeks data yang ingin dihapus");
                    System.out.print("Indeks ke : ");
                    int n = sc.nextInt();
                    dll.remove(n);
                    break;
                }
                case 7:{
                    dll.print();
                    break;
                }
                case 8:{
                    System.out.println("Cari Data");
                    System.out.print("Masukkan NIM yang dicari : ");
                    String nim = sc1.nextLine();
                    dll.search(nim);
                    break;    
                }
                case 9:{
                    dll.sort();
                    break;
                }
                default:
                    if(pilih>10&&pilih<0){
                        System.out.println("Pilihan salah!");
                    }
                    break;
            }
            System.out.println("");
        } while(pilih != 10 && pilih != 0);
    }
}
