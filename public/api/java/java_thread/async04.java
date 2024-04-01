import org.junit.jupiter.api.Test;

import java.util.concurrent.CompletableFuture;

/**
 * thenRun表示某个任务执行完成后执行的动作，即回调方法，无入参，无返回值。
 */

public class TestMain {

    /**
     * 从上面代码和测试结果我们发现thenRun和thenRunAsync区别在于，
     * 使用thenRun方法时子任务与父任务使用的是同一个线程，而thenRunAsync在子任务中可能是另起一个线程执行任务，
     * 并且thenRunAsync可以自定义线程池，默认的使用ForkJoinPool.commonPool()线程池。
     * @throws Exception
     */
    @Test
    public  void test() throws Exception {
        CompletableFuture<Integer> cf1 = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread() + " cf1 do something....");
            return 1;
        });

        CompletableFuture<Void> cf2 = cf1.thenRun(() -> {
            System.out.println(Thread.currentThread() + " cf2 do something....");
        });

        //等待任务1执行完成
        System.out.println("cf1结果->" + cf1.get());
        //等待任务2执行完成
        System.out.println("cf2结果->" + cf2.get());
    }


    @Test
    public  void test2() throws Exception {
        CompletableFuture<Integer> cf1 = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread() + " cf1 do something....");
            return 1;
        });

        CompletableFuture<Void> cf2 = cf1.thenRunAsync(() -> {
            System.out.println(Thread.currentThread() + " cf2 do something....");
        });

        //等待任务1执行完成
        System.out.println("cf1结果->" + cf1.get());
        //等待任务2执行完成
        System.out.println("cf2结果->" + cf2.get());

    }
}
cf1结果->1
cf2结果->null
