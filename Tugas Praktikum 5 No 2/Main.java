package Tugas_Praktikum5_no2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Membuat objek scanner untuk input

        // Mengambil input dari pengguna
        System.out.println("======================== Input Jumlah Pembayaran =========================");
        System.out.print("Masukan Nominal Pembayaran  : ");
        double totalPembelian = scanner.nextDouble();  // Mengambil input pembelian dalam bentuk double
        
        // Membuat objek dari kelas PerhitunganPotongan
        PerhitunganPotongan potongan = new PerhitunganPotongan();
        
        // Menghitung jumlah yang harus dibayar setelah potongan
        double jumlahBayar = potongan.hitungPotongan(totalPembelian);
        
        // Menghitung potongan yang didapat
        double jumlahPotongan = totalPembelian - jumlahBayar;
        
        // Menampilkan hasil
        System.out.println("============================= Total Pembayaran ===========================");
        System.out.println("Jumlah potongan yang anda dapat : " + jumlahPotongan);
        System.out.println("Jumlah yang harus anda bayar    : " + jumlahBayar);
    }
}
