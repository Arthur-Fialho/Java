import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car = new Car();

        while (true) {
            System.out.println("Escolha uma opção (carro com troca de marchas automaticas de acordo com a velocidade):");
            System.out.println("1. Ligar o carro");
            System.out.println("2. Desligar o carro");
            System.out.println("3. Aumentar a velocidade");
            System.out.println("4. Diminuir a velocidade");
            System.out.println("5. Colocar marcha em drive (+)");
            System.out.println("6. Reduzir marcha (-)");
            System.out.println("7. Marcha atual");
            System.out.println("8 - Virar para a esquerda");
            System.out.println("9 - Virar para a direita");
            System.out.println("10 - Verificar velocidade atual");
            System.out.println("0. Sair");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    car.turnOn();
                    break;
                case 2:
                    car.turnOff();
                    break;
                case 3:
                    car.speedUp();
                    break;
                case 4:
                    car.speedDown();
                    break;
                case 5:
                    car.gearUp();
                    break;
                case 6:
                    car.gearDown();
                    break;
                case 7:
                    System.out.println("Marcha atual: " + car.getGear());
                    break;
                case 8:
                    car.turnLeft();
                    break;
                case 9:
                    car.turnRight();
                    break;
                case 10:
                    System.out.println("Velocidade atual: " + car.getSpeed() + " km/h");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
