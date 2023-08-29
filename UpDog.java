public class UpDog extends Animal{
    String breed;

    // Constructor
    public UpDog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // Method for the dog to bark
    public void bark() {
        System.out.println(name + " says: Woof woof!");
    }

    public static void main(String[] args) {
        UpDog myDog = new UpDog("Buddy", 2, "Goodest Boy");
        System.out.println("My dog: " + myDog.getAnimalInfo() + " (" + myDog.breed + ")");
        myDog.bark();
    }
}
