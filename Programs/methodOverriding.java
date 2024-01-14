class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks.");
    }

    void bark() {
        System.out.println("Dog is barking.");
    }
    
    void performActions() {
        super.makeSound();
        makeSound();
        bark();
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.performActions();
    }
}
