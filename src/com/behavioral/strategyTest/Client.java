package com.behavioral.strategyTest;

public class Client {
    public static void main(String[] args) {
        Context c = new Context(new StrategyA());
        c.show();

        c.setStrategy(new StrategyB());
        c.show();
    }
}
