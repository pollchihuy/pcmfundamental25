package com.juaracoding.oop.polimorp;

public class ExecutionImpl {

    public static void main(String[] args) {
        ClassImpl aClass = new ClassImpl();
//        aClass.methodInit();
//        aClass.callMethod();
        System.out.println("Mulai ----- "+Thread.currentThread().getName());
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName());
            }
        });
        t.start();

        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Berakhir ----- "+Thread.currentThread().getName());
    }
}
