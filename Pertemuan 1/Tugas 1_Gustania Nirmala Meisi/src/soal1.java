/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class soal1 {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------");
        System.out.println("//========== SELAMAT DATANG DI SMILE LAUNDRY ==========\\");
        System.out.println("---------------------------------------------------------");
        int Ani, Budi, Bina, Cita;
        Ani = 4; Budi = 15; Bina = 6; Cita = 11;
        double harga, disc, fix, bayar1 = 0,bayar2 = 0, bayar3 = 0, bayar4 = 0, total=0;
        harga = 4500; 
        disc = (harga *5)/100;
        fix = harga - disc;
            
        if (Ani > 10){  
            bayar1 = Ani*fix;
        }else if (Ani <= 10){
            bayar1 = Ani*harga;
        }
            
        if (Budi > 10){                
            bayar2 = Budi*fix;
        }else if (Budi <= 10){
            bayar2 = Budi*harga;
        }
     
        if (Bina > 10){                
            bayar3 = Bina*fix;
        }else if (Bina <= 10){
            bayar3 = Bina*harga;
        }
        
        if (Cita > 10){                
            bayar4 = Cita*fix;
        }else if (Cita <= 10){
            bayar4= Cita*harga;
        }
            total = bayar1+bayar2+bayar3+bayar4;
            System.out.println("---------------------------------------------------------");
            System.out.println("//========== REKAP PENGHASILAN SMILE LAUNDRY ==========\\");
            System.out.println("---------------------------------------------------------");
            System.out.println("Laundry Ani\t\t\t : " + Ani + " kg");
            System.out.println("Biaya yang harus dibayar\t : Rp. "+ bayar1);
            System.out.println("Laundry Budi\t\t\t : " + Budi + " kg");
            System.out.println("Biaya yang harus dibayar\t : Rp. " + bayar2);
            System.out.println("Laundry Bina\t\t\t : " + Bina + " kg");
            System.out.println("Biaya yang harus dibayar\t : Rp. " + bayar3);
            System.out.println("Laundry Cita\t\t\t : "+ Cita + " kg");
            System.out.println("Biaya yang harus dibayar\t : Rp. " + bayar4);
            System.out.println("Total Penghasilan yang diperoleh : Rp. " + total);
    }
}
