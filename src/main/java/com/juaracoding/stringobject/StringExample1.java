package com.juaracoding.stringobject;

public class StringExample1 {

    public int hitungKarakter(String str){
        char [] x = str.toCharArray();
        return x.length;
    }

    public static void main(String[] args) {
        String str1 = "Paul";
        String str2 = " Malau";
//        System.out.println(str1.concat(str2));
        StringBuilder sBuild = new StringBuilder();
        sBuild.append(str1).append(str2).append(3).append(4);
        sBuild.setLength(0);
//        String str3 = "OK";
        System.out.println("[Modul] Standarisasi Penamaan pada Pemrograman Java".charAt(31));
        System.out.println(new StringBuilder().append(str1).append(str1).append(str1).append(str1).append(str1).append(str1).append(str1).append(str1).append(str1).append(str1).append(str1).append(str1).append(str1).append(str1).append(str1).append(str1).append(str1).append(str1).append(str1).append(str1).append(str1).append(str1).append(str1).append(str1).append(str1).append(str1).append(str1).append(str1).append(str1).append(str1).append(str1).append(str1).append(str1).append(str1).append(str1).append(str1).append(str1).append(str1).toString());
        System.out.println(new StringBuilder().append(str1).append(str2).toString());
//        System.out.println("Banyak Karakter : "+strContoh.length());
        char charX = 'P';
        System.out.println((int)'P');
        //"Masuk Kantor pukul 20:44 @ WIB" -> 2030
        //"Keluar Kelas jam 17:25 # WIT" ->
        ContohObject contoh = new ContohObject();
        System.out.println(contoh);

    }
}
