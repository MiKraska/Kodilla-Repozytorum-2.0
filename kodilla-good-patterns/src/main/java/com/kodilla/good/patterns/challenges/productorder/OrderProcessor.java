package com.kodilla.good.patterns.challenges.productorder;

class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    OrderProcessor(final InformationService informationService, final OrderService orderService,
                   final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    OrderDTO process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getSellDate(),
                orderRequest.getQuantity(), orderRequest.getPrice());
        if (isOrdered) {
            orderRepository.makeOrder(orderRequest.getUser(), orderRequest.getSellDate(),
                    orderRequest.getQuantity(), orderRequest.getPrice());
            informationService.information(orderRequest.getUser());
            return new OrderDTO(orderRequest.getUser(), true);
        } else {
            return new OrderDTO(orderRequest.getUser(), false);
        }
    }

}
