interface Animal {
    void eat();
}

interface Bird extends Animal {
    void fly();
}

class Eagle implements Bird {
    public void eat() {
        System.out.println("Eagle is eating.");
    }

    public void fly() {
        System.out.println("Eagle is flying.");
    }
}

public class inheritedInterfaceInherit {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.eat();
        eagle.fly();
    }
}
