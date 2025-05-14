package com.ayan.catalinStefan;

public class EnhancedCoffeeMachine implements CoffeeMachine {
    private NormalCoffeeMachine machine;

    public EnhancedCoffeeMachine(NormalCoffeeMachine machine) {
        this.machine = machine;
    }

    // Override behaviour
    @Override
    public void makeSmallCoffee() {
        System.out.println("Enhanced Coffee Machine: Making small machine");
    }

    // Unaltered behaviour

    @Override
    public void makeLargeCoffee() {
        System.out.println("Enhanced Coffee Machine: Making large coffee");
    }

    // Extended behaviour
    public void makeMilkCoffee() {
        System.out.println("Enhanced Coffee Machine: Making milk coffeee");
        machine.makeLargeCoffee();
        System.out.println("Enchanced Coffee Machine: Adding milk");
    }
}
