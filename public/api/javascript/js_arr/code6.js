// 1.利用set去重
// Set是es6新增的数据结构，似于数组，但它的一大特性就是所有元素都是唯一的，没有重复的值，我们一般称为集合
// Array.from()就是将一个类数组对象或者可遍历对象转换成一个真正的数组，也是ES6的新增方法
let list = ['你是最棒的', 8, 8, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 1, 2, 3, 4, 5, 6, 7, 8, '你是最棒的',]
let newList = Array.from(new Set(list))
console.log('newList', newList);


// 2、利用 filter() 去重
// item是当前元素的值，index是当前元素的索引值。indexOf() 方法可返回某个指定的字符串值在字符串中首次出现的位置
let arr = ['apple','apps','pear','apple','orange','apps'];

console.log(arr)
let newArr = arr.filter(function(item,index){
    return arr.indexOf(item) === index;  // 因为indexOf 只能查找到第一个
});
console.log(newArr);
