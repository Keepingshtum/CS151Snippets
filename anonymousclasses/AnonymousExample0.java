package anonymousclasses;

import java.lang.reflect.InvocationTargetException;

public class AnonymousExample0 {
    // Create an instance of an anonymous class that implements Bird and Pig interfaces
    public static void main(String[] args) {
        Pig birdPig = new Pig() {
            @Override
            public void walk() {
                System.out.println("BirdPig can walk in a fancy way!");
            }

            //We can't override this from bird, because
            // An anonymous inner class can extend one subclass or implement one interface.
            // Unlike non-anonymous classes (inner or otherwise),
            // an anonymous inner class cannot do both.
//            @Override


            //What we CAN do is make a new method called Chirp... but that is NOT GOOD DESIGN!
            //Just create a new class that implements both interfaces
            //Remember, we can't inherit multiple classes.
            public void chirp() {
                System.out.println("BirdPig can chirp");
            }

            @Override
            public void oink() {
                System.out.println("BirdPig can oink");
            }

        };

        birdPig.walk();
        birdPig.oink();

        //This won't work
//        birdPig.chirp();

        //... But this will
        try {
            birdPig.getClass().getMethod("chirp").invoke(birdPig);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
