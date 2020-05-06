class Office {
    private String name;
    private int floor;

    Office() {
        name = "Acer";
        floor = 10;
        System.out.println(name + "\n" + floor);
    }

    Office(int a) {
        System.out.println("\nHelloWorld" + a);
    }

    /*
    class innerOffice {
        private final int comp = 5;
    }
    */

    protected String nameReturn() {
        //System.out.println("\nComputer = " + comp);
        return name;
    }
    protected int floorReturn() {
        return floor;
    }
}

class Employee extends Office{
    private String $name;
    private int age;

    Employee() {
        //super(10);
        $name = "Dell";
        age = 20;
        display();
    }

    private void display() {
        System.out.println($name + "\n" + age);
        System.out.println(nameReturn() + "\n" + floorReturn());
    }
}

public class superConstructor {

    public static void main(String[] args) {
        Employee obj = new Employee();
    }
}
