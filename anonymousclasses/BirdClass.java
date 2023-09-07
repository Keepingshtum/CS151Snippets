package anonymousclasses;

public class BirdClass {
    private String name;

    public BirdClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Make the bird chirp
    public void chirp() {
        System.out.println("Hello, my name is" + name);
    }

    //Make the bird fly
    public void fly() {
        System.out.println("I believe I can fly!");
    }
}
