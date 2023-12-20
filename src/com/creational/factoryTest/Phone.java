package com.creational.factoryTest;

abstract class Phone {
    private String brand;
    private int price;

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public void show() {
        System.out.println(brand + "手机，售价" + price);
    }
}

class HuaweiPhone extends Phone {
    public HuaweiPhone(String brand, int price) {
        super(brand, price);
    }
}

class IPhone extends Phone {
    public IPhone(String brand, int price) {
        super(brand, price);
    }
}

class MiPhone extends Phone {
    public MiPhone(String brand, int price) {
        super(brand, price);
    }
}
