package Assignment4.places;

import Assignment4.places.extraInfo.Exhibition;
import Assignment4.places.extraInfo.Location;
import Assignment4.places.extraInfo.PlaceType;
import Assignment4.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Museum extends Place {
    private List<Exhibition> exhibitions;

    public Museum(Location location, String name, PlaceType type, String address, String contactNumber) {
        super(location, name, type, address, contactNumber);
        exhibitions = new ArrayList<>();
    }

    public Museum addExhibition(Exhibition ex) {
        exhibitions.add(ex);
        return this;
    }

    public List<Exhibition> getExhibitions() {
        return this.exhibitions;
    }

    @Override
    public void accept(Visitor v) {
        v.visitMuseum(this);
    }
}
