public class Salesman extends Employee {

    protected boolean isManager = false;
    protected int salesCount = 0;

    public Salesman(String name, String email, String password) {
        super(name, email, password);
    }

    public boolean isManager() {
        return isManager;
    }

    public void makeSale() {
        System.out.println("Realizando venda...");
        
        System.out.println("Venda realizada com sucesso.");
        salesCount++;
    }

    public int getSalesCount() {
        return salesCount;
    }

    public void consultSales() {
        System.out.println("Consultando vendas...");
        System.out.println("Total de vendas: " + salesCount);
        System.out.println("Consulta de vendas concluída.");
    }
}
