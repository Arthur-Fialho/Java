import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        double result = Math.sqrt(number);
        System.out.printf("The square root of %.2f is %.2f%n", number, result);
        scanner.close();
    }

}
