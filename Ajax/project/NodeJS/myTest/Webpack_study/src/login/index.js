/**
 * 目标5：打包 css 代码
 *  5.1 准备 css 代码，并引入到 js 中
 *  5.2 下载 css-loader 和 style-loader 本地软件包
 *  5.3 配置 webpack.config.js 让 Webpack 拥有该加载器功能
 *  5.4 打包后观察效果
 */
// 5.1 准备 css 代码，并引入到 js 中
// 此时并不需要加from去接收，这是因为我们只是想让CSS代码被引入过来，让Webpack处理就行了，接收CSS对象在下面用不上，所以我们可以省略变量和from的书写，直接引入就行了
import 'bootstrap/dist/css/bootstrap.min.css'
import './index.css'
import { checkPhone, checkCode } from '../utils/check.js'
import './index.less'
import imgObj from './assets/logo.png'
const theImg = document.createElement('img')
theImg.src = imgObj
console.log(imgObj);
document.querySelector('.login-wrap').appendChild(theImg)
console.log(checkPhone('13900002020'))
console.log(checkCode('123123123123'))