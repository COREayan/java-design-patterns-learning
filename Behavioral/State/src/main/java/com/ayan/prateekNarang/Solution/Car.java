package com.ayan.prateekNarang.Solution;

public class Car implements TransportationMode {
    @Override
    public int calcETA() {
        System.out.println("Calculating ETA (Car)");
        return 4;
    }

    @Override
    public String getDirection() {
        return "Directions for Car";
    }
}
