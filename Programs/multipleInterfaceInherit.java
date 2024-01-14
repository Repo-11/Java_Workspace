interface Animal {
    void eat();
}

interface Bird {
    void fly();
}

class Eagle implements Animal, Bird {
    public void eat() {
        System.out.println("Eagle is eating.");
    }

    public void fly() {
        System.out.println("Eagle is flying.");
    }
}

public class multipleInterfaceInherit {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.eat();
        eagle.fly();
    }
}
