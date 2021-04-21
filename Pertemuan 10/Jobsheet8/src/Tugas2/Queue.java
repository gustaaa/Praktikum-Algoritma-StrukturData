/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author Asus
 */
public class Queue { 
    public int max;
    public int size;
    public int front;
    public int rear;
    Mahasiswa[] antrian;
    
    public Queue(int max){
        this.max = max;
        Create();
    }
    public void Create(){
        antrian = new Mahasiswa [max];
        size = 0;
        front = rear = -1;
    }
    public boolean IsEmpty(){
        if (size == 0){
            return true;
            
        }else{
            return false;           
        }
    }
    public boolean IsFull(){
        if(size == max){
            return true;
        }else{
            return false;
        }
    }
    public void peek(){
        if (!IsEmpty()){
            System.out.println("Elemen terdepan : "+antrian[front].nim+" "+antrian[front].nama
                                +" "+antrian[front].absen+" "+antrian[front].ipk);
        }else{
            System.out.println("Queue masih kosong");
        } 
    }
    public void peekRear(){
       if (!IsEmpty()){
            System.out.println("Elemen terakhir : "+antrian[rear].nim+" "+antrian[rear].nama
                                +" "+antrian[rear].absen+" "+antrian[rear].ipk);
        }else{
            System.out.println("Queue masih kosong");
        } 
    }
    public void peekPosition(String nim){
        
    }
    public void print(){
        if(IsEmpty()){
            System.out.println("Queue maih kosong");
        }else{
            int i = front;
            while (i != rear){
                System.out.println(antrian[front].nim+" "+antrian[front].nama
                                +" "+antrian[front].absen+" "+antrian[front].ipk);
                i = (i+1)%max;
                System.out.println("");
            }
            System.out.println(antrian[i]+" ");
            System.out.println("Jumlah elemen = "+size);
        }
    }
    public void printMahasiswa(int posisi){
        
    }
    public void clear(){
        if(!IsEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    public void Enqueue(Mahasiswa data){
        if(IsFull()){
            System.out.println("Data sudah penuh");
            
        }else{
            if(IsEmpty()){
                front = rear = 0;
            }else{
                rear++;
            }
        }
        antrian[rear] = data;
        size++;
    }
    public Mahasiswa Dequeue(){
        Mahasiswa data = new Mahasiswa("","",0,0);
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        }else{
            data = antrian[front];
            size--;
            if(IsEmpty()){
                front = rear = -1;
            }else{
                if(front == max-1){
                    front = 0;
                }else{
                    front++;
                }
            }
        }
        return data;
    }
}
