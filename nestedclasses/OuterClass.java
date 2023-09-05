package nestedclasses;

/**
 *  This is the outer class, which will hold ALL our logic!
 *
 *
 *      Note to self:
 *      Uncomment commented lines to experiment with things that can go wrong!
 */
public class OuterClass {

    private final int secretInt = 7;

    /**
     *  This is the nested inner class!
     */
    public class InnerClass {
        private final int innerSecretInt = secretInt;

        // Will make it a "Static" Nested Class Instead of a pure "Inner" nested class
        private static void doSomething() {
            System.out.println("Is technically allowed");
        }

        private void showSecretInt() {
            System.out.println("Hello from inner class!");
            System.out.println(innerSecretInt);
        }
    }

    /**
     *  This is the nested static class!
     */
    public static class staticInnerClass {
        //Not allowed!
//        private static int staticSecretInt = secretInt;
        private static int staticSecretInt = 8;

        private static void showStaticSecretInt() {
            System.out.println("Hello from static class!");
//            System.out.println(innerSecretInt);
            System.out.println(staticSecretInt);
        }
    }

    /**
     * Demonstrates the quirks of nested classes
     */
    public static void showSecretInts(){
        OuterClass newOuterClassObject = new OuterClass();
        InnerClass newInnerClassObject = newOuterClassObject.new InnerClass();

        System.out.println("Hello from Outer class!");
        //This won't work until we make secret int static, because them's the rules
//        System.out.println(secretInt);

        newInnerClassObject.showSecretInt();

        System.out.println("Directly Accessing Static secret Int");
        System.out.println(staticInnerClass.staticSecretInt);

        System.out.println("Using the static showStaticSecretInt method");
        staticInnerClass.showStaticSecretInt();
    }

    /**
     * Main function to run our showSecretInts() method
     * @param args - empty args, but we would put some args here if we were running it from the CLI!
     */
    public static void main (String[] args) {
        showSecretInts();
    }
}
