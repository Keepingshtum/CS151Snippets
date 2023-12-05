package generics;

public class GenericContainer<T> {
    private T object;

    public GenericContainer(T object) {
        this.object = object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public static void main(String[] args) {
        // Example usage of GenericContainer with different types

        // Integer container
        GenericContainer<Integer> intContainer = new GenericContainer<>(123);
        System.out.println("Integer Value: " + intContainer.getObject());

        // String container
        GenericContainer<String> stringContainer = new GenericContainer<>("a");
        System.out.println("String Value: " + stringContainer.getObject());

        // Double container
        GenericContainer<Double> doubleContainer = new GenericContainer<>(9.99);
        System.out.println("Double Value: " + doubleContainer.getObject());
    }
}