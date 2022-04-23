package Assignment4.places;

import Assignment4.places.extraInfo.Concert;
import Assignment4.places.extraInfo.Location;
import Assignment4.places.extraInfo.PlaceType;
import Assignment4.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Theatre class.
 */
public class Theatre extends Place {
    private List<Concert> affiche;

    /**
     * Constructor.
     */
    public Theatre(Location location, String name, PlaceType type, String address, String contactNumber) {
        super(location, name, type, address, contactNumber);
        affiche = new ArrayList<>();
    }

    /**
     * Method to add new concert.
     */
    public void addConcert(Concert c) {
        affiche.add(c);
    }

    /**
     * Getter for the affiche.
     */
    public List<Concert> getAffiche() {
        return this.affiche;
    }

    /**
     * Overridden method to accept the visitor.
     */
    @Override
    public void accept(Visitor v) {
        v.visitTheatre(this);
    }
}
