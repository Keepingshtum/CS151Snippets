package unitTests.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import unitTests.src.CalculatorImpl;
import unitTests.src.MathServiceImpl;
//import static org.mockito.Mockito.*;

public class CalculatorImplTest {


    @Test
    public void testAddition() {
        MathServiceImpl testMathService = new MathServiceImpl();
        CalculatorImpl calculatorTestObject = new CalculatorImpl(testMathService);
        assertEquals(5, calculatorTestObject.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        MathServiceImpl testMathService = new MathServiceImpl();
        CalculatorImpl calculatorTestObject = new CalculatorImpl(testMathService);
        assertEquals(2, calculatorTestObject.subtract(5, 3));
    }

    @Test
    public void testMultiplication() {
        MathServiceImpl testMathService = new MathServiceImpl();
        CalculatorImpl calculatorTestObject = new CalculatorImpl(testMathService);
        assertEquals(15, calculatorTestObject.multiply(5, 3));
    }

    @Test
    public void testDivision() {
        MathServiceImpl testMathService = new MathServiceImpl();
        CalculatorImpl calculatorTestObject = new CalculatorImpl(testMathService);
        assertEquals(2.5, calculatorTestObject.divide(5, 2), 0.0001);
    }

    @Test
    public void testDivideByZero() {
        MathServiceImpl testMathService = new MathServiceImpl();
        CalculatorImpl calculatorTestObject = new CalculatorImpl(testMathService);
        assertThrows(ArithmeticException.class, () -> calculatorTestObject.divide(5, 0));
    }
}
