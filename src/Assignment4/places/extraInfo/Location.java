package Assignment4.places.extraInfo;

import javafx.util.Pair;

/**
 * Location class.
 * Used to store the coordinates. Has method to find the distance between two locations.
 */
public class Location {
    private Pair<Integer, Integer> coordinates;

    /**
     * Constructor.
     */
    public Location(Pair<Integer, Integer> coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * Getter for coordinates.
     */
    public Pair<Integer, Integer> getCoordinates() {
        return this.coordinates;
    }

    /**
     * Method that finds the distance between two locations.
     */
    public double getDistance(Location anotherLocation) {
        Pair<Integer, Integer> anotherCoordinates = anotherLocation.getCoordinates();
        return Math.sqrt(Math.pow(this.coordinates.getKey() - anotherCoordinates.getKey(), 2) +
                Math.pow(this.coordinates.getValue() - anotherCoordinates.getValue(), 2));
    }

    /**
     * Method that gets the address by given coordinates.
     */
    public String getAddressByCoordinates() {
        // Get address by coordinates and return it.
        return "";
    }
}
