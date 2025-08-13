import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        double numerator = scanner.nextDouble();
        System.out.print("Enter denominator: ");
        double denominator = scanner.nextDouble();
        if (denominator != 0) {
            double result = numerator / denominator;
            System.out.printf("%.2f / %.2f = %.2f%n", numerator, denominator, result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
        scanner.close();
    }
}
