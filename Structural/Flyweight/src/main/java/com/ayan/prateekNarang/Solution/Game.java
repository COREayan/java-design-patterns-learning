package com.ayan.prateekNarang.Solution;

import com.ayan.prateekNarang.Problem.Bullet;

public class Game {
    public static void main(String[] args) {
        // 5 Red Bullet objects.
        for (int i=0; i<5; i++) {
            com.ayan.prateekNarang.Problem.Bullet bullet = new com.ayan.prateekNarang.Problem.Bullet("Red", i * 10, i * 12, 5);
        }

        // 5 Green Bullet Objects
        for (int i=0; i<5; i++) {
            com.ayan.prateekNarang.Problem.Bullet bullet = new Bullet("Red", i * 10, i * 12, 5);
        }

        // Problems
        // Memory Overhead : Every bullet stores redundant data like Color, Image
        // Performance : Slow performance when many bullets are created.
    }
}
