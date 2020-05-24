package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearchEngine {

    private Map<String, Boolean> flights() {
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("London", true);
        flights.put("Berlin", true);
        flights.put("Madryt", false);
        flights.put("Prague", false);
        flights.put("Paris", true);
        return flights;
    }
    public boolean findFlight(Flight flight) throws Exception {

        if (flights().containsKey(flight.getArrivalAirport())) {
            return flights().get(flight.getArrivalAirport());
        } else {
            throw new Exception();
        }
    }
}

