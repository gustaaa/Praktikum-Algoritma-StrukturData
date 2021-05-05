/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas.Nomer3;

/**
 *
 * @author Asus
 */
public class DLLQueue {
    int size;
    Node front;
    Node rear;
    
    public DLLQueue(){
        size = 0;
        front = rear = null;
    }
    
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return front==null;
    }
    public void print(){
        if(!isEmpty()){
            Node tmp=front;
            System.out.println("***********************");
            System.out.println("DAFTAR PENGANTRI VAKSIN");
            System.out.println("***********************");
            System.out.println("\n|No. \t|Nama \t|");
            while(tmp!=null){  
                System.out.println("|"+tmp.no+" \t|"+tmp.nama+" \t|");
                tmp=tmp.next;
            }
        } else{
            System.out.println("Linked List kosong!");
        }
    }
    public void Enqueue(String no, String nama){
        Node nsbh=new Node(null,null,no,nama);
        if(isEmpty()){
            front=nsbh;
            rear=nsbh;
        } else{
            nsbh.next=front;
            front=nsbh;
        }
        size++;
    }
    public void Dequeue(){
        if(isEmpty()){
            System.out.println("Linked List masih kosong!");
        } else if(front==rear){
            front=rear=null;
        } else{
            front=front.next;
        }
        size--;
    }
    public void getDataFront(){
        Node tmp=rear;
        System.out.println(tmp.nama+" telah selesai divaksinasi");
    }
}
