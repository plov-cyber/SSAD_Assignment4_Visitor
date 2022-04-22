package Assignment4.places;

import Assignment4.places.extraInfo.Image;
import Assignment4.places.extraInfo.Location;
import Assignment4.places.extraInfo.PlaceType;
import Assignment4.visitor.Visitor;

public abstract class Place {
    private Location location;
    private String name;
    private PlaceType type;
    private Image image;
    private String address;
    private String contactNumber;

    public Place(Location location, String name, PlaceType type, String address, String contactNumber) {
        this.location = location;
        this.name = name;
        this.type = type;
        this.address = address;
        this.contactNumber = contactNumber;
    }

    public Location getLocation() {
        return this.location;
    }

    public abstract String getInformation();

    public abstract void accept(Visitor v);
}
