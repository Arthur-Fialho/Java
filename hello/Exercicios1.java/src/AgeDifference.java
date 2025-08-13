import java.util.Scanner;

public class AgeDifference {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Calcula diferença de idade: ");
        System.out.println("Digite a idade da pessoa mais velha: ");
        var firstPerson = scanner.nextInt();

        System.out.println("Digite a idade da pessoa mais nova: ");
        var secondPerson = scanner.nextInt();

        var difference = firstPerson - secondPerson;

        System.out.printf("A diferença de idade é de %s anos\n", difference);
        scanner.close();
    }
}
