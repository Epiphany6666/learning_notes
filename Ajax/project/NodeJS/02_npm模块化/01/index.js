/**
 * 目标：基于 CommonJS 标准语法，导入工具属性和方法使用
 */
// 导入
const obj = require('./utils')
console.log(obj);
const result = obj.arraySum([5,1,1,3])
console.log(result);