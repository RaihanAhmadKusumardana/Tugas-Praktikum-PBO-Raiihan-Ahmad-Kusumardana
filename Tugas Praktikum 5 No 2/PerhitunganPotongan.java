package Tugas_Praktikum5_no2;

public class PerhitunganPotongan {
    public double hitungPotongan(double totalPembelian) {
        if (totalPembelian < 50000) {
            // Diskon 5% untuk pembelian di bawah 50.000
            return totalPembelian - (0.05 * totalPembelian);
        } else {
            // Diskon 20% untuk pembelian 50.000 atau lebih
            return totalPembelian - (0.20 * totalPembelian);
        }
    }
}
