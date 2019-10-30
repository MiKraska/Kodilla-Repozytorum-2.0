package com.kodilla.exception.test;

public class Application {
    public static void main(String[] args) {

        FlightProcessor flightSearching = new FlightProcessor();
        Flight flight1 = new Flight("Warsaw", "Dublin");
        Flight flight2 = new Flight("Warsaw", "Moscow");

        try {
            flightSearching.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Searching finished.");
        }

        try {
            flightSearching.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Searching finished.");
        }
    }
}