import asyncio


async def download(url, t):
    print("我要下载了")
    await asyncio.sleep(t)
    print("我下载完了")


async def main():
    # 假设已经有了一堆下载链接
    urls = [
        "http://www.baidu.com",
        "http://luoyonghao.com",
        "http://qiaofuhaoshuai.com"
    ]
    # 需要封装任务列表
    tasks = []
    for url in urls:
        # 创建任务
        task = asyncio.create_task(download(url, 3))
        # 把任务扔到列表, 为了统一处理
        tasks.append(task)

    # 统一等到协程任务执行完毕
    await asyncio.wait(tasks)

"""
    如果要执行多个协程任务的话，就要这样写  这种没有返回值
"""
if __name__ == '__main__':
    asyncio.run(main())

