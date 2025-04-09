package com.juaracoding.stringobject;


import java.util.Scanner;

public class CompareString {

    public static void main(String[] args) {
//        String str1 = new String("Donovan Micelin");
//        String str2 = new String("DoNo");
//        str1 = str1.toUpperCase();
//        str2 = str2.toUpperCase();
//        System.out.println(str1 == str2);
//        System.out.println(str1.equalsIgnoreCase(str2));
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.substring(3));
//        System.out.println(str1.substring(3,6));
//        boolean isStop = true;
//        while(isStop){
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Masukkan Bilangan Bulat : ");
//            int int1= sc.nextInt();
//            System.out.print("Masukkan Bilangan Desimal : ");
//            double do2 = sc.nextDouble();
//            float flo2 = sc.nextFloat();
//            long lo2 = sc.nextLong();
//            System.out.println("Nilai int1 : "+int1);
//            System.out.println("Nilai do2 : "+do2);
//            System.out.println("Ingin Melanjutkan ? Ketik 1 ");
//            int intx = sc.nextInt();
//            if(intx != 1){
//                isStop = false;
//            }
//        }
        Long longX = System.currentTimeMillis();
        String strX = "CGK#"+longX;
        String [] strArr = strX.split("#");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
    }
}