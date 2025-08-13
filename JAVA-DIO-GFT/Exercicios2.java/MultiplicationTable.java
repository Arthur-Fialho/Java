import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número para ver sua tabuada: ");
        var numero = scanner.nextInt();

        
        if(numero <= 0){
            System.out.println("ERRO: Digite um número positivo maior que zero!");
        }else{
            System.out.printf("A Tabuada de %d é:\n", numero);
            for(int i = 0; i <= 10; i++){
                System.out.printf("%d x %d = %d\n", numero, i, numero * i);
            }
        }

        scanner.close();
    }
}
