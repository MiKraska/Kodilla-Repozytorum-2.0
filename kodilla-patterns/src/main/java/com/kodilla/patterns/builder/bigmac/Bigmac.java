package com.kodilla.patterns.builder.bigmac;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class Bigmac {

    private static final Set<String> AVAILABLE_BUNS =
            new HashSet<>(Arrays.asList("Sesame bun", "Standard bun"));
    private static final Set<String> AVAILABLE_SAUCES =
            new HashSet<>(Arrays.asList("Standard", "1000 Islands Dressing", "BBQ"));
    private static final Set<String> AVAILABLE_INGREDIENTS =
            new HashSet<>(Arrays.asList("Salad", "Onion", "Bacon", "Pickle", "Chili Pepper ", "Mushrooms", "Shrimps", "Cheese"));

    private final int burgers;
    private final String bun;
    private final String sauce;
    private final Set<String> ingredients;

    public static class BigmacBuilder {

        private String bun;
        private int burgers;
        private String sauce;
        private Set<String> ingredients = new HashSet<>();

        public BigmacBuilder bun(String bun) {
            if (!AVAILABLE_BUNS.contains(bun)) {
                throw new IllegalStateException("Wrong bun chosen. Available options are: Sesame bun, Standard bun.");
            }
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            if (burgers < 1 || burgers > 10) {
                throw new IllegalStateException("You need to choose between 1 to 10 burgers.");
            }
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            if (!AVAILABLE_SAUCES.contains(sauce)) {
                throw new IllegalStateException("Wrong sauce chosen. Available options are: Standard, 1000 Island Dressing, BBQ.");
            }
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder addIngredient(String ingredient) {
            if (!AVAILABLE_INGREDIENTS.contains(ingredient)) {
                throw new IllegalStateException("Wrong ingredient chosen. Available options are: Salad, Onion, Bacon," +
                        "Pickle, Chili Peppers, Mushrooms, Shrimps, Cheese.");
            }
            this.ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    private Bigmac(final String bun, final int burgers, final String sauce, final Set<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new HashSet<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public Set<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
