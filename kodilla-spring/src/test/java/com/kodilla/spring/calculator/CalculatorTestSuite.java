package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {CalculatorConfiguration.class})
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testSum() {
        //Given
        //When
        double sum = calculator.sum(10, 5);
        //Then
        Assert.assertEquals(15, sum, 0.001);
    }

    @Test
    public void testSub() {
        //Given
        //When
        double sum = calculator.sub(10, 5);
        //Then
        Assert.assertEquals(5, sum, 0.001);
    }

    @Test
    public void testMul() {
        //Given
        //When
        double sum = calculator.mul(10, 5);
        //Then
        Assert.assertEquals(50, sum, 0.001);
    }

    @Test
    public void testDiv() {
        //Given
        //When
        double sum = calculator.div(10, 5);
        //Then
        Assert.assertEquals(2, sum, 0.001);
    }
}
