/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas5;

/**
 *
 * @author Asus
 */
public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray();
        int [] data = {6, 4, 8, 3, 5, 7, 9, 0, 0,0 };
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.println("Traverse In Order");
        bta.traverseInOrder(0);
        System.out.println("");
        System.out.println("Traverse Pre Order");
        bta.traversePreOrder(0);
        System.out.println("");
        System.out.println("Traverse Post Order");
        bta.traversePostOrder(0);
        System.out.println("");
        System.out.println("---------------------------------------------------");
        bta.add(11, 3);
        System.out.println("Traverse In Order");
        bta.traverseInOrder(0);
        System.out.println("");
        System.out.println("Traverse Pre Order");
        bta.traversePreOrder(0);
        System.out.println("");
        System.out.println("Traverse Post Order");
        bta.traversePostOrder(0);
        System.out.println("");
    }
}
