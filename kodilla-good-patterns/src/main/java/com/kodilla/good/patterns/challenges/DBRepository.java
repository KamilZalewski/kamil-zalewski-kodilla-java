package com.kodilla.good.patterns.challenges;

public class DBRepository implements OrderRepository {
    @Override
    public void createOrder(String user, String product) {
        System.out.println("Order has been saved.");
    }
}
