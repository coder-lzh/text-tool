let arr = [{
    username: '张三',
    orderId: '301',
}, {
    username: '王五',
    orderId: '003',
}, {
    username: '卫庄',
    orderId: '111',

}, {
    username: '卫庄',
    orderId: '110',

}, {
    username: '李四',
    orderId: '478',
}]

/**
 * 现根据username 从小到大排序 然后再根据orderId 从小到大 排序
 */
arr.sort((a, b) => {
    let l1 = a.username.localeCompare(b.username)
    if ( l1 != 0){
        return l1
    }
    let l2 = a.orderId.localeCompare(b.orderId)
    return l2
})
console.log(arr)