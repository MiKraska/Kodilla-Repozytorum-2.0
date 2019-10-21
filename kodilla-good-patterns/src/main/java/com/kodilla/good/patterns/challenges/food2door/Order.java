package com.kodilla.good.patterns.challenges.food2door;

class Order {

    private Supplier supplier;
    private int quantity;

    Order(final Supplier supplier, final int quantity) {
        this.supplier = supplier;
        this.quantity = quantity;
    }

    Supplier getSupplier() {
        return supplier;
    }

    int getQuantity() {
        return quantity;
    }

}