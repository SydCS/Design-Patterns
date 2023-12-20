package com.creational.factoryTest;

interface PhoneFactory {
    Phone createPhone();
}

class HuaweiFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new HuaweiPhone("华为", 6999);
    }
}

class AppleFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new IPhone("苹果", 8999);
    }
}

class MiFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new MiPhone("小米", 4999);
    }
}

