package com.example.bootdemo;

import org.springframework.util.StopWatch;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        StopWatch sw = new StopWatch("test");
        sw.start("task1");
        // do something
        Thread.sleep(100);
        sw.stop();
        sw.start("task2");
        // do something
        Thread.sleep(200);
        sw.stop();
        System.out.println("执行完毕；打印信息>>> \n");

        // 任务总的耗时  如果你想获取到每个任务详情（包括它的任务名、耗时等等）可使用
        System.out.println("所有任务总耗时：" + sw.getTotalTimeMillis());
        System.out.println("任务总数：" + sw.getTaskCount());
        System.out.println();
        System.out.println(sw.prettyPrint());
    }
}


//执行完毕；打印信息>>>
//
//所有任务总耗时：306
//任务总数：2
//
//StopWatch 'test': running time = 306022600 ns
//---------------------------------------------
//ns         %     Task name
//---------------------------------------------
//100291900  033%  task1
//205730700  067%  task2
