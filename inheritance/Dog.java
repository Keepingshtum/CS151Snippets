package inheritance;

public class Dog {
    // Instance Variables
    String name;
    int age;
    String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    // Method to get dog information
    public String getDogInfo() {
        return name + " (" + breed + "), " + age + " years old";
    }

    // Method for the dog to bark
    public void bark() {
        System.out.println(name + " says: Woof woof!");
    }

    // Main method
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", 2, "Goodest Boy");
        System.out.println("My dog: " + myDog.getDogInfo());
        myDog.bark();
    }
}
