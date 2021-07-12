import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000); // Sleep for 1000 millisecond = 1 second
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Hi, I am Task running at " + new Date());
    }
}

public class RunnableExecutorService {
    public static void main(String[] args) {
        /*
         * These are asynchronous tasks so their output may vary ...
         */

        // System.out.println("Single Thread Executor:");
        // ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        // singleThreadExecutor.execute(new Task());
        // singleThreadExecutor.execute(new Task());

        // // close execution of all tasks
        // singleThreadExecutor.shutdown();

        // // Fixed size of threads (specify max number of threads)
        // final int nThreads = 3;
        // System.out.println("Fixed Thread Pool Of " + nThreads + " Threads:");
        // ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        // fixedThreadPool.execute(new Task());
        // fixedThreadPool.execute(new Task());
        // fixedThreadPool.execute(new Task());
        // fixedThreadPool.execute(new Task());

        // // close execution of all tasks
        // fixedThreadPool.shutdown();

        // No fixed size of threads (create as many as you can)
        System.out.println("Cached Thread Pool:");
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        // cachedThreadPool.execute(new Task());
        // cachedThreadPool.execute(new Task());
        // cachedThreadPool.execute(new Task());
        // cachedThreadPool.execute(new Task());
        cachedThreadPool.submit(new Task());
        cachedThreadPool.submit(new Task());
        cachedThreadPool.submit(new Task());
        cachedThreadPool.submit(new Task());
        // close execution of all tasks
        cachedThreadPool.shutdown();

    }

}
