package polymorphism;

public class Circle extends Shape {

    /** Orignal Method:
        void draw() {
        System.out.println("Drawing a shape");
    }
     */
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }

    //  OVERLOADED METHOD
    void draw(int radius) {
        System.out.println("Drawing a circle with radius: " + radius);
    }
}
