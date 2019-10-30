package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

class FlightProcessor {
    void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airport = new HashMap<>();
        airport.put("Warsaw", true);
        airport.put("Dublin", false);

        String airport1 = flight.getDepartureAirport();
        String airport2 = flight.getArrivalAirport();

        if (airport.containsKey(airport1) && airport.containsKey(airport2)) {
            System.out.println(airport1 + " airport. Departure possibility: " + airport.get(airport1));
            System.out.println(airport2 + " airport. Arrival possibility: " + airport.get(airport2));
        } else {
            throw new RouteNotFoundException("Airport not found");
        }
    }
}