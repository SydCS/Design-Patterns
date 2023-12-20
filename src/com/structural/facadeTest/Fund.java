package com.structural.facadeTest;

public class Fund {
    private FinancialProduct stock;
    private FinancialProduct bond;
    private FinancialProduct money;
    private double stockRatio;
    private double bondRatio;
    private double moneyRatio;

    public Fund() {
        this.stock = new Stock();
        this.money = new Money();
        this.bond = new Bond();
    }

    public void setRatio(double stockRatio, double bondRatio, double moneyRatio) {
        this.stockRatio = stockRatio;
        this.bondRatio = bondRatio;
        this.moneyRatio = moneyRatio;
    }

    public void buy(double totalAmount) {
        System.out.println("基金经理为客户购买金融产品...");

        stock.buy(totalAmount * stockRatio);
        bond.buy(totalAmount * bondRatio);
        money.buy(totalAmount * moneyRatio);
    }
}

