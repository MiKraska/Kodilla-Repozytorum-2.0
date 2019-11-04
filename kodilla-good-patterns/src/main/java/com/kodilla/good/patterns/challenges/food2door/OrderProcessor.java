package com.kodilla.good.patterns.challenges.food2door;

class OrderProcessor {

    private InformationService informationService;
    private Supplier supplier;

    OrderProcessor(final InformationService informationService, final Supplier supplier) {
        this.informationService = informationService;
        this.supplier = supplier;
    }

    OrderDTO process(final Order order) {
        boolean isProcessed = supplier.process(order);
        if (isProcessed) {
            informationService.information();
        }
        return new OrderDTO(supplier, isProcessed);
    }
}