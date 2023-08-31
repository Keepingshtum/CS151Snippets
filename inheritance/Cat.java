package inheritance;

// inheritance.Cat class
public class Cat {
    //Instance variables
    String name;
    int age;
    String breed;

    // Constructor
    public Cat(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    // Method to get cat information
    public String getCatInfo() {
        return name + " (" + breed + "), " + age + " years old";
    }

    // Method for the cat to meow
    public void meow() {
        System.out.println(name + " says: Meow!");
    }

    // Main method
    public static void main(String[] args) {
        Cat myCat = new Cat("Whiskers", 3, "Chonker");
        System.out.println("My cat: " + myCat.getCatInfo());
        myCat.meow();
    }
}