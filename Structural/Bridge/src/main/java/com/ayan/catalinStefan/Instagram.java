package com.ayan.catalinStefan;

public class Instagram implements App {
    PhoneOS os;

    public Instagram(PhoneOS os) {
        this.os = os;
    }

    @Override
    public void runApp() {
        System.out.println();
        os.display("cached data");
        os.upload("instagram.com");
        os.download("instagram data");
        os.display("fresh data");
        System.out.println();
    }
}
