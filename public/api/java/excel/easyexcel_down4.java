import com.alibaba.excel.EasyExcel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: easyexcel
 * @description:
 * @author: liuzhw
 * @create: 2023-05-03 16:20
 **/
@Controller
public class UploadController {
    /**
     * 下载导出
     */
    @GetMapping("download")
    public void downloadFailedUsingJson(HttpServletResponse response) throws IOException {
        // 这里需要设置不关闭流
        List<ExcelDemo> data = new ArrayList<>();
        data.add(new ExcelDemo(01,"张三",18,"海南"));
        data.add(new ExcelDemo(02,"李四",19,"大理"));
        data.add(new ExcelDemo(03,"王五",20,"西藏"));

        //1.创建字节流
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        //2、excel写入字节流
        EasyExcel.write(os, ExcelDemo.class).autoCloseStream(Boolean.FALSE).sheet("sheet01").doWrite(data);
        //3、下载导出
        DownloadUtils.download(os,response,"人事报表.xlsx");
    }

    /**
     * 读取excel
     */
    @GetMapping("read")
    public void read(MultipartFile file) throws IOException{
        //1 获取文件输入流
        InputStream inputStream = file.getInputStream();
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        EasyExcel.read(inputStream, ExcelDemo.class, new DemoDataListener()).sheet().doRead();
    }
}
