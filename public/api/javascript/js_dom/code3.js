// <div class="div">
//     <div class="tag-class">红色</div>
//     <div class="tag-class">蓝色</div>
//     <div class="tag-class">绿色</div>
// </div>


window.onload = function() {
    // 获取元素
    let elements = document.getElementsByClassName("tag-class");
    for (let i = 0; i < elements.length; i++) {
        // 添加点击事件
        elements[i].addEventListener("click", function(e) {
            alert("元素被点击了！");
        });
    }
};


// 或者
//
// // 添加点击事件
// element.onclick = function() {
//     alert("元素被点击了！");
// };
