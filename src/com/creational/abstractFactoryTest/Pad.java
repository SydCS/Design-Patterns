package com.creational.abstractFactoryTest;

public interface Pad {
    public void display();
}

class MiPad implements Pad {
    @Override
    public void display() {
        System.out.println("小米平板");
    }
}

class MatePad implements Pad {
    @Override
    public void display() {
        System.out.println("华为平板");
    }
}

class IPad implements Pad {
    @Override
    public void display() {
        System.out.println("果板");
    }
}