package com.kodilla.good.patterns.challenges.flightsapp;

import java.util.*;
import java.util.stream.Collectors;

class FlightProcessor {

    List<String> findFlightsFrom(String city){
        return FlightsRepository.getFlightSet().stream()
                .filter(flight -> flight.getFlightFrom().equals(city))
                .map(Flight::getFlightTo)
                .collect(Collectors.toList());
    }


    List<String> findFlightsTo(String city){
        return FlightsRepository.getFlightSet().stream()
                .filter(flight -> flight.getFlightTo().equals(city))
                .map(Flight::getFlightFrom)
                .collect(Collectors.toList());
    }

    void findFlightVia(String city1, String city2) {
        List<String> flightsFromCity = findFlightsFrom(city1);
        List<String> flightsToCity = findFlightsTo(city2);


        List<String> list = new ArrayList<>();
        for (String flight : flightsFromCity) {

            if (flightsToCity.contains(flight)) {
                list.add(flight);
            }
        }

        System.out.println(city1 + ": Flights via " + list + " to " + city2);
    }
}