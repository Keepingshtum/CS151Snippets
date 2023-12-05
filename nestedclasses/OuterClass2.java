package nestedclasses;

public class OuterClass2 {
    private static String staticMessage = "I am a static nested class.";
    private String nonStaticMessage = "I am an inner class.";

    // Static nested class
    static class StaticNestedClass {
        void display() {
            System.out.println(staticMessage); // Can access static members of the outer class
        }
    }

    // Inner class
    class InnerClass {
        void display() {
            System.out.println(nonStaticMessage); // Can access non-static members of the outer class
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the static nested class
        OuterClass2.StaticNestedClass nestedObject = new OuterClass2.StaticNestedClass();
        nestedObject.display();

        // Creating an instance of the inner class
        OuterClass2 outerObject = new OuterClass2();
        OuterClass2.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.display();
    }
}