package com.ayan.prateekNarang.Problem;

public class AppSettings {
    private String databaseUrl;
    private String apiKey;

    public AppSettings() {
        // Read settings from a config file
        databaseUrl = "";
        apiKey = "12345-ABCDE";
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getApiKey() {
        return apiKey;
    }
}
