package com.kodilla.good.patterns.challenges.food2door;

public class Food2DoorApp {
    public static void main(String[] args) {
        Order order = new Order(Wholesale.EXTRA_FOOD_SHOP, "Orange", 1);
        Wholesale wholesale = new Wholesale();
        wholesale.processOrder(order);
    }
}
