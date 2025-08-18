public class Attendant extends Employee {

    protected boolean isManager = false;
    protected double cashRegister = 0.0;
    protected double cashRegisterConference = 0.0;

    public Attendant(String name, String email, String password) {
        super(name, email, password);
    }

    public boolean isManager() {
        return isManager;
    }

    public void receivePayment(double amount) {
        cashRegister += amount;
        System.out.println("Pagamento recebido: " + amount);
    }

    public void conferenceCashRegister() {
        System.out.println("Conferindo caixa...");
        cashRegisterConference = cashRegister;
        System.out.println("Conferência concluída. Total no caixa: " + cashRegisterConference);
    }

}
