package types;

public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Woof! Woof!");
    }

    public void bark() {
        System.out.println("Barking...");
    }
}
