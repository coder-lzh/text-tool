// =================================================ES5写法
// 假设你的对象数组如下所示
var objArray = [
    { keyField: 'key1', valueField: 'value1' },
    { keyField: 'key2', valueField: 'value2' },
    { keyField: 'key3', valueField: 'value3' },
    // ...
];

// 使用 reduce 方法将对象数组转换成 Map
var mapFromObjArray = objArray.reduce(function(map, obj) {
    map.set(obj.keyField, obj.valueField);
    return map;
}, new Map());

// 输出转换后的 Map 结构
console.log(mapFromObjArray);

// =================================================ES6写法

var mapFromObjArray = objArray.reduce((map, obj) => {
    map.set(obj.keyField, obj.valueField);
    return map;
}, new Map());
