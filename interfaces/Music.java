package interfaces;

// First class implementing the interface
class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the guitar.");
    }
}

// Second class implementing the interface
class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the piano.");
    }
}

// Main class to demonstrate the use of the interface
public class Music {
    public static void main(String[] args) {
        Playable guitar = new Guitar();
        Playable piano = new Piano();

        guitar.play(); // Outputs: Playing the guitar.
        piano.play(); // Outputs: Playing the piano.
    }
}
