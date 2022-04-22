package Assignment4.visitor;

import Assignment4.places.Museum;
import Assignment4.places.Restaurant;
import Assignment4.places.Theatre;

public interface Visitor {
    void visitMuseum(Museum museum);

    void visitTheatre(Theatre theatre);

    void visitRestaurant(Restaurant restaurant);

}
