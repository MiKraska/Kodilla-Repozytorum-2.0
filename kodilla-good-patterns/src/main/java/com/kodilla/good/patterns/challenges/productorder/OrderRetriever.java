package com.kodilla.good.patterns.challenges.productorder;

import java.time.LocalDateTime;

class OrderRetriever {

    OrderRequest retrieve() {
        User user = new User("Michał", "Anioł");
        LocalDateTime sellDate = LocalDateTime.of(2019, 10, 21, 17, 24);
        int quantity = 12;
        int price = quantity * 123;
        return new OrderRequest(user, sellDate, quantity, price);
    }

}