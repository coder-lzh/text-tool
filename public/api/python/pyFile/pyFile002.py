from unittest import TestCase

import requests


class TestPy(TestCase):

    def testDownImg(self):
        with open("1.jpg", mode="wb") as f:
            resp = requests.get("https://img97.mm3.cc:7979/attach/2020-05-09/1588962603cBmd.jpg")
            f.write(resp.content)
