package com.ayan.PrateekNarang.Solution;

import com.ayan.PrateekNarang.Problem.RealImage;

public class ProxyImage implements Image {
    private String filename; // Proxy reference to real Image
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename); // Image is loaded + cached
        }
        realImage.display();
    }
}
