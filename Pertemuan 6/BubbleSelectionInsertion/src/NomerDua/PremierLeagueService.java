/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NomerDua;

/**
 *
 * @author Asus
 */
public class PremierLeagueService {
    PremierLeague[] leagues = new PremierLeague[20];
    int n;
public void tambah(PremierLeague x){
   if (n<leagues.length) {
       leagues[n] = x;
       n++;
   }else {
       System.out.println("Semua team sudah terdata");
   }
}
void tampilAll(){
    for(PremierLeague x : leagues){
      x.tampil();
        System.out.println("-----------------------------------");
    }
}
/*void insertionSortAsc(){
    for(int i = 1; i<leagues.length; i++){
        PremierLeague temp = leagues[i];
        int j = i;
        while (j > 0 && leagues[j -1].points > temp.points){
            leagues[j] = leagues[j - 1];
            j--;
        }
        leagues[j] = temp;
    }
}
void insertionSortDesc(){
    for(int i = 1;i < leagues.length; i++){
        PremierLeague temp = leagues[i];
        int j = i;
        while (j > 0 && leagues[j-1].points < temp.points){
            leagues[j] = leagues[j-1];
            j--;
        }
        leagues[j] = temp;
    }
}*/
void insertionSort(boolean asc){
    for(int i = 1;i < leagues.length; i++){
        PremierLeague temp = leagues[i];
        int j = i;
        if(asc){
            while (j > 0 && leagues[j-1].points < temp.points){
            leagues[j] = leagues[j-1];
            j--;
            }        
        }else{
            while (j > 0 && leagues[j-1].points < temp.points){
            leagues[j] = leagues[j-1];
            j--;
            }
        }
        leagues[j] = temp;
        }
    }
}
