(function flexible(window, document) {
  // 获取HTML
  var docEl = document.documentElement
  // 获取当前的dpr，判断是二倍图还是一倍的，PC端就是1，移动端就是2
  // 如果浏览器不识别，前面的就是undefined，浏览器就会当 1 来解析
  var dpr = window.devicePixelRatio || 1

  // adjust body font size
  function setBodyFontSize() {
    // 如果可以直接识别body，就把body改为12px，但如果还没加载完，就等整个dom加载完了再执行document.body
    if (document.body) {
      // font-size需要加单位
      document.body.style.fontSize = (12 * dpr) + 'px'
    } else {
      document.addEventListener('DOMContentLoaded', setBodyFontSize)
    }
  }
  setBodyFontSize();

  // 最核心的就下面几句话
  // set 1rem = viewWidth / 10
  function setRemUnit() {
    // 往上看（或者直接把鼠标放在docEl上，它就会告诉你它是啥类型，docEl就是HTML，简单来说就是整个窗口
    // 获取整个窗口的宽度，不包含边框，也不包含滚动条，以前使用的就是化成10等分，原因就在这
    var rem = docEl.clientWidth / 10
    docEl.style.fontSize = rem + 'px'
  }

  setRemUnit()

  //当屏幕尺寸发生变化时，就重新调用这个函数
  // reset rem unit on page resize
  window.addEventListener('resize', setRemUnit)


  //pageshow是为了兼容性，像火狐resize就会有问题
  window.addEventListener('pageshow', function (e) {
    if (e.persisted) {
      setRemUnit()
    }
  })

  // 下面的是为了处理1px的问题
  // 按照正常情况下，写了1px的边框在经济里面显示2px，看起来稍微有点粗，所以有些人喜欢写0.5px，0.5到真机变成1px了，但是现在都不去处理这1px了
  // detect 0.5px supports
  if (dpr >= 2) {
    var fakeBody = document.createElement('body')
    var testElement = document.createElement('div')
    testElement.style.border = '.5px solid transparent'
    fakeBody.appendChild(testElement)
    docEl.appendChild(fakeBody)
    if (testElement.offsetHeight === 1) {
      docEl.classList.add('hairlines')
    }
    docEl.removeChild(fakeBody)
  }
}(window, document))