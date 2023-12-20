package com.creational.abstractFactoryTest;

public interface Phone {
    public void display();
}

class MiPhone implements Phone {
    @Override
    public void display() {
        System.out.println("小米手机");
    }
}

class HuaweiPhone implements Phone {
    @Override
    public void display() {
        System.out.println("华为手机");
    }
}

class IPhone implements Phone {
    @Override
    public void display() {
        System.out.println("苹果手机");
    }
}

