package Assignment4;

import Assignment4.map.Map;
import Assignment4.places.extraInfo.Exhibition;
import Assignment4.places.extraInfo.Location;
import Assignment4.places.Museum;
import Assignment4.places.extraInfo.PlaceType;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Museum museum = new Museum(new Location(new Pair<Integer, Integer>(10, 20)),
                "hyu",
                PlaceType.HISTORICAL,
                "pushkina kolotushkina",
                "122993");
        Exhibition ex1 = new Exhibition("22.03.2021",
                "Very good exhibition",
                new ArrayList<>(Arrays.asList("Artist1", "Artist2")));
        museum.addExhibition(ex1);

        Database db = new Database();
        db.addPlace(museum);

        Map map = new Map();
        map.updatePlaces(db, 10, new Location(new Pair<Integer, Integer>(10, 20)));

        for (java.util.Map.Entry elem : map.getVisiblePlaces().entrySet()) {
            System.out.println(elem.getValue());
        }
    }
}
