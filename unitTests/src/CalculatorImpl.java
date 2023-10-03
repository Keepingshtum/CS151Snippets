package unitTests.src;

//You can also generate tests for this using your IDE!
public class CalculatorImpl implements CalculatorService {

    private static MathService mathService;

    public CalculatorImpl(MathService mathService) {
        this.mathService = mathService;
    }

    public static int performComplexCalculation(int a, int b) {
        return mathService.complexOperation(a, b);
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }
}
