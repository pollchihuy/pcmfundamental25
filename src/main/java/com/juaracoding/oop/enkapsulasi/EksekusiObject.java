package com.juaracoding.oop.enkapsulasi;

public class EksekusiObject {

    public static void main(String[] args) {
        User u = new User();
//        u.id=2L;//set
//        u.id;//get
//        u.setId(2L);
        System.out.println(u.getId());
        System.out.println(u.getEmail());

        User2 u2 = new User2();
        u2.id=2L;
    }
}
