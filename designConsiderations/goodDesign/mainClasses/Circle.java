package designConsiderations.goodDesign.mainClasses;

import designConsiderations.goodDesign.mainInterfaces.Measurable;

// Good design because it utilizes interface to have the same method call to have different functionality depending on the object type.

public class Circle implements Measurable {
    private double radius;

    // Constructor to initialize the circle with a specific radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter method for the radius
    public double getRadius() {
        return radius;
    }

    // Setter method for the radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    @Override
    public double measureArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display the circle's details
    public void displayDetails() {
        System.out.println("Circle: ");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + measureArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
}
