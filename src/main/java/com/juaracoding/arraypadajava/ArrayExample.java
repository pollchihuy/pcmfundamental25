package com.juaracoding.arraypadajava;

public class ArrayExample {
    public static void main(String[] args) {
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
//        }
//        System.out.println("SELESAI !!");
//        if(args[0] != "Paul" && args[1] != "Paul@1234"){
//            System.out.println("Autentikasi Gagal !!");
//            System.exit(0);
//        }

//        int [] intArr = {1,2,3,4};
//        System.out.println(intArr.length);
//        for (int i = 0; i < intArr.length; i++) {
//            System.out.println(intArr[i]);
//        }

        int [] intArrNext = new int[4];
        for (int i = 0; i < intArrNext.length; i++) {
            System.out.println(intArrNext[i]);
        }

        double [] doArrNext = new double[4];
        for (int i = 0; i < doArrNext.length; i++) {
            System.out.println(doArrNext[i]);
        }

        String [] strArrNext = new String[4];
        for (int i = 0; i < strArrNext.length; i++) {
            System.out.println(strArrNext[i]);
        }

        char [] chArrNext = new char[4];
        for (int i = 0; i < chArrNext.length; i++) {
            System.out.println(chArrNext[i]);
        }
    }
}