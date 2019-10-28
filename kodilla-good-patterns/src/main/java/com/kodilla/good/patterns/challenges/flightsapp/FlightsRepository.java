package com.kodilla.good.patterns.challenges.flightsapp;

import java.util.HashSet;
import java.util.Set;

public class FlightsRepository {
    private static final String WAR = "Warszawa";
    private static final String KRK = "Kraków";
    private static final String GDA = "Gdańsk";
    private static final String WRO = "Wrocław";

    private static Set<Flight> flightSet = new HashSet<>();

    static {
        flightSet.add(new Flight(WAR, KRK));
        flightSet.add(new Flight(WAR, GDA));
        flightSet.add(new Flight(WAR, WRO));
        flightSet.add(new Flight(KRK, WAR));
        flightSet.add(new Flight(KRK, GDA));
        flightSet.add(new Flight(KRK, WRO));
        flightSet.add(new Flight(WRO, KRK));
        flightSet.add(new Flight(WRO, GDA));
        flightSet.add(new Flight(WRO, WAR));
        flightSet.add(new Flight(GDA, WAR));
        flightSet.add(new Flight(GDA, KRK));
        flightSet.add(new Flight(GDA, WRO));
    }

    static Set<Flight> getFlightSet() {
        return new HashSet<>(flightSet);
    }

    @Override
    public String toString() {
        return "FlightDatabase{" +
                "flightSet=" + flightSet +
                '}';
    }

}