package tugas_pertemuan_2_no_1.pkg2;

public class MatematikaInheritance {

    public static void main(String[] args) {
        Matematika2 mtk = new Matematika2();
        System.out.println("Pertambahan 20+30 : " + mtk.pertambahan(20, 10));
        System.out.println("Pengurangan 10-5: " + mtk.pengurangan(10, 5));
        System.out.println("Perkalian 10x3: " + mtk.perkalian(10, 3));
        System.out.println("Pembagian 21/2: " + mtk.pembagian(21, 2));
        System.out.println("Modulus 15/3: " + mtk.modulus(15, 3));
        
    }
    
}