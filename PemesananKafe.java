import java.util.Scanner;
public class PemesananKafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = { "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino",
                "Chocolate Ice" };
        int[] harga = { 15000, 13000, 10000, 12000, 8000, 18000, 20000 };

        System.out.println("=== Daftar Menu Kafe ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }

        System.out.print("\nCari menu: ");
        String cari = sc.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                System.out.println("Menu tersedia. Harga " + menu[i] + ": Rp " + harga[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Menu tersebut tidak tersedia.");
        }

        System.out.print("\nMasukkan jumlah item yang ingin dipesan: ");
        int jumlahItem = sc.nextInt();
        sc.nextLine();

        String[] pesanan = new String[jumlahItem];
        int[] hargaPesanan = new int[jumlahItem];
        int totalBiaya = 0;

        for (int i = 0; i < jumlahItem; i++) {
            System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
            String namaMenu = sc.nextLine();

            int indeksMenu = -1;
            for (int j = 0; j < menu.length; j++) {
                if (menu[j].equalsIgnoreCase(namaMenu)) {
                    indeksMenu = j;
                    break;
                }
            }

            if (indeksMenu != -1) {
                pesanan[i] = menu[indeksMenu];
                hargaPesanan[i] = harga[indeksMenu];
                totalBiaya += harga[indeksMenu];
            } else {
                System.out.println("Menu tidak ada di daftar, silakan input ulang.");
                i--;
            }
        }

        System.out.println("\n=== Daftar Pesanan Anda ===");
        for (int i = 0; i < pesanan.length; i++) {
            System.out.println((i + 1) + ". " + pesanan[i] + " (Rp " + hargaPesanan[i] + ")");
        }
        System.out.println("Total Biaya: Rp " + totalBiaya);

        sc.close();
    }
}
