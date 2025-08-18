public class Main {

    public static void main(String[] args) {
        
        // Exemplo do ingresso familiar
        FamilyTicket familyTicket = new FamilyTicket(4);
        familyTicket.setMovieName("Avengers: Endgame");
        familyTicket.setIsDubbed("Sim");
        System.out.println(familyTicket);

        // Exemplo do ingresso de meia entrada
        HalfEntry halfEntry = new HalfEntry("Inception", "Não");
        System.out.println(halfEntry);

        // Exemplo do ingresso regular
        Ticket regularTicket = new Ticket(20, "The Matrix", "Sim") {
            @Override
            public String toString() {
                return "Ingresso normal{" +
                        "preço=" + getValue() +
                        ", Nome do Filme='" + getMovieName() + '\'' +
                        ", dublado='" + getIsDubbed() + '\'' +
                        '}';
            }
        };
        System.out.println(regularTicket); 
    }
}
