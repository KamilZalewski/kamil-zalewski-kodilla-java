package com.kodilla.good.patterns.challenges.food2door;

import com.sun.org.apache.xpath.internal.operations.Or;

public class ExtraFoodShop implements Order{
    String supplier;
    String product;
    double quantity;

    @Override
    public Order order(String supplier, String product, double quantity) {
        System.out.println("This is a new order. ");
        return Order;
    }
    public void process(Order order){
        if (supplier == "ExtraFoodShop"){
            System.out.println("Thank You for your order in ExtraFoodShop. You ordered product: "
                + product
                + "in amount: "
                + quantity
                + ".");
        } else System.out.println("Thank You for your visit.");
    }
}
