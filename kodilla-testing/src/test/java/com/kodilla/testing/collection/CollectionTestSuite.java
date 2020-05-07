package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        List<Integer> result = exterminator.exterminate(numbers);
        //Then
        assertEquals(0, result.size());
    System.out.println("testOddNumbersExterminatorEmptyList is completed");
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(19);
        numbers.add(18);
        numbers.add(17);
        numbers.add(16);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(18);
        expected.add(16);

        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        List<Integer> result = exterminator.exterminate(numbers);
        //Then
        assertEquals(expected, result);
    System.out.println("testOddNumbersExterminatorNormalList is completed");
    }
}
