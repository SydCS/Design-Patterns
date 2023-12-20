package com.behavioral.observerTest;

import java.util.ArrayList;
import java.util.List;

public interface Subject {
    //增加订阅者
    void attach(Observer observer);

    //删除订阅者
    void detach(Observer observer);

    //通知订阅者更新消息
    void notify(String message);
}

class SubscriptionSubject implements Subject {
    //储存订阅公众号的微信用户
    private List<Observer> list = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        list.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : list) {
            observer.update(message);
        }
    }
}





