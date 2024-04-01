"""
 @Author: 公众号：干货食堂
 @FileName: TestPo.py
 @DateTime: 2023/11/14 22:40
 @SoftWare: PyCharm
"""
from unittest import TestCase


class TestTxt(TestCase):
    """
           写文件  with 的好处是可以自动关流
    """
    def testWrite(self):
        print(0)
        # w=写 a=追加 r=读
        with open("data.csv", mode="w", encoding="utf-8") as f:
            for i in range(10):
                print(f"row:{i}")
                f.write(f"row:{i}\n")

    """
        读取文件
    """
    def testRead(self):
        with open("data.csv", mode="r", encoding="utf-8") as f:
            # print(f.read()) # 读取全部
            # print(f.readline()) # 读取第一条

            for i in f.readlines():
                print(i.strip('\n'))  # 去除换行

            # 两种写法一样
            for line in f:
                print(line.strip('\n'))  # 去除换行