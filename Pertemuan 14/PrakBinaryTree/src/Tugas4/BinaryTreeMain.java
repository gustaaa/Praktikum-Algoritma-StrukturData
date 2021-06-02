/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

/**
 *
 * @author Asus
 */
public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bt= new BinaryTree();
        
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        
        System.out.println("Traverse Pre Order");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.println("Traverse In Order");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.println("Traverse Post Order");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Mencari nilai node");
        System.out.println("Find "+bt.find(5));
        bt.delete(8);
        System.out.println("Traverse Pre Order");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.println("Menampilkan berapa jumlah leaf yang ada di dalam tree");
        System.out.println(bt.jumlahLeaf(bt.root));
    }
}
