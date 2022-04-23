package Assignment4;

import Assignment4.display.Display;
import Assignment4.map.Map;
import Assignment4.places.*;
import Assignment4.places.extraInfo.*;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * App class.
 * Main class of the app. Controls all other classes.
 */
public class App {
    private Map map;
    private Display display;
    private Database database;
    private Location currentLocation;
    private static Integer radius = 10; // Radius can be changed by user

    /**
     * Constructor.
     */
    public App(Database database) {
        this.map = new Map();
        this.display = new Display(this);
        this.database = database;
        this.currentLocation = new Location(new Pair<Integer, Integer>(0, 0));
    }

    /**
     * Main method. The project starts from here.
     */
    public static void main(String[] args) {
        // Creating the database and filling it with example places.
        Database db = new Database();

        Museum spaceMuseum = new Museum(new Location(new Pair<Integer, Integer>(0, 5)),
                "Space Museum",
                PlaceType.HISTORICAL,
                "Peace Avenue, 111, Moscow, Russia",
                "+7 499 750-23-00");
        Exhibition spaceShipsExhibition = new Exhibition("22.04.2022",
                "Exhibition of space ships",
                new ArrayList<>(Arrays.asList("Yuriy Gagarin", "Nil Armstrong")));
        spaceMuseum.addExhibition(spaceShipsExhibition);

        Theatre bigTheatre = new Theatre(new Location(new Pair<Integer, Integer>(7, 0)),
                "Big Theatre",
                PlaceType.ENTERTAINMENT,
                "Theatre Square, 1, Moscow, Russia",
                "+7 495 455-55-55");
        Concert nutCracker = new Concert("Roman Molochkov", "22.04.2022", 300);
        bigTheatre.addConcert(nutCracker);

        Restaurant MacDonalds = new Restaurant(new Location(new Pair<Integer, Integer>(12, 0)),
                "MacDonald's",
                PlaceType.FOOD,
                "Manezhnaya Square, 1, Building 2, Moscow, Russia",
                "+7 495 190-99-99");
        Dish CocaCola = new Dish("CocaCola", 2, Arrays.asList("CocaCola", "Ice", "Water"), 500);
        Dish nuggets = new Dish("Nuggets", 3, Arrays.asList("Chicken", "Spices"), 300);
        MacDonalds.addDish(CocaCola).addDish(nuggets);

        // Adding the places to the database.
        db.addPlace(spaceMuseum);
        db.addPlace(bigTheatre);
        db.addPlace(MacDonalds);

        // Creating the app and outputting the places within 10 pts. from current location.
        App mainApp = new App(db);
        mainApp.showNearPlaces();
    }

    /**
     * Method to display the map.
     */
    public void displayMap() {
        this.map.refresh();
        this.display.renderApp();
    }

    /**
     * Method to show near places.
     */
    public void showNearPlaces() {
        this.map.updatePlaces(this.database, radius, this.currentLocation);
        this.displayMap();
    }

    /**
     * Getter for the map.
     */
    public Map getMap() {
        return this.map;
    }

    /**
     * Method to refresh the location.
     */
    public void refreshLocation() {
        // Get the current location of tourist from GPS.
    }
}
