function weekDay (time) {
    let datelist = ['周日', '周一', '周二', '周三', '周四', '周五', '周六',]
    return datelist[new Date(time).getDay()];
}
weekDay('2023-04-02')
