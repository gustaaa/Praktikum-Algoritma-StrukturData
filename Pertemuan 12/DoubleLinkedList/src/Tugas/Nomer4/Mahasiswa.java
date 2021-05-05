/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas.Nomer4;

/**
 *
 * @author Asus
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private double ipk;
    
    //deklarasi konstruktor
    public Mahasiswa (String nim, String nama, double ipk){
        
        this.nama = nama;
        this.ipk = ipk;
        this.nim = nim;
    } 
    //deklarasi method
    //ambil nilai ipk
    public double getIpk (){
        return this.ipk;
    }
    
    //ambil nilai nim
    public String getNim(){
        return this.nim;
    }
    
    //ambil nilai nama
    public String getNama(){
        return this.nama;
    }
    
    //cetak di format dalam bentuk string
    public String toString (){
        return String.format("%s\t| %.6s\t| %s\t|\n", nim, nama, ipk);
    }
    Node head;
    int size;
    private Node pointer;   
    
    public Mahasiswa(){
        pointer = null;
        head = null;
        size = 0;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(String nim, String nama, double ipk){
        if (isEmpty()){
            head = new Node (null, null, ipk, nim, nama);
        }else{
            Node newNode = new Node(null, head, ipk, nim, nama);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(String nim, String nama, double ipk){
        if (isEmpty()){
            //addFirst(String nim, String nama, double ipk);
        }else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            Node newNode = new Node(current, null, ipk, nim, nama);
            current.next = newNode;
            size++;
        }
    }
    public void add(String nim, String nama, double ipk, int index) throws Exception {
        if (isEmpty()){
           // addFirst(item);
        }else if (index < 0 || index > size){
            throw new Exception ("Nilai indeks diluar batas");
        }else{
            Node current = head;
            int i = 0;
            while (i < index){
                current = current.next;
                i++;
            }
            if(current.prev == null){
                Node newNode = new Node(null, current, ipk, nim, nama);
                current.prev = newNode;
                head = newNode;
            }else{
                Node newNode = new Node(current.prev, current, ipk, nim, nama);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    public int size(){
        return size;
    }
    public void clear(){
        head = null;
        size = 0;
    }
    public void print(){
        if (!isEmpty()){
            Node tmp = head;
            System.out.println("*****************************");
            System.out.println("\tCETAK DATA");
            System.out.println("*****************************");
            System.out.println("|No. \t|Nama \t|IPK \t|");
            while(tmp!=null){  
                System.out.println("|"+tmp.nim+" \t|"+tmp.nama+" \t|"+tmp.ipk+"\t|");
                tmp=tmp.next;
            }
            System.out.println("\nBerhasil Diisi");
        }else{
            System.out.println("Linked Lists Kosong");
        }
    }
    public void removeFirst() throws Exception{
        if (isEmpty()){
            throw new Exception ("Linked List masih kosong, tidak dapat dihapus!");
        }else if(size == 1){
            removeLast();
        }else{
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    public void removeLast() throws Exception{
        if (isEmpty()){
            throw new Exception ("Linked List masih kosong, tidak dapat dihapus!");
        }else if (head.next == null){
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }
    public void remove(int index) throws Exception{
        if (isEmpty() || index >= size){
            throw new Exception ("Nilai indeks diluar batas");
        }else if (index == 0){
            removeFirst();
        }else{
            Node current = head;
            int i = 0;
            while (i < index){
                current = current.next;
                i++;
            }
            if (current.next == null){
                current.prev.next = null;
            }else if(current.prev == null){
                current = current.next;
                current.prev = null;
                head = current;
            }else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
    public void search(String nim)throws Exception{
        int i=0;
        boolean flag=false;
        Node current=head;
        if(head==null){
            System.out.println("List masih kosong!");
            return;
        }
        while(current!=null){
            if(current.nim.equalsIgnoreCase(nim)){
                flag=true;
                break;
            }
            current=current.next;
            i++;
        }
        if(flag){
            System.out.println("Data "+nim+" berada di node ke-"+i);
            System.out.println("*****************************");
            System.out.println("\tCETAK DATA");
            System.out.println("*****************************");
            System.out.println("|No. \t|Nama \t|IPK \t|");
            System.out.println("|"+current.nim+" \t|"+current.nama+" \t|"+current.ipk+" \t|");
        } else{
            System.out.println("Data tidak ditemukan!");
        }
    }
    public void sort()throws Exception{
        Node current=null, idx=null;
        double tmp;
        if(head==null){
            return;
        } else{
            for(current=head; current.next!=null; current=current.next){
                for(idx=current.next; idx!=null; idx=idx.next){
                    if(current.ipk<idx.ipk){
                        tmp=current.ipk;
                        current.ipk=idx.ipk;
                        idx.ipk=tmp;
                    }
                }
            }
        }
        print();
    }
}
