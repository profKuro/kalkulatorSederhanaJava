/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculator;

/**
 *
 * @author Kuro
 */
import java.util.Scanner;

public class SimpleCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean isKeluar = false;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Menu Calculator");
            System.out.println("----------------");
            System.out.println("1. Penjumlahan\n"
                    + "2. Pengurangan\n"
                    + "3. Perkalian\n"
                    + "4. Pembagian\n"
                    + "5. Keluar\n"
                    + "Pilih Salah Satu : ");
            int menuSelect = scanner.nextInt();
            if (menuSelect == 5) {
                isKeluar = true;
            } else {
                if (menuSelect == 1) {//Penjumlahan
                    System.out.println("Penjumlahan");
                } else if (menuSelect == 2) {//Pengurangan
                    System.out.println("Pengurangan");
                } else if (menuSelect == 3) { //Perkalian
                    System.out.println("PERKALIAN ");
                } else if (menuSelect == 4) { //Pembagian
                    System.out.println("PEMBAGIAN ");
                } else {
                    System.out.println(" Menu Tidak Tersedia ");
                    System.exit(0);
                }

                System.out.print("Masukkan angka pertama : ");
                double nilai1 = scanner.nextDouble();
                System.out.print("Masukkan angka kedua : ");
                double nilai2 = scanner.nextDouble();

                double hasil = 0;

                if (menuSelect == 1) {//Penjumlahan
                    hasil = nilai2 + nilai2;
                } else if (menuSelect == 2) {//Pengurangan
                    hasil = nilai1 - nilai2;
                } else if (menuSelect == 3) {//Perkalian
                    hasil = nilai1 * nilai2;
                } else if (menuSelect == 4) {//Pembagian
                    hasil = nilai1 / nilai2;
                }

                System.out.println("Hasil " + hasil);
                System.out.print("Masukkan angka 5 untuk keluar dan 0 untuk menu : ");
                menuSelect = scanner.nextInt();
                if (menuSelect == 5) {
                    isKeluar = true;
                }
            }

        } while (!isKeluar);
        scanner.close();

    }

}
