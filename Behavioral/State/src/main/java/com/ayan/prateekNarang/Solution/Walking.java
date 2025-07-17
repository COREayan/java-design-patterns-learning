package com.ayan.prateekNarang.Solution;

public class Walking implements TransportationMode {

    @Override
    public int calcETA() {
        System.out.println("Calculating ETA (Walking)");
        return 10;
    }

    @Override
    public String getDirection() {
        return "Directions for walking";
    }
}
