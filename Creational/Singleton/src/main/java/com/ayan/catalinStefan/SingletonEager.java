package com.ayan.catalinStefan;

public class SingletonEager {
    private static SingletonEager eagerInstance = new SingletonEager();

    private SingletonEager() {

    }

    public static SingletonEager getEagerInstance() {
        return eagerInstance;
    }
}
