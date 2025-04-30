package com.ayan.prateekNarang;

import java.util.*;

// Observer Interface
interface Observer {
    void update(float temp);
}

// Subject interface
interface Subject {
    void attach(Observer obs);
    void detach(Observer obs);
    void notifyObservers();
}

// Weather Station
class WeatherStation implements Subject {
    private float temperature;
    private List<Observer> observerList;

    WeatherStation() {
        observerList = new ArrayList<>();
    }

    @Override
    public void attach(Observer obs) {

    }

    @Override
    public void detach(Observer obs) {

    }

    @Override
    public void notifyObservers() {

    }
}

public class ObserverPatternExample {
    public static void main(String[] args) {

    }
}
