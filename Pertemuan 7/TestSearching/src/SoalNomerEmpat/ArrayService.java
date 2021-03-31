/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoalNomerEmpat;

/**
 *
 * @author Asus
 */
public class ArrayService {
    int idx;
    Array arr[];
    
    ArrayService(int x){
        this.arr = new Array[x];
    }
    void tambah(Array a){
        if(idx < arr.length){
            arr[idx] = a;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!!");
        }
    }
    void tampil(){
        for(Array n : arr){
            n.tampil();
        }
    }
    public void bubbleSort(){
        for(int i = 0; i<arr.length-1; i++){
            for(int j = 1; j<arr.length-i; j++){
                if(arr[j].nilai<arr[j-1].nilai){
                    Array tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
    public void tampilPosisi(int n, int x){
        if(x != -1){
            System.out.println("Data "+n+" ditemukan di indeks ke- "+x);
        }else{
            System.out.println("Data "+n+" tidak ditemukan");
        }
    }
    public void tampilData(int n, int x){
        if(x != -1){
            System.out.println("Nilai : "+arr[x].nilai);
        }else{
            System.out.println("Data "+n+" tidak ditemukan");
        }
    }
    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if(right >= left){
            mid = (left + right)/2;
            if(cari == arr[mid].nilai){
                if(cari == arr[mid].nilai){
                    tampilPosisi(cari, mid);
                    tampilData(cari, mid);
                    return (mid); 
                }
                if(cari == arr[left].nilai || cari == arr[right].nilai){
                    if(cari == arr[left].nilai){
                        tampilPosisi(cari, left);
                        tampilData(cari, left);
                        System.out.println("Kiri Basecase");
                    }
                    if(cari == arr[right].nilai){
                        tampilPosisi(cari, right);
                        tampilData(cari, right);
                        System.out.println("Kanan Basecase");                    
                    }
                }
            }else if(arr[mid].nilai < cari){
                if(cari == arr[left].nilai || cari == arr[right].nilai){
                    if(cari == arr[left].nilai){
                        tampilPosisi(cari, left);
                        tampilData(cari, left);
                        return FindBinarySearch(cari, left, mid-1);
                    }else{
                        tampilPosisi(cari, right);
                        tampilData(cari, right);
                    return FindBinarySearch(cari, left, mid-1);
                    }
                }
                return FindBinarySearch(cari, left, mid-1);   
            }else {
                if(cari == arr[left].nilai || cari == arr[right].nilai){
                    if(cari == arr[left].nilai){
                        tampilPosisi(cari, left);
                        tampilData(cari, left);
                        return FindBinarySearch(cari, mid+1, right);
                    }else{
                        tampilPosisi(cari, right);
                        tampilData(cari, right);
                    return FindBinarySearch(cari, mid+1, right);
                    }
                }
                return FindBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
}
