import java.util.Scanner;

public class SquareSize {
    public static void main(String[] args) {
    var scanner = new Scanner(System.in);

    System.out.println("Digite o tamanho de um lado do quadrado: ");
    var sqrtA = scanner.nextInt();

    var sqrtArea = sqrtA * sqrtA;

    System.out.printf("A Área do quadrado é %s\n", sqrtArea);
    scanner.close();
    }
}
