package com.kodilla.good.patterns.challenges.productorder;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository {

    public boolean makeOrder(User user, LocalDateTime sellDate, int quantity, int price) {
        System.out.println("Order made.");
        return true;
    }

}