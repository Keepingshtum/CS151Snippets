// Generic Animal class
public class Animal {
    // Instance variables
    String name;
    int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to get animal information
    public String getAnimalInfo() {
        return name + ", " + age + " years old";
    }
}