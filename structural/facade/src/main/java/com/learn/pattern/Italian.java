package com.learn.pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Italian implements Food {
    List<String> ingredients = new ArrayList<String>();

    @Override
    public String prepareFood(String... ingredients) {

        for(String ingredient:ingredients){
            this.ingredients.add(ingredient);
        }
        return "Italian thali is preparing with required items .. "+ this.ingredients;
    }

    @Override
    public String deliverFood() {
        return "Italian thali is ready with required items .. "+ this.ingredients;
    }
}
