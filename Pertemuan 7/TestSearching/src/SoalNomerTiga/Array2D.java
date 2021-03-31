/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoalNomerTiga;

/**
 *
 * @author Asus
 */
public class Array2D {
    int a[][];
    int nilai1;
    int nilai2;
    Array2D(int array[][], int n1, int n2){
        nilai1 = n1;
        nilai2 = n2;
        a = new int[n1][n2];
        for(int i=0; i<nilai1;i++){
            for(int j=0; j<nilai2;j++){
                a[i][j] = array[i][j];
            }
        }
    }
    void tampilAll(){
       for(int i = 0; i < nilai1; i++){
           for(int j = 0; j < nilai2; j++){
               System.out.print(a[i][j]+" "); 
           }
           System.out.println(" ");
       } 
    }
    public int FindSeqSearch(int cari){
        int posisi = -1;
        int posisi1 = 0;
        for(int i = 0; i < nilai1; i++){
            for (int j = 0; j < nilai2; j++){
                if(a[i][j] == cari){
                    posisi = i;
                    posisi1 = j;
                    System.out.println("Nilai : "+cari+ " Ada pada baris ke- "+posisi1+ " kolom ke- "+posisi);
                    break;              
                }
            }
        }
        return posisi;
    }

    
}
