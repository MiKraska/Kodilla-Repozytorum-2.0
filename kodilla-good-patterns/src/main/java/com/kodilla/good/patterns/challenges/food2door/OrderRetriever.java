package com.kodilla.good.patterns.challenges.food2door;

class OrderRetriever {

    Order retrieve() {
        TestSupplier testSupplier = new TestSupplier("Test Name", "Testing Street 2, Test Town",
                "Test Product");
        return new Order(testSupplier, 1234);
    }

}