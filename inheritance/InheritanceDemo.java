package inheritance;

class Vehicle {
    private String make;
    private String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Vehicle Make: " + make + ", Model: " + model);
    }
}

// Subclass
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, int numberOfDoors) {
        super(make, model); // Calling the constructor of the superclass
        this.numberOfDoors = numberOfDoors;
    }

    public void displayCarInfo() {
        // This method extends the functionality of the superclass
        super.displayInfo(); // Calling the method from the superclass
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Main class to demonstrate inheritance
public class InheritanceDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 4);
        car.displayCarInfo(); // Displays information about the car
    }
}
