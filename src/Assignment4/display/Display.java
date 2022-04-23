package Assignment4.display;

import Assignment4.App;

import java.util.Map;

/**
 * Display class.
 * Renders the app on the screen.
 */
public class Display {
    private App app; // Private field app.

    /**
     * Constructor.
     */
    public Display(App app) {
        this.app = app;
    }

    /**
     * Method for rendering the app.
     */
    public void renderApp() {
        // Outputs to the console in our project.
        for (Map.Entry elem : app.getMap().getVisiblePlaces().entrySet()) {
            System.out.println(elem.getValue());
        }
    }
}
