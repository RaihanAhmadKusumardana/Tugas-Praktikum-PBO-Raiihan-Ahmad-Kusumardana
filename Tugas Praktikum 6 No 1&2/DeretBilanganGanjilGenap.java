public class DeretBilanganGanjilGenap {
    public static void main(String[] args) {
        // Menampilkan bilangan genap dari 0 sampai 20
        System.out.println("Bilangan Genap dari 0-20:");
        
        // Menggunakan for loop untuk iterasi dari 0 sampai 20
        for (int i = 0; i <= 20; i++) {
            // Jika i habis dibagi 2, maka i adalah bilangan genap
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nBilangan Ganjil dari 0-20:");
        
        // Menggunakan for loop lagi untuk iterasi dari 0 sampai 20
        for (int j = 0; j <= 20; j++) {
            // Jika j tidak habis dibagi 2, maka j adalah bilangan ganjil
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
        }
    }
}
