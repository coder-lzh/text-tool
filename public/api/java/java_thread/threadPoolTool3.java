import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Demo {

    public static void main(String[] args) throws Exception{
        int corePoolSize = 5;           // 核心线程数，即线程池中保持活动状态的线程数
        int maximumPoolSize = 10;       // 最大线程数，线程池中允许的最大线程数
        long keepAliveTime = 60;        // 非核心线程闲置超时时长，超过该时间未被使用的非核心线程将被终止
        TimeUnit unit = TimeUnit.SECONDS; // 闲置时间的单位
        BlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<>(); // 任务队列，用于保存待执行的任务
        ThreadFactory threadFactory = Executors.defaultThreadFactory(); // 线程工厂，用于创建新线程
        RejectedExecutionHandler handler = new ThreadPoolExecutor.AbortPolicy(); // 拒绝策略，当任务无法被执行时的处理策略

        ExecutorService executor = new ThreadPoolExecutor(
                corePoolSize,
                maximumPoolSize,
                keepAliveTime,
                unit,
                workQueue,
                threadFactory,
                handler
        );

    }
}
