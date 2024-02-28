/**
 * 目标：基于 Web 服务，开发提供网页资源的功能
 * 步骤：
 *  1. 基于 http 模块，创建 Web 服务
 *  2. 使用 req.url 获取请求资源路径，并读取 index.html 里字符串内容返回给请求方
 *  3. 其他路径，暂时返回不存在提示
 *  4. 运行 Web 服务，用浏览器发起请求
 */
const http = require('http')
const server = http.createServer()
server.on('request', (req, res) => {
  if (req.url === '/index.html') {
    const fs = require('fs')
    const path = require('path')
    fs.readFile(path.join(__dirname, 'index.html'), (err, data) => {
      if (err) console.log(err)
      else {
        const htmlStr = data.toString()
        const resultStr = htmlStr.replace(/[\r\n]/g, '')
        fs.writeFile(path.join(__dirname, 'dist/index.html'), resultStr, (err) => {
          if (err) console.log(err)
          else {
            console.log('压缩成功');
          }
        })
      }
    })

    fs.readFile(path.join(__dirname, 'dist/index.html'), (err, data) => {
      if (err) console.log(err)
      else {
        res.setHeader('Context-type', 'text/html;charset=utf-8')
        res.end(data.toString())
      }
    })
  } else {
    res.setHeader('Context-type', 'text/html;charset=utf-8')
    res.end('该资源路径不存在')
  }
})

server.listen(3000, () => {
  console.log('Web 服务启动成功了');
})