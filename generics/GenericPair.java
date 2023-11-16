package generics;

// Generic class
class Pair<T, U> {
    private T first;
    private U second;

    //Generic method
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}

class Car {
    private String manufacturer;
    private String model;
    private int topSpeed;

    public Car(String manufacturer, String model, int topSpeed) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.topSpeed = topSpeed;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
}

public class GenericPair {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(1, "One");
        System.out.println(pair1);

        Pair<Integer, Car> pair2 = new Pair<>(1, new Car("Toyota","Corolla", 200));
        System.out.println(pair2);
    }
}