from concurrent.futures import ThreadPoolExecutor
# 线程池
def fn(name):
    for i in range(10):
        print(name, i)


if __name__ == '__main__':
    with ThreadPoolExecutor(10) as t:
        for i in range(2):
            t.submit(fn, name=f"线程{i}")