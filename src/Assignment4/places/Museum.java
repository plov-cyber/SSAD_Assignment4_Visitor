package Assignment4.places;

import Assignment4.places.extraInfo.Exhibition;
import Assignment4.places.extraInfo.Location;
import Assignment4.places.extraInfo.PlaceType;
import Assignment4.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Museum class.
 */
public class Museum extends Place {
    private List<Exhibition> exhibitions;

    /**
     * Constructor.
     */
    public Museum(Location location, String name, PlaceType type, String address, String contactNumber) {
        super(location, name, type, address, contactNumber);
        exhibitions = new ArrayList<>();
    }

    /**
     * Method to add new exhibition.
     */
    public Museum addExhibition(Exhibition ex) {
        exhibitions.add(ex);
        return this;
    }

    /**
     * Getter for the all exhibitions.
     */
    public List<Exhibition> getExhibitions() {
        return this.exhibitions;
    }

    /**
     * Overridden method to accept the visitor.
     */
    @Override
    public void accept(Visitor v) {
        v.visitMuseum(this);
    }
}
