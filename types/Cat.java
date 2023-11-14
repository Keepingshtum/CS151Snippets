package types;

public class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow!");
    }

    public void meow() {
        System.out.println("Meowing...");
    }
}
