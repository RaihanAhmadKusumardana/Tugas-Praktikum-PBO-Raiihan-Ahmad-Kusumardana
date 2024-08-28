package tugas_pertemuan1_no2;

public class Nilai {
    long nim;
    String nama;
    int nilaiAbsen;
    int nilaiTugas;
    int nilaiUTS;
    int nilaiUAS;

    public void cetakNilai(){
        double nilaiAkhir = (nilaiAbsen * 0.1) + (nilaiTugas * 0.3) + (nilaiUAS * 0.4);

        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Nilai Absen[10%] " + nilaiAbsen);
        System.out.println("Nilai Tugas[20%]: " + nilaiTugas);
        System.out.println("Nilai UTS[30]: " + nilaiUTS);
        System.out.println("Nilai UAS[40]: " + nilaiUAS);
        System.out.println("Nilai AKhir: " + String.format("%.2f", nilaiAkhir));

    }
}
