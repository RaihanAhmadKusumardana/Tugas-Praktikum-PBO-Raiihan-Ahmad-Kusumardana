package Tugas_praktikum5_no3;

public class MenentukanKriteriaKegemukan {
    // Method untuk menghitung IMT
    public double hitungIMT(double beratBadan, double tinggiBadan) {
        return beratBadan / (tinggiBadan * tinggiBadan);
    }

    // Method untuk menentukan kategori berdasarkan nilai IMT
    public String tentukanKategori(double imt) {
        if (imt <= 18.4) {
            return "Berat Badan Kurang";
        } else if (imt >= 18.5 && imt <= 24.9) {
            return "Berat Badan Ideal";
        } else if (imt >= 25 && imt <= 29.9) {
            return "Berat Badan Lebih";
        } else if (imt >= 30 && imt <= 39.9) {
            return "Gemuk";
        } else {
            return "Sangat Gemuk";
        }
    }
}
