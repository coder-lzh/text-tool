/**
 * 获取一周日期方法;  支持传递 字符串  和 date对象
 *  PS : getWeekDataList('2023-04-02')
 *       getWeekDataList(new Date())
 * @param data
 * @returns {[]}
 */
function getWeekDataList(data) {
    //根据日期获取本周周一~周日的年-月-日
    let weekList = [];
    let date = new Date(data);
    //判断本日期是否为周日，获取本周一日期
    if(date.getDay()=="0"){
        date.setDate(date.getDate() -6);
    }else {
        date.setDate(date.getDate() - date.getDay() + 1);
    }
    let myDate=date.getDate();
    let myMonth=date.getMonth() + 1;
    if(date.getDate()<10){
        myDate= '0'+ myDate;
    }
    if(date.getMonth() + 1<10){
        myMonth='0'+myMonth;
    }
    weekList.push(date.getFullYear() + "-" + myMonth+ "-" + myDate);
    // 获取周二以后日期
    for(let i=0;i<6;i++) {
        date.setDate(date.getDate() + 1);
        myDate=date.getDate();
        myMonth=date.getMonth() + 1;
        if(date.getDate()<10){
            myDate= '0'+ myDate;
        }
        if(date.getMonth() + 1<10){
            myMonth='0'+myMonth;
        }
        weekList.push(date.getFullYear() + "-" + myMonth+ "-" +myDate);
    }
    return weekList
}
