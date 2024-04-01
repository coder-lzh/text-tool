let jsonEditorMenu =  document.getElementsByClassName("jsoneditor-menu")[0]
const copyNode = document.createElement("div");
copyNode.id = "copy"
copyNode.classList.add('customBtn');
copyNode.innerHTML = "复制"
//设置属性
copyNode.setAttribute('data-index', "1");
//绑定事件
copyNode.addEventListener('click', function(e) {
    let index = e.target.getAttribute('data-index')
    let id = e.target.id
});
//新增元素
jsonEditorMenu.appendChild(copyNode);
