import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class ScheduledTask implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000); // Sleep for 1000 millisecond = 1 second
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Hi, I am Scheduled Task running at " + new Date());
    }
}

class CheckTask implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000); // Sleep for 1000 millisecond = 1 second
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Hi, I am Check Task running at " + new Date());
    }
}

public class RunnableScheduledExecutorService {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(3);
        scheduledThreadPool.schedule(new ScheduledTask(), 2000, TimeUnit.MILLISECONDS);
        scheduledThreadPool.schedule(new ScheduledTask(), 1000, TimeUnit.MILLISECONDS);
        scheduledThreadPool.schedule(new ScheduledTask(), 500, TimeUnit.MILLISECONDS);

        scheduledThreadPool.shutdown();

        // Note: DO NOT shutdown this task or otherwise it won't run at all!
        ScheduledExecutorService scheduledThreadPoolF = Executors.newScheduledThreadPool(3);
        scheduledThreadPoolF.scheduleAtFixedRate(new CheckTask(), 500, 1000, TimeUnit.MILLISECONDS);
        scheduledThreadPoolF.scheduleAtFixedRate(new CheckTask(), 500, 1000, TimeUnit.MILLISECONDS);
        scheduledThreadPoolF.scheduleAtFixedRate(new CheckTask(), 500, 1000, TimeUnit.MILLISECONDS);
    }
}
