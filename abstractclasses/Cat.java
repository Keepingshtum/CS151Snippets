package abstractclasses;

public class Cat extends absAnimal{
    //Why no constructor?
    //https://stackoverflow.com/questions/4488716/java-default-constructor
    private String sound = "Meow";
    @Override
    public String getSound() {
        System.out.println("getSound in Cat Class was called!");
        return sound;
    }

    public static void main(String[] args) {
        Cat newCat = new Cat();
        System.out.println(newCat.getSound());
        newCat.showSound();
    }
}
