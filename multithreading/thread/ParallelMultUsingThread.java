package multithreading.thread;


//Recall: Is this single threaded or multi threaded?
public class ParallelMultUsingThread {
    public static void main(String[] args) throws InterruptedException {
        int num1 = 10;
        int num2 = 10;

        AddThread addThread = new AddThread(num1, num2);
        addThread.start();
        addThread.join();

        int result = addThread.getResult();
        System.out.println("Result: " + result);
    }
}