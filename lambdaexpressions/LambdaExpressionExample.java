package lambdaexpressions;

public class LambdaExpressionExample {
    public static void main(String[] args) {

        //We can omit types, if we want to
        MathOperation add = (a, b) -> a + b;

        //We can force types if we want to
        MathOperation subtract = (int a, int b) -> a - b;

        //If we have more than one line of logic, we can use braces
        MathOperation sumThenMultiply = (a,b) -> {
            int c = a+b;
            return c*b;
        };

        //We don't even need parentheses if we only have one argument for our lambda!
        OneOpMathOperation doubleNum =  a -> a*2;

        System.out.println("Addition: " + add.doOperation(5, 3));

        //Will not print what you expect!
        System.out.println("Addition: " + add.doOperation('a', 'b'));


        System.out.println("Addition: " + add.doOperation(5, 3));
        System.out.println("Subtraction: " + subtract.doOperation(5, 3));
        System.out.println("Summing the two numbers, then multiplying by the second: "+ sumThenMultiply.doOperation(5, 3));
        System.out.println("Doubling: " + doubleNum.doOperation(5));




//        System.out.println("Subtraction: " + subtract.doOperation(5.0, 3.0));
//        System.out.println("Addition: " + add.doOperation("a", "b"));

        StringOperation addStrs = (a, b) -> a + b;
        System.out.println("String Addition: " + addStrs.doOperation("a", "b"));


    }
}
