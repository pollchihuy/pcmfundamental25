package com.juaracoding.oop.polimorp;

public class ClassImpl extends Parent {

    public String nama = super.hue;

    public ClassImpl() {
        super();
        super.methodInit();
        super.hue ="OK";
    }
//
//    public ClassImpl(String str) {
//        super(str);
//    }

    /**
     * message
     * timestamp
     * path
     */


    public void callMethod(){
        super.methodInit();
        super.hue ="OK";
        System.out.println("Method called !!");
        methodInit();
    }

//    @Override
//    void methodInit() {
//        System.out.println("Method Inisialisasi Sudah Berjalan !!");
//    }

    @Override
    void methodInit() {
        super.methodInit();
    }
}