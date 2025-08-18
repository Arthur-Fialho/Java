public class Employee {

    protected String name;

    protected String email;

    private String password;

    private boolean loggedIn = false;

    

    public Employee(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        if(!loggedIn){
            System.out.println("Login necessário para alterar o nome.");
            return;
        }else if (name == null || name.isEmpty()) {
            System.out.println("Nome inválido.");
            return;
        }else {
            System.out.println("Alterando nome...");
            this.name = name;
            System.out.println("Nome alterado com sucesso." + name);
        }
    }

    public void setEmail(String email) {
        if(!loggedIn){
            System.out.println("Login necessário para alterar o email.");
            return;
        } else if (email == null || email.isEmpty()) {
            System.out.println("Email inválido.");
            return;
        }else {
            System.out.println("Alterando email...");
            this.email = email;
            System.out.println("Email alterado com sucesso." + email);
        }
    }

    public void setPassword(String password) {
        if(!loggedIn){
            System.out.println("Login necessário para alterar a senha.");
            return;
        }else if (password == null || password.isEmpty()) {
            System.out.println("Senha inválida.");
            return;
        }else{
            System.out.println("Alterando senha...");
            this.password = password;
            System.out.println("Senha alterada com sucesso.");
        }
    }
    
    
    public boolean login(String email, String password) {
        boolean success = this.email.equals(email) && this.password.equals(password);
        if (success) {
            System.out.println("Login realizado com sucesso.");
            loggedIn = true;
        }
        return success;
    }

    public void logout() {
        System.out.println("Saindo...");
        loggedIn = false;
        System.out.println("Saiu com sucesso.");
    }

}
