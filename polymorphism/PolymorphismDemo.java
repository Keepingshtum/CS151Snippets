package polymorphism;

class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

// Main class to demonstrate polymorphism
public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal myAnimal;

        // Polymorphism in action
        myAnimal = new Dog();
        myAnimal.makeSound();  // Outputs: Bark because we used the dog object

        myAnimal = new Cat();
        myAnimal.makeSound();  // Outputs: Meow because we used the cat object
    }
}
