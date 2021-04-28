/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas.NomerEmpat;

/**
 *
 * @author Asus
 */
public class LinkedList {
    private Node pointer;    
    // contructor LL
    public LinkedList() {
        pointer = null;
    }
    
    //deklarasi method
    // membuat suatu node baru
    public void buatNode(Nasabah dt) {
        Node nodeBaru = new Node();
        nodeBaru.data = dt;
        nodeBaru.next = pointer;
        pointer = nodeBaru;
    }
    
    public boolean sisip(Nasabah dt1, Nasabah dt2) {
        Node n = pointer; //n digunakan utk mencari posisi dt2
        while ((n != null) && (n.data != dt2)) {
            n = n.next;
        }
        if (n == null) {
            return false;
        }
        Node nn = new Node();
        nn.data = dt1;
        nn.next = n.next;
        n.next = nn;
        return true;
    }
    
    public Object hapusDiDepan() {
        Node hapus = pointer;
        pointer = pointer.next;
        return hapus.data;
    }
    
    public void sisipDataDiAkhir(Nasabah data) {
        Node pSblAkhir, pAkhir;
        pSblAkhir = null;
        pAkhir = pointer;
        Node baru = new Node();
        baru.data = data;
        baru.next = null;
        while (pAkhir != null) {
            pSblAkhir = pAkhir;
            pAkhir = pAkhir.next;
        }
        pSblAkhir.next = baru;
    }
    
    public void hapusData(Nasabah dataHapus) {
        Node n = pointer;
        while ((n != null) && (n.next.data != dataHapus)) {
            n = n.next;
        }
        n.next = n.next.next;
    }
    public Node getPointer() {
        return pointer;
    } 
                  
    // cetak data
    public void cetak(String kom) {
        System.out.println("==================================================");
        System.out.println(kom);
        System.out.println("==================================================");
        Node n = pointer;
        while (n!= null) {
            System.out.print(n.data+"");
            n = n.next;
        }
        System.out.println("==================================================\n");
    }
}
