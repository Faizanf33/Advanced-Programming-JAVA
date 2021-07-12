import java.util.Date;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class callableTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        String names[] = new String[] { "Ali Ghulam", "Faizan Ahmad", "Muhammad Hafeez Ullah" };
        return names[Math.abs(new Random().nextInt()) % names.length];
    }

}

public class CallableExecutorService {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<String> name = executorService.submit(new callableTask());
        System.out.println(name.get() + " is performing task at " + new Date());

        name = executorService.submit(new callableTask());
        System.out.println(name.get() + " is performing task at " + new Date());

        name = executorService.submit(new callableTask());
        System.out.println(name.get() + " is performing task at " + new Date());

        executorService.shutdown();
    }
}