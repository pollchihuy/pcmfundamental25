package com.juaracoding.method;

public class PanggilClass1 {


    public static void main(String[] args) {
        Class1 c1 = new Class1();
        /** Passing By Value */
        int intInput = 30;
        c1.prosesingData(intInput);
        System.out.println(intInput);

        /** Passing By Reference */
        PanggilMethod1 p1 = new PanggilMethod1();
        System.out.println("Ini Referensi : "+p1);
        p1.setDataDouble(5.0);
        c1.prosesingObject(p1);
        System.out.println(p1.getDataDouble());
    }
}
