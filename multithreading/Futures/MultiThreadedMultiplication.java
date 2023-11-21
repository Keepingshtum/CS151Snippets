package multithreading.Futures;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultiThreadedMultiplication {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int num1 = 10;
        int num2 = 10;

        System.out.println("Result: " + parallelMultiply(num1, num2));
    }

    private static int parallelMultiply(int num1, int num2) throws InterruptedException, ExecutionException {
        //Figure out how many threads are available to us
        int numThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);

        int chunkSize = num1 / numThreads;
        int remainder = num1 % numThreads;

        int[] partialResults = new int[numThreads];
        List<Future<Void>> futures = new ArrayList<>();

        for (int i = 0; i < numThreads; i++) {
            final int threadIndex = i;

            //Allocate the calculations to our adder threads
            Future<Void> future = executorService.submit(() -> {
                int start = threadIndex * chunkSize;
                int end = (threadIndex == numThreads - 1) ? start + chunkSize + remainder : start + chunkSize;

                for (int j = start; j < end; j++) {
                    partialResults[threadIndex] += num2;
                }

                return null;
            });

            futures.add(future);
        }

        // Wait for all threads to complete
        for (Future<Void> future : futures) {
            future.get();
        }

        executorService.shutdown();

        // Sum up partial results to get the final result
        int result = 0;
        for (int partialResult : partialResults) {
            result += partialResult;
        }

        return result;
    }
}