package com.behavioral.observer3;

public class Main {
    public static void main(String[] args) {
        Thermosensor thermosensor = new Thermosensor();
        thermosensor.attach(new CautionLightObserver());
        thermosensor.attach(new SecurityDoorObserver());

        thermosensor.trigger();
    }
}
