import java.util.Scanner;

public class BioskopScannerSoal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, next;
        int baris, kolom, pilihan;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("1. Masukkan input data penontoh");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih yang anda mau (1/2/3): ");
            pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan Baris (1-4): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan Kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Nomor baris/kolom tidak tersedia. Silakan coba lagi.");
                    } else if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi sudah terisi, pilih kursi lain.");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        break;
                    }
                }
            } else if (pilihan == 2) {
                System.out.println("Daftar Penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("***    ");
                        } else {
                            System.out.print(penonton[i][j] + "   ");
                        }
                    }
                    System.out.println();
                }
            } else if (pilihan == 3) {
                System.out.println("Terima kasih atas kunjungannya.");
                break;
            } else {
                System.out.println("Pilihan tidak valid, pilih angka 1, 2, atau 3");
            }
        }
        }
 
    }

