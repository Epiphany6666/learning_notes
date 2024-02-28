const fs = require('fs')
console.log(__dirname)

const path = require('path')
const pathStr = path.join(__dirname, '..', 'test.txt')
console.log(pathStr);
fs.readFile(pathStr, (err, data) => {
  if (err) console.log(err)
  else console.log(data.toString());
})