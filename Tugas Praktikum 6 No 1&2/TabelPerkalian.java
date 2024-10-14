import java.util.Scanner;

public class TabelPerkalian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n (maksimal 10): ");
        int n = scanner.nextInt();

        if (n > 0 && n <= 10) {
            System.out.print("\t"); // Untuk memberikan spasi di awal header kolom
            
            // Menampilkan header kolom
            for (int i = 1; i <= n; i++) {
                System.out.print(i + "\t");
            }
            System.out.println();

            // Menampilkan isi tabel
            for (int i = 1; i <= n; i++) {
                System.out.print(i + "\t"); // Menampilkan header baris
                
                for (int j = 1; j <= n; j++) {
                    System.out.print(i * j + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("Nilai n harus antara 1 dan 10.");
        }

        scanner.close();
    }
}
