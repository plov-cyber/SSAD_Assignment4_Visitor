package Assignment4.places;

import Assignment4.places.extraInfo.Dish;
import Assignment4.places.extraInfo.Location;
import Assignment4.places.extraInfo.PlaceType;
import Assignment4.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Restaurant extends Place {
    private List<Dish> menu;

    public Restaurant(Location location, String name, PlaceType type, String address, String contactNumber) {
        super(location, name, type, address, contactNumber);
        menu = new ArrayList<>();
    }

    public Restaurant addDish(Dish dish) {
        menu.add(dish);
        return this;
    }

    public List<Dish> getMenu() {
        return this.menu;
    }

    @Override
    public void accept(Visitor v) {
        v.visitRestaurant(this);
    }
}
