package tugas_praktikum9no2;

public class HitungHari {
    public int hitung(int tahun, String bulan) {
        int jumlahHari;

        // Cek bulan Februari dan tahun kabisat
        if (bulan.equals("Februari")) {
            if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 4 == 0)) {
                jumlahHari = 29;
            } else {
                jumlahHari = 28;
            }
        } 
        // Cek bulan yang memiliki 30 hari
        else if (bulan.equals("April") || bulan.equals("Juni") || 
                 bulan.equals("September") || bulan.equals("November")) {
            jumlahHari = 30;
        } 
        //selain yang tadi jumlah harinya 31
        else {
            jumlahHari = 31;
        }

        return jumlahHari;
    }
}