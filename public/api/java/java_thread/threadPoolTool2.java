package com.example.demo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo {

    public static void main(String[] args) throws Exception{
        //创建固定大小的线程池
        ExecutorService executor = Executors.newFixedThreadPool(10);
        //创建单线程的线程池：
        ExecutorService executor2 = Executors.newSingleThreadExecutor();
        //创建可缓存的线程池
        ExecutorService executor3 = Executors.newCachedThreadPool();
        //创建定时任务的线程池，可以执行定时任务或周期性任务
        ExecutorService executor4 = Executors.newScheduledThreadPool(10);

        executor.execute(new Runnable() {
            @Override
            public void run() {
                // 任务的具体逻辑
            }
        });


        Future<String> future = executor.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                // 任务的具体逻辑
                return "OK"; // 返回任务的执行结果
            }
        });
        //关闭线程池，释放资源
        executor.shutdown();
    }
}
