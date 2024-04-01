public static void printCacheInfo(){
    // JVM试图使用额最大内存量（单位是字节）
    System.out.println("最大内存量:" + Runtime.getRuntime().maxMemory() / 1024 / 1024 + "M");
    // 的JVM内存总量（单位是字节）
    System.out.println("目前初始内存量:" + Runtime.getRuntime().totalMemory() / 1024 / 1024 + "M");
    // 得到JVM中的空闲内存量（单位是字节）
    System.out.println("目前可用的内存量:" + Runtime.getRuntime().freeMemory() / 1024 / 1024 + "M");

}
