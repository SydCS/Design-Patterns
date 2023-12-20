package com.behavioral.observer3;

//  observer + adapter 模式
public abstract class AlarmListener {
    abstract void alarm();
}

class CautionLightObserver extends AlarmListener {
    public CautionLight cautionLight = new CautionLight();

    @Override
    public void alarm() {
        this.cautionLight.flicker();
    }
}

class CautionLight {
    public void flicker() {
        System.out.println("CautionLight flicker");
    }
}

class AnnunciatorObserver extends AlarmListener {
    public Annunciator announciator = new Annunciator();

    @Override
    public void alarm() {
        this.announciator.announce();
    }
}

class Annunciator extends AlarmListener {
    @Override
    public void alarm() {
        this.announce();
    }

    public void announce() {
        System.out.println("Annunciator announce");
    }
}

class SecurityDoorObserver extends AlarmListener {
    public SecurityDoor securityDoor = new SecurityDoor();

    @Override
    void alarm() {
        this.securityDoor.open();
    }
}

class SecurityDoor {
    public void open() {
        System.out.println("SecurityDoor open");
    }
}

class InsulatedDoorObserver extends AlarmListener {
    public InsulatedDoor insulatedDoor = new InsulatedDoor();

    @Override
    void alarm() {
        this.insulatedDoor.close();
    }
}

class InsulatedDoor {
    public void close() {
        System.out.println("InsulatedDoor close");
    }
}


