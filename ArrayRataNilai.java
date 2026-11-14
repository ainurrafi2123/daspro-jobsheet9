import java.util.Scanner;

public class ArrayRataNilai<NoAbsen> {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = input.nextInt();

        // Kapasitas array diambil dengan input 
        int[] nilaiMhs = new int[jmlMhs];

        int total = 0;
        double rata2;
        int jmlLulus = 0; // variabel menghitung lulus 

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = input.nextInt();
            total += nilaiMhs[i];

            // mengecek mahasiswa yang lulus
            if (nilaiMhs[i] > 70) {
                jmlLulus++;
            }
        }

        rata2 = (double) total / nilaiMhs.length;
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rata2); 
        // hasil mahasiswa yang lulus
        System.out.println("Banyaknya mahasiswa lulus: " + jmlLulus);

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        String predikat;
        if (rata2 >= 85) {
            predikat = "SANGAT BAIK";
        } else if (rata2 >= 70) {
            predikat = "BAIK";
        } else {
            predikat = "PERLU PENDAMPINGAN";
        }
        System.out.println("Predikat kelas: " + predikat);

        input.close();
    }
}
