/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas.Nomer1;
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
        
        DLL dll=new DLL();
        int pilih;
        do{
            menu();
            System.out.print("Masukkan Pilhan Menu : ");
            pilih=sc.nextInt();
            switch (pilih){
                case 1:{
                    System.out.print("Masukkan Data Posisi Head : ");
                    int a = sc.nextInt();
                    dll.addFirst(a);
                    break;
                }
                case 2:{
                    System.out.print("Masukkan Data Posisi Tail : ");
                    int b = sc.nextInt();
                    dll.addLast(b);
                    break;
                }
                case 3:{
                    System.out.println("Masukkan Data");
                    System.out.print("Data Node : ");
                    int a = sc.nextInt();
                    System.out.print("Alamat Pointer : ");
                    int b = sc.nextInt();
                    dll.add(a, b);
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
                    System.out.print("Masukkan data yang ingin dicari : ");
                    int n = sc.nextInt();
                    dll.search(n);
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
       
       

