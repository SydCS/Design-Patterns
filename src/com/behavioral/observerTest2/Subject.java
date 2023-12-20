package com.behavioral.observerTest2;

import java.util.ArrayList;
import java.util.List;

abstract class Subject {
    private List<Observer> list = new ArrayList<>();

    void attach(Observer observer) {
        list.add(observer);
    }

    void detach(Observer observer) {
        list.remove(observer);
    }

    void notifyOb() {
        for (Observer observer : list) {
            observer.update();
        }
    }
}

class Account extends Subject {
    private String lastIP;

    public Account(String lastIP) {
        this.lastIP = lastIP;
    }

    public String getLastIP() {
        return lastIP;
    }
}
