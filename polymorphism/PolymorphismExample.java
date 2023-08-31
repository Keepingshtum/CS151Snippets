package polymorphism;

public class PolymorphismExample {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        // Dynamic polymorphism
        // Calls the overridden method in Circle class
        shape1.draw();

        Circle circle = new Circle();
        // Static polymorphism - overloaded method
        circle.draw(5);

        Shape shape2 = new Shape();
        // Calls the method in Shape class
        shape2.draw();
    }
}
