from multiprocessing import Process


def func(name):
    for i in range(1000):
        print(name, i)


if __name__ == '__main__':
    p1 = Process(target=func, args=("进程1",))
    p2 = Process(target=func, args=("进程2",))
    p1.start()
    p2.start()


