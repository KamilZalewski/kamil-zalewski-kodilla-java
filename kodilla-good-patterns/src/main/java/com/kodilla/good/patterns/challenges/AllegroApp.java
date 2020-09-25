package com.kodilla.good.patterns.challenges;

public class AllegroApp {
    public static void main(String[] args) {
        InformationService informationService = new EmailService();
        OrderService orderService = new AllegroService();
        OrderRepository orderRepository = new DBRepository();
        ProductOrderService service = new ProductOrderService(informationService, orderService, orderRepository);
        OrderRequest orderRequest = new OrderRequest("Kamil", "1");
        OrderDto result = service.process(orderRequest);
        System.out.println(result);
    }
}
