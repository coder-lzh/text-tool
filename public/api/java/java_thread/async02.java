import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Test {
    public static void main(String[] args) throws Exception {
        // 自定义线程池
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        CompletableFuture<Void> cf = CompletableFuture.runAsync(() -> {
            System.out.println("do something....");
        }, executorService);

        //等待任务执行完成
        System.out.println("结果->" + cf.get());
    }
}


do something....
结果->null
