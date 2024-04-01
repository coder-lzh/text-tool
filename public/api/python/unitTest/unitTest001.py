import numpy as np
from unittest import TestCase
import requests

class TestNumpy(TestCase):

    def testReadFile(self):
        url = ""
        headers = {}
        response = requests.get(url, headers=headers, timeout=3)
        # 断言
        assert response.status_code == 200
        return response