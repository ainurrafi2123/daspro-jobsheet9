import java.util.Scanner;

public class PengelolaanNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();

        int[] nilai = new int[jumlah];
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }

        int tertinggi = nilai[0];
        int terendah = nilai[0];

        for (int i = 1; i < jumlah; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        double rataRata = (double) total / jumlah;

        System.out.println("\n=== HASIL PENGELOLAAN NILAI ===");
        System.out.printf("Nilai Rata-rata : %.2f\n", rataRata);
        System.out.println("Nilai Tertinggi : " + tertinggi);
        System.out.println("Nilai Terendah  : " + terendah);

        System.out.println("\n=== DAFTAR NILAI & KELULUSAN ===");
        for (int i = 0; i < jumlah; i++) {

            String status = (nilai[i] >= 60) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + " : " + nilai[i] + " (" + status + ")");
        }

        input.close();
    }
}
