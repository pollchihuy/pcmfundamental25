package com.juaracoding.logikapercabangan;

import com.juaracoding.stringobject.ContohObject;

import java.util.Scanner;

public class MenghitungLuasSegitiga {

    public static void main(String[] args) {
        System.out.println("ABC");
        System.out.println("DEF");
        System.out.println("HIJ");
//        boolean isContinue = true;
//        while(isContinue){
//            Scanner input = new Scanner(System.in);
//            System.out.print("Rumus Luas Segitiga Adalah ( Alas X Tinggi ) / 2 ");
//            System.out.print("Masukkan Alas : ");
//            double alas = input.nextDouble();
//            System.out.print("Masukkan Tinggi : ");
//            double tinggi = input.nextDouble();
//            double luasSegitiga = (alas * tinggi) / 2;
//            System.out.println("Luas Segitiga Adalah : " + luasSegitiga);
//            System.out.println("Apakah Ingin Menghitung Lagi ? Ketik y/Y jika ya ");
//            String strContinue = input.next();
//            if(!strContinue.equalsIgnoreCase("y")){
//                isContinue = false;
//                System.out.println("Program Berhenti....");
//            }
//        }

        Scanner sc = new Scanner(System.in);
//        System.out.print("Masukkan Nilai Num : ");
//        int num = sc.nextInt();
//        int x = 20;
//        if(num>2){
//            x = 10 * num + 2;
//            System.out.println("Nilai x adalah : "+x);
//        }else{
//            System.out.println("Masuk ke Blok Else ");
//        }
//        if(x%2==0){
//            if(x/100 != 0)
//            {
//                System.out.println("Bilangan Genap Lebih dari Seratus");
//            }
//        }else{
//            if(x/10 !=0)
//            {
//                System.out.println("Bilangan Genap Lebih Dari Sepuluh");
//            }
//        }
//        if(num>2){
//            System.out.println("Num lebih besar dari 2");
//        }else if(num<0){
//            System.out.println("Num kurang dari 0");
//        }else{
//            System.out.println("Num adalah 0 atau 1 atau 2");
//        }

//        if(num==1){
//            System.out.println("Num nilai nya 1 ");
//        }else if(num==2){
//            System.out.println("Num nilai nya 2 ");
//        }else if(num==3){
//            System.out.println("Num nilai nya 3 ");
//        }else if(num==4){
//            System.out.println("Num nilai nya 4 ");
//        }else if(num==5){
//            System.out.println("Num nilai nya 5 ");
//        }else{
//            System.out.println("Num nilai nya selain 1,2,3,4,5 ");
//        }

//        switch(num){
//            case 1:System.out.println("Num nilai nya 1 ");break;
//            case 2:System.out.println("Num nilai nya 2 ");break;
//            case 3:System.out.println("Num nilai nya 3 ");break;
//            case 4:System.out.println("Num nilai nya 4 ");break;
//            case 5:System.out.println("Num nilai nya 5 ");break;
//            default:System.out.println("Num nilai nya selain 1,2,3,4,5 ");break;
//        }
        System.out.print("Masukkan 1 huruf lalu tekan enter : ");
        String strX = sc.next();
        if(strX.equalsIgnoreCase("a")
                || strX.equalsIgnoreCase("i")
                || strX.equalsIgnoreCase("u")
                || strX.equalsIgnoreCase("e")
                || strX.equalsIgnoreCase("o")){
            System.out.println("Huruf Vokal");
        }else {
            System.out.println("Huruf Konsonan");
        }

        if(strX.equalsIgnoreCase("b")
                || strX.equalsIgnoreCase("c")
                || strX.equalsIgnoreCase("d")
                || strX.equalsIgnoreCase("f")
                || strX.equalsIgnoreCase("g")
                || strX.equalsIgnoreCase("h")
                || strX.equalsIgnoreCase("j")
                || strX.equalsIgnoreCase("z")){
            System.out.println("Huruf Konsonan");
        }else {
            System.out.println("Huruf Vokal");
        }

        for (int i = 0;
             i < 10;
             i++) {
            System.out.println("OK");
        }
        int intX = sc.nextInt();
        if(intX > 2){
            System.out.println("Lebih Besar Dari 2");
        }else {
            System.out.println("Kurang dari atau sama dengan 2");
        }
        String strXX = (intX>2)?"Lebih Besar Dari 2":"Kurang dari atau sama dengan 2";
        System.out.println(strXX);
        ContohObject contohObject=null;
        contohObject=(contohObject==null)?new ContohObject():contohObject;
        int intK=0;
        Integer intL=null;
        System.out.println(contohObject.printText());

        if(((5==5) || (2!=2)) && (1<0)){

        }else {

        }
    }



}