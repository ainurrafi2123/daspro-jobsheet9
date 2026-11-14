import java.util.Arrays;
import java.util.Scanner;

public class SearchNilai_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlahElemen = input.nextInt();

        int[] nilai = new int[jumlahElemen];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari (key): ");
        int key = input.nextInt();

        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("\nHasil: Nilai yang dicari tidak ditemukan! Nilai " + key
                    + " tidak terdapat di dalam daftar nilai " + Arrays.toString(nilai) + ".");
        }
        input.close();
    }
}

// int[] nilai = new int[jumlahElemen];
// int[] nilai = { 78, 65, 90, 55, 88, 72 };
// int key = 90;
// boolean ditemukan = false;

// for(
// int i = 0;i<nilai.length;i++)
// {
// if (nilai[i] == key) {
// System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
// ditemukan = true;
// break;
// }
// }

// if(!ditemukan)
// {
// System.out.println("Nilai " + key + " tidak ditemukan.");
// }