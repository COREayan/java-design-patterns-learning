package com.ayan.catalinStefan;

public class NormalCoffeeMachine implements CoffeeMachine {
    @Override
    public void makeSmallCoffee() {
        System.out.println("Normal Coffee Machine: Making small coffee");
    }

    @Override
    public void makeLargeCoffee() {
        System.out.println("Normal Coffee Machine: Making large coffee");
    }
}
