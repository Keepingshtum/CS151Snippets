package designConsiderations.goodDesign.mainClasses;

import designConsiderations.goodDesign.mainInterfaces.Measurable;

public class Rectangle implements Measurable {
    private double length;
    private double width;

    // Constructor to initialize the rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing the measure method to calculate area
    @Override
    public double measureArea() {
        return length * width;
    }

    // Getter and Setter methods
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
