package abstractclasses;

public abstract class absAnimal {
    public abstract String getSound();
    public void showSound() {
        String sound = getSound();
        System.out.println(sound);
    }

    private void secretMethod(){
        System.out.println("This is too secret to be inherited!");
    }
}
