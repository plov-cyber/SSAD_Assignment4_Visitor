package Assignment4.visitor;

import Assignment4.map.Map;
import Assignment4.places.Restaurant;
import Assignment4.places.Theatre;
import Assignment4.places.extraInfo.*;
import Assignment4.places.Museum;
import Assignment4.places.Place;

import java.util.Collections;

/**
 * InfoVisitor class.
 * Gets the relevant information about each place.
 */
public class InfoVisitor implements Visitor {
    private Map map;

    /**
     * Constructor.
     */
    public InfoVisitor(Map map) {
        this.map = map;
    }

    /**
     * Method that adds the place and information about it on map.
     */
    public void addOnMap(Place place, String placeInfo) {
        map.addVisiblePlace(place, placeInfo);
    }

    /**
     * Overridden method that gets the information about Museum.
     */
    @Override
    public void visitMuseum(Museum museum) {
        StringBuilder result = new StringBuilder();
        result.append(museum.getInformation());
        int index = 1;
        result.append("Exhibitions: \n");
        for (Exhibition ex : museum.getExhibitions()) {
            result.append(index).append(": ").append(ex.toString());
            index++;
        }
        result.append(String.join("", Collections.nCopies(14 + museum.getName().length(), "#")))
                .append("\n");
        this.addOnMap(museum, result.toString());
    }

    /**
     * Overridden method that gets the information about Theatre.
     */
    @Override
    public void visitTheatre(Theatre theatre) {
        StringBuilder result = new StringBuilder();
        result.append(theatre.getInformation());

        int index = 1;
        result.append("Concerts: \n");
        for (Concert c : theatre.getAffiche()) {
            result.append(index).append(": ").append(c.toString());
            index++;
        }
        result.append(String.join("", Collections.nCopies(14 + theatre.getName().length(), "#")))
                .append("\n");

        this.addOnMap(theatre, result.toString());
    }

    /**
     * Overridden method that gets the information about Restaurant.
     */
    @Override
    public void visitRestaurant(Restaurant restaurant) {
        StringBuilder result = new StringBuilder();
        result.append(restaurant.getInformation());

        int index = 1;
        result.append("Dishes: \n");
        for (Dish d : restaurant.getMenu()) {
            result.append(index).append(": ").append(d.toString());
            index++;
        }
        result.append(String.join("", Collections.nCopies(14 + restaurant.getName().length(), "#")))
                .append("\n");

        this.addOnMap(restaurant, result.toString());
    }

}
