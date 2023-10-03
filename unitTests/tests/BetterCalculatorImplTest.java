package unitTests.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import unitTests.src.CalculatorImpl;
import unitTests.src.MathServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;


public class BetterCalculatorImplTest {

    //Initialize test variables
    MathServiceImpl testMathService = new MathServiceImpl();
    CalculatorImpl calculatorTestObject = new CalculatorImpl(testMathService);

// Below lines won't work because we need to import Mockito properly; Beyond the scope of this demo
// But this is how you would do it in a proper spring-boot project!
//    @BeforeAll
//    public static void setup(){
////        MathServiceImpl testMathService = mock(MathServiceImpl.class);
////        // Set up the mock behavior
////        when(testMathService.complexOperation(2, 3)).thenReturn(5);
//        MathServiceImpl testMathService = new MathServiceImpl();
//        CalculatorImpl calculatorTestObject = new CalculatorImpl(testMathService);
//    }

    @Test
    public void testAddition() {
        assertEquals(5, calculatorTestObject.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(2, calculatorTestObject.subtract(5, 3));
    }

    @Test
    public void testMultiplication() {
        assertEquals(15, calculatorTestObject.multiply(5, 3));
    }

    @Test
    public void testDivision() {
        assertEquals(2.5, calculatorTestObject.divide(5, 2), 0.0001);
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculatorTestObject.divide(5, 0));
    }

    //We have disabled this test because we know it won't work currently
    @Disabled
    public void testPerformComplexCalculation() {
        // Test the performComplexCalculation() method
        int result = CalculatorImpl.performComplexCalculation(2, 3);

        // Verify the result using assertions
        assertEquals(5, result);

        // Verify that the complexOperation method of MathService was called with the correct arguments
        verify(testMathService, times(1)).complexOperation(2, 3);
    }
}
