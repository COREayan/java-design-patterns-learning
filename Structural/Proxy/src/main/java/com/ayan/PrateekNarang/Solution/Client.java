package com.ayan.PrateekNarang.Solution;

public class Client {
    public static void main(String[] args) {
        /*
        // Using realImage
        Image img1 = new RealImage("dog.png");
        Image img2 = new RealImage("dog.png");

        img1.display();
        img1.display();
         */

        // Using proxyImage
        Image img3 = new ProxyImage("cat.png");
        Image img4 = new ProxyImage("cat.png");

        // The image is loaded lazily when needed,
        // saving time and resources if the
        // image is never displayed.
        img3.display();
        img4.display();
    }
}
