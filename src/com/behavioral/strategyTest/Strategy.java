package com.behavioral.strategyTest;

public abstract class Strategy {
    public abstract void discount();    // 抽象策略
}

class StrategyA extends Strategy {
    @Override
    public void discount() {
        System.out.println("两件8折，三件7折");
    }   // 具体实现
}

class StrategyB extends Strategy {
    @Override
    public void discount() {
        System.out.println("满300减50元");
    }
}

class StrategyC extends Strategy {
    @Override
    public void discount() {
        System.out.println("满500元加1元换购");
    }
}

