package com.juaracoding.oop;

public class CobaInstantiasi {


    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        System.out.println("Fruit: " + fruit);
//        fruit = new Fruit("Hello");
//        System.out.println("Fruit: " + fruit);

//        new Configuration("paul",
//                "paul@123",
//                "localhost");


        // java -jar apps.jar paulll paul@123456 localhostttt
        new Configuration(args[0],
                args[1],
                args[2]);

        System.out.println("Password : "+Configuration.getPassword());
        System.out.println("Username : "+Configuration.getUsername());
        System.out.println("Url : "+Configuration.getUrl());
    }
}
