/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

/**
 *
 * @author Asus
 */
public class Buku {
    String judul, namaPengarang;
    int tahunTerbit, jmlHalaman, harga;
    
    Buku(String jd, String nm, int thn, int hal, int hg){
        judul = jd;
        namaPengarang = nm;
        tahunTerbit = thn;
        jmlHalaman = hal;
        harga = hg;
    }
    int size;
    int top;
    Buku data[];
    
    public Buku(int size){
        this.size = size;
        data = new Buku[size];
        top = -1;
    }
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull(){
        if(top == size-1){
            return true;
        }else{
            return false;
        }
    }
    public void push(Buku bk){
        if(!isFull()){
            top++;
            data[top] = bk;
        }else{
            System.out.println("Isi Stack Penuh!!!");
        }
    }
    public void pop(){
        if(!isEmpty()){
            Buku x = data[top];
            top--;
            System.out.println("Data yang keluar : "+x.judul+" "+
                    x.namaPengarang+" "+x.tahunTerbit+" "+
                    x.jmlHalaman+" "+x.harga);
            
        }else{
            System.out.println("Stack masih kosong");
        }
    }
    public void peek(){
        System.out.println("Elemen teratas : "+data[top].judul+ " "+
                data[top].namaPengarang+" "+data[top].tahunTerbit+" "+
                data[top].jmlHalaman+" "+data[top].harga);
    }
    public void print(){
        System.out.println("Isi Stack : ");
        for(int i = top; i >= 0; i--){
            System.out.println(data[i].judul+" "+data[i].namaPengarang+" "+
                    data[i].tahunTerbit+" "+data[i].jmlHalaman+" "+
                    data[i].harga);
        }
        System.out.println("");
    }
}
