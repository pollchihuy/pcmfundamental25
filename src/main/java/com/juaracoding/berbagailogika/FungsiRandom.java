package com.juaracoding.berbagailogika;

import java.util.Random;

public class FungsiRandom {

    public static void main(String[] args) {
        Random r = new Random();
        String otp = "";
//        for (int i = 0; i < 6; i++) {
////            System.out.println(r.nextInt(10));//0 s.d 10-1
////            System.out.println(r.nextInt(10,15));//10 s.d 15-1
//            otp += r.nextInt(10);
//        }
//        System.out.println("OTP : "+r.nextInt(111111,999999));
//        System.out.println("OTP adalah : "+otp);
//        System.out.println(r.nextInt(10,100));
        System.out.println(r.nextLong(1111111111111111L,9999999999999999L));
    }
}
