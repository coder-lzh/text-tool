// ================================================== 普通数组
var colors = ["red", "green", "blue", "yellow"];
var index = colors.indexOf("blue");
console.log(index); // 2


// ================================================== 对象数组 ES5写法
// 假设你的对象数组如下所示
var objArray = [
    { fieldName: 'value1', otherField: 'otherValue1' },
    { fieldName: 'value2', otherField: 'otherValue2' },
    { fieldName: 'value3', otherField: 'otherValue3' },
    // ...
];

// 要查找的字段的值
var targetFieldName = 'value2';

// 使用 findIndex 方法查找目标对象的索引
var targetIndex = objArray.findIndex(function(obj) {
    return obj.fieldName === targetFieldName;
});

// 输出找到的索引位置
console.log("目标对象的索引位置是：" + targetIndex);

// =================================================ES6写法
var targetIndex = objArray.findIndex(obj => obj.fieldName === targetFieldName);
