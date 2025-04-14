package com.juaracoding.perulangan;

public class JamPasir {
    public static void main(String[] args) {
        int baris = 11;

        if (baris % 2 == 0) {
            System.out.println("Jumlah baris harus ganjil agar jam pasir simetris.");
        } else {
            for (int i = baris; i >= 1; i -= 2) {
                int spasi = (baris - i) / 2;

                for (int j = 0; j < spasi; j++) {
                    System.out.print(" ");
                }

                for (int k = 0; k < i; k++) {
                    System.out.print("*");
                }

                System.out.println();
            }

            for (int i = 3; i <= baris; i += 2) {
                int spasi = (baris - i) / 2;

                for (int j = 0; j < spasi; j++) {
                    System.out.print(" ");
                }

                for (int k = 0; k < i; k++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }
}