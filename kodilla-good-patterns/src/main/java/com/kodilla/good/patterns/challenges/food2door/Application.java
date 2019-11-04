package com.kodilla.good.patterns.challenges.food2door;


public class Application {

    public static void main(String[] args) {
        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();
        OrderProcessor orderProcessor = new OrderProcessor(new InformationSender(), order.getSupplier());
        orderProcessor.process(order);
    }
}