package com.behavioral.strategyTest;

public class Context {
    // 持有一个策略对象的引用
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    // 供客户端调用
    public void show(){
        strategy.discount();
    }
}

