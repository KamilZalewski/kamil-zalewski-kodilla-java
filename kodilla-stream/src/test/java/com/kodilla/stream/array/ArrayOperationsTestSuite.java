package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;
import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[20];
        numbers[0] = 5;
        numbers[1] = 16;
        numbers[2] = 4;
        numbers[3] = 89;
        numbers[4] = 3;
        numbers[5] = 45;
        numbers[6] = 33;
        numbers[7] = 2;
        numbers[8] = 9;
        numbers[9] = 5;
        numbers[10] = 77;
        numbers[11] = 456;
        numbers[12] = 89;
        numbers[13] = 14;
        numbers[14] = 71;
        numbers[15] = 56;
        numbers[16] = 91;
        numbers[17] = 25;
        numbers[18] = 7;
        numbers[19] = 1;
        //When
        double result = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(54.9, result, 0.001);
    }
}