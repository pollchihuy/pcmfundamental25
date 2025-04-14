package com.juaracoding;

public class Main {
    public static void main(String[] args) {
        try {
            Thread.sleep(10000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}