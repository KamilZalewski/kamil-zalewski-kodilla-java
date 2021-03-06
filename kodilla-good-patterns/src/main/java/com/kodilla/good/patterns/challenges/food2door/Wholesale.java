package com.kodilla.good.patterns.challenges.food2door;

public class Wholesale {

    public static final String EXTRA_FOOD_SHOP = "ExtraFoodShop";
    public static final String GLUTEN_FREE_SHOP = "GlutenFreeShop";
    public static final String HEALTHY_SHOP = "Healthy Shop";

    public boolean processOrder(Order order) {
        Supplier shop = null;
        if (order.getShopName().equals(EXTRA_FOOD_SHOP)) {
            shop = new ExtraFoodShop();
        } else if (order.getShopName().equals(GLUTEN_FREE_SHOP)) {
            shop = new GlutenFreeShop();
        } else if (order.getShopName().equals(HEALTHY_SHOP)) {
            shop = new HealthyShop();
        }
        return shop.processOrder(order.getProduct(), order.getQuantity());
    }
}
