package com.ayan.catalinStefan;

public class LowercaseStrategy implements PrintStrategy {
    public String formatString(String input) {
        return input.toLowerCase();
    }
}
