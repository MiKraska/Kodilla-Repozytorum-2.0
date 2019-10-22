package com.kodilla.good.patterns.challenges.flightsapp;

import java.util.ArrayList;
import java.util.List;

class Flights {

    List<Airport> getDepartureAirports() {
        List<Airport> airports = new ArrayList<>();
        airports.add(new Airport("Warszawa"));
        airports.add(new Airport("Kraków"));
        airports.add(new Airport("Gdańsk"));
        return airports;
    }

    List<Airport> getFlightsFromWarsaw() {
        List<Airport> airports = new ArrayList<>();
        airports.add(new Airport("Moskwa"));
        airports.add(new Airport("Gdańsk"));
        airports.add(new Airport("Radom"));
        return airports;
    }

    List<Airport> getFlightsFromKrakow() {
        List<Airport> airports = new ArrayList<>();
        airports.add(new Airport("Berlin"));
        airports.add(new Airport("Wrocław"));
        airports.add(new Airport("Warszawa"));
        return airports;
    }

    List<Airport> getFlightsFromGdansk() {
        List<Airport> airports = new ArrayList<>();
        airports.add(new Airport("Warszawa"));
        airports.add(new Airport("Wrocław"));
        airports.add(new Airport("Poznań"));
        return airports;
    }
}
