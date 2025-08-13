import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        var num1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        var num2 = scanner.nextInt();

        System.out.println("Você deseja ver os numeros impares ou pares?");
        var opcao = scanner.next();

        if(num2 <= num1){
            System.out.printf("ERRO: O segundo número precisa ser maior que o primeiro (%d)\n", num1);
        }else if (opcao.equalsIgnoreCase("pares")){
            for(int i = num2; i >= 0; i--){
                if(i % 2 == 0 && i >= num1){
                    System.out.printf("%d\n", i);
                }
            }
        }else if (opcao.equalsIgnoreCase("impares")){
            for(int i = num2; i >= 0; i--){
                if(i % 2 != 0 && i >= num1){
                    System.out.printf("%d\n", i);
                }
            }
        }
    }
}
