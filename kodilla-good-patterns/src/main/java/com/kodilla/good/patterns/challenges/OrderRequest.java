package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    private String user;
    private String product;


    public String getUser() {
        return user;
    }

    public String getProduct() {
        return product;
    }

    public OrderRequest(String user, String product) {
        this.user = user;
        this.product = product;
    }
}
