package com.kodilla.good.patterns.challenges.productorder;

import java.time.LocalDateTime;

public interface OrderService {

    boolean order(User user, LocalDateTime sellDate, int quantity, int price);

}