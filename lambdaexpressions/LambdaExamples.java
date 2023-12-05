package lambdaexpressions;

public class LambdaExamples {
    public static void main(String[] args) {
        // Lambda expression for a greeting action
        Action greet = () -> System.out.println("Hello, world!");

        // Lambda expression for a task completion action
        Action completeTask = () -> System.out.println("Task completed successfully!");

        // Performing the actions
        performAction(greet);
        performAction(completeTask);
    }

    private static void performAction(Action action) {
        action.perform();
    }
}
