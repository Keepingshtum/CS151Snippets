package abstractclasses;

public class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }

    public static void main(String args[]) {
    Shape rect = new Rectangle();
    rect.draw();
    }
}
