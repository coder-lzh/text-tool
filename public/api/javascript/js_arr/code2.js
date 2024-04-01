const variable = "Hello";
console.log(typeof variable); // 输出 "string"

const variable = { key: "value" };
console.log(typeof variable); // 输出 "object"

const variable = [1, 2, 3];
console.log(typeof variable); // 输出 "object"


// 注意：typeof 操作符对于数组返回的是 "object"，这可能会导致歧义。
// 使用Array.isArray函数： Array.isArray 函数用于检查一个变量是否为数组。
const variable = [1, 2, 3];
if (Array.isArray(variable)) {
    console.log("是数组");
} else {
    console.log("不是数组");
}

// 使用instanceof操作符： instanceof 操作符可以检查一个变量是否是特定构造函数的实例。
const variable = [1, 2, 3];
if (variable instanceof Array) {
    console.log("是数组");
} else {
    console.log("不是数组");
}
