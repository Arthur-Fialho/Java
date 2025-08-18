public class Main {

    public static void main(String[] args) {
        
        
        Manager manager = new Manager("Alice Brown", "alice@example.com", "password101");
        Salesman salesman = new Salesman("Jane Smith", "jane@example.com", "password456");
        Attendant attendant = new Attendant("Bob Johnson", "bob@example.com", "password789");
        

        // Testando o gerente
        System.out.println("Gerente: " + manager.getName() + ", Email: " + manager.getEmail());
        System.out.println("É gerente? " + manager.isManager());
        manager.login("alice@example.com", "password101");
        manager.generateFinancialReport();
        manager.consultSales();
        
        manager.setName("Alice Johnson");
        
        manager.setEmail("alice.johnson@example.com");
        
        manager.setPassword("newpassword101");
        
        System.out.println("Gerente: " + manager.getName() + ", Email: " + manager.getEmail());
        manager.logout();

        System.out.println("---------------------------------------------------------------");

        // Testando o vendedor
        System.out.println("\nVendedor: " + salesman.getName() + ", Email: " + salesman.getEmail());
        System.out.println("É gerente? " + salesman.isManager());
        salesman.login("jane@example.com", "password456");
        salesman.makeSale();
        salesman.consultSales();
        System.out.println("Total de vendas: " + salesman.getSalesCount());
        
        // Testando se com o vendedor deslogado, não é possível alterar os dados
        salesman.logout();
        salesman.setName("Jane Doe");
        salesman.setEmail("jane.doe@example.com");
        salesman.setPassword("newpassword456");

        // Verificando se os dados foram alterados
        System.out.println("Vendedor: " + salesman.getName() + ", Email: " + salesman.getEmail());
    
        System.out.println("---------------------------------------------------------------");

        // Testando o atendente
        System.out.println("\nAtendente: " + attendant.getName() + ", Email: " + attendant.getEmail());
        System.out.println("É gerente? " + attendant.isManager());
        attendant.login("bob@example.com", "password789");
        attendant.receivePayment(100.0);
        attendant.conferenceCashRegister();
        attendant.setName("Bob Smith");
        attendant.setEmail("bob.smith@example.com");
        attendant.setPassword("newpassword789");

        // Verificando se os dados foram alterados
        System.out.println("Atendente: " + attendant.getName() + ", Email: " + attendant.getEmail());
        attendant.logout();
    }
}