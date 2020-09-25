package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User facebookUser = new ZGeneration("Tomasz Motyka");
        User twitterUser = new YGeneration("Maciej Kolano");
        User snapchatUser = new Millenials("Kamil Szyszka");
        //When
        String facebookMessage = facebookUser.sharePost();
        System.out.println("Tomasz Motyka: " + facebookMessage);
        String twitterMessage = twitterUser.sharePost();
        System.out.println("Maciej Kolano: " + twitterMessage);
        String snapchatMessage = snapchatUser.sharePost();
        System.out.println("Kamil Szyszka: " + snapchatMessage);
        //Then
        Assert.assertEquals("I use Facebook.", facebookMessage);
        Assert.assertEquals("I use Twitter.", twitterMessage);
        Assert.assertEquals("I use Snapchat.", snapchatMessage);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User facebookUser = new ZGeneration("Tomasz Motyka");
        //When
        String facebookMessage = facebookUser.sharePost();
        System.out.println("Tomasz Motyka: " + facebookMessage);
        facebookUser.setSocialPublisher(new TwitterPublisher());
        facebookMessage = facebookUser.sharePost();
        System.out.println("Tomasz Motyka: now " + facebookMessage);
        //Then
        Assert.assertEquals("I use Twitter.", facebookMessage);
    }
}
