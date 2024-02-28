// 富文本编辑器
// 这个插件引入后，在全局暴露了一个wangEditor的属性，在这个基础上进行了对象的结构赋值，通过查看地下，是以函数的形式调用，所以它导出的是两个函数
// 通过读名字也就知道，这两个函数是用来创建编辑器函数，创建工具栏函数
const { createEditor, createToolbar } = window.wangEditor

// 定义了一个编辑器的配置对象
const editorConfig = {
    // placeholder：占位符提示文字
    placeholder: 'Type here...',
    // 这里看名字可以猜出来这个函数的作用，但如果猜不出来，就需要查看官方文档，或者可以直接打印内容
    // 编辑器变化时回调函数
    onChange(editor) {
      // 获取富文本内容
      const html = editor.getHtml()
      console.log('editor content', html)
      // 也可以同步到 <textarea>
      // 为了后续快速收集整个表单内容做铺垫
      document.querySelector('.publish-content').value = html
    }
}

// createEditor：真正创建编辑器
const editor = createEditor({
    // selector：选择器，告诉这个函数，把富文本编辑器创建在具体哪个标签的位置，这里使用的是id选择器
    selector: '#editor-container',
    html: '<p><br></p>',//这个在文档中可能搜不到，搜不到的时候就自己试，会发现它可以设置编辑器的默认内容
    config: editorConfig,//它把配置对象传到了这个函数中
    // 配置集成模式（default 全部） （simple 简洁）
    mode: 'default', // or 'simple'
})

// 工具栏配置对象，去官方文档中就能寻找修改配置的一些属性名，添入到代码里即可，这里默认采用全部的工具
const toolbarConfig = {}

// 创建工具栏
const toolbar = createToolbar({
    // 为指定的编辑器创建工具栏
    editor,
    // 工具栏创建的位置
    selector: '#toolbar-container',
    // 工具栏配置对象
    config: toolbarConfig,
    // 配置集成的模式
    mode: 'default', // or 'simple'
})