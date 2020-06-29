package com.kodilla.good.patterns.challenges;

public class EmailService implements InformationService {
    @Override
    public void inform(String user) {
        System.out.println("Notify " + user + " by mail.");
    }
}
