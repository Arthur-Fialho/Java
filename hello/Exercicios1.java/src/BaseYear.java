import java.time.OffsetDateTime;
import java.util.Scanner;

public class BaseYear {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);

        var baseYear = OffsetDateTime.now().getYear();

        System.out.println("Digite seu nome: ");
        var name = scanner.next();
        System.out.println("Digite o ano que você nasceu: ");
        var year = scanner.nextInt();
        
        var age = baseYear - year;

        System.out.printf("%s tem %s anos!\n", name, age);
        scanner.close();
    }
}
