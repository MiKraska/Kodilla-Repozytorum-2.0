package com.kodilla.good.patterns.challenges.flightsapp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class FlightsConnection {

    private String throughCity;

    final Map<Airport, List<Airport>> getFlights() {

        final Map<Airport, List<Airport>> flightsConnection = new HashMap<>();

        Flights flights = new Flights();

        Airport Warsaw = flights.getDepartureAirports().get(0);
        Airport Krakow = flights.getDepartureAirports().get(1);
        Airport Gdansk = flights.getDepartureAirports().get(2);

        List<Airport> flightsFromWarsaw = flights.getFlightsFromWarsaw();
        List<Airport> flightsFromKrakow = flights.getFlightsFromKrakow();
        List<Airport> flightsFromGdansk = flights.getFlightsFromGdansk();

        flightsConnection.put(Warsaw, flightsFromWarsaw);
        flightsConnection.put(Krakow, flightsFromKrakow);
        flightsConnection.put(Gdansk, flightsFromGdansk);

        return new HashMap<>(flightsConnection);
    }

    String findFlightThroughCity(String airport) {
        FlightsConnection flightsConnection = new FlightsConnection();
        flightsConnection.getFlights().forEach((key, value) -> {
            if (value.toString().contains(airport)) {
                this.throughCity = key.toString();
            }
        });
        return throughCity;
    }
}
