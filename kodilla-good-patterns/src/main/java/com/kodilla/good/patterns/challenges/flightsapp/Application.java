package com.kodilla.good.patterns.challenges.flightsapp;

public class Application {
    public static void main(String[] args) {

        FlightProcessor flightProcessor = new FlightProcessor();
        System.out.println(flightProcessor.findFlightsFrom("Kraków"));
        System.out.println(flightProcessor.findFlightsTo("Warszawa"));
        flightProcessor.findFlightVia("Gdańsk","Wrocław");
    }
}