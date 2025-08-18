public class HalfEntry extends Ticket {


    private double fullprice = getValue();

    public HalfEntry(String movieName, String isDubbed) {
        super(20, movieName, isDubbed);
        setValue(fullprice / 2);
    }

    @Override
    public String toString() {
        return "Meia entrada{" +
                "preço=" + getValue() +
                ", Nome do Filme='" + getMovieName() + '\'' +
                ", dublado='" + getIsDubbed() + '\'' +
                '}';
    }

}
