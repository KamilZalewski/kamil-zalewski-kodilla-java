package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void TestBasicPizzaOrderGetCost(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void TestBasicPizzaOrderGetDescription(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sauce, cheese", description);
    }

    @Test
    public void TestPizzaWithHamGetCost(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HamDecorator(pizzaOrder);
        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(18), calculatedCost);
    }

    @Test
    public void TestPizzaWithHamGetDescription(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HamDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sauce, cheese, ham", description);
    }

    @Test
    public void TestPizzaWithHamAndOnionGetCost(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new OnionDecorator(pizzaOrder);
        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(20), calculatedCost);
    }

    @Test
    public void TestPizzaWithHamAndOnionGetDescription(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new OnionDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sauce, cheese, ham, onion", description);
    }

    @Test
    public void TestPizzaWithHamAndOnionAndExtraCheeseGetCost(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new OnionDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(24), calculatedCost);
    }

    @Test
    public void TestPizzaWithHamAndOnionAndExtraCheeseGetDescription(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new OnionDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sauce, cheese, ham, onion, extra cheese", description);
    }


}
