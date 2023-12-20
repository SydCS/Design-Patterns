package com.structural.proxy;


public class Client {
    public static void main(String[] args) {
//        Internet internet = new RealInternet();
        Internet internet = new Proxy();

        try {
            internet.connectTo("geeksforgeeks.org");
            internet.connectTo("google.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}