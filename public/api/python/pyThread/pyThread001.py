from threading import Thread

"""
    Thread 的简单使用
"""

def func():
    for i in range(10):
        print("func", i)


if __name__ == '__main__':
    t = Thread(target=func)
    t.start()
    for i in range(3):
        print("main", i)