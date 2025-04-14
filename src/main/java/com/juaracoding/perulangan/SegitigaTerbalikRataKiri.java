package com.juaracoding.perulangan;

public class SegitigaTerbalikRataKiri {
    public static void main(String[] args) {
        int intLoop = 10;
        for (int i = 0; i < intLoop; i++) {
            for (int l=0; l<(intLoop-i); l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}