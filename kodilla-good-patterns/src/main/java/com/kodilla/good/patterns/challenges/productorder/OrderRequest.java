package com.kodilla.good.patterns.challenges.productorder;

import java.time.LocalDateTime;

class OrderRequest {

    private User user;
    private LocalDateTime sellDate;
    private int quantity;
    private int price;

    OrderRequest(final User user, final LocalDateTime sellDate, final int quantity, final int price) {
        this.user = user;
        this.sellDate = sellDate;
        this.quantity = quantity;
        this.price = price;
    }

    User getUser() {
        return user;
    }

    LocalDateTime getSellDate() {
        return sellDate;
    }

    int getQuantity() {
        return quantity;
    }

    int getPrice() {
        return price;
    }

}