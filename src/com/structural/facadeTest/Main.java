package com.structural.facadeTest;

public class Main {
    public static void main(String[] args) {
        Fund fund = new Fund();
        fund.setRatio(0.3, 0.3, 0.4);
        fund.buy(10000);
    }
}