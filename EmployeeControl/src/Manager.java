public class Manager extends Employee {

    protected boolean isManager = true;

    public Manager(String name, String email, String password) {
        super(name, email, password);
    }

    public boolean isManager() {
        return isManager;
    }

    public void generateFinancialReport() {
        System.out.println("Gerando relatório financeiro...");
        
        System.out.println("Relatório financeiro gerado com sucesso.");
    }

    public void consultSales() {
        System.out.println("Consultando vendas...");
        
        System.out.println("Consulta de vendas concluída.");
    }

}
