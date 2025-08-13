import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua Altura: ");
        var altura = scanner.nextDouble();

        System.out.println("Digite seu Peso: ");
        var peso = scanner.nextDouble();

        var imc = peso/(altura * altura);

        if(imc <= 18.5){
            System.out.printf("Abaixo do peso, seu imc é: %.2f\n", imc);
        }else if(imc > 18.6 && imc <= 24.9){
            System.out.printf("Peso ideal, seu imc é: %.2f\n", imc);
        }else if(imc > 25.0 && imc <= 29.9){
            System.out.printf("Levemente acima do peso, seu imc é: %.2f\n", imc);
        }else if(imc > 30.0 && imc <= 34.9){
            System.out.printf("Obesidade grau I, seu imc é: %.2f\n", imc);
        }else if(imc > 35.0 && imc <= 39.9){
            System.out.printf("Obesidade grau II, seu imc é: %.2f\n", imc);
        }else{
            System.out.printf("Obesidade grau III, seu imc é: %.2f\n", imc);
        }

        scanner.close();
    }
}
