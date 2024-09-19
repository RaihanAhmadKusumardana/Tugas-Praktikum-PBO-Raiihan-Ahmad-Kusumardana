package tugas_praktikum3_no2;

public class demoKonversiSuhu {

    public static void main(String[] args) {
        KonversiSuhu2 konversi = new KonversiSuhu2();
        System.out.println("Hasil Konversi Suhu dari 20 Celcius ke Fahrenheit adalah: " + konversi.celciusToFarenheit(20));
        System.out.println("Hasil Konversi Suhu dari 20 Celcius ke Reamur adalah: " + konversi.celciusToReamur(20));
        System.out.println("Hasil Konversi Suhu dari 20 Fahrenheit ke Reamur adalah: " + konversi.fahrenheitToReamur(20));
    }
}
