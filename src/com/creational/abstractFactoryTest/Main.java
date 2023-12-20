package com.creational.abstractFactoryTest;

public class Main {
    public static void main(String[] args) {
        DigitFactory factory = new AppleFactory();
        Pad iPad = factory.createPad();
        iPad.display();
    }
}
