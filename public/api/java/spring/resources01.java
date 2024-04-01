import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

// ResourceLoader接口是Spring框架提供的用于加载各种资源的接口，包括classpath下的资源。在Spring Boot中，可以通过依赖注入ResourceLoader接口来获取resources目录下的文件。

@Component
public class YourComponent {
    private final ResourceLoader resourceLoader;
    public YourComponent(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }
    public void getResource() throws IOException {
        Resource resource = resourceLoader.getResource("classpath:your-file.txt");
        InputStream inputStream = resource.getInputStream();
        // 对文件进行操作，比如读取内容等
    }
}
