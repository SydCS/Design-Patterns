package com.creational.builder;

public class Client {
    public static void main(String[] args) {
        KFCWaiter waiter = new KFCWaiter();

        MealBuilder builder = new ConcreteBuilder1();
        waiter.setMealBuilder(builder);
        waiter.constructMeal();

        Meal meal = waiter.getMeal();
        System.out.println("Meal 1: " + meal.getBurger() + ", " + meal.getDrink());
    }
}
