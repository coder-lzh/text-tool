from threading import Thread

"""
    Thread 的简单使用2  继承Thread类
"""
class MyThread(Thread):
    # 重写run方法
    def run(self):
        for i in range(10):
            print("func", i)


if __name__ == '__main__':
    t = MyThread()
    t.start()
    for i in range(3):
        print("main", i)