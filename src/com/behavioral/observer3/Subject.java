package com.behavioral.observer3;


import java.util.ArrayList;
import java.util.List;

abstract class Subject {
    private List<AlarmListener> list = new ArrayList<>();

    void attach(AlarmListener alarmListener) {
        list.add(alarmListener);
    }

    void detach(AlarmListener alarmListener) {
        list.remove(alarmListener);
    }

    void notifyOb() {
        for (AlarmListener alarmListener : list) {
            alarmListener.alarm();
        }
    }
}

class Thermosensor extends Subject {
    private int temperature = 66;

    public void trigger() {
        if (temperature > 42) {
            notifyOb();
        }
    }
}