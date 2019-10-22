package com.kodilla.good.patterns.challenges.flightsapp;

public class FlightsSystemMain {
    public static void main(String[] args) {

        FlightsSearch flightsSearch = new FlightsSearch();

        flightsSearch.findFlightsFrom("Warszawa");
        flightsSearch.findFlightsTo("Berlin");
        flightsSearch.findFlightsBy("Moskwa");
    }
}