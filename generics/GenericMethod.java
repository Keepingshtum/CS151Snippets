package generics;


public class GenericMethod {
    // More obvious example of a generic method
    public static <T extends Comparable<T>> T findMax(T x, T y) {
        return x.compareTo(y) > 0 ? x : y;
    }

    public static void main(String[] args) {
        // Finding the maximum of two Integers
        Integer maxInteger = findMax(5, 8);
        System.out.println("Max Integer: " + maxInteger);

        // Finding the maximum of two Doubles
        Double maxDouble = findMax(3.14, 2.71);
        System.out.println("Max Double: " + maxDouble);
    }
}
