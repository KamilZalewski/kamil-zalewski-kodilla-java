package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightsSearchEngine {

    public List<Flight> flightList() {
        List<Flight> flightList = new ArrayList<>();
        Flight flight = new Flight("Warszawa", "Gdańsk");
        Flight flight1 = new Flight("Katowice", "Wrocław");
        Flight flight2 = new Flight("Gdańsk", "Wrocław");
        Flight flight3 = new Flight("Wrocław", "Kraków");
        Flight flight4 = new Flight("Katowice", "Warszawa");
        flightList.add(flight);
        flightList.add(flight1);
        flightList.add(flight2);
        flightList.add(flight3);
        flightList.add(flight4);
        return flightList;
    }

    public List<Flight> findFlightFrom(String departure) {
        List<Flight> flightsFrom = flightList().stream()
                .filter(flight -> flight.getDeparture().equals(departure))
                .collect(Collectors.toList());
        return flightsFrom;
    }

    public List<Flight> findFlightTo(String arrival) {
        List<Flight> flightTo = flightList().stream()
                .filter(flight -> flight.getArrival().equals(arrival))
                .collect(Collectors.toList());
        return flightTo;
    }

    public List<Flight> findFlightThrough(String departure,String through, String arrival){
        List<Flight> flightFirstSection = flightList().stream()
                .filter(flight -> flight.getDeparture().equals(departure))
                .filter(flight -> flight.getArrival().equals(through))
                .collect(Collectors.toList());
        List<Flight> flightSecondSection = flightList().stream()
                .filter(flight -> flight.getDeparture().equals(through))
                .filter(flight -> flight.getArrival().equals(arrival))
                .collect(Collectors.toList());

        List<Flight> flightCompleted = Stream.of(flightFirstSection,flightSecondSection)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        return flightCompleted;
    }


}

