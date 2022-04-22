package Assignment4.places.extraInfo;

import java.util.List;

public class Dish {
    private Integer cost;
    private List<String> products;
    private Integer weight;

    public Dish(Integer cost, List<String> products, Integer weight) {
        this.cost = cost;
        this.products = products;
        this.weight = weight;
    }
}
