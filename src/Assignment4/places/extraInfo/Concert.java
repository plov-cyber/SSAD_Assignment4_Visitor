package Assignment4.places.extraInfo;

public class Concert {
    private String singer;
    private String date;
    private Integer cost;

    public Concert(String singer, String date, Integer cost) {
        this.singer = singer;
        this.date = date;
        this.cost = cost;
    }

    public String toString() {
        String result = "\tSinger: " + this.singer + "\n" +
                "\tDate: " + this.date + "\n" +
                "\tCost: " + this.cost + "$" + "\n";
        return result;
    }
}
