from unittest import TestCase
from lxml import etree

import requests


class TestPy(TestCase):

    def testXpath(self):
        url = "http://www.66ip.cn/"
        resp = requests.get(url)
        resp.encoding = 'gbk'
        source = resp.text
        tree = etree.HTML(source)
        trs = tree.xpath("//div[@id='main']//table//tr[position()>1]")
        for tr in trs:
            print(tr.xpath("./td/text()"))
