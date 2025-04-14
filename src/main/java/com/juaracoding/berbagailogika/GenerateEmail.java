package com.juaracoding.berbagailogika;

import java.util.Random;

public class GenerateEmail {

    /**
     * Format email
     * 1. min 6 max 16 huruf
     * 2. min 1 max 3 digit random angka -> 0 - 999
     * 3. @
     * 4. provider (gmail,ymail,yahoo,rocketmail)
     * 5. . (titik)
     * 6. domain (sch,ac.id,edu,com,co.id,biz)
     */
    public static void main(String[] args) {
        Random r = new Random();
        for (int x = 0; x < 10000; x++) {
            String strHuruf = "abcdefghijklmnopqrstuvwxyz";
            char[] chArr = strHuruf.toCharArray();
            int lengthHuruf = strHuruf.length();
            String strProvider [] = {"gmail","ymail","yahoo","rocketmail"};
            String strDomain [] = {"sch","ac.id","edu","com","co.id","biz"};

            int lengChar = r.nextInt(6,17);
            for (int i = 0; i < lengChar; i++) {
                System.out.print(chArr[r.nextInt(lengthHuruf)]);
            }
            System.out.print(r.nextInt(0,999));
            System.out.print("@");
            System.out.print(strProvider[r.nextInt(strProvider.length)]);
            System.out.print(".");
            System.out.print(strDomain[r.nextInt(strDomain.length)]);
            System.out.println();
        }

    }
}
