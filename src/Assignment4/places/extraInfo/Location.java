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

    public double getDistance(Location anotherLocation) {
        Pair<Integer, Integer> anotherCoordinates = anotherLocation.getCoordinates();
        return Math.sqrt(Math.pow(this.coordinates.getKey() - anotherCoordinates.getKey(), 2) +
                Math.pow(this.coordinates.getValue() - anotherCoordinates.getValue(), 2));
    }

    public String getAddressByCoordinates() {
        // Get address by coordinates and return it.
        return "";
    }
}
