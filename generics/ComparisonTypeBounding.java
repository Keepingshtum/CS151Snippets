package generics;

public class ComparisonTypeBounding {

    // Generic method without type bounding
//    public static <T> T findMax(T first, T second) {
//        // This code will not compile, as the compiler doesn't know if T has a meaningful ordering
//        // because T could be any type, and not all types support comparison using the '>' operator.
//        return first > second ? first : second;
//    }

    // Generic method with type bounding using Comparable
    public static <T extends Comparable<T>> T findMax(T first, T second) {
        // Now, the compiler knows that T extends Comparable<T>, so we can safely use compareTo for comparison.
        return (first.compareTo(second) > 0) ? first : second;
    }

    public static void main(String[] args) {

        //Uncomment this and see what happens!
//        findMax(5,6.0);

        // Find the maximum of two integers
        int maxInteger = findMax(5, 8);
        System.out.println("Max Integer: " + maxInteger);



        // Find the maximum of two strings
        String maxString = findMax("Apple", "Banana");
        System.out.println("Max String: " + maxString);
    }
}

