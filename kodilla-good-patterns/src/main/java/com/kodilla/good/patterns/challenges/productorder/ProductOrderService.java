package com.kodilla.good.patterns.challenges.productorder;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {

    public boolean order(User user, LocalDateTime sellDate, int quantity, int price) {
        System.out.println(user.getName() + " " + user.getSurname() + " ordered product. Date of purchase: " + sellDate
                + " Quantity: " + quantity + " Price: " + price);
        return true;
    }

}