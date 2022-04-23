package Assignment4.places.extraInfo;

import java.util.List;

/**
 * Exhibition class.
 * Used by Museum class to store current exhibitions.
 */
public class Exhibition {
    public String date;
    public String description;
    public List<String> artists;

    /**
     * Constructor.
     */
    public Exhibition(String date, String description, List<String> artists) {
        this.date = date;
        this.description = description;
        this.artists = artists;
    }

    /**
     * String format of the class.
     */
    public String toString() {
        String result = "\tDate: " + this.date + "\n" +
                "\tDescription: " + this.description + "\n" +
                "\tArtists: " + String.join(", ", this.artists) + "\n";
        return result;
    }
}
