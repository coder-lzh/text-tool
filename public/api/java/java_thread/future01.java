import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/**
 * 公众号：干货食堂
 */
public class ExecutorTest {
    public static void main(String[] args){
        ExecutorService executor = Executors.newCachedThreadPool();
        ArrayList<Future<String>> list=new ArrayList<>();
        for (int i = 0; i < 5; i++){
            //Future和每个线程关联
            Future<String> result=executor.submit(new MyTask());
            list.add(result);
        }
        //遍历Future，获取返回值
        for(Future<String> f:list){
            try {
                //while(!f.isDone()){};
                //阻塞等待获取返回值
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
class MyTask implements Callable<String>{
    @Override
    public String call() throws Exception {
        Random random=new Random();
        int result=random.nextInt(100);
          // 休眠
        Thread.sleep((random.nextInt(5) * 1000));
        return Thread.currentThread().getName()+":"+result;
    }

}
