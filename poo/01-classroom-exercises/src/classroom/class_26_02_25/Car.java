package classroom.class_26_02_25;

public class Car {
    String Model;
    int Year;
    String color;
    double Tank;
    double currentSpeed;
    boolean isTurnedOn;

    void accelerate(double value){
        currentSpeed += value;
        if (currentSpeed > 120){
            System.out.println("The engine is going to blow up!");
        }
    }

    void brake(double value){
        currentSpeed -= value;
    }

    void turnOn(){
        isTurnedOn = true;
    }

    void turnOff(){
        isTurnedOn = false;

        // Slow down
        if (currentSpeed > 0){
            while (currentSpeed != 0){
                currentSpeed -= 10;
            }
        }
    }

    void honk(){
        System.out.printf("%s says: BI BI!\n", Model);
    }

    void showCurrentSpeed(){
        System.out.println("SPEED: " + currentSpeed);
    }

    static void main(String[] args) {
        Car kwid = new Car();
        kwid.Model = "KWID";
        kwid.Tank = 20;
        kwid.color = "RED";
        kwid.Year = 2020;

        Car cronnos = new Car();
        cronnos.Model = "FIAT Cronnos";
        cronnos.Tank = 20;
        cronnos.color = "Gray";
        cronnos.Year = 2023;

        // Using the kwid methods
        kwid.accelerate(30);
        kwid.showCurrentSpeed();

        kwid.accelerate(20);
        kwid.showCurrentSpeed();

        kwid.accelerate(60);
        kwid.showCurrentSpeed();

        kwid.accelerate(23);
        kwid.showCurrentSpeed();

        kwid.honk();

        // Using the cronnos methods
        cronnos.accelerate(25);
        cronnos.showCurrentSpeed();

        cronnos.accelerate(50);
        cronnos.showCurrentSpeed();

        cronnos.accelerate(90);
        cronnos.showCurrentSpeed();

        cronnos.accelerate(10);
        cronnos.showCurrentSpeed();

        cronnos.honk();
    }
}
