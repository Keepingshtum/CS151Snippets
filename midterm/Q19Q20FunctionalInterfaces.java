package midterm;

/**
 *  This is the code for Questions 19 and 20.
 */
public class Q19Q20FunctionalInterfaces {
    // Functional interface definition - notice we need to define at least two interfaces.
    // Try using only one - what problems do you run into?
    public interface IntMathOperation {
        int operate(int a, int b);
    }

    public interface DoubleMathOperation {
        double operate(double a, double b);
    }

    // Method that takes a functional interface as a parameter
    public static int operate(int a, int b, IntMathOperation operation) {
        return operation.operate(a, b);
    }

    public static double operate(double a, double b, DoubleMathOperation operation) {
        return operation.operate(a, b);
    }

    public static void main(String[] args) {
        int addition = operate(5, 3,  (int a, int b) -> a + b);
        int subtraction = operate(5, 3, (int a, int b) -> a - b);
        double doubleAddition = operate(5,3,(double a, double b) -> a + b);
        double doubleSubtraction = operate(5,3,(double a, double b) -> a - b);
        System.out.println("Addition:"+ addition + " Subtraction:" + subtraction + " doubleAddition:" + doubleAddition + " doubleSubtraction: " + doubleSubtraction);
    }

}
