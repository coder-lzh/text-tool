package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.concurrent.CompletableFuture;
/**
 * 重点！！！ 两个任务
 */
public class TestMain {

    /**
     * 1.thenCombine、thenAcceptBoth 和runAfterBoth
     * 这三个方法都是将两个CompletableFuture组合起来处理，只有两个任务都正常完成时，才进行下阶段任务。
     *
     * 区别：thenCombine会将两个任务的执行结果作为所提供函数的参数，且该方法有返回值；
     * thenAcceptBoth同样将两个任务的执行结果作为方法入参，但是无返回值；
     * runAfterBoth没有入参，也没有返回值。注意两个任务中只要有一个执行异常，则将该异常信息作为指定任务的执行结果。
     * @throws Exception
     */
    @Test
    public  void test() throws Exception {
        CompletableFuture<Integer> cf1 = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread() + " cf1 do something....");
            return 1;
        });

        CompletableFuture<Integer> cf2 = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread() + " cf2 do something....");
            return 2;
        });

        CompletableFuture<Integer> cf3 = cf1.thenCombine(cf2, (a, b) -> {
            System.out.println(Thread.currentThread() + " cf3 do something....");
            return a + b;
        });

        System.out.println("cf3结果->" + cf3.get());
    }


    @Test
    public  void test2() throws Exception {
        CompletableFuture<Integer> cf1 = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread() + " cf1 do something....");
            return 1;
        });

        CompletableFuture<Integer> cf2 = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread() + " cf2 do something....");
            return 2;
        });

        CompletableFuture<Void> cf3 = cf1.thenAcceptBoth(cf2, (a, b) -> {
            System.out.println(Thread.currentThread() + " cf3 do something....");
            System.out.println(a + b);
        });

        System.out.println("cf3结果->" + cf3.get());
    }

    @Test
    public  void test3() throws Exception {
        CompletableFuture<Integer> cf1 = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread() + " cf1 do something....");
            return 1;
        });

        CompletableFuture<Integer> cf2 = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread() + " cf2 do something....");
            return 2;
        });

        CompletableFuture<Void> cf3 = cf1.runAfterBoth(cf2, () -> {
            System.out.println(Thread.currentThread() + " cf3 do something....");
        });

        System.out.println("cf3结果->" + cf3.get());
    }
}
