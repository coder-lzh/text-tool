public class UnitedThreadPoolUtil {
    private static final Integer CORE_POOL_SIZE = Runtime.getRuntime().availableProcessors() * 2;
    private static ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
            CORE_POOL_SIZE,
            CORE_POOL_SIZE*2,
            3,
            TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(100),
            //用调用者所在的线程来执行任务
            new ThreadPoolExecutor.CallerRunsPolicy());

    public static void execute(Runnable runnable){
        //获取 上下文信息
        RpcContext_inner context = EagleEye.getRpcContext();
        threadPoolExecutor.execute(() -> {
            EagleEye.setRpcContext(context);
            try {
                runnable.run();
            } finally {
                //清空当前线程context
                MDC.clear();
            }
        });
        log.info("当前线程池[线程总数]为:{},当前线程池[正在工作线程数量]为:{},当前线程池[核心线程数量]为:{},当前线程池[任务数量]为:{}，当前线程池[等待数量]为:{}"
                ,threadPoolExecutor.getPoolSize()
                ,threadPoolExecutor.getActiveCount()
                ,threadPoolExecutor.getCorePoolSize()
                ,threadPoolExecutor.getTaskCount()
                ,threadPoolExecutor.getQueue().size()
        );
    }
}
