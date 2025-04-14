package com.juaracoding.method;

public class Class1 {


    public void prosesingData(int intX){
        intX = intX + 3;
        System.out.println("Nilai intX adalah : "+intX);
    }

    public int prosesingData(int intX,String s){
        intX = intX + 3;
        return intX;
    }

    public void prosesingObject(PanggilMethod1 p){
        p.setDataDouble(3.0);
        System.out.println("Nilai value Class 1 : "+p.getDataDouble());
    }
}
