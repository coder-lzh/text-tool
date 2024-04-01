import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class HttpClient {
    public static void main(String[] args) {
        String url = "http://example.com/api";
        String params = "param1=value1&param2=value2"; // 参数字符串

        try {
            // 构建完整的URL，包含参数
            String fullUrl = url + "?" + params;

            // 创建URL对象
            URL apiUrl = new URL(fullUrl);

            // 创建HttpURLConnection对象并设置请求属性
            HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();
            connection.setRequestMethod("GET");

            // 发起请求
            connection.connect();

            // 检查响应码
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // 读取响应流
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // 处理响应数据
                System.out.println("Response: " + response.toString());
            } else {
                System.out.println("Error: " + responseCode);
            }

            // 断开连接
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
