package tugaspraktikum10;

public class Mahasiswa {
    private String NIM, Nama, Alamat, MataKuliah;
    private double Nilai1, Nilai2, Nilai3, Nilai4, Nilai5;
    private double NilaiAkhir;

    public Mahasiswa(String NIM, String Nama, String Alamat, String MataKuliah,
                     double Nilai1, double Nilai2, double Nilai3, double Nilai4, double Nilai5) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.MataKuliah = MataKuliah;
        this.Nilai1 = Nilai1;
        this.Nilai2 = Nilai2;
        this.Nilai3 = Nilai3;
        this.Nilai4 = Nilai4;
        this.Nilai5 = Nilai5;
        hitungNilaiAkhir();
    }

    private void hitungNilaiAkhir() {
        NilaiAkhir = (Nilai1 * 0.1) + (Nilai2 * 0.15) + (Nilai3 * 0.25) + (Nilai4 * 0.15) + (Nilai5 * 0.35);
    }

    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public String getMataKuliah() {
        return MataKuliah;
    }

    public double getNilai1() {
        return Nilai1;
    }

    public double getNilai2() {
        return Nilai2;
    }

    public double getNilai3() {
        return Nilai3;
    }

    public double getNilai4() {
        return Nilai4;
    }

    public double getNilai5() {
        return Nilai5;
    }

    public double getNilaiAkhir() {
        return NilaiAkhir;
    }
}
