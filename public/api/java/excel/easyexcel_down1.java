package com.example.demo.easyexcel;

import com.alibaba.excel.EasyExcel;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class TestWrite {

    @Test
    public void write() {
        //表示Excel要存储的位置,这里我存在当前项目下
        String fileName = "D:\\home\\easyexcel.xlsx";
        // 这里 需要指定写用哪个class去写，然后写到第一个sheet，名字为模板 然后文件流会自动关闭

        List<ExcelDemo> data = new ArrayList<>();
        data.add(new ExcelDemo(01,"张三",18,"海南"));
        data.add(new ExcelDemo(02,"李四",19,"大理"));
        data.add(new ExcelDemo(03,"王五",20,"西藏"));
        EasyExcel.write(fileName, ExcelDemo.class).sheet("第一个表格").doWrite(data);
    }

    @Test
    public void read() {
        String fileName = "D:\\home\\easyexcel.xlsx";
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        EasyExcel.read(fileName, ExcelDemo.class, new DemoDataListener()).sheet().doRead();
    }
}
