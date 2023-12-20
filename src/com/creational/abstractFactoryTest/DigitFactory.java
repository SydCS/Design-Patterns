package com.creational.abstractFactoryTest;

interface DigitFactory {
    Phone createPhone();

    Laptop createLaptop();

    Pad createPad();

    Watch createWatch();
}

class MiFactory implements DigitFactory {
    @Override
    public Phone createPhone() {
        return new MiPhone();
    }

    @Override
    public Laptop createLaptop() {
        return new MiBook();
    }

    @Override
    public Pad createPad() {
        return new MiPad();
    }

    @Override
    public Watch createWatch() {
        return new MiWatch();
    }
}

class HuaweiFactory implements DigitFactory {
    @Override
    public Phone createPhone() {
        return new HuaweiPhone();
    }

    @Override
    public Laptop createLaptop() {
        return new Matebook();
    }

    @Override
    public Pad createPad() {
        return new MatePad();
    }

    @Override
    public Watch createWatch() {
        return new HuaweiWatch();
    }
}

class AppleFactory implements DigitFactory {
    @Override
    public Phone createPhone() {
        return new IPhone();
    }

    @Override
    public Laptop createLaptop() {
        return new MacBook();
    }

    @Override
    public Pad createPad() {
        return new IPad();
    }

    @Override
    public Watch createWatch() {
        return new IWatch();
    }
}
