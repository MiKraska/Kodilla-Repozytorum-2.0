package com.kodilla.good.patterns.challenges.flightsapp;

public class Flight {
    private String flightFrom;
    private String flightTo;

    String getFlightFrom() {
        return flightFrom;
    }

    String getFlightTo() {
        return flightTo;
    }

    Flight(String flightFrom, String flightTo) {
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!flightFrom.equals(flight.flightFrom)) return false;
        return flightTo.equals(flight.flightTo);
    }

    @Override
    public int hashCode() {
        int result = flightFrom.hashCode();
        result = 31 * result + flightTo.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightFrom='" + flightFrom + '\'' +
                ", flightTo='" + flightTo + '\'' +
                '}';
    }
}