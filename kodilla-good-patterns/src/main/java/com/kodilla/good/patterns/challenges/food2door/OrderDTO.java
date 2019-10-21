package com.kodilla.good.patterns.challenges.food2door;

public class OrderDTO {

    private Supplier supplier;
    private boolean isAdded;

    OrderDTO(final Supplier supplier, final boolean isAdded) {
        this.supplier = supplier;
        this.isAdded = isAdded;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public boolean isAdded() {
        return isAdded;
    }
}
