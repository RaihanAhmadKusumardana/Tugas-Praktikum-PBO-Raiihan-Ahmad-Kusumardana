public class LaguAnakAyam {
    public static void main(String[] args) {
        int n = 10; // Kamu bisa mengganti nilai N sesuai kebutuhan
        for (int i = n; i > 0; i--) {
            if (i == 1) {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal induknya.");
            } else {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1));
            }
        }
    }
}
