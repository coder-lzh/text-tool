let url = "https://tool.share888.top?name=公众号：干货食堂&age=27"
/**
 * 解析url参数
 * @param url
 * @returns {any}
 */
function deserializeUrl(url) {
    return Object.fromEntries(new URL(url).searchParams)
}

// 测试
console.log(deserializeUrl(url))
// {
//     "name": "公众号：干货食堂",
//     "age": 27
// }
