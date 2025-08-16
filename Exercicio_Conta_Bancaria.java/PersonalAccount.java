import java.util.Scanner;

public class PersonalAccount {
    Scanner scanner = new Scanner(System.in);

    private String name;
    private double accountBalance;
    private double especial;
    private double deficit;
    public boolean usingEspecial;

    public PersonalAccount(String name, double accountBalance) {
        this.name = name;
        this.accountBalance = accountBalance;
        this.especial = accountBalance <= 500 ? 50 : accountBalance * 0.5;
    }

    public String getName() {
        return name;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public double getEspecial(){
        return especial;
    }
    
    public void addBalance(double amount){
        if(amount <= 0) {
            System.out.println("Valor de depósito deve ser positivo.");
            return;
        }else{
            this.accountBalance += amount;
            System.out.println("Depósito realizado com sucesso! Saldo atual: " + this.accountBalance);
        }
    }

    public void withdrawBalance(double amount){
        if(amount > accountBalance) {
            System.out.println("Não é possível sacar mais do que o saldo disponível.");
            return;
        }else{
            this.accountBalance -= amount;
            System.out.println("Saque realizado com sucesso! Saldo atual: " + this.accountBalance);
        }
    }
    
    public boolean isUsingEspecial() {
        if (accountBalance < 0) {
            usingEspecial = true;
        } else {
            usingEspecial = false;
        }
        return usingEspecial;
    }

    public boolean getUsingEspecial() {
        return usingEspecial;
    }

    public void pay(double amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Pagamento realizado com sucesso! Saldo atual: " + accountBalance);
        } else if (amount <= accountBalance + especial) {
            deficit = amount - accountBalance;
            accountBalance -= amount;
            especial -= deficit;
            usingEspecial = true;
            System.out.println("Pagamento realizado usando limite especial! Saldo atual: " + accountBalance + ", Limite especial restante: " + especial);
        } else {
            System.out.println("Saldo insuficiente para pagamento.");
        }
    }

    public void especialTax() {
        if (usingEspecial && accountBalance > especial * 0.2) {
            double tax = deficit * 0.2;
            accountBalance -= tax;
            especial += deficit;
            deficit = 0;
            usingEspecial = false;
            System.out.printf("Taxa de 20%% (%.2f) aplicada ao usar o limite especial. Saldo atual: %.2f%n\n", tax, accountBalance);
        } else {
            System.out.println("Você não está usando o limite especial, ou nao há saldo suficiente para pagar a taxa.");
        }
    }

}
