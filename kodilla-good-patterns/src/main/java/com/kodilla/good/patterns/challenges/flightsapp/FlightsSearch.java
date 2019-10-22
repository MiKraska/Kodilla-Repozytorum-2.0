package com.kodilla.good.patterns.challenges.flightsapp;

class FlightsSearch {

    private FlightsConnection flightsConnection = new FlightsConnection();

    void findFlightsFrom(String airport) {
        System.out.println("Flights from " + airport + ":");

        flightsConnection.getFlights().entrySet().stream()
                .filter(depart -> depart.getKey().toString().equals(airport))
                .flatMap(arrive -> arrive.getValue().stream())
                .forEach(System.out::println);
    }

    void findFlightsTo(String airport) {
        System.out.println("Flights to " + airport + " from:");

        flightsConnection.getFlights().forEach((key, value) -> {
            if (value.toString().contains(airport)) {
                System.out.println(key.toString());
            }
        });
    }

    void findFlightsBy(String airport) {
        System.out.println("Flights to " + airport + " from:");

        String throughCity = flightsConnection.findFlightThroughCity(airport);
        flightsConnection.getFlights().forEach((key, value) -> {
            if (value.toString().contains(throughCity)) {
                System.out.println(key.toString() + " via " + throughCity);
            }
        });
    }
}
