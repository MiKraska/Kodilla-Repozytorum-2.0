package com.kodilla.good.patterns.challenges.food2door;

public interface Supplier {

    boolean process(Order order);

    String getName();

    String getAddress();

    String getProduct();

}