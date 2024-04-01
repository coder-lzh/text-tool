config.map.code=test
config.map.name[0]=star
config.map.name[1]=star1
config.map.name[2]=star2
config.map.obj.key=name
config.map.obj.value=liuzhw
config.map.listMap[0].appId=1234
config.map.listMap[0].token=2234
config.map.listMap[1].appId=3234
config.map.listMap[1].token=4234



import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix="config.map")
//可以省略
@PropertySource("classpath:application.properties")
@Data
public class CustomConfig {
    private String code;
    private List<String> name;
    private Map<String,String> obj;
    private List<Map<String,String>> listMap;
}
