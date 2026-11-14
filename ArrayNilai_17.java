import java.util.Scanner;
public class ArrayNilai_17 {
  public static void main(String[] args) {
    int[] nilai_akhir = new int[10];
    Scanner input = new Scanner(System.in);
    int jmlLulus = 0;
    int jmlTidakLulus = 0;

    for (int i = 0; i < nilai_akhir.length; i++) {
      System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
      nilai_akhir[i] = input.nextInt();
    }

    for (int i = 0; i < nilai_akhir.length; i++) {
      if (nilai_akhir[i] > 70) {
        System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai_akhir[i] + " (LULUS)");
        jmlLulus++;
      } else {
        System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai_akhir[i] + " (TIDAK LULUS)");
        jmlTidakLulus++;
      }
    }

    System.out.println("\nJumlah mahasiswa yang lulus: " + jmlLulus);
    System.out.println("Jumlah mahasiswa yang tidak lulus: " + jmlTidakLulus);

    input.close();
  }
}

// 85, 60, 72, 90, 45, 78, 66, 95, 50,
// 71

// for (int i = 0; i < nilai_akhir.length; i++) {
// String status = (nilai_akhir[i] > 70) ? "LULUS" : "TIDAK LULUS";
// System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai_akhir[i] + " (" +
// status + ")");
// }

// for (int i = 0; i < nilai_akhir.length; i++) {
// if (nilai_akhir[i] > 70) {
// System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai_akhir[i] + "
// (LULUS)");
// }
// }

// for (int nilai : nilai_akhir) {
// String status = (nilai > 70) ? "LULUS" : "TIDAK LULUS";
// System.out.println("Mahasiswa ke-" + no + ": " + nilai + " (" + status +
// ")");
// no++;
// }