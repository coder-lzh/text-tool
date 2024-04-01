
// ResourceUtils类是Spring框架提供的用于操作资源的实用工具类。在Spring Boot中，我们可以使用ResourceUtils.getFile()方法来获取resources目录下的文件

import org.springframework.util.ResourceUtils;

public void getResource() throws IOException {
    File file = ResourceUtils.getFile("classpath:your-file.txt");
    // 对文件进行操作，比如读取内容等
}
