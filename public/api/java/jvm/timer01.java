public class Test {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        // do something
        Thread.sleep(100);
        long end = System.currentTimeMillis();
        long start2 = System.currentTimeMillis();
        // do something
        Thread.sleep(200);
        long end2 = System.currentTimeMillis();
        System.out.println("某某1执行耗时:" + (end - start));
        System.out.println("某某2执行耗时:" + (end2 - start2));
    }
}
