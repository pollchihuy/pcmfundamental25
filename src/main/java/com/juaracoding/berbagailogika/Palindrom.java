package com.juaracoding.berbagailogika;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kata : ");
        String strInput = sc.nextLine();
//        strInput = strInput.toLowerCase();
        char [] chArr = strInput.toCharArray();
        int intLength = strInput.length();
        String strTemp = "";
        for (int i = (intLength-1); i >= 0; i--) {
            strTemp += chArr[i];
        }

        if(strTemp.equalsIgnoreCase(strInput)){
//        if(strTemp.equals(strInput)){
            System.out.println(strInput+" Palindrom");
        }else {
            System.out.println(strInput+" Bukan Palindrom");
        }
    }
}