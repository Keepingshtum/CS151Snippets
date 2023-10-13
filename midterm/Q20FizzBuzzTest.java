package midterm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


/**
 *  This is part of the code for Question 20.
 */

public class Q20FizzBuzzTest {

    Q20FizzBuzz fizzBuzz = new Q20FizzBuzz();

    @Test
    public void testFizzBuzz() {
        assertEquals("1, 2, Fizz, 4, Buzz", fizzBuzz.fizzBuzz(5));
    }

    @Test
    public void testFizzBuzz2() {
        assertEquals("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz", fizzBuzz.fizzBuzz(15));
    }

    @Test
    public void testFizzBuzz3() {
        assertEquals("1", fizzBuzz.fizzBuzz(1));
    }

    @Test
    public void testFizzBuzz4() {
        assertEquals("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16, 17, Fizz, 19, Buzz", fizzBuzz.fizzBuzz(20));
    }

    @Test
    public void testFizzBuzzInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> fizzBuzz.fizzBuzz(0));
    }
}