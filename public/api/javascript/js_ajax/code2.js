/**
 * post 请求 ，传递json参数
 */
function show() {
    let xhr = new XMLHttpRequest();
    xhr.open('POST', '/send', true);
    xhr.setRequestHeader("Content-Type", "application/json");
    let data = {
        key1: "value1",
        key2: "value2"
    };
    let jsonData = JSON.stringify(data);
    xhr.onreadystatechange = function() {
        if (xhr.readyState === 4 && xhr.status === 200) {
            console.log(xhr.responseText);
        }
    };
    xhr.send(jsonData);
}
