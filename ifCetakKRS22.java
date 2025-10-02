package jobsheet5;

import java.util.Scanner;

public class ifCetakKRS22 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("---Cetak KRS SIAKAD---");
       System.out.print("Apakah UKT sudah lunas? (true/false): ");
       boolean uktLunas = sc.nextBoolean();
       if (uktLunas) {
        //... kode jika true
        } else {
            System.out.println("Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu");
        }
        System.out.println("Pembayaran UKT terverifikasi");
        System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
       }
    }
