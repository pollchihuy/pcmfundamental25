package com.juaracoding.oop.polimorp;

import java.util.ArrayList;
import java.util.List;

public class HitungLuas {


    public static void main(String[] args) {
        HitungLuasBangunan hitungLuas = new HitungLuasBangunan();
        System.out.println(hitungLuas.hitungLuasSegitiga("4","8"));
        System.out.println(hitungLuas.hitungLuasSegitiga(2,2));
        System.out.println(1L);
        System.out.println("a");
        System.out.println(21.2);
        System.out.println(21.2f);
        System.out.println(5);
        System.out.println(hitungLuas);

        IService iService = new Service1();
        Service1 service1 = new Service1();
        List l = new ArrayList();
        ArrayList a = new ArrayList();
        hitungLuas = new HitungLuasBangunan();
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("aosjhndoaijsdoiajds").
                append("aoijsdoaijds");
//        20MB + 20MB
        sBuilder.setLength(0);
        sBuilder.append("aosjhndoaijsdoiajds").
                append("aoijsdoaijds");
//        20MB + 20MB
        // ArrayList -> 100 method
        // List -> 20

    }
}
