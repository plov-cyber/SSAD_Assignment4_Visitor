package Assignment4;

import Assignment4.places.Place;

import java.util.ArrayList;
import java.util.List;

/**
 * Database class.
 * Stores all available places.
 */
public class Database {
    private List<Place> allPlaces;

    /**
     * Constructor.
     */
    public Database() {
        allPlaces = new ArrayList<>();
    }

    /**
     * Method to add new place.
     */
    public void addPlace(Place place) {
        allPlaces.add(place);
    }

    /**
     * Method to remove the place.
     */
    public void removePlace(Place place) {
        allPlaces.remove(place);
    }

    /**
     * Getter for all places.
     */
    public List<Place> getAllPlaces() {
        return this.allPlaces;
    }
}
