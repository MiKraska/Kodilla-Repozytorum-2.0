package com.kodilla.patterns.strategy.social;


import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        User Imoen = new Millenials("Imoen");
        User Minsc = new YGeneration("Minsc");
        User Boo = new ZGeneration("Boo");

        String imoenSocial = Imoen.sharePost();
        System.out.println("Imoen favourite platform is: " + imoenSocial);
        String minscSocial = Minsc.sharePost();
        System.out.println("Minsc favourite platform is: " + minscSocial);
        String booSocial = Boo.sharePost();
        System.out.println("Boo favourite platform is: " + booSocial);

        Assert.assertEquals("Facebook", imoenSocial);
        Assert.assertEquals("Twitter", minscSocial);
        Assert.assertEquals("Snapchat", booSocial);
    }

    @Test
    public void testIndividualSharingStrategy() {
        User jaheira = new YGeneration("Jaheira");

        String jaheiraSocial = jaheira.sharePost();
        System.out.println("Jaheira favourite platform is: " + jaheiraSocial);
        jaheira.setSocialPublisher(new FacebookPublisher());
        jaheiraSocial = jaheira.sharePost();
        System.out.println("Jaheira favourite platform is: " + jaheiraSocial);

        Assert.assertEquals("Facebook", jaheiraSocial);
    }
}