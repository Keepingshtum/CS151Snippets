package interfaces;

public class FriendlyPerson implements Friend,Person{
    private final String name;

    public FriendlyPerson(String name) {
        this.name = name;
    }

    @Override
    public void doFavor(String personName) {
        System.out.println(name + " is helping a friend," + personName);
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I am " + name + ". Nice to meet you!");
    }

    public static void main(String[] args) {
        FriendlyPerson friendlyPerson = new FriendlyPerson("Anant");
        friendlyPerson.introduce();
        friendlyPerson.doFavor("");
    }
}
