package com.ayan.prateekNarang;

interface PaymentStrategy {
    void processPayment();
}

// Concrete Strategy: Credit Card
class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Making payment via Credit Card");
    }
}

// Concrete Strategy: Debit Card
class DebitCardPayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Making payment via Credit Card");
    }
}

// Concrete Strategy: UPI
class UPICardPayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Making payment via UPI");
    }
}

class PaymentService2 {
    private PaymentStrategy strategy;

    public void setPayementStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay() {
        strategy.processPayment(); // Polymorphic Behaviour
    }
}

public class StrategyPattern {
    public static void main(String[] args) {
        PaymentService2 paymentService = new PaymentService2();
        paymentService.setPayementStrategy(new DebitCardPayment());

        paymentService.pay();
    }
}
