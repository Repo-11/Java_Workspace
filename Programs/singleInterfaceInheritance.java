interface Animal {
    void eat();
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog is eating.");
    }
}

public class singleInterfaceInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
    }
}
