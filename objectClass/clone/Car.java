package objectClass.clone;

public class Car implements Cloneable {
    private String brand;
    private int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Getter and setter for the brand field
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter and setter for the year field
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Overriding the clone method for shallow copy
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                '}';
    }

    public static void main(String[] args) {
        try {
            Car originalCar = new Car("Toyota", 2021);
            Car clonedCar = (Car) originalCar.clone(); // Cloning the Car object

            System.out.println("Original Car: " + originalCar);
            System.out.println("Cloned Car: " + clonedCar);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
