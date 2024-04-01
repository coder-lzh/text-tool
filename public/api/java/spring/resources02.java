
// ClassPathResource类是Spring框架提供的用于加载类路径下资源的类。在Spring Boot中，我们可以使用ClassPathResource类来获取resources目录下的文件

import org.springframework.core.io.ClassPathResource;

public void getResource() throws IOException {
    ClassPathResource resource = new ClassPathResource("your-file.txt");
    InputStream inputStream = resource.getInputStream();
    // 对文件进行操作，比如读取内容等
}
