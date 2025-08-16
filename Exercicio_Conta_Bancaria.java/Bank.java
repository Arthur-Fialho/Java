import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PersonalAccount account = new PersonalAccount("João", 1000.0);
        System.out.println("Bem-vindo, " + account.getName() + "! Seu saldo inicial é: " + account.getAccountBalance());
        System.out.println("Seu limite especial é: " + account.getEspecial());

        var opcao = -1;

        do{
            System.out.println("=== Conta Bancaria ===");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Ver saldo especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar conta");
            System.out.println("6 - Verificar se esta usando especial");
            System.out.println("7 - Pagar taxa do cheque especial");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: " + account.getAccountBalance());
                    break;
                case 2:
                    System.out.println("Saldo especial: " + account.getEspecial());
                    break;
                case 3:
                    System.out.print("Digite o valor a depositar: ");
                    double depositAmount = scanner.nextDouble();
                    account.addBalance(depositAmount);
                    break;
                case 4:
                    System.out.print("Digite o valor a sacar: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdrawBalance(withdrawAmount);
                    break;
                case 5:
                    System.out.print("Digite o valor da conta a pagar: ");
                    double amount = scanner.nextDouble();
                    account.pay(amount);
                    break;
                case 6:
                    if (account.usingEspecial) {
                        System.out.println("Você está usando o limite especial.");
                    } else {
                        System.out.println("Você não está usando o limite especial.");
                    }
                    break;
                case 7:
                    account.especialTax();
                    break;
                case 0:
                    System.out.println("Saindo do sistema. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, tente novamente.");
                    break;  
            }
        }while(opcao != 0);

        scanner.close();
    }
}