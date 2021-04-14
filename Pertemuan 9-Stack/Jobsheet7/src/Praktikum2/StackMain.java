/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class StackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Buku st = new Buku(8);
        int n = 0;
        String ulang;
        char pilih;
        do{
            System.out.print("Judul : ");
            String judul = sc.nextLine();
            System.out.print("Nama Pengarang : ");
            String nama = sc.nextLine();
            System.out.print("Tahun Terbit : ");
            int tahun = sc.nextInt();
            System.out.print("Jumlah Halaman : ");
            int jml = sc.nextInt();
            System.out.print("Harga : ");
            int hrg = sc.nextInt();
            
            Buku bk = new Buku(judul, nama, tahun, jml, hrg);
            System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n)? ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
            st.push(bk);
        }while(pilih == 'y');
        st.print();
        do{
            int x = menuUtama();
            if (x == 1){
                st.push(st);
            }else if(x == 2){
                st.pop();
            }else if(x == 3){
                st.peek();
            }else if(x == 4){
                st.print();
            }else{
                System.out.println("Anda Keluar Dari Menu");
            }           
            System.out.println();
            System.out.print("Apakah Anda Ingin Memilih Menu Lainnya (Y/T) ?  ");
            sc.nextLine();
            ulang = sc.nextLine();                 
        }while(ulang.equalsIgnoreCase("y"));
        n++; 
    }   
    static int menuUtama(){ 
        Scanner sc = new Scanner(System.in);
        int menu;
        System.out.println("||==========================================================================||");
        System.out.println("\t\t\t         MENU UTAMA UTS");
        System.out.println("||==========================================================================||");
        System.out.println(" 1. Menu Tampil Push");
        System.out.println(" 2. Menu Tampil Pop");
        System.out.println(" 3. Menu Tampil Peek");
        System.out.println(" 4. Menu Tampil Print");
        System.out.println(" 5. Menu Keluar");
        System.out.println(" Silahkan pilih salah satu menu : ");
        System.out.print(" -->> ");
        menu = sc.nextInt();
        return menu;
    }
}
