package Assignment4.places.extraInfo;

import java.util.List;

public class Exhibition {
    public String date;
    public String description;
    public List<String> artists;

    public Exhibition(String date, String description, List<String> artists) {
        this.date = date;
        this.description = description;
        this.artists = artists;
    }
}
