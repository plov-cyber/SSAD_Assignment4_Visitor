package Assignment4.display;

import Assignment4.App;

import java.util.Map;

public class Display {
    private App app;

    public Display(App app) {
        this.app = app;
    }

    public void renderApp() {
        for (Map.Entry elem : app.getMap().getVisiblePlaces().entrySet()) {
            System.out.println(elem.getValue());
        }
    }
}
