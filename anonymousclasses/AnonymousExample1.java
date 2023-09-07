package anonymousclasses;

public class AnonymousExample1 {
        public static void main(String[] args) {
            // Create an instance of the anonymous subclass of BirdClass
            BirdClass bird = new BirdClass("Anonymous Bird") {
                // Override the chirp method
                @Override
                public void chirp() {
                    System.out.println("Chirp chirp! My name is " + getName());
                }

                // Override the fly method
                @Override
                public void fly() {
                    System.out.println("Flap flap! I'm soaring high!");
                }
            };

            // Call the overridden methods
            bird.chirp();
            bird.fly();
        }
}
