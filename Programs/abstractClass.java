abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

public class abstractClass {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}
