// 创建一个猪 构造函数 
function Pig(uname, age) {
    this.uname = uname // 这里的this指的是函数的调用者，即我们创建的对象
    this.age = age // 右边的age是形参，左边的age是对象属性
}

// console.log(new Pig('佩奇', 6))
// console.log(new Pig('乔治', 3))
const p = new Pig('佩奇', 6)
console.log(p) // Pig {uname: '佩奇', age: 6}

//  const pepa = { uname: '佩奇', age: 6 }

// const obj = new Object()