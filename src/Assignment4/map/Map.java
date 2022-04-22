package Assignment4.map;

import Assignment4.Database;
import Assignment4.places.Place;
import Assignment4.places.extraInfo.Location;
import Assignment4.visitor.InfoVisitor;
import Assignment4.visitor.Visitor;

import java.util.HashMap;


public class Map {
    private HashMap<Place, String> visiblePlaces;

    public Map() {
        visiblePlaces = new HashMap<Place, String>();
    }

    public void refresh() {
        // Refresh the map.
    }

    public void updatePlaces(Database database, Integer radius, Location location) {
        Visitor v = new InfoVisitor(this);
        for (Place place : database.getAllPlaces()) {
            // Condition that distance < radius.
            place.accept(v);
        }
    }

    public void addVisiblePlace(Place place, String placeInfo) {
        visiblePlaces.put(place, placeInfo);
    }

    public HashMap<Place, String> getVisiblePlaces() {
        return this.visiblePlaces;
    }
}
