package multithreading.runnable;

//Recall: Is this single threaded or multi threaded?
public class ParallelMultUsingRunnable {
    public static void main(String[] args) throws InterruptedException {
        int num1 = 10;
        int num2 = 10;

        AddRunnable addRunnable = new AddRunnable(num1, num2);
        Thread thread = new Thread(addRunnable);
        thread.start();
        thread.join();

        int result = addRunnable.getResult();
        System.out.println("Result: " + result);
    }
}