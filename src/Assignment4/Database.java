package Assignment4;

import Assignment4.places.Place;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Place> allPlaces;

    public Database() {
        allPlaces = new ArrayList<>();
    }

    public void addPlace(Place place) {
        allPlaces.add(place);
    }

    public void removePlace(Place place) {
        allPlaces.remove(place);
    }

    public List<Place> getAllPlaces() {
        return this.allPlaces;
    }
}
