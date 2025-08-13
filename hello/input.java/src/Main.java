import java.util.Scanner;


public class Main {
    
    private final static String WELCOME_MESSAGE = "Bem-vindo ao programa de exemplo!";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);
        System.out.println("Olá, informe seu nome: ");
        String name = scanner.next();
        System.out.println("Informe sua idade: ");
        int age = scanner.nextInt();
        System.out.println("Olá " + name + ", você tem " + age + " anos.");
        scanner.close();
        System.out.println("Obrigado por usar nosso programa!");
        System.out.println("Até logo!");
    }
}
