package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop implements Supplier {

    @Override
    public boolean processOrder(String product, double quantity) {
        if(quantity > 10){
            System.out.println("Order cannot be managed - out of products.");
            return false;
        } else {
            System.out.println("All products are available. Order is realized.");
            return true;
        }
    }
}
