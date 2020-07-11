package com.kodilla.good.patterns.challenges.flights;

import java.util.List;

public class Departures {

    private List<String> departures;

    public Departures(List<String> departures) {
        this.departures = departures;
    }

    public List<String> getDepartures() {
        return departures;
    }
}
