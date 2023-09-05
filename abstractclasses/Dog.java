package abstractclasses;

public class Dog extends absAnimal{

    //Why no constructor?
    //https://stackoverflow.com/questions/4488716/java-default-constructor

    private String sound = "Woof";

    @Override
    public String getSound() {
        System.out.println("getSound in Dog Class was called!");
        return sound;
    }

    public static void main(String[] args) {
        Dog newDog = new Dog();
        System.out.println(newDog.getSound());
        newDog.showSound();
//        newDog.secretMethod();
//        absAnimal newAbsAnimal = new absAnimal();
    }
}

