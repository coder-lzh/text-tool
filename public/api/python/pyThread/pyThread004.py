import time
from concurrent.futures import ThreadPoolExecutor


def func(name):
    time.sleep(2)
    return name


def do_callback(res):
    print(res.result())


"""
    submit 提交，经常用这个
"""
if __name__ == '__main__':
    with ThreadPoolExecutor(10) as t:
        names = ["线程1", "线程2", "线程3"]
        for name in names:
            # 方案一, 添加回调
            t.submit(func, name).add_done_callback(do_callback)

"""
    map 分发，结果是有顺序的，一般很少用
"""
if __name__ == '__main__':
    start = time.time()
    with ThreadPoolExecutor(10) as t:
        names = [5, 2, 3]
        # 方案二, 直接用map进行任务分发. 最后统一返回结果
        results = t.map(func, names, )  # 结果是按照你传递的顺序来执行的, 代价就是如果第一个没结束. 后面就都没结果
        for r in results:
            print("result", r)
    print(time.time() - start)
