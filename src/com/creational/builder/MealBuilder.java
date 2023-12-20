package com.creational.builder;

// Builder接口
public interface MealBuilder {
    void buildBurger();

    void buildDrink();

    Meal getMeal();
}

// 具体的ConcreteBuilder1
class ConcreteBuilder1 implements MealBuilder {
    private Meal meal;

    public ConcreteBuilder1() {
        this.meal = new Meal();
    }

    public void buildBurger() {
        meal.setBurger("Chicken Burger");
    }

    public void buildDrink() {
        meal.setDrink("Coke");
    }

    public Meal getMeal() {
        return meal;
    }
}

// 具体的ConcreteBuilder2
class ConcreteBuilder2 implements MealBuilder {
    private Meal meal;

    public ConcreteBuilder2() {
        this.meal = new Meal();
    }

    public void buildBurger() {
        meal.setBurger("Beef Burger");
    }

    public void buildDrink() {
        meal.setDrink("Pepsi");
    }

    public Meal getMeal() {
        return meal;
    }
}
