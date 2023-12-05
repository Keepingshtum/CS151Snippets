package abstractclasses;

public class Circle extends Shape{
    public void draw() {
        System.out.println("Drawing Circle");
    }

    public static void main(String args[]) {
        Shape circ = new Circle();
        circ.draw();
    }
}
