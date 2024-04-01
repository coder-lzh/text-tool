package com.example.demo.easyexcel;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExcelDemo {
    //value表示表头名字
    @ExcelProperty(value = "编号")
    private Integer id;
    @ExcelProperty(value = "姓名")
    private String name;
    @ExcelProperty(value = "年龄")
    private Integer age;
    @ExcelIgnore//表示不显示在Excel表格里
    private String address;
}
