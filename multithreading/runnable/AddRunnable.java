package multithreading.runnable;

public class AddRunnable implements Runnable {
    private int num1;
    private int num2;
    private int result;

    public AddRunnable(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void run() {
        for (int i = 0; i < num2; i++) {
            result += num1;
        }
    }

    public int getResult() {
        return result;
    }
}
