package com.kodilla.good.patterns.challenges.flightsapp;

public class Airport {

    private String name;

    Airport(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airport)) return false;

        Airport airport = (Airport) o;

        return getName() != null ? getName().equals(airport.getName()) : airport.getName() == null;
    }

    @Override
    public int hashCode() {
        return getName() != null ? getName().hashCode() : 0;
    }

    @Override
    public String toString() {
        return name;
    }
}
