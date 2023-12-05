package multithreading.runnable;

public class Counter implements Runnable {
    private int count = 0;

    @Override
    public void run() {
        // This method is executed when the thread starts
        for (int i = 0; i < 5; i++) {
            count++;
            System.out.println(Thread.currentThread().getName() + " incremented count to: " + count);

            // Adding a small delay for demonstration purposes
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted");
            }
        }
    }

    public static void main(String[] args) {
        Counter counter = new Counter();

        // Creating two threads that run the same instance of Counter
        Thread thread1 = new Thread(counter, "Thread 1");
        Thread thread2 = new Thread(counter, "Thread 2");

        // Starting both threads
        thread1.start();
        thread2.start();
    }
}