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

    void findFlightVia(String cityFrom, String cityTo) {
        List<String> flightsFromCity = findFlightsFrom(cityFrom);
        List<String> flightsToCity = findFlightsTo(cityTo);


        List<String> list = new ArrayList<>();
        for (String flight : flightsFromCity) {

            if (flightsToCity.contains(flight)) {
                list.add(flight);
            }
        }

        System.out.println(cityFrom + ": Flights via " + list + " to " + cityTo);
    }
}