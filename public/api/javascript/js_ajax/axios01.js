import axios from 'axios';

// 发送 GET 请求，并携带参数
axios.get('/api/data', {
    params: {
        param1: 'value1',
        param2: 'value2'
    }
})
    .then(response => {
        // 处理响应数据
        console.log(response.data);
    })
    .catch(error => {
        // 处理错误
        console.error(error);
    });
