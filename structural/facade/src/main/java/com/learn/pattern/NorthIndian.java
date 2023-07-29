package com.learn.pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NorthIndian implements Food {
    List<String> ingredients = new ArrayList<String>();

    @Override
    public String prepareFood(String... ingredients) {

        for(String ingredient:ingredients){
            this.ingredients.add(ingredient);
        }
       return "North Indian thali is preparing with required items .. "
               +this.ingredients;
    }

    @Override
    public String deliverFood() {
        return "North Indian thali is ready for delivery with required items .. "
                + this.ingredients;
    }
}
