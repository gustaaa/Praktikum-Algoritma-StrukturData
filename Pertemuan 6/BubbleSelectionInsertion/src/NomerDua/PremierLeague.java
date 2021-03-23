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
public class PremierLeague {
    String team;
    int play;
    int goal;
    int points;

    PremierLeague(String t, int p, int g, int pt){
        team = t;
        play = p;
        goal = g;
        points = pt;
        
    }
    void tampil(){
        System.out.println("Nama team\t : "+team);
        System.out.println("Pertandingan\t : "+play);
        System.out.println("Goal\t\t : "+goal);
        System.out.println("Poin\t\t : "+points);
    }
}
