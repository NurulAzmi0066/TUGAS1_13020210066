/*Nama	 : Nurul Azmi
NIM	 : 13020210066
Hari/Tgl : Rabu, 8 Maret 2023*/

import java.util.*;

public class KonfersiWaktu{
    public static void main(String[] args){ 
    Scanner userInput = new Scanner(System.in);
    
    System.out.println("\tKonversi Waktu");
    System.out.println("     (jam : menit : detik)");
    System.out.println("===============================");
    System.out.print("Masukkan Jumlah Detik = ");
    int masukan = userInput.nextInt();
    
    int detikSekarang = masukan % 60;
    int totalMenit = masukan / 60;
    int menitSekarang = totalMenit % 60;
    int totalJam = totalMenit / 60;
    int jamSekarang = totalJam % 24;

    
    System.out.println("Hasil Konversinya = "+ jamSekarang + " : " + menitSekarang + " : "+detikSekarang );
    }
         

}

