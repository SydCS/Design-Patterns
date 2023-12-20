package com.creational.builder;

// Director类
public class KFCWaiter {
    private MealBuilder mealBuilder;

    public void setMealBuilder(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal getMeal() {
        return mealBuilder.getMeal();
    }

    public void constructMeal() {
        mealBuilder.buildBurger();
        mealBuilder.buildDrink();
    }
}