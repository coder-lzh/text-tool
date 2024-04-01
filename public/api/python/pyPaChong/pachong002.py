import re

"""
 正则，给匹配的内容起名，group直接获取。用法就是 前面()前面加上   ?P<名字>
"""
x = "你好，这里是【公众号：干货食堂】"
pattern = "【(?P<name>.+)】"
m = re.search(pattern, x)
r = m.group("name")
print(r)
