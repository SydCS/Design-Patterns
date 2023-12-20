package com.creational.builder;

// 产品类
public class Meal {
    private String burger;
    private String drink;

    public void setBurger(String burger) {
        this.burger = burger;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getBurger() {
        return burger;
    }

    public String getDrink() {
        return drink;
    }
}