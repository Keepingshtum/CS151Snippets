package unitTests.src;

public class MathServiceImpl implements MathService {

    /**
     * @param a - First Operand
     * @param b - Second Operant
     * @return The sum of the two operands.
     */
    @Override
    public int complexOperation(int a, int b) {
        return a+b;
    }
}
