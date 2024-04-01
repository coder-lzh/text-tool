import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLEncoder;

public class DownloadUtils {
    public static void download(ByteArrayOutputStream byteArrayOutputStream, HttpServletResponse response, String returnName) throws IOException {
        response.setContentType("application/octet-stream");
        returnName = URLEncoder.encode(returnName, "UTF-8");
        //加上就是下载 否则就是预览
        response.addHeader("Content-Disposition","attachment;filename="+new String(returnName.getBytes("ISO8859-1")));
        response.setContentLength(byteArrayOutputStream.size());
        response.addHeader("Content-Length", "" + byteArrayOutputStream.size());
        ServletOutputStream outputstream = response.getOutputStream();
        byteArrayOutputStream.writeTo(outputstream);
        byteArrayOutputStream.close();
        outputstream.flush();
    }

}
