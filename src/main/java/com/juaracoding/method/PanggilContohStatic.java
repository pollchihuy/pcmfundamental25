package com.juaracoding.method;

public class PanggilContohStatic {

    public static void main(String[] args) {
        ContohStatic c1 = new ContohStatic();
        System.out.println("Referensi c1 : "+c1);
        System.out.print("Nilai x di c1 : ");
        c1.cetakValue();
        ContohStatic c2 = new ContohStatic();
        System.out.println("Referensi c2 : "+c2);
        System.out.print("Nilai x di c2 : ");
        c2.cetakValue();
        ContohStatic c3 = new ContohStatic();
        System.out.println("Referensi c3 : "+c3);
        System.out.print("Nilai x di c3 : ");
        c3.cetakValue();
    }
}
