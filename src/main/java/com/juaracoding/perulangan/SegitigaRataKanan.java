package com.juaracoding.perulangan;

public class SegitigaRataKanan {
    public static void main(String[] args) {
        int intLoop = 10;
        for (int i = 0; i < intLoop; i++) {
            for (int k = 1; k <=intLoop ; k++) {
                if(k>=(intLoop-i)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}