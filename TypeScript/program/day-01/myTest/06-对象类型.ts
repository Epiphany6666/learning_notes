let person: { name: String; age: number; sayHi(): void; greet(name: String): void } = {
  name: '刘老师',
  age: 18,
  sayHi() {},
  greet(name) {
    console.log(name);
    
  }
}

person.greet("jack")