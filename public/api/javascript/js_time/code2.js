/**
 * 日期转时间戳  第一种方法
 *  PS  : date2timestamp_1(new Date())
 * @type {Date}
 */
function date2timestamp_1(date) {
    return Number(date);
}

/**
 * 日期转时间戳  第二种方法
 *  PS  : date2timestamp_2(new Date())
 * @type {Date}
 */
function date2timestamp_2(date) {
    return Date.parse(date);
}


//------------------------------ 时间戳转换成Date对象

// 实例化一个Date对象，将时间戳直接传入，注意一定是13位
let newDate = new Date(1403058804000)



// 第二种方法
let timestamp3 = 1403058804000;  //声明一个时间戳
let newDate = new Date();  //实例化一个Date对象
newDate.setTime(timestamp3); //设置Date对象的时间为时间戳的时间
