package Assignment4.visitor;

import Assignment4.map.Map;
import Assignment4.places.Restaurant;
import Assignment4.places.Theatre;
import Assignment4.places.extraInfo.Exhibition;
import Assignment4.places.Museum;
import Assignment4.places.Place;

public class InfoVisitor implements Visitor {
    private Map map;

    public InfoVisitor(Map map) {
        this.map = map;
    }

    public void addOnMap(Place place, String placeInfo) {
        map.addVisiblePlace(place, placeInfo);
    }

    @Override
    public void visitMuseum(Museum museum) {
        StringBuilder result = new StringBuilder();
        int index = 1;
        for (Exhibition ex : museum.getExhibitions()) {
            result.append("Exhibition ").append(index).append(":\n").append(ex.date).append(" ").append(ex.description).append(" ");
            for (String artist : ex.artists) {
                result.append(artist).append(" ");
            }
        }
        this.addOnMap(museum, result.toString());
    }

    @Override
    public void visitTheatre(Theatre theatre) {
        StringBuilder result = new StringBuilder();
        // Some beautiful output;
        this.addOnMap(theatre, result.toString());
    }

    @Override
    public void visitRestaurant(Restaurant restaurant) {
        StringBuilder result = new StringBuilder();
        // Some beautiful output;
        this.addOnMap(restaurant, result.toString());
    }

}
