package com.juaracoding.arraypadajava;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Panjang Array : ");
        int intLength = sc.nextInt();
        int [] intArr = new int[intLength];
        for (int i = 0; i < intArr.length; i++) {
            System.out.print("Masukkan Data ke "+(i+1)+": ");
            intArr[i] = sc.nextInt();
            System.out.println();
        }
        System.out.print("Masukkan data yang ingin dicari : ");
        int intSearch = sc.nextInt();
        boolean isFound = false;
        /** Pencarian data ditemukan */
        for (int i = 0; i < intArr.length; i++) {
            if(intArr[i] == intSearch){
                System.out.println("Data Ditemukan pada Pengulangan ke "+(i+1));
                isFound=true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Data Tidak Ditemukan !!");
        }


    }
}
