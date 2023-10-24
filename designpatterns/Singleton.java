package designpatterns;

public class Singleton {
    // Private static variable to hold the single instance of the class
    private static Singleton instance;

    // Private constructor prevents instantiation from other classes
    private Singleton() {
    }

    // Public method to provide the single instance of the class
    public static Singleton getInstance() {
        // If the instance is not created, create it
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods of the class
    public void showMessage() {
        System.out.println("Hello, I am the Singleton instance!");
    }

    public static void main(String[] args) {

        Singleton singletonInstance1 = Singleton.getInstance();
        singletonInstance1.showMessage();

        // Try to create another instance (it will still refer to the existing instance)
        Singleton singletonInstance2 = Singleton.getInstance();
        singletonInstance2.showMessage();

        if (singletonInstance1 == singletonInstance2) {
            System.out.println("Both instances are the same. Singleton pattern works!");
        } else {
            System.out.println("Singleton pattern is broken!");
        }

        //If you are still not convinced, notice the output of the following lines
        System.out.println(singletonInstance1);
        System.out.println(singletonInstance2);
    }
}
