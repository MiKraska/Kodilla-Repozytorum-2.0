package com.kodilla.good.patterns.challenges.productorder;

public class Application {

    public static void main(String[] args) {
        OrderRetriever orderRetriever = new OrderRetriever();
        OrderRequest orderRequest = orderRetriever.retrieve();
        OrderProcessor orderProcessor = new OrderProcessor(new SMSInformationService(), new ProductOrderService(), new ProductOrderRepository());
        orderProcessor.process(orderRequest);
    }

}