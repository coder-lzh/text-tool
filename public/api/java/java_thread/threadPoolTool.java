import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 公众号：干货食堂
 */
public class ThreadPoolUtil {
    private static ExecutorService threadPool = Executors.newCachedThreadPool();

    public static void execute(Runnable runnable) {
        threadPool.execute(runnable);
    }

    public static <T> Future<T> submit(Callable<T> callable) {
        return threadPool.submit(callable);
    }

    public static void shutdown() {
        threadPool.shutdown();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Future<String> future = ThreadPoolUtil.submit(() -> "公众号：干货食堂");
        System.out.println(future.get());
    }
}
