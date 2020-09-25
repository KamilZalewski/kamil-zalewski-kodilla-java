package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.flights.Flight;
import com.kodilla.good.patterns.challenges.flights.FlightsSearchEngine;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FlightsTestSuite {

    @Test
    public void testFindFlightFrom() {
        //Given
        FlightsSearchEngine flightsSearchEngine = new FlightsSearchEngine();
        //When
        List<Flight> flightsFrom = flightsSearchEngine.findFlightFrom("Katowice");
        //Then
        System.out.println(flightsFrom);
        Assert.assertEquals(2, flightsFrom.size());
    }

    @Test
    public void testFindFlightTo() {
        //Given
        FlightsSearchEngine flightsSearchEngine = new FlightsSearchEngine();
        //When
        List<Flight> flightsTo = flightsSearchEngine.findFlightTo("Wrocław");
        //Then
        System.out.println(flightsTo);
        Assert.assertEquals(2, flightsTo.size());
    }

    @Test
    public void testFindFlightThrough() {
        //Given
        FlightsSearchEngine flightsSearchEngine = new FlightsSearchEngine();
        //When
        List<Flight> flightsTo = flightsSearchEngine.findFlightThrough("Warszawa", "Gdańsk", "Wrocław");
        //Then
        System.out.println(flightsTo);
        Assert.assertEquals(2, flightsTo.size());
    }
}
