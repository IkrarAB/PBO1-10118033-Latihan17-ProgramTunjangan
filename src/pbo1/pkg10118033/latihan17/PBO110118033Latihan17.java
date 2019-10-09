
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk menghitung
 * total gaji karyawan
 *  
 */

package pbo1.pkg10118033.latihan17;

import java.util.Scanner;

public class PBO110118033Latihan17 {
    public static void main(String[] args) {
        double tunjangan = 0;
        double totalGaji;
        Scanner sGaji = new Scanner(System.in);
        System.out.println("==========Program Tunjangan==========");
        System.out.print("Berapa gaji pokok anda perbulan? : Rp.");
        double gajiPokok = sGaji.nextInt();
        System.out.print("Status Anda? (Menikah/Belum)     : ");
        String status = sGaji.next();
        System.out.println("\n=====Hasil Perhitungan Gaji Anda=====");
        if(status.equalsIgnoreCase("Menikah")){
            tunjangan = 0.35*gajiPokok;
        }
        totalGaji = tunjangan + gajiPokok;
        System.out.println("Gaji Pokok : Rp." + gajiPokok);
        System.out.println("Tunjangan  : Rp." + tunjangan);
        System.out.println("Total Gaji : Rp." + totalGaji);
        System.out.println("(Developed By : Ikrar AB)");
    }
}
