package tugas_praktikum2;

import java.util.Scanner;

public class Tugas_Praktikum2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("TOKO SERBA ADA");
        System.out.println("**************");
        int jumlahBarang = 0;
        
        while (jumlahBarang < 1 || jumlahBarang > 5) {
            System.out.print("Masukkan Item Barang (1-5): ");
            jumlahBarang = input.nextInt();

            if (jumlahBarang > 5) {
                System.out.println("Jumlah barang melebihi batas.");
            } else if (jumlahBarang < 1) {
                System.out.println("Jumlah barang harus minimal 1.");
            }
        }
        
        // Deklarasi array untuk data barang
        String[] kodeBarang = new String[jumlahBarang];
        String[] namaBarang = new String[jumlahBarang];
        int[] hargaBarang = new int[jumlahBarang];
        int[] jumlahBeli = new int[jumlahBarang];
        int[] jumlahBayar = new int[jumlahBarang];
        
        int totalBayar = 0;

        // Input data untuk setiap barang
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println("\nData ke " + (i + 1));
            System.out.print("Masukkan Kode: ");
            kodeBarang[i] = input.next();

            System.out.print("Masukkan jumlah Beli: ");
            jumlahBeli[i] = input.nextInt();

            // Menentukan nama barang dan harga berdasarkan kode
            switch (kodeBarang[i]) {
                case "a001":
                    namaBarang[i] = "Buku";
                    hargaBarang[i] = 12000;
                    break;
                case "a002":
                    namaBarang[i] = "Pensil";
                    hargaBarang[i] = 3000;
                    break;
                case "a003":
                    namaBarang[i] = "Pulpen";
                    hargaBarang[i] = 5000;
                    break;
                case "a004":
                    namaBarang[i] = "Penggaris";
                    hargaBarang [i] = 6000;
                case "a005":
                    namaBarang[i] = "Penghapus";
                    hargaBarang[i] = 2000;
                default:
                    namaBarang[i] = "Barang Tidak Dikenal";
                    hargaBarang[i] = 0;
                    break;
            }
            
            // Menghitung jumlah bayar per barang
            jumlahBayar[i] = hargaBarang[i] * jumlahBeli[i];
            totalBayar += jumlahBayar[i];
        }
        
        // Menampilkan data barang dalam bentuk tabel
        System.out.println("\n=============== TOKO SERBA ADA ===============");
        System.out.println("**********************************************");
        System.out.println("No   Kode Barang   Nama Barang   Harga   Jumlah Beli   Jumlah Bayar");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < jumlahBarang; i++) {
            // Menampilkan setiap baris data dengan spasi yang disesuaikan secara manual
            System.out.printf("%-4d %-13s %-13s %-10d %-13d %-10d\n", 
                              (i + 1), kodeBarang[i], namaBarang[i], hargaBarang[i], jumlahBeli[i], jumlahBayar[i]);
        }
        
        System.out.println("--------------------------------------------------------------");
        System.out.println("Total Bayar: " + totalBayar);
    }
}
