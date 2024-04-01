// =================================================ES5写法
// 假设你的对象数组如下所示
// 假设你的对象数组如下所示
var objArray = [
    { field1: 'value1', field2: 'valueA' },
    { field1: 'value2', field2: 'valueB' },
    { field1: 'value3', field2: 'valueA' },
    // ...
];

// 要过滤的字段值
var targetFieldValue = 'value2';

// 使用 filter 方法过滤对象数组
var filteredObjects = objArray.filter(function(obj) {
    return obj.field1 === targetFieldValue;
});

// 输出符合条件的对象数组
console.log(filteredObjects);


// =================================================ES6写法

var filteredObjects = objArray.filter(obj => obj.field1 === targetFieldValue);

