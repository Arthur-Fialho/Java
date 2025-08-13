import java.util.Scanner;

public class RectangleSize {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho da Base do Retangulo: ");
        var base = scanner.nextInt();
        System.out.println("Digite a Altura do Retangulo: ");
        var height = scanner.nextInt();

        var rectangleSize = base * height;

        System.out.printf("A Área do Retangulo é %s\n", rectangleSize);
        scanner.close();
    }
}
