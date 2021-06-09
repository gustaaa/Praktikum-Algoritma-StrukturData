/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class GraphMain {
    public static void main(String[] args) throws Exception {
        boolean jenis;        
        Scanner sc = new Scanner(System.in);
        System.out.println("Pilih jenis graph");
        System.out.println("1. Directed");
        System.out.println("2. Undirected");
        System.out.print("Pilih : ");
        int pilih = sc.nextInt();
        if (pilih == 1){
            System.out.println("Menggunakan Directed");
            jenis = true;
        }else{
            System.out.println("Menggunakan Undirected");
            jenis = false;
        }
        System.out.println("");
        Graph graph = new Graph(6, jenis);
        System.out.print("Masukkan jumlah lintasan : ");
        int n = sc.nextInt();
        System.out.println("Hasil running\n");
        for(int i = 0; i <= n; i++){
            System.out.println("Masukkan path : ");
            System.out.print("Source :");
            int s = sc.nextInt();
            System.out.print("Destination : ");
            int d = sc.nextInt();
            graph.addEdge(s, d);
        }
        graph.printGraph();
        graph.degree(2);
        graph.removeEdge(1, 2);
        graph.printGraph();
        
    }
}
