package com.kodilla.good.patterns.challenges.productorder;

public class OrderDTO {

    private User user;
    private boolean isOrdered;

    OrderDTO(final User user, final boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

}
