package com.kodilla.good.patterns.challenges.productorder;

import java.time.LocalDateTime;

public interface OrderRepository {

    boolean makeOrder(User user, LocalDateTime sellDate, int quantity, int price);

}