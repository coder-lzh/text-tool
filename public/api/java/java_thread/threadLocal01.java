
/**
 * 获取当前环境工具类
 * 公众号：干货食堂
 */
public class CurrentEnvUtil {
    private static final ThreadLocal<String> envHolder = new ThreadLocal<String>();

    public static void add(String env) {
        envHolder.set(env);
    }
    public static String get() {
        return envHolder.get();
    }
    public static void remove() {
        envHolder.remove();
    }
}
