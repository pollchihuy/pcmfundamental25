package com.juaracoding.oop.polimorp;

public class HitungLuasBangunan {

    public Integer hitungLuasSegitiga(int alas, int tinggi){
        return alas*tinggi/2;
    }

    public Double hitungLuasSegitiga(double alas, double tinggi){
        return alas*tinggi*0.5;
    }

    public Double hitungLuasSegitiga(float alas, float tinggi){
        return alas*tinggi*0.5;
    }
    public Integer hitungLuasSegitiga(Byte alas, Byte tinggi){
        return alas*tinggi/2;
    }

    public Integer hitungLuasSegitiga(String alas, String tinggi){
        Integer intAlas = Integer.parseInt(alas);
        Integer intTinggi = Integer.parseInt(tinggi);
        return intAlas*intTinggi/2;
    }

    public String getDataUser(){
        return "User";
    }

    public String getDataUser(String s){
        return "User";
    }


}
