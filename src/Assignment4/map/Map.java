package Assignment4.map;

import Assignment4.Database;
import Assignment4.places.Place;
import Assignment4.places.extraInfo.Location;
import Assignment4.visitor.InfoVisitor;
import Assignment4.visitor.Visitor;

import java.util.HashMap;

/**
 * Map class.
 * Responsible for map functionality: show necessary places, update visible places, etc.
 */
public class Map {
    private HashMap<Place, String> visiblePlaces; // Private field with currently showed places.

    /**
     * Constructor.
     */
    public Map() {
        visiblePlaces = new HashMap<>();
    }

    /**
     * Method to refresh the map view.
     */
    public void refresh() {
        // Refresh the map.
    }

    /**
     * Update the places within the given radius from given position.
     */
    public void updatePlaces(Database database, Integer radius, Location location) {
        // Creating new visitor and accepting it in all "places".
        Visitor v = new InfoVisitor(this);

        for (Place place : database.getAllPlaces()) {
            if (place.getLocation().getDistance(location) <= radius)
                place.accept(v);
        }
    }

    /**
     * Add new place.
     */
    public void addVisiblePlace(Place place, String placeInfo) {
        visiblePlaces.put(place, placeInfo);
    }

    /**
     * Get all visible places.
     */
    public HashMap<Place, String> getVisiblePlaces() {
        return this.visiblePlaces;
    }
}
