package com.ayan.prateekNarang.problem;

import java.util.*;

class DisplayDevice {
    private static int nextId;
    private int id;

    public DisplayDevice() {
        id = ++nextId;
    }

    public void showTemp(float temp) {
        System.out.println("Devie id : " + id + ", Current Temp: " + temp + " C");
    }
}

class WeatherStation {
    private float temperature;
    private List<DisplayDevice> displayDeviceList; // can be multiple such devices later on.

    public WeatherStation(List<DisplayDevice> displayDeviceList) {
        this.displayDeviceList = displayDeviceList;
    }

    public void setTemperature(float temp) {
        this.temperature = temp;
        notifyDevice();
    }

    public void notifyDevice() {
        for (DisplayDevice currentDevice : displayDeviceList) {
            currentDevice.showTemp(this.temperature);
        }
        System.out.println();
    }
}

public class WithoutObserverPattern {
    public static void main(String[] args) {
        List<DisplayDevice> displayDeviceList = new ArrayList<>();
        for (int i=0; i<5; i++) {
            displayDeviceList.add(new DisplayDevice());
        }

        WeatherStation station = new WeatherStation(displayDeviceList);

        station.setTemperature(26);
        station.setTemperature(30);
    }
}
