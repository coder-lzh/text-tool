from urllib import parse

"""
连接两个参数的url, 将第二个参数中缺的部分用第一个参数的补齐,如果第二个有完整的路径，则以第二个为主。
"""
print(parse.urljoin('http://www.baidu.com', '?category=2#comment'))
# http://www.baidu.com?category=2#comment
print(parse.urljoin("http://www.google.com/1/aaa.html", "bbbb.html"))
# 'http://www.google.com/1/bbbb.html'
print(parse.urljoin("http://www.google.com/1/aaa.html", "2/bbbb.html"))
# 'http://www.google.com/1/2/bbbb.html'
print(parse.urljoin("http://www.google.com/1/aaa.html", "/2/bbbb.html"))
# 'http://www.google.com/2/bbbb.html'
print(parse.urljoin("http://www.google.com/1/aaa.html", "http://www.google.com/3/ccc.html"))
# 'http://www.google.com/3/ccc.html'
print(parse.urljoin("http://www.google.com/1/aaa.html", "http://www.google.com/ccc.html"))
# 'http://www.google.com/ccc.html'
print(parse.urljoin("http://www.google.com/1/aaa.html", "javascript:void(0)"))
# 'javascript:void(0)'
