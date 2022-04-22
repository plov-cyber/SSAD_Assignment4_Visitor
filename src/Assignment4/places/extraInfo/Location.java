package Assignment4.places.extraInfo;

import javafx.util.Pair;

public class Location {
    private Pair<Integer, Integer> coordinates;

    public Location(Pair<Integer, Integer> coordinates) {
        this.coordinates = coordinates;
    }

    public Pair<Integer, Integer> getCoordinates() {
        return this.coordinates;
    }

    public String getAddressByCoordinates() {
        // Get address by coordinates and return it
        return "";
    }
}
