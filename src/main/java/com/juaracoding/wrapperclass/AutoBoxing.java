package com.juaracoding.wrapperclass;

import com.juaracoding.stringobject.ContohObject;

public class AutoBoxing {

    public static void main(String[] args) {
        char chX = 'a';
        Character chY = chX;
        System.out.println("chX : "+chX);
        System.out.println("chY : "+chY);
        ContohObject contohObject = new ContohObject();
        System.out.println("contohObject : "+contohObject);
        contohObject = new ContohObject();
        System.out.println("contohObject : "+contohObject);
//        int intZ = Integer.parseInt("18.5");
        double doubleZ = Double.parseDouble("18.5");
//        System.out.println(intZ);
        System.out.println(doubleZ);
        System.out.println(Integer.toBinaryString(18));
        System.out.println(Integer.toHexString(18));
        System.out.println(Integer.toOctalString(18));
//        signed
//        unsigned
//            Byte -> -128 s.d 127
//            Unsigned Byte -> 0 s.d 255
//        byte byteZ = 128;
//        System.out.println(byteZ);
        Long longZ = 9223372036854775807L;
        String strZ = "9223372036854775808";
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        int intZ = 10000;
        String s = Integer.toString(intZ);
        System.out.println(s.length());
        Character.isDigit(chX);
        Character.isAlphabetic(chY);
    }
}