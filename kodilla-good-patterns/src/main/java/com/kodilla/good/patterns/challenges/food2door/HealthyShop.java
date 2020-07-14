package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop implements Supplier {

    @Override
    public boolean processOrder(String product, double quantity) {
        if (quantity < 5) {
            System.out.println("We don't sell less than 5 piece of product.");
            return false;
        } else {
            System.out.println("Bon Appetit!");
            return true;
        }
    }
}
