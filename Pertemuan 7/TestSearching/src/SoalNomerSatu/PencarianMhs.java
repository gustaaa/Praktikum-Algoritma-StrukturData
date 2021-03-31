/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoalNomerSatu;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class PencarianMhs {
    //Mahasiswa listMhs[] = new Mahasiswa[5];
    //modifikasi program
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();    
    Mahasiswa listMhs[] = new Mahasiswa[n];
    int idx;
    
    void tambah(Mahasiswa m){
        if (idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
            
        }else {
            System.out.println("Data sudah penuh!");
        }
    }
    void tampilAll(){
         for(Mahasiswa m : listMhs){
             m.tampil();
             System.out.println("----------------------------------------");
             
         }
    }
    //modifikasi soal latihan 1
    public void bubbleSort(){
        for(int i = 0; i<listMhs.length-1; i++){
            for(int j = 1; j<listMhs.length-i; j++){
                if(listMhs[j].nim<listMhs[j-1].nim){
                    Mahasiswa tmp = listMhs[j-1];
                    listMhs[j-1] = listMhs[j];
                    listMhs[j] = tmp;
                }
            }
        }
    }
    public int FindSeqSearch(int cari){
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++){
            if(listMhs[j].nim == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    
    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if(right >= left){
            mid = (left + right)/2;
            if(cari == listMhs[mid].nim){
                return (mid);           
            }else if(listMhs[mid].nim > cari){
                return FindBinarySearch(cari, left, mid-1);
                //modifikasi program
            }else if(listMhs[mid].nim < cari){
                return FindBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
    public void Tampilposisi(int x, int pos){
        if (pos != -1){
            System.out.println("data : "+ x + " ditemukan pada indeks "+pos);
            
        }else{
            System.out.println("data : "+x+" tidak ditemukan");
        }
    }
    public void TampilData(int x, int pos){
        if (pos!= -1){
            System.out.println("Nim\t : "+x);
            System.out.println("Nama\t : "+listMhs[pos].nama);
            System.out.println("Umur\t : "+listMhs[pos].umur);
            System.out.println("IPK\t : "+listMhs[pos].ipk);
        }else{
            System.out.println("data "+x+" tidak ditemukan");
        }
    }
}

