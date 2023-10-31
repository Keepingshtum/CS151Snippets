package interfaces;

public class Dog implements Animal{
    String sound = "woof";
    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking");
    }

    @Override
    public void fly() {

    }
}
