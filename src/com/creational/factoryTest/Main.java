package com.creational.factoryTest;

public class Main {
    public static void main(String[] args) {
//        PhoneFactory factory = new MiFactory();
        PhoneFactory factory = (PhoneFactory) PropertyUtil.getBean();
        Phone mi = factory.createPhone();
        mi.show();
    }
}
