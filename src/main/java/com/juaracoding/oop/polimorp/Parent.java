package com.juaracoding.oop.polimorp;

public class Parent {

    public String hue = "OK";

    public Parent() {
        System.out.println("Print Parent");
    }

    public Parent(String str){
        System.out.println("Print Parent "+str);
    }

    //    private , no modifier , protected , public
    void methodInit(){
        System.out.println("Welcome To The Jungle !!");
    }
}
