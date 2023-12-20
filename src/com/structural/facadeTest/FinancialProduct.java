package com.structural.facadeTest;

public interface FinancialProduct {
    void buy(double amount);
}

class Stock implements FinancialProduct {
    private double amount;

    @Override
    public void buy(double amount) {
        this.amount = amount;
        System.out.println("购买股票：" + amount + "元");
    }
}

class Bond implements FinancialProduct {
    private double amount;

    @Override
    public void buy(double amount) {
        this.amount = amount;
        System.out.println("购买债券：" + amount + "元");
    }
}

class Money implements FinancialProduct {
    private double amount;

    @Override
    public void buy(double amount) {
        this.amount = amount;
        System.out.println("购买货币市场工具：" + amount + "元");
    }
}
