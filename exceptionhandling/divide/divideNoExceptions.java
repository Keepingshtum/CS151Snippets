package exceptionhandling.divide;

public class divideNoExceptions {

    static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        }
        return 0.0; //Remember, no need to honor postcondition
    }

    static double complexOperation(double a, double b) {
        double sum = a+b;
        b = b - 2;
        return divide(sum,b);
    }

    public static void main(String[] args) {
        System.out.println(complexOperation(10,5));
        System.out.println(complexOperation(5,2));
    }
}
