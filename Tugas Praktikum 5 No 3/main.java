package Tugas_praktikum5_no3;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // Membuat Scanner untuk membaca input pengguna
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = input.nextDouble();

        System.out.print("Masukkan tinggi badan (m): ");
        double tinggiBadan = input.nextDouble();

        MenentukanKriteriaKegemukan imtObjek = new MenentukanKriteriaKegemukan();
        
        // Mengubah tinggi badan dari cm ke meter
        tinggiBadan = tinggiBadan / 100;
        
        // Menghitung IMT menggunakan method dari class IMT
        double imt = imtObjek.hitungIMT(beratBadan, tinggiBadan);

        // Menentukan kategori IMT
        String kategori = imtObjek.tentukanKategori(imt);

        // Menampilkan hasil perhitungan dan kategori IMT
        System.out.printf("IMT Anda: %.2f%n", imt);
        System.out.println("Kategori: " + kategori);

        // Menutup scanner
        input.close();
    }
}