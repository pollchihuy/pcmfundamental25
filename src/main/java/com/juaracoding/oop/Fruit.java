package com.juaracoding.oop;

public class Fruit {

    public Fruit() {
        System.out.println("Ini Di Eksekusi Pertama Kali, atau hanya sekali di panggil saja saat keyword new");
    }

    public Fruit(String str) {
        System.out.println("Ini Di Eksekusi Pertama Kali, atau hanya sekali di panggil saja saat keyword new "+str);
    }

//    public Fruit(int grams, int calsPerGram) {
//        this.grams = grams;
//        this.calsPerGram = calsPerGram;
//    }

    public int grams;
    public int calsPerGram;
    public static final double phi = 3.14038498395;

    public int totalCalories(){
        return grams * calsPerGram;
    }

    protected int getCalories(){
        return grams * calsPerGram;
    }

    public static int callFunction(){
        return 3;
    }
}
