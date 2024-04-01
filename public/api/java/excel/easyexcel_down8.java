package com.example.bootdemo;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.listener.PageReadListener;

import java.io.File;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        EasyExcel.read(new File("C:\\Users\\liuzhw\\Desktop\\目标导入.xlsx"), new PageReadListener<ExcelDemo>(dataList -> {
            System.out.println(dataList);
        })).sheet().doRead();
    }
}