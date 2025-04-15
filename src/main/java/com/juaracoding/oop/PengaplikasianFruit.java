package com.juaracoding.oop;

public class PengaplikasianFruit {

    public static void main(String[] args) {
        Fruit anggur = new Fruit();
        Fruit apel = new Fruit();
        Fruit jeruk = new Fruit();

        anggur.grams=10;
        anggur.calsPerGram=10;
        System.out.println(anggur.totalCalories());
        System.out.println("Referensi : "+anggur);

        apel.grams=11;
        apel.calsPerGram=11;
        System.out.println(apel.totalCalories());

        jeruk.grams=12;
        jeruk.calsPerGram=12;
        System.out.println(jeruk.totalCalories());

        anggur.grams=13;
        anggur.totalCalories();

        getData();

        System.out.println("=================================");
        System.out.println(Fruit.callFunction());
        System.out.println(Fruit.phi);
    }

    public static void getData(){
        Fruit anggur = new Fruit();
        System.out.println("Referensi : "+anggur);
        System.out.println(anggur.callFunction());
        System.out.println(anggur.phi);
    }
}
