//Mother class
class Vehicle {
    void start() {
        System.out.println("Vehicle started.");
    }
    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

//Daughter class
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

public class simpleInherit {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.drive();
        myCar.stop();
    }
}
