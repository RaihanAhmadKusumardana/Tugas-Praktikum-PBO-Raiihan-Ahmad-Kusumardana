package tugaspraktikum10;
import java.util.ArrayList;

public class InputDataMahasiswa {
    ArrayList<Mahasiswa> listMahasiswa;

    public InputDataMahasiswa() {
        listMahasiswa = new ArrayList<>();
    }

    // Metode untuk menambahkan data Mahasiswa, termasuk nilai
    public void insertData(String NIM, String Nama, String Alamat, String MataKuliah,
                           double Nilai1, double Nilai2, double Nilai3, double Nilai4, double Nilai5) {
        // Membuat objek Mahasiswa yang sudah berisi semua data
        Mahasiswa mhs = new Mahasiswa(NIM, Nama, Alamat, MataKuliah, Nilai1, Nilai2, Nilai3, Nilai4, Nilai5);
        listMahasiswa.add(mhs);
    }

    // Mengambil semua data Mahasiswa
    public ArrayList<Mahasiswa> getAll() {  
        return listMahasiswa;  
    } 

    // Menghapus data Mahasiswa berdasarkan index
    public void deleteData(int index) { 
        listMahasiswa.remove(index);
    }     
}
