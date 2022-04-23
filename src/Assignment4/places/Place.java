package Assignment4.places;

import Assignment4.places.extraInfo.Image;
import Assignment4.places.extraInfo.Location;
import Assignment4.places.extraInfo.PlaceType;
import Assignment4.visitor.Visitor;

/**
 * Place abstract class.
 * Used as a place on Map.
 */
public abstract class Place {
    private Location location;
    private String name;
    private PlaceType type;
    private Image image;
    private String address;
    private String contactNumber;

    /**
     * Constructor.
     */
    public Place(Location location, String name, PlaceType type, String address, String contactNumber) {
        this.location = location;
        this.name = name;
        this.type = type;
        this.address = address;
        this.contactNumber = contactNumber;
    }

    /**
     * Getter for location of place.
     */
    public Location getLocation() {
        return this.location;
    }

    /**
     * Getter for name of place.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Method that returns the information about place.
     */
    public String getInformation() {
        String result = "###### " + this.name + " ######\n" +
                "Address: " + this.address + "\n" +
                "Contact number: " + this.contactNumber + "\n";
        return result;
    }

    /**
     * Abstract method to accept the visitor.
     */
    public abstract void accept(Visitor v);
}
