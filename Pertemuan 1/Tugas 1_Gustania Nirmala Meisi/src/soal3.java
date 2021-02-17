
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, x, i;
        System.out.print("Masukan Deret : ");
        n =input.nextInt();
        int banyak [] = new int[n];
        for(i = 1; i <=banyak.length; i++){
            if(i%2 == 0){
                if(i%4==0){
                    continue;
                }
                System.out.print(" "+i);
            }
                            
        }
    }
}
