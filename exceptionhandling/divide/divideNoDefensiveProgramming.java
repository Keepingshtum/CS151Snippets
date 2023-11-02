package exceptionhandling.divide;

public class divideNoDefensiveProgramming {

    static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println(divide(5, 2));
        System.out.println(divide(5, 0));
    }
}
