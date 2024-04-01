import org.apache.commons.lang3.RandomStringUtils;


/**
 * 公众号：干货食堂
*   <dependency>
*      <groupId>org.apache.commons</groupId>
*      <artifactId>commons-lang3</artifactId>
*      <version>3.3.2</version>
*  </dependency>
 */
public class Test {

    public static void main(String[] args) {
        //随机生成6位字符串  字母+数字
        String num = RandomStringUtils.randomAlphanumeric(6);

        //生成n位大写字母+数字
        String num2 = RandomStringUtils.randomAlphanumeric(8).toUpperCase();

        //生成n位小写字母+数字
        String num3 = RandomStringUtils.randomAlphanumeric(8).toLowerCase();

    }
}
