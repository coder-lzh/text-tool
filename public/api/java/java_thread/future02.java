import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 公众号：干货食堂
 */
public class ExecutorTest2 {
    public static void main(String[] args){
        ExecutorService executor = Executors.newCachedThreadPool();
        //任务链表
        List<MyTask> taskList=new ArrayList<>();
        //结果链表
        List<Future<String>> resultList=new ArrayList<>();
        for (int i = 0; i < 5; i++){
            taskList.add(new MyTask());
        }
        try {
            //与submit()不同，invokeAll()会阻塞直到所以得任务都执行完成。
            //所以，你会发现 结果是一下子出来完的。而submit()是一个一个出来的
            resultList=executor.invokeAll(taskList);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }

        System.out.println("获取执行结果：");
        for(Future<String> f:resultList){
            try {
                //              while(!f.isDone()){};
                System.out.println(f.get());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (ExecutionException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }

}

//定义Callable实现类，返回一个字符串
class MyTask2 implements Callable<String>{
    @Override
    public String call() throws Exception {
        Random random=new Random();
        int result=random.nextInt(100);
          // 休眠
        Thread.sleep((random.nextInt(3) * 1000));
        return Thread.currentThread().getName()+":"+result;
    }

}
