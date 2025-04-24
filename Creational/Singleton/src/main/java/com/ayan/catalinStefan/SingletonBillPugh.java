package com.ayan.catalinStefan;

public class SingletonBillPugh {
    private SingletonBillPugh() {

    }

    private static class InnerStaticClass {
        private static final SingletonBillPugh billPUghInstance = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance() {
        return InnerStaticClass.billPUghInstance;
    }
}
