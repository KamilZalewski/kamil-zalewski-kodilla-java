package com.kodilla.good.patterns.challenges;

public class OrderDto {
    private final String user;
    private final boolean isOrdered;

    public OrderDto(String user, boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }

    public String getUser() {
        return user;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "user='" + user + '\'' +
                ", isOrdered=" + isOrdered +
                '}';
    }
}
