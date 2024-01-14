// Grandmother class
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

// Mother class
class Mammal extends Animal {
    void breathe() {
        System.out.println("Mammal is breathing.");
    }
}

// Daughter class
class Human extends Mammal {
    void speak() {
        System.out.println("Human is speaking.");
    }
}

public class multilevelInherit {
    public static void main(String[] args) {
        Human person = new Human();
        person.eat();
        person.breathe();
        person.speak();
    }
}
