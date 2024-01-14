class Animal {
    String name = "Animal";
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    String name = "Dog";
    void makeSound() {
        super.makeSound(); // Calls the makeSound() method of the superclass
        System.out.println("Dog barks.");
    }
}

public class superStaticFinal {
    // Static variable
    static int staticVariable = 10;

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Final variable
    final int finalVariable = 20;

    public static void main(String[] args) {
        // Using the super keyword
        Dog dog = new Dog();
        dog.makeSound();

        // Using static keyword
        System.out.println("Static variable: " + staticVariable);
        staticMethod();

        // Using final keyword
        final superStaticFinal demo = new superStaticFinal();
        // demo.finalVariable = 30;
        System.out.println("Final variable: " + demo.finalVariable);
    }
}
