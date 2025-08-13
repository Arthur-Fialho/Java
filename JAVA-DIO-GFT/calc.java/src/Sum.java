import java.util.Scanner;

public class Sum {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        var num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        var num2 = scanner.nextDouble();
        System.out.printf("%s + %s = %.2f%n", num1, num2, num1 + num2);
        scanner.close();
    }
}
