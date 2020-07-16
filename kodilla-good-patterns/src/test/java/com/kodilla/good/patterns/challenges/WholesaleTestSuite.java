package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.food2door.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.food2door.Order;
import com.kodilla.good.patterns.challenges.food2door.Supplier;
import com.kodilla.good.patterns.challenges.food2door.Wholesale;
import org.junit.Assert;
import org.junit.Test;

public class WholesaleTestSuite {

    @Test
    public void testProcessOrder(){
        //Given
        Order order = new Order(Wholesale.EXTRA_FOOD_SHOP, "Orange", 1);
        Order order1 = new Order(Wholesale.GLUTEN_FREE_SHOP,"Pizza", 2);
        Order order2 = new Order(Wholesale.HEALTHY_SHOP, "Tortilla", 4);
        //When
        Wholesale wholesale = new Wholesale();
        //Then
        Assert.assertTrue(true, wholesale.processOrder(order));
    }
}
