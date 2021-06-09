/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class GraphMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Graph graph = new Graph(6);
        //Mengubah lintasan menjadi inputan
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
