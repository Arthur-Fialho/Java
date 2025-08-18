public abstract class Ticket{

    protected double value = 20;

    protected String movieName;

    protected String isDubbed;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getIsDubbed() {
        return isDubbed;
    }

    public void setIsDubbed(String isDubbed) {
        this.isDubbed = isDubbed;
    }

    public Ticket(double value, String movieName, String isDubbed) {
        this.value = value;
        this.movieName = movieName;
        this.isDubbed = isDubbed;
    }

    


}
