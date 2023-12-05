package types;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    // List to store animals of type Animal
    private List<Animal> animals;

    // Constructor to initialize the list
    public Zoo() {
        animals = new ArrayList<>();
    }

    // Method to add an animal to the zoo
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    // Method to make each animal in the zoo make its sound
    public void makeAnimalsSound() {
        // Loop through each animal in the list
        for (Animal animal : animals) {
            // Call the sound method of each animal
            animal.sound();

            // Check the type of the animal using instanceof
            // and call the specific methods for Dog and Cat
            if (animal instanceof Dog) {
                ((Dog) animal).bark(); // Cast to Dog and call bark method
            } else if (animal instanceof Cat) {
                ((Cat) animal).meow(); // Cast to Cat and call meow method
            }
        }
    }

    // Main method to demonstrate the usage of the Zoo class
    public static void main(String[] args) {
        Zoo zoo = new Zoo(); // Create a new Zoo instance
        zoo.addAnimal(new Dog()); // Add a Dog to the zoo
        zoo.addAnimal(new Cat()); // Add a Cat to the zoo

        zoo.makeAnimalsSound(); // Make all animals in the zoo make their sound
    }
}