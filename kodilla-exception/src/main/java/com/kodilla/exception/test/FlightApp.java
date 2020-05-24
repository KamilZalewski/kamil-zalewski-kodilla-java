package com.kodilla.exception.test;

public class FlightApp {
    public static void main (String[] args){
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine();
        Flight flightWrong = new Flight("Warsaw","Radom");
        Flight flight = new Flight("Moscow", "Berlin");
        try {
            flightSearchEngine.findFlight(flightWrong);
        } catch (Exception RouteNotFoundException){
            System.out.println("Errorek: RouteNotFoundException");
        } finally {
            System.out.println("Mission completed.");
        }
    }
}
