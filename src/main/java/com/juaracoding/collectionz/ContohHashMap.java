package com.juaracoding.collectionz;

import java.util.*;

public class ContohHashMap {

    public static void main(String[] args) {
        Barang b = new Barang();
        List<Barang> l = new ArrayList<>();
        b.setNama("Panci");
        b.setJumlah(20);
        b.setHarga(200000.0);
        System.out.println(b.getHarga());
        System.out.println(b.getJumlah());
        System.out.println(b.getNama());

        //java Reflection
        HashMap<String,Object> hm = new HashMap<>();
        List<Map<String,Object>> l1 = new ArrayList<>();

        LinkedHashMap<String,Object> lh = new LinkedHashMap<>();
        HashMap<Float,Double> x = new HashMap<>();
        hm.put("nama","Panci");
        hm.put("jumlah",20);
        hm.put("harga",200000.0);
        for (Map.Entry<String, Object> entry : hm.entrySet()) {
            System.out.println("key: "+entry.getKey()+" value: "+entry.getValue());
        }
        System.out.println(hm.get("nama"));
//        {
//            "nama":"Panci"
//            "jumlah":20
//            "harga":200000.0
//        }
    }
}