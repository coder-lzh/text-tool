import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegUtil {

    public static void main(String[] args) {
        String url = "http://172.12.1.123/test.txt";
        String regex = "(\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})";
        System.out.println(getMatcher(regex,url));
    }

    /**
     * 提取匹配的数据
     * @param regex
     * @param source
     * @return
     */
    public static List getMatcher(String regex, String source) {
        List<String> result=new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(source);
        while (matcher.find()) {
            for (int i = 0; i < matcher.groupCount(); i++) {
                result.add(matcher.group(i+1));
            }
        }
        return result;
    }
}