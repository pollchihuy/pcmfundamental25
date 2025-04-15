package com.juaracoding.oop;

public class PengaplikasianObject {

    public static void main(String[] args) {
        int intX = 10;//inisialisasi - initialize
        BikinClass bikinClass = new BikinClass();//instatiasi - instantiate
        System.out.println(bikinClass);
        bikinClass.getData();
        bikinClass = null;
        bikinClass.getData();
    }
}
