package Assignment4.places.extraInfo;

import java.util.List;

public class Dish {
    private String name;
    private Integer cost;
    private List<String> ingredients;
    private Integer weight;

    public Dish(Integer cost, List<String> ingredients, Integer weight) {
        this.cost = cost;
        this.ingredients = ingredients;
        this.weight = weight;
    }

    public String toString() {
        String result = "\tName: " + this.name + "\n" +
                "\tCost: " + this.cost + "\n" +
                "\tWeight: " + this.weight + " g." + "\n" +
                "\tIngredients: " + String.join(", ", this.ingredients) + "\n";
        return result;
    }
}
