package interfaces;

public class Cat implements Animal {
    String sound = "meow";
    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public void walk() {
        System.out.println("Cat is walking");
    }

    @Override
    public void fly() {

    }
}
