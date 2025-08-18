public class Main {

    public static void main(String[] args) {
        
        // Example usage of the Ticket classes
        FamilyTicket familyTicket = new FamilyTicket(4);
        familyTicket.setMovieName("Avengers: Endgame");
        familyTicket.setIsDubbed("Yes");
        System.out.println(familyTicket);

        HalfEntry halfEntry = new HalfEntry("Inception", "No");
        System.out.println(halfEntry);

        // how to create a regular ticket
        Ticket regularTicket = new Ticket(20, "The Matrix", "Yes") {
            @Override
            public String toString() {
                return "RegularTicket{" +
                        "value=" + getValue() +
                        ", movieName='" + getMovieName() + '\'' +
                        ", isDubbed='" + getIsDubbed() + '\'' +
                        '}';
            }
        };
        System.out.println(regularTicket); 
    }
}
