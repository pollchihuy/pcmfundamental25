package com.juaracoding.oop;

public class Configuration {

    private static String username;
    private static String password;
    private static String url;

    public Configuration(String username, String password, String url) {
        this.username = username;
        this.password = password;
        this.url = url;
    }

    public static  String getUsername() {
        return username;
    }

    public static  String getPassword() {
        return password;
    }

    public static  String getUrl() {
        return url;
    }
}
