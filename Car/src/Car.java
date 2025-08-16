public class Car {
    

    boolean isOn;
    int speed;
    int gear;

    

    public Car() {
        this.isOn = false;
        this.speed = 0;
        this.gear = 0;
    }

    void turnOn() {
        isOn = true;
        if (gear == 0) {
            System.out.println("Carro ligado. Está na marcha neutra.");
        } else {
            System.out.println("Carro ligado. Marcha atual: " + gear);
        }
    }

    void turnOff() {
        if(speed > 0 && gear > 0 && isOn) {
            System.out.println("O carro está em movimento. Reduza a velocidade e mude a marcha para desligar.");
            return;
        }

        gear = 0;
        speed = 0;
        isOn = false;

        System.out.println("Carro desligado.");
        System.out.println("Marcha atual: " + gear);
        System.out.println("Velocidade atual: " + speed + " km/h");
    }

    void speedUp() {
        if(!isOn) {
            System.out.println("O carro está desligado. Ligue-o primeiro.");
            return;
        }else if(gear == 0) {
            System.out.println("O carro está na marcha neutra. Mude a marcha para acelerar.");
            return;
        }else{
            speed++;
            if(speed >= 0 && gear == 1 && speed <= 20) {
                System.out.println("Acelerando. Velocidade atual: " + speed + " km/h");
            }else if(speed >= 21 && gear == 2 && speed <= 40) {
                System.out.println("Acelerando. Velocidade atual: " + speed + " km/h");
            }else if(speed >= 41 && gear == 3 && speed <= 60) {
                System.out.println("Acelerando. Velocidade atual: " + speed + " km/h");
            }else if(speed >= 61 && gear == 4 && speed <= 80) {
                System.out.println("Acelerando. Velocidade atual: " + speed + " km/h");
            }else if(speed >= 81 && gear == 5 && speed <= 100) {
                System.out.println("Acelerando. Velocidade atual: " + speed + " km/h");
            }else if(speed >= 101 && gear == 6 && speed <= 120) {
                System.out.println("Acelerando. Velocidade atual: " + speed + " km/h");
            }else {
                System.out.println("Subindo a marcha para continuar acelerando.");
                gearUp();
            }

            if(speed >= 120) {
                System.out.println("Velocidade máxima atingida.");
                speed = 120;
            }
        }
    }

    void speedDown() {
        if(!isOn) {
            System.out.println("O carro está desligado. Ligue-o primeiro.");
            return;
        }
        
        speed--;
        if (speed <= 120 && gear == 6 && speed >= 100) {
            System.out.println("Desacelerando. Velocidade atual: " + speed + " km/h");
        }else if (speed <= 100 && gear == 5 && speed >= 80) {
            System.out.println("Desacelerando. Velocidade atual: " + speed + " km/h");
        }else if (speed <= 80 && gear == 4 && speed >= 60) {
            System.out.println("Desacelerando. Velocidade atual: " + speed + " km/h");
        }else if (speed <= 60 && gear == 3 && speed >= 40) {
            System.out.println("Desacelerando. Velocidade atual: " + speed + " km/h");
        }else if (speed <= 40 && gear == 2 && speed >= 20) {
            System.out.println("Desacelerando. Velocidade atual: " + speed + " km/h");
        }else if (speed <= 20 && gear == 1 && speed >= 1) {
            System.out.println("Desacelerando. Velocidade atual: " + speed + " km/h");
        }else  {
            System.out.println("Reduzindo a marcha.");
            gearDown();

        }

        if(speed == 0) {
            System.out.println("O carro já está parado. Ou desligado.");
        }
    }

    void turnRight() {
        if(speed >= 1 && gear > 0 && speed <= 40 && isOn) {
            System.out.println("Virando à direita.");
        }else{
            System.out.println("Não é possível virar à direita. O carro está desligado ou em velocidade inadequada.");
        }
    }

    void turnLeft() {
        if(speed >= 1 && gear > 0 && speed <= 40 && isOn) {
            System.out.println("Virando à esquerda.");
        }else{
            System.out.println("Não é possível virar à esquerda. O carro está desligado ou em velocidade inadequada.");
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    void gearUp() {
        if(gear < 6 && isOn){
            gear++;
            System.out.println("Marcha aumentada para: " + gear);
        }else {
            System.out.println("Não é possível aumentar a marcha, já está na marcha máxima. Ou o carro está desligado.");
        }
    }

    void gearDown() {
        if (gear > 0 && isOn) {
            gear--;
            System.out.println("Marcha reduzida para: " + gear);
        }else {
            System.out.println("Não é possível reduzir a marcha, já está na marcha mínima. Ou o carro está desligado.");
        }
    }

}
