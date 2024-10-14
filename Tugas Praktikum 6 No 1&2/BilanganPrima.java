public class BilanganPrima {
    public static void main(String[] args) {
        System.out.println("Bilangan Prima dari 0-20:");
        
        // Loop untuk mengecek setiap angka dari 0 sampai 20
        for (int i = 0; i <= 20; i++) {
            int faktor = 0; // Variabel untuk menghitung jumlah pembagi dari i
            
            // Loop untuk menghitung jumlah faktor dari angka i
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    faktor++;
                }
            }
            
            // Jika jumlah faktor hanya 2 (1 dan dirinya sendiri), maka i adalah bilangan prima
            if (faktor == 2) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nBilangan Bukan Prima dari 0-20:");
        
        // Loop lagi untuk angka bukan prima, mulai dari 0 hingga 20
        for (int i = 0; i <= 20; i++) {
            int faktor = 0; // Variabel untuk menghitung jumlah pembagi dari i
            
            // Loop untuk menghitung jumlah faktor dari angka i
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    faktor++;
                }
            }
            
            // Jika jumlah faktor lebih dari 2 dan angka lebih besar dari 1, maka bukan bilangan prima
            if (faktor > 2 && i > 1) {
                System.out.print(i + " ");
            }
        }
    }
}
