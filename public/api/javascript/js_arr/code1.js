let arr = [
    {
        'id': '1',
        'name': 'img1',
        'imgUrl': './img1.jpg',
    },
    {
        'id': '2',
        'name':'./img2.jpg',
        'imgUrl': './img2.jpg',
    },
    {
        'id': '3',
        'name': 'img3',
        'imgUrl': './img3.jpg',
    }
];
let b = arr.map(x => {return x.imgUrl})

// ["./img1.jpg", "./img2.jpg", "./img3.jpg"]
