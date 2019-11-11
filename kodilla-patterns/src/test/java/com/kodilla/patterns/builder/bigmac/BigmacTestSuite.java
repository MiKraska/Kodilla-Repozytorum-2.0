package com.kodilla.patterns.builder.bigmac;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Set;

public class BigmacTestSuite {

    @Test
    public void testBigMacBuilder() {

        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Sesame bun")
                .burgers(3)
                .sauce("Standard")
                .addIngredient("Salad")
                .addIngredient("Onion")
                .addIngredient("Bacon")
                .addIngredient("Cheese")
                .build();
        System.out.println(bigmac);

        String bun = bigmac.getBun();
        int burgers = bigmac.getBurgers();
        String sauce = bigmac.getSauce();
        Set<String> ingredients = bigmac.getIngredients();

        Assert.assertEquals("Sesame bun", bun);
        Assert.assertEquals(3, burgers);
        Assert.assertEquals("Standard", sauce);
        Assert.assertTrue(ingredients.containsAll(Arrays.asList("Salad", "Cheese", "Onion", "Bacon")));
        Assert.assertEquals(4, ingredients.size());
    }

}