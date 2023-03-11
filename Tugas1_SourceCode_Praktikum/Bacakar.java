/*Nama	 : Nurul Azmi
NIM	 : 13020210066
Hari/Tgl : Rabu, 8 Maret 2023*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.*;
import java.io.Console;

public class Bacakar {
    public static void main(String[] args) throws IOException {
        char cc;
        int bil;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader dataIn = new BufferedReader(isr);
        Scanner scanner = new Scanner(System.in);
        Console console = System.console();

        /* Algoritma */
        System.out.print("hello\n");

        // Membaca input BufferedReader
        System.out.print("baca 1 karakter: ");
        cc = dataIn.readLine().charAt(0);

        // Membaca input Scanner
        System.out.print("baca 1 bilangan: ");
        bil = scanner.nextInt();

        // Membaca input JOptionPane
        String kar = JOptionPane.showInputDialog("Karakter 1 : ");
        System.out.println(kar);

        // Menampilkan Kembali Data Inputan
	System.out.print("\n===========================\n");
        JOptionPane.showMessageDialog(null, "hello");
        System.out.print(cc + "\n" + bil + "\n");
        System.out.print(kar +"\n" +"bye \n");
    }
}
