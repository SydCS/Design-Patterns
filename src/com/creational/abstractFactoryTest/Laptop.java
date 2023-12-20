package com.creational.abstractFactoryTest;

public interface Laptop {
    public void display();
}

class MiBook implements Laptop {
    @Override
    public void display() {
        System.out.println("小米笔记本");
    }
}

class Matebook implements Laptop {
    @Override
    public void display() {
        System.out.println("华为笔记本");
    }
}

class MacBook implements Laptop {
    @Override
    public void display() {
        System.out.println("苹果笔记本");
    }
}