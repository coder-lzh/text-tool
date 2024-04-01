import asyncio


"""
该函数执行时得到的是一个协程对象.
"""
async def func():
    print("我是函数")

"""
    1、得到协程对象
    2、asyncio来run

    asyncio.run(f)
    等同于
    event_loop = asyncio.get_event_loop()
    event_loop.run_until_complete(f)
"""

if __name__ == '__main__':  # 程序的入口
    f = func()
    asyncio.run(f)
