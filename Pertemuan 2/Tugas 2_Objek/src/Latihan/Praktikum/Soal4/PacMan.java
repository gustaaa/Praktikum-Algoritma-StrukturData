/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan.Praktikum.Soal4;

/**
 *
 * @author Asus
 */
public class PacMan {
    int x,y,width,height;
    void moveLeft(){
        x -= 1;
    }
    void moveRight(){
        x += 1;
    }
    void moveUp(){
        y -= 1;
    }
    void moveDown(){
        y += 1;
    }
    void printPosition(){
        for (int i = 0; 1 < width; i++){
            for (int j = 0; j < width; j++){
                if (i == y && j == x){
                    System.out.print(" :3 ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }        
    }
}
