package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop implements Supplier {

    @Override
    public boolean processOrder(String product, double quantity) {
        if (product.equals("pizza") || product.equals("Pizza")){
            System.out.println("We don't like pizza");
            return false;
        } else {
            System.out.println("Thank you for your order.");
            return true;
        }
    }
}
