from multiprocessing import Process


class MyProcess(Process):
    def run(self):
        for i in range(1000):
            print("MyProcess", i)


if __name__ == '__main__':
    t = MyProcess()
    t.start()
    for i in range(1000):
        print("main", i)

