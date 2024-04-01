function chunkArray(array, chunkSize) {
    const chunkedArray = [];
    for (let i = 0; i < array.length; i += chunkSize) {
        const chunk = array.slice(i, i + chunkSize);
        chunkedArray.push(chunk);
    }
    return chunkedArray;
}

// 测试
const myArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
const chunkedArray = chunkArray(myArray, 3);
console.log(chunkedArray);