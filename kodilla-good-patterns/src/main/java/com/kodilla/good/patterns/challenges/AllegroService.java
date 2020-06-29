package com.kodilla.good.patterns.challenges;

import java.util.Random;

public class AllegroService implements OrderService {
    @Override
    public boolean order(String user, String product) {
        Random random = new Random();
        return random.nextBoolean();
    }
}
