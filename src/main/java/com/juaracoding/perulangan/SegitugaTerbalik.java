package com.juaracoding.perulangan;

public class SegitugaTerbalik {

    public static void main(String[] args) {
        int intLoop = 10;

        for (int i = intLoop; i >= 1; i--) {
            for (int j = 1; j <= intLoop - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((2 * i) - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}