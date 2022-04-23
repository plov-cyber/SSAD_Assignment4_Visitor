package Assignment4.places.extraInfo;

import java.util.List;

/**
 * Dish class.
 * Used by Restaurant class to store dishes in menu.
 */
public class Dish {
    private String name;
    private Integer cost;
    private List<String> ingredients;
    private Integer weight;

    /**
     * Constructor.
     */
    public Dish(String name, Integer cost, List<String> ingredients, Integer weight) {
        this.name = name;
        this.cost = cost;
        this.ingredients = ingredients;
        this.weight = weight;
    }

    /**
     * String format of the class.
     */
    public String toString() {
        String result = "\tName: " + this.name + "\n" +
                "\tCost: " + this.cost + "$\n" +
                "\tWeight: " + this.weight + " g." + "\n" +
                "\tIngredients: " + String.join(", ", this.ingredients) + "\n";
        return result;
    }
}
