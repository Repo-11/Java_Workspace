class vehile
{
    void start() {
        System.out.println("Vehicle Started");
    }
    void stop() {
        System.out.println("Vehicle Stopped");
    }
}

class car extends vehile
{
    void drive() {
        System.out.println("Car is driving");
    }
}
class Maruti extends car
{
    void name() {
        System.out.println("Maruti is a car");
    }
}

public class testMultilevelInherit {
    public static void main(String[] args) {
        Maruti mymaruti = new Maruti();
        mymaruti.start();
        mymaruti.stop();
        mymaruti.drive();
        mymaruti.name();
    }
}
