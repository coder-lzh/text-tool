import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegUtil {

    public static void main(String[] args) {
        System.out.println(isInteger("12"));
        System.out.println(isNumber("23"));
        System.out.println(isNumber("-1.2"));
        System.out.println(isNumber("44.2"));
    }

    /**
     * 正整数验证
     * @param str
     * @return
     */
    public static boolean isInteger(String str) {
        String pattern = "^[1-9]\\d*$";
        return str.matches(pattern);
    }

    /**
     * 正则表达式匹配正负小数以及整数
     * @param str
     * @return
     */
    public static boolean isNumber(String str) {
        String pattern = "^[\\+\\-]?[\\d]+(\\.[\\d]+)?$";
        return Pattern.matches(pattern, str);
    }
}