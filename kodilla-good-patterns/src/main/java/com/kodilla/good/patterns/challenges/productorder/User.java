package com.kodilla.good.patterns.challenges.productorder;

public class User {

    private String name;
    private String surname;

    public User(String name, String surname) {

        this.name = name;
        this.surname = surname;
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

}