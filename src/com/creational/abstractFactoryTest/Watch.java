package com.creational.abstractFactoryTest;

public interface Watch {
    public void display();
}

class MiWatch implements Watch  {
    @Override
    public void display() {
        System.out.println("小米手表");
    }
}

class HuaweiWatch implements Watch {
    @Override
    public void display() {
        System.out.println("华为手表");
    }
}

class IWatch implements Watch {
    @Override
    public void display() {
        System.out.println("苹果手表");
    }
}


