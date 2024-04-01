import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@EnableAsync
public class ScheduleTask {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

     /**
     * 默认spring自带的线程池名字是  task-1 ，task-2 这种的。我们可以自定义配置他的相关一些参数
     * @Async 默认是使用自带的线程池。当然也可以用自定义的线程池 需要 @Async("myAsync") 这样写，
     * 说明该异步方法需要用 bean的名字为myAsync的线程池。
     */

    @Async
    @Scheduled(fixedRate = 1000)
    public void testScheduleTask() {
        try {
            Thread.sleep(2000);
            System.out.println("Spring自带的线程池" + Thread.currentThread().getName() + "-" + sdf.format(new Date()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
