import axios from 'axios';

// 发送 POST 请求，并携带参数  Axios 会自动将该对象转换为 JSON 格式
axios.post('/api/data', {
    param1: 'value1',
    param2: 'value2'
})
    .then(response => {
        // 处理响应数据
        console.log(response.data);
    })
    .catch(error => {
        // 处理错误
        console.error(error);
    });
