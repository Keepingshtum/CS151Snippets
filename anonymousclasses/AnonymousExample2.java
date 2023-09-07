package anonymousclasses;

public class AnonymousExample2 {
    public static void main(String[] args) {
        // Create and start a new thread using an anonymous class
        //Revisit this after the next live demo!
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread: " + i);
                    try {
                        Thread.sleep(200); // Sleep for 1 second
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread.start(); // Start the thread
    }
}
