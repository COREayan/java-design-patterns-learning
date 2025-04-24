package com.ayan.prateekNarang.Problem;

public class WithoutSingletonPattern {
    public static void main(String[] args) {
        AppSettings appSettings = new AppSettings();
        AppSettings appSettingsCopy = new AppSettings(); // we should not create multiple objects, only one copy of object should exist.

        System.out.println(appSettingsCopy.getApiKey());
        System.out.println(appSettings.getApiKey());
    }
}
