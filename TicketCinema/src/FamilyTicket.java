public class FamilyTicket extends Ticket {

    private double fullprice = getValue();
    private int numberOfTickets;


    public FamilyTicket(int numberOfTickets) {
        super(20, "", "");
        this.numberOfTickets = numberOfTickets;
        if(numberOfTickets > 3){
            setValue((fullprice * numberOfTickets)* 0.95);
        }else {
            setValue(fullprice * numberOfTickets);
        }
    }

    @Override
    public String toString() {
        return "Ingresso Familiar{" +
                "preço=" + getValue() +
                ", Nome do Filme='" + getMovieName() + '\'' +
                ", dublado='" + getIsDubbed() + '\'' +
                '}';
    }

}
