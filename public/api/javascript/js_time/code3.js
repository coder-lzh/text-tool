/**
 * 给日期增加天数
 *  PS : addDay(new Date(),2)  给日期增加2天
 * @param date
 * @param days
 * @returns {*}
 */
function addDay(date,days) {
    date.setDate(date.getDate() + days)
    return date;
}
