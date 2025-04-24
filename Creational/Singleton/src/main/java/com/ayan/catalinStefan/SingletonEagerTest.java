package com.ayan.catalinStefan;

public class SingletonEagerTest {
    public static void main() {
        SingletonEager eagerInstance1 = SingletonEager.getEagerInstance();
        SingletonEager eagerInstance2 = SingletonEager.getEagerInstance();

        System.out.println(eagerInstance1);
        System.out.println(eagerInstance2);
    }
}
