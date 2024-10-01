package pertemuan7;

import java.util.Scanner;

public class tugaskelas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nama = "";
        int umur = 0;

        // Input nama
        while (true) {
            System.out.print("Masukkan nama: ");
            nama = scanner.nextLine();

            // Validasi nama hanya berisi huruf
            if (nama.matches("[a-zA-Z ]+")) {
                break;
            } else {
                System.out.println("Nama hanya boleh berisi huruf! Coba lagi.");
            }
        }

        // Input umur
        while (true) {
            System.out.print("Masukkan umur: ");
            try {
                umur = Integer.parseInt(scanner.nextLine());

                // Validasi umur positif
                if (umur > 0) {
                    break;
                } else {
                    System.out.println("Umur harus lebih dari 0! Coba lagi.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Umur harus berupa angka! Coba lagi.");
            }
        }

        // Menampilkan input yang valid
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}
