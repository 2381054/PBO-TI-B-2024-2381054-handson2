package ternaryoperator;

public class TernaryOperator {
    public static void main(String[] args) {
        int nilai = 75;
        String hasil = (nilai >= 75) ? "Lulus" : "Tidak Lulus";
        if (nilai >= 75) {
            hasil = "Lulus";
        } else {
            hasil = "Tidak Lulus";
        }

        System.out.println("Hasil ujian : " + hasil);
    }
}
