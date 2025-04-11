package com.juaracoding.perulangan;

import java.util.Scanner;

public class Segitiga {


    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j<=i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 5; j>=(5-i) ; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        int intX = 10;
//        double douX = 20;
//        if(intX > douX){
//            return;
//        }

//        for(int i = 1; i <= 5; i++){
//            if(i%2==0){
//                continue;
//            }
//            System.out.println(i);
//        }

        /**
         *  Entry -> Membuat Data Xc3L .@2833
         *  Output -> 309
         *
         *  Berapakah Output Dari -> Kami Adalah P@5uKan Cili|<
         *  Output ?
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Teks : ");
        String strInput = in.nextLine();
        char [] charArray = strInput.toCharArray();
        int intTampung = 0;
        for (int x = 0; x < charArray.length; x++) {
            if(charArray[x]>=65 && charArray[x]<=90){
                intTampung += charArray[x];
            }
        }
        System.out.println("Output dari "+strInput+" adalah : "+intTampung);

//            **
//           ****
//          ******
//         ********
//        **********
//
//            *
//           ***
//          *****
//         *******
//        *********
//
//            *
//           **
//          ***
//         ****
//        *****
//        *
//        **
//        ***
//        ****
//        *****
    }
}
