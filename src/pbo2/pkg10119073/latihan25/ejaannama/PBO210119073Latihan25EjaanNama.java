package pbo2.pkg10119073.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk mengeja nama
 *
 */

public class PBO210119073Latihan25EjaanNama {

    public static void main(String[] args) {
        String nama;
        int panjang;
        
        System.out.print("Masukkan nama depan Anda untuk dieja : ");
        Scanner scanner = new Scanner(System.in);
        nama = scanner.next();
        panjang = nama.length();
        
        System.out.println();
        System.out.println("Ejaan untuk " + "\"" + nama + "\" adalah : ");
        
        for (int i = 0; i < panjang; i++) {
            System.out.println("Huruf ke-" + (i + 1) + " : " + nama.charAt(i));
        }
    }
    
}