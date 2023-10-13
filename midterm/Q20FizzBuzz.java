package midterm;


/**
 *  This is part of the code for Question 20.
 */


public class Q20FizzBuzz {
    public String fizzBuzz(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer");
        }

        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.append("FizzBuzz");
            } else if (i % 3 == 0) {
                result.append("Fizz");
            } else if (i % 5 == 0) {
                result.append("Buzz");
            } else {
                result.append(i);
            }

            if (i < n) {
                result.append(", ");
            }
        }
        return result.toString();
    }
}