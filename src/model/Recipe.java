package model;

import java.util.Map;

public class Recipe {
    private String name;
    private Map<String, Integer> ingredients;
    private String instructions;

    public Recipe(String name, Map<String, Integer> ingredients, String instructions) {
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    public Map<String, Integer> getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public String getName() {
        return name;
    }
}
