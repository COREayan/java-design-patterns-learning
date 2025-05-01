package com.ayan.prateekNarang.solution;

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

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void attach(Observer obs) {
        observerList.add(obs);
    }

    @Override
    public void detach(Observer obs) {
        observerList.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for (Observer obs : observerList) {
            obs.update(temperature); // Run Time Polymorphism
        }
    }
}

class DisplayDevice implements Observer {
    String name;

    public DisplayDevice (String deviceName) {
        this.name = deviceName;
    }

    @Override
    public void update(float temp) {
        System.out.println("Temp on " + name + " display is " + temp);
    }
}

class MobileDevice implements Observer {
    String name;

    public MobileDevice (String deviceName) {
        this.name = deviceName;
    }

    @Override
    public void update(float temp) {
        System.out.println("Temp on " + name + " mobile is " + temp);
    }
}

public class ObserverPatternExample {
    public static void main(String[] args) {
        // Create a Publisher
        WeatherStation weatherStation = new WeatherStation();

        // Create subscribers
        DisplayDevice device = new DisplayDevice("SamsungLCD");
        MobileDevice mobileDevice = new MobileDevice("Samsung M33");

        // Attach
        weatherStation.attach(device);
        weatherStation.attach(mobileDevice);

        // Set Temperature
        weatherStation.setTemperature(25);

        // Detach
        weatherStation.detach(mobileDevice);
        weatherStation.setTemperature(26);
    }
}
