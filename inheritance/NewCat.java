package inheritance;

public class NewCat extends Animal{
    String breed;

    // Constructor
    public NewCat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // Method for the cat to meow
    public void meow() {
        System.out.println(name + " says: Meow!");
    }

    // Main method
    public static void main(String[] args) {
        NewCat myCat = new NewCat("Whiskers", 3, "Chonker");
        System.out.println("My cat: " + myCat.getAnimalInfo() + " (" + myCat.breed + ")");
        myCat.meow();
    }
}
