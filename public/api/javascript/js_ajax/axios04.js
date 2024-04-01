import qs from 'Qs'

// qs.stringify 是把一个参数对象格式化为一个字符串
let params = { c: 'b', a: 'd' };
qs.stringify(params)
// 结果是
'c=b&a=d'

// 排序-甚至可以对格式化后的参数进行排序：
qs.stringify(params, (a,b) => a.localeCompare(b))
// 结果是
'a=b&c=d'
