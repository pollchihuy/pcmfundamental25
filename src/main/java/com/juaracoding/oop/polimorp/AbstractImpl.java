package com.juaracoding.oop.polimorp;

import com.juaracoding.oop.abstrak.ContohAbstract;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on 16/04/2025 21:31
@Last Modified 16/04/2025 21:31
Version 1.0
*/
public class AbstractImpl {

    public static void main(String[] args) {
        ContohAbstract c = new ContohAbstract() {
            @Override
            public void abstractMethod() {
                System.out.println("Meledak");
            }
        };
        c.getData();
    }
}
