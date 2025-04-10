package com.juaracoding.exchandling;

public class ThrowValidation {


    public static void main(String[] args) {
        int intX = 14;
        if(intX != 14){
            throw new IllegalArgumentException("WOII ILEGAL !!");
        }else {
            System.out.println("SUDAH OK");
        }
    }
}
