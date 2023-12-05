package anonymousclasses;

public class AnimalShowcase extends BirdClass implements BirdInterface, Pig {
    public AnimalShowcase(String name) {
        super(name); // Call the constructor of BirdClass
    }

    // Implement the methods from the Pig interface
    @Override
    public void oink() {
        System.out.println(getName() + " the bird-pig says: Oink!");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " the bird-pig walks around happily.");
    }

    // Override the chirp method from BirdClass to customize the behavior
    @Override
    public void chirp() {
        System.out.println("Chirp chirp! I'm " + getName() + ", the unique bird-pig!");
    }

    // Override the fly method from BirdClass to customize the behavior
    @Override
    public void fly() {
        System.out.println(getName() + " spreads its wings and flies!");
    }

    // Additional method to showcase the combined behaviors
    public void showcaseAbilities() {
        chirp();
        fly();
        oink();
        walk();
    }

    public static void main(String[] args) {
        AnimalShowcase showcase = new AnimalShowcase("Mike");
        showcase.showcaseAbilities();
    }
}
