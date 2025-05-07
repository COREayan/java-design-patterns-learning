package com.ayan.prateekNarang.Solution;

import com.ayan.prateekNarang.problem.OrderService;
import com.ayan.prateekNarang.problem.PaymentService;
import com.ayan.prateekNarang.problem.UserService;

public class Client {
    public static void main(String[] args) {
        // Client code interacting with API Gateway (Facade)
        APIGateway apiGateway = new APIGateway();
        // Task
        System.out.println(apiGateway.getFullOrderDetails("123", "456", "789"));
    }
}
