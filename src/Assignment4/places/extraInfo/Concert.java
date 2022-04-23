package Assignment4.places.extraInfo;

/**
 * Concert class.
 * Used by Theatre class to store current events.
 */
public class Concert {
    private String singer;
    private String date;
    private Integer cost;

    /**
     * Constructor
     */
    public Concert(String singer, String date, Integer cost) {
        this.singer = singer;
        this.date = date;
        this.cost = cost;
    }

    /**
     * String format of the class.
     */
    public String toString() {
        String result = "\tSinger: " + this.singer + "\n" +
                "\tDate: " + this.date + "\n" +
                "\tCost: " + this.cost + "$" + "\n";
        return result;
    }
}
