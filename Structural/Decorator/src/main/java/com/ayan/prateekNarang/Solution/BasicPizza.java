package com.ayan.prateekNarang.Solution;

public class BasicPizza implements Pizza {
    public BasicPizza() {
    }

    @Override
    public String getDescription() {
        return "Basic Pizza";
    }

    @Override
    public double getCost() {
        return 5.00; // base cost
    }
}
