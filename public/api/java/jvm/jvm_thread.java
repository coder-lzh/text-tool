public static void printThreadInfo(){
    while (true){
        int threadCount = ManagementFactory.getThreadMXBean().getThreadCount();
        System.out.println("目前JVM线程数："+threadCount);
        try {
            Thread.sleep(500L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
