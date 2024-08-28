package tugas_pertemuan1_no2;

public class nilaiMain {
    public static void main(String[] args) {
        // Membuat objek Nilai
        Nilai nilaiMahasiswa = new Nilai();

        // Mengisi data mahasiswa
        nilaiMahasiswa.nim = 23106311170042L;
        nilaiMahasiswa.nama = "Raihan Ahmad Kusumardana";
        nilaiMahasiswa.nilaiAbsen = 85;
        nilaiMahasiswa.nilaiTugas = 90;
        nilaiMahasiswa.nilaiUTS = 80;
        nilaiMahasiswa.nilaiUAS = 88;

        // Memanggil metode cetakNilai untuk menampilkan data dan nilai akhir
        nilaiMahasiswa.cetakNilai();
    }
}

