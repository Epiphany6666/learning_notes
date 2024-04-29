# day24 集合（Map&可变参数&集合工具类）

# 2.双列集合的特点

## 一、介绍

单列集合：在添加数据的时候，每次只能添加一个元素，例如现在我可以往集合中添加一些商品的名字，一次只添加一个，这个就是单列集合。

<img src="./assets/image-20240428083447102.png" alt="image-20240428083447102" style="zoom:50%;" />

双列集合：在添加数据的时候，每次添加的是 **一对数据** ，例如每次都往集合中添加 `商品的名字和对应的价格`。

<img src="./assets/image-20240428083459357.png" alt="image-20240428083459357" style="zoom:50%;" />

在这些元素中，左边的这一列称之为 `键`，右边的这一列我们称之为 `值`。

其中键是唯一的，不可以重复；值是不唯一的，可以重复。

<img src="./assets/image-20240428083846958.png" alt="image-20240428083846958" style="zoom:67%;" />

键跟值之间是一一对应的关系，这就表示每个键只能对应自己的值。

<img src="./assets/image-20240428084006834.png" alt="image-20240428084006834" style="zoom:67%;" />

其中，一个键和值，这个整体我们称之为：键值对 / 键值对对象，在Java中也叫做 `Entry对象`。

因此右边的集合中，有三个 `Entry对象`。

<img src="./assets/image-20240428084140518.png" alt="image-20240428084140518" style="zoom:50%;" />

----

## 二、双列集合的特点

1、双列集合一次需要添加一对数据，分别为键和值。

2、键不能重复，值可以重复。

3、键和值是一一对应的关系，每一个键只能找到自己对应的值

4、在Java中，键 + 值这个整体，我们称之为 `键值对` 或者 `键值对对象`，在Java中叫做 `Entry对象`。



----

# 3.Map集合常用的API

## 一、引入

先来看一下双列集合的体系结构。

在双列集合中，`Map` 是它最顶级的接口，在 `Map集合` 中定义了双列集合所有的共性方法，因此我们只有把它学会了后，下面的这三个实现类，就非常的轻松了，也没有什么额外的新的方法需要学习了，这就是成体系学习的好处。

<img src="./assets/image-20240428084622413.png" alt="image-20240428084622413" style="zoom:50%;" />

---

## 二、Map的常见API

Map是双列集合的顶层接口，它的功能是所有双列集合都可以继承使用的。

在 `Map集合` 中有以下方法

| 方法名                                | 说明                                 |
| ------------------------------------- | ------------------------------------ |
| `V put(K key,V value)`                | 添加元素                             |
| `V remove(Object key)`                | 根据键删除键值对元素                 |
| `void clear()`                        | 移除所有的键值对元素                 |
| `boolean containsKey(Object key)`     | 判断集合是否包含指定的键             |
| `boolean containsValue(Object value)` | 判断集合是否包含指定的值             |
| `boolean isEmpty()`                   | 判断集合是否为空                     |
| `int size()`                          | 集合的长度，也就是集合中键值对的个数 |

---

## 三、代码实现

创建 `Map集合的对象` 的时候需要注意，`Map` 是一个接口，并且后面有泛型。

既然它是一个接口，那么我们就不能直接创建它的对象，而是需要创建它实现类的对象。

既然 `Map` 中可以存一对元素，一对就是 `键与值`，因此泛型我们也得写两个。

前面的 `K` 表示 `Key`，即键的类型；后面的 `V` 表示 `Value`，即值的类型。

<img src="./assets/image-20240428085352972.png" alt="image-20240428085352972" style="zoom:67%;" />

现在由于是要学习 `Map集合` 里面的方法，所以才使用多态的这种方式来创建对象。

~~~java
Map<String, String> m = new HashMap<>();
~~~

----

### 1）  添加元素

方法的形参就有两个值：`key 和 value`。

`put()` 其实有两个左右：1、添加；2、覆盖

在添加数据的时候，如果键不存在，那么直接把键值对对象添加到map集合当中，方法返回null。

在添加数据的时候，如果键是存在的，那么会把原有的键值对对象覆盖，会把被覆盖的值进行返回。

<img src="./assets/image-20240428090100253.png" alt="image-20240428090100253" style="zoom:67%;" />

~~~java
V put(K key,V value)
~~~

~~~java
m.put("郭靖", "黄蓉");
m.put("韦小宝","沐剑屏");
m.put("尹志平","小龙女");
String value2 = m.put("韦小宝", "双儿");
System.out.println(value2); // 沐剑屏
~~~

----

### 2）根据键删除键值对元素

返回值 `V`，就是 `Value`。

即：方法会根据键删除键值对元素，并把值进行返回。

~~~java
V remove(Object key)
~~~

代码示例

~~~java
String result = m.remove("郭靖");
System.out.println(result); // 黄蓉
~~~

---

### 3）移除所有的键值对元素

~~~java
void clear()
~~~

可以发现，`clear()` 一旦执行完毕后，集合里面什么都没有了

~~~java
m.clear();
System.out.println(m); // {}
~~~

----

### 4）判断集合是否包含指定的键

方法有一个 `boolean` 的返回值，如果包含返回 `true`，如果不包含返回 `false`

~~~java
boolean containsKey(Object key)
~~~

代码示例

~~~java
boolean keyResult = m.containsKey("郭靖");
System.out.println(keyResult); // true
~~~

----

### 5）判断集合是否包含指定的值

方法有一个 `boolean` 的返回值，如果包含返回 `true`，如果不包含返回 `false`

~~~java
boolean containsValue(Object value)
~~~

代码示例

~~~java
boolean valueResult = m.containsValue("小龙女2");
System.out.println(valueResult); // false
~~~

----

### 6）判断集合是否为空

~~~java
boolean isEmpty()
~~~

代码示例

~~~java
boolean result = m.isEmpty();
System.out.println(result);
~~~

----

### 7）集合的长度，也就是集合中键值对的个数

~~~java
int size()
~~~

代码示例

~~~java
int size = m.size();
System.out.println(size);
~~~

----

# 4.`Map` 的遍历方式

`Map集合` 一共有三种遍历方式

1、键找值

2、一次获取所有的键值对对象

3、Lambda表达式

----

## 一、键找值

~~~java
//1.创建Map集合的对象
Map<String,String> map = new HashMap<>();

//2.添加元素
map.put("尹志平","小龙女");
map.put("郭靖","穆念慈");
map.put("欧阳克","黄蓉");

//3.通过键找值

//3.1获取所有的键，把这些键放到一个单列集合当中
//keySet 可以理解为：将Map集合的key放到一个Set集合中
Set<String> keys = map.keySet();
//3.2遍历单列集合，得到每一个键
for (String key : keys) {
    //System.out.println(key);
    //3.3 利用map集合中的键获取对应的值，通过get方法
    String value = map.get(key);
    System.out.println(key + " = " + value);
}
~~~

----

## 二、一次获取所有的键值对对象

在Java中，键 + 值这个整体，我们称之为 `键值对` 或者 `键值对对象`，在Java中叫做 `Entry对象`。

先复制粘贴基础代码

~~~java
//1.创建Map集合的对象
Map<String, String> map = new HashMap<>();

//2.添加元素
//键：人物的外号
//值：人物的名字
map.put("标枪选手", "马超");
map.put("人物挂件", "明世隐");
map.put("御龙骑士", "尹志平");
~~~

Map集合的第二种遍历方式，这种方式是通过键值对对象进行遍历。

通过一个方法获取所有的键值对对象，返回一个Set集合，在这个集合里面装的就是所有的键值对对象。

调用的是 `Map集合` 中的 `entrySet()`，`entry`：键值对对象。整个方法的理解：获取所有的键值对对象，将它们全部放到一个 `Set集合` 中，因此方法就会返回一个 `Set集合`。

此时 `Set集合` 里面装的就是键值对对象，因此 `Set集合` 里面的泛型就是 `Entry`，但是 `Entry` 是键值对对象，因此 `Entry` 里面也有两个泛型：`键和值`，这种情况叫做 `泛型的嵌套`。

但是在写代码的时候泛型嵌套不需要自己写，IDEA会帮我们自动生成：<kbd>ctrl + alt + V</kbd>。

`Set` 中装的是 `Entry对象`，在 `Entry` 里面装的是键和值。

![image-20240428095236571](./assets/image-20240428095236571.png)

~~~java
Set<Map.Entry<String, String>> entries = map.entrySet();
~~~

选中 `Entry` 跟进。可以发现 `Entry` 是 `Map接口` 中的内部接口。

因此我们在调用内部类型的时候，需要用 `外部接口.内部接口`

<img src="./assets/image-20240428095423979.png" alt="image-20240428095423979" style="zoom:57%;" />

但是有的资料并没有写 `Map.`，那么此时就需要对 `Entry` 进行导包，那么下面就可以直接使用 `Entry` 了。

~~~java
import java.util.Map.Entry;
Set<Entry<String, String>> entries = map.entrySet();
~~~

接下来遍历`entries`这个集合，去得到里面的每一个键值对对象

~~~java
//这里的entry变量就依次表示一个键值对对象
for (Map.Entry<String, String> entry : entries) {
    //3.3 利用entry调用get方法获取键和值
    String key = entry.getKey();
    String value = entry.getValue();
    System.out.println(key + "=" + value);
}
~~~

----

## 三、Lambda表达式

在使用 `Lambda表达式` 进行遍历的时候，会使用到 `Map集合` 中的一个方法：`forEach()`。

![image-20240428100340095](./assets/image-20240428100340095.png)

基础代码直接复制粘贴。

~~~java
//1.创建Map集合的对象
Map<String,String> map = new HashMap<>();

//2.添加元素
//键：人物的名字
//值：名人名言
map.put("鲁迅","这句话是我说的");
map.put("曹操","不可能绝对不可能");
map.put("刘备","接着奏乐接着舞");
map.put("柯镇恶","看我眼色行事");
~~~

利用lambda表达式进行遍历，需要调用 `Map` 里面的 `forEach()`，跟进 `forEach()`。

<img src="./assets/image-20240428100857790.png" alt="image-20240428100857790" style="zoom:50%;" />

方法里面需要传入 `BiConsumer`，继续跟进 `BiConsumer`。

可以发现 `BiConsumer` 是一个接口，并且接口上面有 `@FunctionalInterface`，表示它是一个函数式接口，因此我们可以传递 `Lambda表达式`。

<img src="./assets/image-20240428100929800.png" alt="image-20240428100929800" style="zoom:67%;" />

我们先试用匿名内部类的方式来进行遍历

~~~java
map.forEach(new BiConsumer<String, String>() {
    @Override
    // 形参一：键；形参二：值
    public void accept(String key, String value) {
        System.out.println(key + "=" + value);
    }
});
~~~

下面改写成 `Lambda表达式`

~~~java
map.forEach((key, value)-> System.out.println(key + "=" + value));
~~~

---

接下来我们查看一下 `forEach()` 的底层源码，选中 `forEach()` <kbd>ctrl + b</kbd> 跟进。

先通过 `增强for键值对` 进行遍历，取出键和值，然后再去调用 `accept()`，这个方法就是我们在匿名内部类中重写的 `accept()`，因此第一个参数就是 `键`，第二个参数就是 `值`。

![image-20240428102035107](./assets/image-20240428102035107.png)



----

# 7.`HashMap` 基本的使用

`HashMap` 是 `Map体系` 中最为常用的一种集合，在 `HashMap` 中我们不需要学习额外新的方法，直接使用 `Map` 里面的方法就行了。

<img src="./assets/image-20240428102536023.png" alt="image-20240428102536023" style="zoom:47%;" />

因此本节主要讲解的是 `HashMap` 本身的特点就可以直接开始写练习了。

## 一、`HashMap` 的特点

1、`HashMap` 是 `Map` 里面的一个实现类。

2、它里面没有额外需要学习的特有方法，直接使用 `Map` 里面的方法就可以了。

3、所有 `Map集合` 的特点都是由**键**决定的：无序、不重复、无索引。

- `无序`：存和取的顺序有可能是不一样的
- `不重复`：键是不能重复的
- `无索引`：不能通过索引获取里面的元素

4、`HashMap` 跟 `HashSet` 底层原理是一模一样的，都是哈希表结构。

哈希表结构：`数组 + 链表`，在JDK8的时候为了提高它的性能，所以又在里面加上了 `红黑树`

---

## 二、`HashMap` 的底层原理

当我们创建了一个 `HashMap` 对象的时候，在底层它首先还是会创建一个长度为16，默认加载因子为0.75的数组。

![image-20240428103112856](./assets/image-20240428103112856.png)

再利用 `put()` 就可以添加数据了。

`put()` 的底层首先会创建一个 `Entry对象`，`Entry对象` 里面记录的就是要添加的 `键和值`。

然后再利用键计算出键的哈希值，注意跟值无关。

然后再计算出在数组中应存入的索引。

![image-20240428103404233](./assets/image-20240428103404233.png)

如果该位置为 `null`，直接添加即可；如果不为 `null`，跟 `HashSet` 一样，会调用 `equals()` 比较 `键` 的属性值。

接下来就和 `HashSet` 有点不一样了。

如果键里面的数据是一样的，它就会覆盖原有的 `Entry对象`，因此这就是 `put()` 隐含的覆盖功能。

<img src="./assets/image-20240428103725013.png" alt="image-20240428103725013" style="zoom:67%;" />

但如果比较完后 `键` 不一样呢？它就会添加新的 `Entry对象`。

在JDK8以前，新元素会添加到数组中，原先的会挂载在下面形成一条链表。

<img src="./assets/image-20240428103943137.png" alt="image-20240428103943137" style="zoom:67%;" />

但是在JDK8的时候就没有那么复杂了，新的元素会直接挂在老元素的下面形成链表。

<img src="./assets/image-20240428104141153.png" alt="image-20240428104141153" style="zoom:67%;" />

额外在JDK8的时候还有一个特点，为了提高性能，当 `链表长度超过8，而且数组长度 >= 64`，链表就会自动转成 `红黑树`

<img src="./assets/image-20240428104351738.png" alt="image-20240428104351738" style="zoom:67%;" />

----

## 四、总结

1、`HashMap` 底层是哈希表结构

2、它也是保证 `hashCode()` 和 `equals()` 来保证**键的唯一**。

3、如果键存储的是自定义对象，需要重写 `hashCode()` 和 `equals()`

若干值存储自定义对象，就不需要重写 `hashCode()` 和 `equals()`



----

# 8.`HashMap` 练习一：存储自定义对象

案例需求

- 创建一个HashMap集合，键是学生对象(Student)，值是居住地 (String)。存储多个元素，并遍历。
- 要求保证键的唯一性：如果学生对象的成员变量值相同，我们就认为是同一个对象

**Student.java**

~~~java
public class Student {
    //姓名
    private String name;
    //年龄
    private int age;

    // 无参构造、有参构造、get、set方法
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student2 = (Student2) o;
        return age == student2.age && Objects.equals(name, student2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
~~~

**测试类**

~~~java
//1.创建HashMap的对象
HashMap<Student,String> hm = new HashMap<>();

//2.创建三个学生对象
Student s1 = new Student("zhangsan",23);
Student s2 = new Student("lisi",24);
Student s3 = new Student("wangwu",25);
Student s4 = new Student("wangwu",25);

//3.添加元素
hm.put(s1,"江苏");
hm.put(s2,"浙江");
hm.put(s3,"福建");
hm.put(s4,"山东");

//4.遍历集合
Set<Student> keys = hm.keySet();
for (Student key : keys) {
    String value = hm.get(key);
    System.out.println(key + "=" + value);
}

System.out.println("--------------------------");

Set<Map.Entry<Student, String>> entries = hm.entrySet();
for (Map.Entry<Student, String> entry : entries) {
    Student key = entry.getKey();
    String value = entry.getValue();
    System.out.println(key + "=" + value);
}

System.out.println("--------------------------");

hm.forEach((student, s)-> System.out.println(student + "=" +  s));
~~~



----

# 9.`HashMap` 练习二：利用 `Map集合` 进行统计

```
某个班级80名学生，现在需要组成秋游活动，
班长提供了四个景点依次是（A、B、C、D）,
每个学生只能选择一个景点，请统计出最终哪个景点想去的人数最多。
```

**测试类**

~~~java
//1.需要先让同学们投票
//定义一个数组，存储4个景点
String[] arr = {"A","B","C","D"};
//利用随机数模拟80个同学的投票，并把投票的结果存储起来
ArrayList<String> list = new ArrayList<>();
Random r = new Random();
for (int i = 0; i < 80; i++) {
    int index = r.nextInt(arr.length);
    list.add(arr[index]);
}
//2.如果要统计的东西比较多，不方便使用计数器思想
//我们可以定义map集合，利用集合进行统计。
HashMap<String,Integer> hm = new HashMap<>();
for (String name : list) {
    //判断当前的景点在map集合当中是否存在
    if(hm.containsKey(name)){
        //存在
        //先获取当前景点已经被投票的次数
        int count = hm.get(name);
        //表示当前景点又被投了一次
        count++;
        //把新的次数再次添加到集合当中
        hm.put(name,count);
    }else{
        //不存在
        hm.put(name,1);
    }
}

System.out.println(hm);

//3.求最大值
//这里不能以ABCD任何一个景点的投票次数为初始值，因为80次投票中可能一次都没有投中这个景点，那么这个景点就不在Map集合中，因此应该为 0 作为参照物。
int max = 0;
Set<Map.Entry<String, Integer>> entries = hm.entrySet();
for (Map.Entry<String, Integer> entry : entries) {
    int count = entry.getValue();
    if(count > max){
        max = count;
    }
}
System.out.println(max);
//4.判断哪个景点的次数跟最大值一样，如果一样，打印出来
for (Map.Entry<String, Integer> entry : entries) {
    int count = entry.getValue();
    if(count == max){
        System.out.println(entry.getKey());
    }
}
~~~



----

# 10.LinkedHashMap

`LinkedHashMap` 在 `Map集合` 中的辈分比较低，它的父类就是 `HashMap`，因此我们同样的也不需要学习额外的新的方法，直接使用 `Map` 里面的方法就行了。

<img src="./assets/image-20240428112342161.png" alt="image-20240428112342161" style="zoom:37%;" />

## 一、特点

由键决定：有序、不重复、无索引。

其中 `不重复、无索引` 跟它的父类 `HashMap` 是一样的。

但是这里的有序指的是：保证存储和取出的元素顺序一致。

它的实现原理跟前面的 `LinkedHashSet` 是一样的。

`LinkedHashMap` 底层数据结构是哈希表，只是在哈希表的基础上又额外多了一条双向链表机制，用来记录存储的顺序。

----

## 二、底层原理

在存的时候跟它的父类 `HashMap` 是一样的，同样会调用 `hashCode()` 计算出键的哈希值，然后再计算出它在数组中应存入的位置。

如果该位置是有元素的，就会使用 `equals()` 比较键是否相同；如果该位置是没有元素的，直接添加进去即可。

与此同时，在底层还多了一条链表，而且是双向链表。

链表的头结点就是刚刚添加的第一个元素。

![image-20240428113003917](./assets/image-20240428113003917.png)

此时再来添加第二个元素，当我们将第二个元素添加成功之后，第一个元素内会记录第二个元素的的指针；第二个元素内也会记录第一个元素的地址值，这样就形成了双向链表。

![image-20240428113446227](./assets/image-20240428113446227.png)

当我们再来添加第三个元素的时候，同样的还是通过键的哈希值计算出应存入的索引是 `3`，但是这里已经有元素了，因此它就会通过 `equals()` 去比较键的属性值是否相同。

如果相同直接覆盖，如果不同，在JDK8以后就会挂在下面，与此同时，第二个元素和第三个元素之间还要再互相记录一次地址值，这样在双向链表中就已经把刚刚添加的三个元素按照顺序连在一起了。

<img src="./assets/image-20240428113949337.png" alt="image-20240428113949337" style="zoom:67%;" />

最后来添加第四个元素，与此同时，第三个元素与第四个元素之间也会互相记录一次地址值。

四个元素添加完毕，此时双向链表的头结点就是刚刚添加的第一个元素；而双向链表的尾结点就是我们刚刚添加的最后一个元素。

在遍历的时候就是从双向链表的头结点开始，依次往后遍历，这样得到的数据就跟添加的顺序是一模一样的了。

![image-20240428114316244](./assets/image-20240428114316244.png)

-----

## 三、代码实现

~~~java
//1.创建集合
LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();

//2.添加元素
lhm.put("c",789);
lhm.put("b",456);
lhm.put("a",123);
lhm.put("a",111);

//3.打印集合
System.out.println(lhm); // {c=789, b=456, a=111}，说明LinkedHashMap也有两个功能：1、添加；2、覆盖
~~~



---

# 11.TreeMap

`TreeMap` 学习完毕后，整个的 `Map集合` 也就学习完毕了。

在整个Map体系中，其实还有 `Hashtable`、`Properties` 这两个集合，由于这两个集合会有跟 IO 相关的方法，因此当我们学完IO后再去学习这两个集合。

关于 `TreeMap` 我们同样没有什么额外的新的方法学习，只需要知道它本身的特点和底层原理就行了。

<img src="./assets/image-20240428125807956.png" alt="image-20240428125807956" style="zoom:50%;" />

---

## 一、特点

`TreeMap` 跟 `TreeSet` 底层原理一样，都是红黑树结构。

`TreeMap` 所有的特点也是由键决定的：不重复、无索引、可排序（对键进行排序）。

PS：默认按照键的从小到大进行排序，也可以自己规定键的排序规则。

代码的书写跟 `TreeSet` 是一样的

- 实现 `Comparable接口`，指定比较规则。
- 创建集合时传递 `Comparator` 比较器对象，指定比较规则。

如果第一种和第二种同时存在，那么以第二种为准。

----

## 二、练习一

```
需求1：
    键：整数表示id
    值：字符串表示商品名称
    要求1：按照id的升序排列
    要求2：按照id的降序排列
```

运行以下代码，发现它默认是按照 `id` 升序排列的

~~~java
//1.创建集合对象
TreeMap<Integer,String> tm = new TreeMap<>();

//2.添加元素
tm.put(5,"可恰可乐");
tm.put(4,"雷碧");
tm.put(3,"九个核桃");
tm.put(2,"康帅傅");
tm.put(1,"粤利粤");

//3.打印集合
System.out.println(tm); // {1=粤利粤, 2=康帅傅, 3=九个核桃, 4=雷碧, 5=可恰可乐}
~~~

跟进 `Integer`，可以发现它也是实现了 `Comparable接口` 的。

<img src="./assets/image-20240428131906830.png" alt="image-20240428131906830" style="zoom:67%;" />

我们找到它重写的 `compareTo` 方法，可以发现在这个里面它其实已经制定了排序的规则，这个规则就是升序排列

<img src="./assets/image-20240428131953103.png" alt="image-20240428131953103" style="zoom:67%;" />

跟进 `compare()`，可以发现这个方法里面就是一个三元运算符。

<img src="./assets/image-20240428132155197.png" alt="image-20240428132155197" style="zoom:67%;" />

此时我们就知道了 `Integer`、`Double` 等默认都是按照升序排列的。而我们在这里存的键就是 `Integer`，因此它就默认按照升序排列了。

`String` 是按照字母在 `ASCII码表` 中对应的数字升序进行排列的，而且是从首字母开始，一个一个往后比较。

---

题目还有第二个需求：按照 `id` 降序排列。此时默认的方式就已经不能满足我们的需求了，就可以使用第二种方式：在创建集合对象的时候，小括号中可以传递比较器的对象。

~~~java
TreeMap<Integer,String> tm = new TreeMap<>(new Comparator<Integer>() {
    @Override
    public int compare(Integer o1, Integer o2) {
        //o1:当前要添加的元素
        //o2：表示已经在红黑树中存在的元素
        return o2 - o1;
    }
});
~~~



---

## 三、练习二

~~~java
需求2：
    键：学生对象
    值：籍贯
    要求：按照学生年龄的升序排列，年龄一样按照姓名的字母排列，同姓名年龄视为同一个人。
~~~

测试类

~~~java
//1.创建集合
TreeMap<Student,String> tm = new TreeMap<>();

//2.创建三个学生对象
Student s1 = new Student("zhangsan",23);
Student s2 = new Student("lisi",24);
Student s3 = new Student("wangwu",25);

//3.添加元素
tm.put(s1,"江苏");
tm.put(s2,"天津");
tm.put(s3,"北京");

//4.打印集合
System.out.println(tm);
~~~

如果不指定排序规则，就会直接报错。

![image-20240428141754654](./assets/image-20240428141754654.png)

**Student.java**

~~~java
public class Student implements Comparable<Student>{
    private String name;
    private int age;

    // 无参构造、有参构造、get、set方法
    
    @Override
    public int compareTo(Student o) {
        //按照学生年龄的升序排列，年龄一样按照姓名的字母排列，同姓名年龄视为同一个人。

        //this：表示当前要添加的元素
        //o：表示已经在红黑树中存在的元素

        //返回值：
        //负数：表示当前要添加的元素是小的，存左边
        //正数：表示当前要添加的元素是大的，存右边
        //0：表示当前要添加的元素已经存在，舍弃

        int i = this.getAge() - o.getAge();
        i = i == 0 ? this.getName().compareTo(o.getName()) : i;
        return i;
    }
}
~~~

----

## 四、利用 `TreeMap` 进行排序

~~~java
需求：
字符串“aababcabcdabcde”
请统计字符串中每一个字符出现的次数，并按照以下格式输出
输出结果：
a（5）b（4）c（3）d（2）e（1）
~~~

由于利用计数器的方式进行统计有一定的弊端，因此我们就引出来一个新的思想：利用 `Map集合` 进行统计。

利用 `Map集合` 进行统计有两种方式：1、`HashMap`；2、`TreeMap`

它们的键都表示：要统计的内容；值：表示要统计的次数。

如果题目中没有要求对结果进行排序，默认使用 `HashMap`，因为它的效率是最高的。

但是如果题目要求对结果进行排序，请使用 `TreeMap`。

由结果可知，这里应该使用 `TreeMap`。

~~~java
//1.定义字符串
String s = "aababcabcdabcde";

//2.创建集合
TreeMap<Character,Integer> tm = new TreeMap<>();

//3.遍历字符串得到里面的每一个字符
for (int i = 0; i < s.length(); i++) {
    char c = s.charAt(i);
    //拿着c到集合中判断是否存在
    //存在，表示当前字符又出现了一次
    //不存在，表示当前字符是第一次出现
    if(tm.containsKey(c)){
        //存在
        //先把已经出现的次数拿出来
        int count = tm.get(c);
        //当前字符又出现了一次
        count++;
        //把自增之后的结果再添加到集合当中
        tm.put(c,count);
    }else{
        //不存在
        tm.put(c,1);
    }
}

//4.遍历集合，并按照指定的格式进行拼接
// a（5）b（4）c（3）d（2）e（1）
//StringBuilder sb = new StringBuilder();
//tm.forEach((key, value)->sb.append(key).append("(").append(value).append(")"));

StringJoiner sj = new StringJoiner("","","");
// 非字符串的内容需要 + ""
tm.forEach((key, value)->sj.add(key + "").add("(").add(value + "").add(")"));

System.out.println(sj);
~~~

----

## 五、总结

1、`TreeMap集合` 的特点是什么样的？

- 键：不重复、无索引、可排序
- 底层基于红黑树进行实现，增删改查性能较好

2、`TreeMap集合` 排序的两种方式

- 默认的排序规则：实现 `Comparable接口`，指定比较规则
- 创建集合时传递Comparator比较器对象，指定比较规则

例如字符串、Integer中默认的排序规则有时候就不能满足我们的需求了。



-----

# 12.`HashMap` 源码

选中 `HashMap` 跟进，首先我们要来看四大点。

## 一、每个元素的组成

第一个我们需要 `HashMap` 里面每一个元素到底是什么。

<kbd>ctrl + F12</kbd> 搜索 `Node`，其实在 `HashMap` 中，每一个元素都是一个 `Node` 的对象，`Node` 实现了 `Map` 里面的 `Entry接口`，因此我们也称之为：一个元素（`Node<K,V>`）它是一个Entry对象（`Entry<K,V>`）。

在一个 `Entry` 里面有四个成员变量：

- `hash`：通过键计算出来的哈希值
- `key`：键
- `value`：值

`next`：在之前我们说过，一个 `HashMap` 底层是由 `数组 + 链表 + 红黑树` 组成的，当我们在数组中添加了一个元素，如果是链表的话，下面还会挂其他的元素，这就是 `next` 的作用，它的作用就是记录下一个节点的地址值。

-----

如果转成红黑树的话，那么元素就不是 `Node类型` 了，而是 `TreeNode`，它里面一共有五个成员变量。

- `parent`：记录父节点的地址值
- `left`：左子结点
- `right`：右子节点
- `prev`：暂时没什么用
- `red`：颜色，`true` 表示当前节点为红色，`false` 表示当前节点为黑色

并且 `TreeNode` 继承了 `LinkedHashMap` 中的 `Entry`，选中这个 `Entry` 跟进

<img src="./assets/image-20240428153419815.png" alt="image-20240428153419815" style="zoom:77%;" />

可以看见这个 `Entry` 又继承了 `HashMap` 中的 `Node`，继续跟进 `Node`

<img src="./assets/image-20240428153513294.png" alt="image-20240428153513294" style="zoom:67%;" />

可以发现又回到 `HashMap中的Node` 了。

因此，如果是红黑树，里面的每一个节点除了有 `Node` 中的成员变量外，还会再记录父节点的地址值、左子结点、右子节点、颜色。

<img src="./assets/image-20240428153707261.png" alt="image-20240428153707261" style="zoom:67%;" />

----

## 二、成员变量

<kbd>ctrl + F12</kbd> 找到 `table` 成员变量。

<img src="./assets/image-20240428153816788.png" alt="image-20240428153816788" style="zoom:67%;" />

可以看见 `table` 是一个数组， `HashMap` 底层是由 `数组 + 链表 + 红黑树` 组成的，这个数组的名字就是 `table`，它里面装的每一个元素就是 `Node` 的对象。

---

接下来看第二个成员变量，那就是数组的长度。

<kbd>ctrl + F12</kbd> 找到 `DEFAULT_INITIAL_CAPACITY` 常量，即默认的初始容量，它后面的值是 `1 << 4`，即 `16`，所以数组默认长度是 `16`。

再往下看 `DEFAULT_LOAD_FACTOR`，表示默认的加载因子为 `0.75`，加载因子就决定了 `HashMap` 的扩容时机，当数组长度超过 `16 × 0.75` 的时候就需要进行扩容，每次扩容为原先的两倍。

---

第三个成员变量了解一下就行了：`MAXIMUM_CAPACITY`，表示最大的容量为 `1 << 30`，

<img src="./assets/image-20240428154620400.png" alt="image-20240428154620400" style="zoom:67%;" />

---

## 三、构造方法

找到跟类名一致的成员方法即可。

<img src="./assets/image-20240428154729747.png" alt="image-20240428154729747" style="zoom:67%;" />

如果用空参构造创建 `HashMap` 的对象，在底层它其实只做了一件事情：将默认的加载因子0.75赋值给成员变量 `loadFactor`，这就表示当前的 `HashMap集合` 的加载因子就是 `0.75`。![image-20240428154830202](./assets/image-20240428154830202.png)

但是要注意的是，这个时候，底层的数组还没有创建！因为在刚刚我们看见了，`table` 后面并没有赋值，那么默认初始化值就是 `null`。

<img src="./assets/image-20240428155013530.png" alt="image-20240428155013530" style="zoom:80%;" />

数组在我们添加元素的时候就会创建。

----

## 四、添加元素

<kbd>ctrl + F12</kbd> 找到 `put()`。

`put()` 形参有两个：`key、value`，表示键和值。

底层调用了一个 `putVal()`，在这个方法里面有五个参数。

<img src="./assets/image-20240428155338769.png" alt="image-20240428155338769" style="zoom:87%;" />

`hash(key)` ：将键传递过去。

跟进 `hash()` 看看，此时就能发现了，它拿着键调用 `hashCode()`，然后再进行一些其他的运算，我们不用操心这个方法的计算结果是什么，只需要知道它返回的是键的哈希值即可。

并且通过这个方法我们也知道了，哈希值只跟键有关系，跟值没有半毛钱关系。

<img src="./assets/image-20240428155508812.png" alt="image-20240428155508812" style="zoom:67%;" />

`key`：键

`value`：值

`onlyIfAbsent`：表示当前的数据是否保留。

如果添加键在HashMap中已经有了，就会进行覆盖，覆盖的原因就是这个值决定的。

`false` 表示重复的数据不保留，进行覆盖。 `true` 表示不会覆盖。它默认情况下都是 `false`。

第五个参数 `true` 现在跟我们没有什么太大关系，因此我们只需要知道前面四个参数就行了。

然后将这四个参数传递给 `putVal()`，真正的难点才刚刚开始。

<img src="./assets/image-20240428160128502.png" alt="image-20240428160128502" style="zoom:67%;" />

在这里可以看见一个数组，那方括号里面，肯定就是数组的索引。

如果让我们自己写，那肯定先把索引计算出来，用一个变量 `index` 表示，再把 `index` 写在方括号中。

但是编写Java的大佬直接一步到位，将 `计算、赋值` 全部写在一起了。

但我们自己不能这么写，因为我们自己写的代码需要有阅读性，这就是我们看不懂源码的第一个原因。

<img src="./assets/image-20240428160302698.png" alt="image-20240428160302698" style="zoom:67%;" />

还有第二个原因：集合是跟数据结构结合在一起的，因此在阅读这些源码的时候，我们在脑海中还要去想象出数据结构的变化。

----

老师在资料中准备了两个东西，一个是下面的源码，和一张图。老师在讲解的时候：左边是源码，右边是图。

在讲解的时候会将源码一边讲一边改，改成我们平时书写习惯。右边的图老师会边讲边画好好理解。

视频地址：[集合进阶-14-HashMap源码超详细解析（二）_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1yW4y1Y7Ms?p=15&vd_source=95ed0cf36a948bb4f3a90c1fe3d690af)

~~~java
1.看源码之前需要了解的一些内容

Node<K,V>[] table   哈希表结构中数组的名字

DEFAULT_INITIAL_CAPACITY：   数组默认长度16

DEFAULT_LOAD_FACTOR：        默认加载因子0.75



HashMap里面每一个对象包含以下内容：
1.1 链表中的键值对对象
    包含：  
			int hash;         //键的哈希值
            final K key;      //键
            V value;          //值
            Node<K,V> next;   //下一个节点的地址值
			
			
1.2 红黑树中的键值对对象
	包含：
			int hash;         		//键的哈希值
            final K key;      		//键
            V value;         	 	//值
            TreeNode<K,V> parent;  	//父节点的地址值
			TreeNode<K,V> left;		//左子节点的地址值
			TreeNode<K,V> right;	//右子节点的地址值
			boolean red;			//节点的颜色
					


2.添加元素
HashMap<String,Integer> hm = new HashMap<>();
hm.put("aaa" , 111);
hm.put("bbb" , 222);
hm.put("ccc" , 333);
hm.put("ddd" , 444);
hm.put("eee" , 555);

添加元素的时候至少考虑三种情况：
2.1数组位置为null
2.2数组位置不为null，键不重复，挂在下面形成链表或者红黑树
2.3数组位置不为null，键重复，元素覆盖



//参数一：键
//参数二：值

//返回值：被覆盖元素的值，如果没有覆盖，返回null
public V put(K key, V value) {
    return putVal(hash(key), key, value, false, true);
}


//利用键计算出对应的哈希值，再把哈希值进行一些额外的处理
//简单理解：返回值就是返回键的哈希值
static final int hash(Object key) {
    int h;
    return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
}

//参数一：键的哈希值
//参数二：键
//参数三：值
//参数四：如果键重复了是否保留
//		   true，表示老元素的值保留，不会覆盖
//		   false，表示老元素的值不保留，会进行覆盖
final V putVal(int hash, K key, V value, boolean onlyIfAbsent,boolean evict) {
	    //定义一个局部变量，用来记录哈希表中数组的地址值。
    	// 成员变量已经有个table数组用来记录数组的地址值了，为什么这里还要记录呢？
    	// 成员变量是在堆中的，方法在栈中，如果在这个方法里面反复调用 table，也就是说每一次用都要到堆里面找，相对来讲比较麻烦，于是干脆就自己在方法里面定义一个，以后要用到时候直接使用这个局部变量就行了，效率要更高。
        Node<K,V>[] tab;
		
		//临时的第三方变量，用来记录键值对对象的地址值
        Node<K,V> p;
        
		//表示当前数组的长度
		int n;
		
		//表示索引
        int i;
		
		//把哈希表中数组的地址值，赋值给局部变量tab
		tab = table;

        if (tab == null || (n = tab.length) == 0){
			//1.如果当前是第一次添加数据，底层会创建一个默认长度为16，加载因子为0.75的数组
			//2.如果不是第一次添加数据，会看数组中的元素是否达到了扩容的条件
			//如果没有达到扩容条件，底层不会做任何操作
			//如果达到了扩容条件，底层会把数组扩容为原先的两倍，并把数据全部转移到新的哈希表中
			tab = resize();
			//表示把当前数组的长度赋值给n
            n = tab.length;
        }

		//拿着数组的长度跟键的哈希值进行计算，计算出当前键值对对象，在数组中应存入的位置
		i = (n - 1) & hash;//index
		//获取数组中对应元素的数据
		p = tab[i];
		
		
        if (p == null){
			//底层会创建一个键值对对象，直接放到数组当中
            tab[i] = newNode(hash, key, value, null);
        }else {
            Node<K,V> e;
            K k;
			
			//等号的左边：数组中键值对的哈希值
			//等号的右边：当前要添加键值对的哈希值
			//如果键不一样，此时返回false
			//如果键一样，返回true
			boolean b1 = p.hash == hash;
			
            if (b1 && ((k = p.key) == key || (key != null && key.equals(k)))){
                e = p;
            } else if (p instanceof TreeNode){
				//判断数组中获取出来的键值对是不是红黑树中的节点
				//如果是，则调用方法putTreeVal，把当前的节点按照红黑树的规则添加到树当中。
                e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
            } else {
				//如果从数组中获取出来的键值对不是红黑树中的节点
				//表示此时下面挂的是链表
                for (int binCount = 0; ; ++binCount) {
                    if ((e = p.next) == null) {
						//此时就会创建一个新的节点，挂在下面形成链表
                        p.next = newNode(hash, key, value, null);
						//判断当前链表长度是否超过8，如果超过8，就会调用方法treeifyBin
						//treeifyBin方法的底层还会继续判断
						//判断数组的长度是否大于等于64
						//如果同时满足这两个条件，就会把这个链表转成红黑树
                        if (binCount >= TREEIFY_THRESHOLD - 1)
                            treeifyBin(tab, hash);
                        break;
                    }
					//e：			  0x0044  ddd  444
					//要添加的元素： 0x0055   ddd   555
					//如果哈希值一样，就会调用equals方法比较内部的属性值是否相同
                    if (e.hash == hash && ((k = e.key) == key || (key != null && key.equals(k)))){
						 break;
					}

                    p = e;
                }
            }
			
			//如果e为null，表示当前不需要覆盖任何元素
			//如果e不为null，表示当前的键是一样的，值会被覆盖
			//e:0x0044  ddd  555
			//要添加的元素： 0x0055   ddd   555
            if (e != null) {
                V oldValue = e.value;
                if (!onlyIfAbsent || oldValue == null){
					
					//等号的右边：当前要添加的值
					//等号的左边：0x0044的值
					e.value = value;
				}
                afterNodeAccess(e);
                return oldValue;
            }
        }
		
        //threshold：记录的就是数组的长度 * 0.75，哈希表的扩容时机  16 * 0.75 = 12
        if (++size > threshold){
			 resize();
		}
        
		//表示当前没有覆盖任何元素，返回null
        return null;
    }
~~~



------

# 18.`TreeMap` 源码

选中 `TreeMap` 跟进。

## 一、需要提前知道的

在正式看源码之前，需要带大家去看四个小知识点：

### 1）`TreeMap` 底层是红黑树结构的，所以我们需要知道每一个元素的内部有哪些属性

<kbd>ctrl + F12</kbd> 搜索 `entry`，我们找的不是方法，而是找它的内部类。

<img src="./assets/image-20240428171730930.png" alt="image-20240428171730930" style="zoom:67%;" />

在 `TreeMap` 中，每一个元素其实就是一个 `Entry对象`，在 `Entry对象` 中有以下属性。

<img src="./assets/image-20240428171856816.png" alt="image-20240428171856816" style="zoom:80%;" />

~~~java
K key; // 键
V value; // 值
Entry<K,V> left;  // 记录左子节点的地址值
Entry<K,V> right; // 记录右子节点的地址值
Entry<K,V> parent; // 记录父节点的地址值
boolean color = BLACK; // 记录节点的颜色
~~~

但是在这为什么默认节点是黑色的呢？

先来看上面用 `private static final` 定义的两个常量：`RED`、`BLACK`，此时就发现了，这里的 `RED跟BLACK` 是表示颜色，但是本质上只是常量的颜色而已。

<img src="./assets/image-20240428172243695.png" alt="image-20240428172243695" style="zoom:80%;" />

那Java为什么这么去设计呢？

如果在赋值的时候赋值 `true / false`，那就很难理解了，`true` 表示什么？`false` 表示什么？一点也不好理解，因此Java就使用了这种常量的方式提高了代码的阅读性。

此时不用看其他地方，直接看 `boolean color = BLACK;` 这一行代码，我们就知道了，创建一个 `Entry对象` 的时候，里面节点颜色的初始化值是黑色的，因此它的作用是为了提高代码的阅读性。

但是我们之前学习红黑树的时候，不都是默认红色的吗？是的，你说的非常对。

但是看源码不能只看一部分，还得结合其他地方才能得到结论。

`TreeMap` 在添加节点的时候它还会调整，一律调整为默认的红色，这些调整方案一会在看 `put()` 的时候会详细说明。

----

### 2）`TreeMap` 中的一些成员变量

<kbd>ctrl + F12</kbd> 点一下 `comparator`

<img src="./assets/image-20240428172846545.png" alt="image-20240428172846545" style="zoom:67%;" />

`TreeMap` 中一共有三个成员变量需要我们知道。

1、`comparator`：表示比较的规则。

2、`root`：记录红黑树根节点的地址值，并且类型是 `Entry`，因此它就表示根节点。

3、`size`：表示集合的长度，也表示红黑树中节点的个数。

<img src="./assets/image-20240428173216730.png" alt="image-20240428173216730" style="zoom:80%;" />

-----

### 3）空参构造

空参构造非常的简单，它里面没有传递任何的数据，在方法体中将 `null` 赋值给了 `comparator`。

因此当我们用空参构造来创建对象的时候，这里的 `comparator` 记录的值就是 `null`，表示没有比较器对象。

<img src="./assets/image-20240428173345229.png" alt="image-20240428173345229" style="zoom:80%;" />

----

### 4）带参构造

带参构造就是我们在调用的时候要传递比较器对象，然后将传递过来的比较器对象赋值给成员变量 `comparator`，此时成员变量 `comparator` 才有值，这个值就是我们自己传递的比较器对象。

<img src="./assets/image-20240428173507311.png" alt="image-20240428173507311" style="zoom:80%;" />

---

## 二、`put()` 底层原理

这些东西因为比较麻烦，因此老师还是将这些东西整理到文档中了。

建议观看视频理解：[集合进阶-17-TreeMap源码超详细解析（一）_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1yW4y1Y7Ms?p=18&vd_source=95ed0cf36a948bb4f3a90c1fe3d690af)，定位到 `5:31`

~~~java
1.TreeMap中每一个节点的内部属性
K key;					//键
V value;				//值
Entry<K,V> left;		//左子节点
Entry<K,V> right;		//右子节点
Entry<K,V> parent;		//父节点
boolean color;			//节点的颜色


2.TreeMap类中中要知道的一些成员变量
public class TreeMap<K,V>{
   
    //比较器对象
    private final Comparator<? super K> comparator;

	//根节点
    private transient Entry<K,V> root;

	//集合的长度
    private transient int size = 0;

   

3.空参构造
	//空参构造就是没有传递比较器对象
	 public TreeMap() {
        comparator = null;
    }
	
	
	
4.带参构造
	//带参构造就是传递了比较器对象。
	public TreeMap(Comparator<? super K> comparator) {
        this.comparator = comparator;
    }
	
	
5.添加元素
	public V put(K key, V value) {
        return put(key, value, true);
    }

参数一：键
参数二：值
参数三：当键重复的时候，是否需要覆盖值
		true：覆盖
		false：不覆盖
    这里跟 HashMap 是反过来的，这是因为它在判断的时候逻辑是不一样的。
		
	private V put(K key, V value, boolean replaceOld) {
		//获取根节点的地址值，赋值给局部变量t
        Entry<K,V> t = root;
		//判断根节点是否为null
		//如果为null，表示当前是第一次添加，会把当前要添加的元素，当做根节点
		//如果不为null，表示当前不是第一次添加，跳过这个判断继续执行下面的代码
        if (t == null) {
			//方法的底层，会创建一个Entry对象，把他当做根节点
            addEntryToEmptyMap(key, value);
			//表示此时没有覆盖任何的元素
            return null;
        }
		//表示两个元素的键比较之后的结果
        int cmp;
		//表示当前要添加节点的父节点
        Entry<K,V> parent;
		
		//表示当前的比较规则
		//如果我们是采取默认的自然排序，那么此时comparator记录的是null，cpr记录的也是null
		//如果我们是采取比较去排序方式，那么此时comparator记录的是就是比较器
        Comparator<? super K> cpr = comparator;
		//表示判断当前是否有比较器对象
		//如果传递了比较器对象，就执行if里面的代码，此时以比较器的规则为准
		//如果没有传递比较器对象，就执行else里面的代码，此时以自然排序的规则为准
        if (cpr != null) {
            do {
                parent = t;
                cmp = cpr.compare(key, t.key);
                if (cmp < 0)
                    t = t.left;
                else if (cmp > 0)
                    t = t.right;
                else {
                    V oldValue = t.value;
                    if (replaceOld || oldValue == null) {
                        t.value = value;
                    }
                    return oldValue;
                }
            } while (t != null);
        } else {
			//把键进行强转，强转成Comparable类型的
			//要求：键必须要实现Comparable接口，如果没有实现这个接口
			//此时在强转的时候，就会报错。
            Comparable<? super K> k = (Comparable<? super K>) key;
            do {
				//把根节点当做当前节点的父节点
                parent = t;
				//调用compareTo方法，比较根节点和当前要添加节点的大小关系
                cmp = k.compareTo(t.key);
				
                if (cmp < 0)
					//如果比较的结果为负数
					//那么继续到根节点的左边去找
                    t = t.left;
                else if (cmp > 0)
					//如果比较的结果为正数
					//那么继续到根节点的右边去找
                    t = t.right;
                else {
					//如果比较的结果为0，会覆盖
                    V oldValue = t.value;
                    if (replaceOld || oldValue == null) {
                        t.value = value;
                    }
                    return oldValue;
                }
            } while (t != null);
        }
		//就会把当前节点按照指定的规则进行添加
        addEntry(key, value, parent, cmp < 0);
        return null;
    }	
	
	
	
	 private void addEntry(K key, V value, Entry<K, V> parent, boolean addToLeft) {
        Entry<K,V> e = new Entry<>(key, value, parent);
        if (addToLeft)
            parent.left = e;
        else
            parent.right = e;
		//添加完毕之后，需要按照红黑树的规则进行调整
        fixAfterInsertion(e);
        size++;
        modCount++;
    }
	
	
	
	private void fixAfterInsertion(Entry<K,V> x) {
		//因为红黑树的节点默认就是红色的
        x.color = RED;

		//按照红黑规则进行调整
		
		//parentOf:获取x的父节点
		//parentOf(parentOf(x)):获取x的爷爷节点
		//leftOf:获取左子节点
        while (x != null && x != root && x.parent.color == RED) {
			
			
			//判断当前节点的父节点是爷爷节点的左子节点还是右子节点
			//目的：为了获取当前节点的叔叔节点
            if (parentOf(x) == leftOf(parentOf(parentOf(x)))) {
				//表示当前节点的父节点是爷爷节点的左子节点
				//那么下面就可以用rightOf获取到当前节点的叔叔节点
                Entry<K,V> y = rightOf(parentOf(parentOf(x)));
                if (colorOf(y) == RED) {
					//叔叔节点为红色的处理方案
					
					//把父节点设置为黑色
                    setColor(parentOf(x), BLACK);
					//把叔叔节点设置为黑色
                    setColor(y, BLACK);
					//把爷爷节点设置为红色
                    setColor(parentOf(parentOf(x)), RED);
					
					//把爷爷节点设置为当前节点
                    x = parentOf(parentOf(x));
                } else {
					
					//叔叔节点为黑色的处理方案
					
					
					//表示判断当前节点是否为父节点的右子节点
                    if (x == rightOf(parentOf(x))) {
						
						//表示当前节点是父节点的右子节点
                        x = parentOf(x);
						//左旋
                        rotateLeft(x);
                    }
                    setColor(parentOf(x), BLACK);
                    setColor(parentOf(parentOf(x)), RED);
                    rotateRight(parentOf(parentOf(x)));
                }
            } else {
				//表示当前节点的父节点是爷爷节点的右子节点
				//那么下面就可以用leftOf获取到当前节点的叔叔节点
                Entry<K,V> y = leftOf(parentOf(parentOf(x)));
                if (colorOf(y) == RED) {
                    setColor(parentOf(x), BLACK);
                    setColor(y, BLACK);
                    setColor(parentOf(parentOf(x)), RED);
                    x = parentOf(parentOf(x));
                } else {
                    if (x == leftOf(parentOf(x))) {
                        x = parentOf(x);
                        rotateRight(x);
                    }
                    setColor(parentOf(x), BLACK);
                    setColor(parentOf(parentOf(x)), RED);
                    rotateLeft(parentOf(parentOf(x)));
                }
            }
        }
		
		//把根节点设置为黑色
        root.color = BLACK;
    }
~~~

----

## 三、课堂思考问题

~~~java
6.1TreeMap添加元素的时候，键是否需要重写hashCode和equals方法？
此时是不需要重写的。
hashCode和equals方法是跟HashMap的键有关的。

6.2HashMap是哈希表结构的，JDK8开始由数组，链表，红黑树组成的。
既然有红黑树，HashMap的键是否需要实现Compareable接口或者传递比较器对象呢？
不需要的。
因为在HashMap的底层，默认是利用哈希值的大小关系来创建红黑树的。
~~~

我们可以来看下源码，跟进 `HashMap`，<kbd>ctrl + F12</kbd> 找到 `put()`。

<img src="./assets/image-20240429074841391.png" alt="image-20240429074841391" style="zoom:67%;" />

跟进 `putVal()`，可以发现如果你当前节点是 `TreeNode`，那么它是用 `putTreeVal()` 来添加。

<img src="./assets/image-20240429075006345.png" alt="image-20240429075006345" style="zoom:67%;" />

跟进 `putTreeVal()`，在这个方法里面有个 `find()`

<img src="./assets/image-20240429075149617.png" alt="image-20240429075149617" style="zoom:67%;" />

跟进看看，这里的 `p` 表示当前要添加的节点，用 `p` 调用 `hash`。

`h` 就是调用 `find()` 传递过来的哈希值。

所以在底层它是默认采用哈希值的大小关系去创建的这颗红黑树的。

<img src="./assets/image-20240429075324089.png" alt="image-20240429075324089" style="zoom:67%;" />

~~~java
6.3TreeMap和HashMap谁的效率更高？
如果是最坏情况，添加了8个元素，这8个元素形成了链表，此时TreeMap的效率要更高
但是这种情况出现的几率非常的少。
一般而言，还是HashMap的效率要更高。
~~~

~~~java
6.4你觉得在Map集合中，java会提供一个如果键重复了，不会覆盖的put方法呢？
~~~

对于这个问题，我们可以打开API帮助文档，或者源码来看看，这里就打开源码来看看。

首先需要思考，为什么会有这样的问题呢？

因为 `HashMap` 在添加的时候，调用了 `putVal()`，这个方法里面有一个变量去控制是否覆盖值。

<img src="./assets/image-20240429080059407.png" alt="image-20240429080059407" style="zoom:67%;" />

那么既然有变量控制，那是不是有覆盖和不覆盖的情况。如果它没有这两种情况的话，那我干嘛还要用变量去控制呢？

<kbd>ctrl + F12</kbd> 搜索 `putIfAbsent()`，它就表示：如果键重复了，那么值是不会覆盖的。

它在调用 `putVal()` 的时候，第四个参数的值跟 `put()` 是不一样的。

<img src="./assets/image-20240429080414563.png" alt="image-20240429080414563" style="zoom:67%;" />

我们再来看 `TreeMap`，`TreeMap` 中也有一个 `putIfAbsent()`，它的参数跟上面的 `put()` 也是相反的。

<img src="./assets/image-20240429080532648.png" alt="image-20240429080532648" style="zoom:67%;" />

只不过下面的方法我们平时几乎不怎么用，因此了解一下知道有它的存在就行了。

**此时putIfAbsent本身不重要，主要的是在这里主要是想和大家传递一个思想：**

代码中的逻辑都有两面性，如果我们只知道了其中的A面，而且代码中还发现了有变量可以控制两面性的发生，那么该逻辑一定会有B面。

在写代码的时候我们一般会有一个习惯：

- 如果是boolean类型的变量控制，一般只有AB两面，因为boolean只有两个值

- int类型的变量控制，一般至少有三面，因为int可以取多个值。

  例如在给 `TreeMap` 制定比较规则的时候，返回值类型就是 `int类型` 的，它要控制三面：正数、负数、`0`

~~~java
6.5三种双列集合，以后如何选择？
	HashMap LinkedHashMap TreeMap
	
	默认：HashMap（效率最高）
	如果要保证存取有序：LinkedHashMap
	如果要进行排序：TreeMap
~~~



-----

# ----------------------------------------------

# day25 阶段项目（综合练习&斗地主游戏）

# 20.可变参数

我们先来看一个小案例：

```
假如需要定义一个方法求和，该方法可以灵活的完成如下需求：
计算2个数据的和
计算3个数据的和
计算4个数据的和
计算n个数据的和
```

像下面这样的写法，其实是有些小问题的，如果我们要求 `n` 个数据的和，这个 `n` 我们还不知道，那这个方法该怎么写呢？

~~~java
public class ArgsDemo1 {
    public static void main(String[] args) {
        System.out.println(getSum(10,20));
        System.out.println(getSum(10,20,30));
        System.out.println(getSum(10,20,30,40));
    }

    //计算2个数据的和
    public static int getSum(int a, int b) {
        return a + b;
    }

    //计算3个数据的和
    public static int getSum(int a, int b, int c) {
        return a + b + c;
    }

    //计算4个数据的和
    public static int getSum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
~~~

在以前我们是这么写的：由于我们也不知道有多少个数据要求和，因此形参直接写数组就好了

~~~java
package com.itheima.a06args;

public class ArgsDemo2 {
    public static void main(String[] args) {
        //计算n个数据的和
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int sum = getSum(arr);
        System.out.println(sum);
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        return sum;
    }
}
~~~

但是这种方式也很麻烦，因为如果要求和，还需要定义一个数组，定义完后还要把数组传递给方法。其实还有更简单的方法。

在JDK5的时候提出了一个特性：可变参数。方法形参的个数是可以发生变化的。

**格式**

```
修饰符 返回值类型 方法名(参数类型... 形参名){  }
```

此时就不需要定义数组了，在小括号中直接传入要求和的数据，传几个都是可以的，但一定要是 `int类型` 的。

底层：可变参数底层就是一个数组，只不过不需要我们自己创建了，Java会帮我们创建好，然后传递给下面的 `args变量`。

~~~java
public class ArgsDemo3 {
    public static void main(String[] args) {
        getSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(sum);
    }

    public static int getSum(int...args){
    }
}
~~~

在 `getSum()` 中打印 `args`

~~~java
System.out.println(args);//[I@119d7047
//[ ：表示当前是一个数组
//I：I表示数组里面的元素都是int类型的。
//@：表示一个间隔符号。（固定格式）
//776ec8df：才是数组真正的地址值，它是一个十六进制的表现形式。
//但是平时我们习惯性的会把这个整体叫做数组的地址值。但其实只有后半部分才是真正的地址值776ec8df
~~~

既然是数组，那么方法的写法就跟以前一模一样了

~~~java
public static int getSum(int...args){
    int sum = 0;
    for (int i : args) {
        sum = sum + i;
    }
    return sum;
}
~~~

**注意**

1. 一个方法只能有一个可变参数

   可变参数，理解为一个大胖子，有多少吃多少。如果写了多个可变参数，那么数据都会被前面的可变参数吃掉，第二个就没得吃了。

   <img src="./assets/image-20240429083437215.png" alt="image-20240429083437215" style="zoom:67%;" />

2. 如果方法中有多个形参，可变参数要放到最后。

**应用场景: Collections**

​	在Collections中也提供了添加一些元素方法：

​	

**代码演示:**

```java
public class CollectionsDemo {
	public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<Integer>();
      //原来写法
      //list.add(12);
      //list.add(14);
      //list.add(15);
      //list.add(1000);
      //采用工具类 完成 往集合中添加元素  
      Collections.addAll(list, 5, 222, 1，2);
      System.out.println(list);
}
```



-----

# 21.集合工具类Collections

## 一、介绍

`java.util.Collections`：是集合工具类

在这个里面帮我们定义了很多很多能操作集合的方法。

参数一：集合，类型是 `Collection<T>`，也就是说这个方法只能给单列集合进行批量添加，双列集合Map是不行的。

参数二：可变参数。

~~~java
public static <T> boolean addAll(Collection<T> c, T... elements);  // 批量添加元素。
~~~

要注意，这个形参是 `List`，也就是我们只能传 `ArrayList、LinkedList、Vector`；`Set集合` 是不能打乱顺序的。

~~~java
public static void shuffle(List<?> list);  // 打乱List集合元素的顺序。
~~~

在Collections中还有很多很多其它的方法，但这里演示前两个。

![image-20240429084841739](./assets/image-20240429084841739.png)

----

## 二、代码示例

注意使用的是 `Collections` 里面的方法，这个类是集合的工具类。

工具类的特点：私有化构造方法，不让外界创建它的对象。

<img src="./assets/image-20240429090833426.png" alt="image-20240429090833426" style="zoom:67%;" />

并且里面所有的方法几乎都有 `static` ，因此调用方法的时候直接使用类名调用即可。

~~~java
//addAll  批量添加元素
//1.创建集合对象
ArrayList<String> list = new ArrayList<>();
//2.批量添加元素
Collections.addAll(list,"abc","bcd","qwer","df","asdf","zxcv","1234","qwer");
//3.打印集合
System.out.println(list); // [abc, bcd, qwer, df, asdf, zxcv, 1234, qwer]

//shuffle 打乱
Collections.shuffle(list);

System.out.println(list); // [qwer, 1234, bcd, qwer, abc, df, zxcv, asdf]，每刷新一次
~~~

其他方法示例

~~~java
System.out.println("-------------sort默认规则--------------------------");
//默认规则，需要重写Comparable接口compareTo方法。Integer已经实现，按照从小打大的顺序排列
//如果是自定义对象，需要自己指定规则
ArrayList<Integer> list1 = new ArrayList<>();
Collections.addAll(list1, 10, 1, 2, 4, 8, 5, 9, 6, 7, 3);
Collections.sort(list1);
System.out.println(list1);


System.out.println("-------------sort自己指定规则规则--------------------------");
Collections.sort(list1, new Comparator<Integer>() {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
});
System.out.println(list1);

Collections.sort(list1, (o1, o2) -> o2 - o1);
System.out.println(list1);

System.out.println("-------------binarySearch--------------------------");
//需要元素有序
ArrayList<Integer> list2 = new ArrayList<>();
Collections.addAll(list2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
System.out.println(Collections.binarySearch(list2, 9));
System.out.println(Collections.binarySearch(list2, 1));
System.out.println(Collections.binarySearch(list2, 20));

System.out.println("-------------copy--------------------------");
//把list3中的元素拷贝到list4中
//会覆盖原来的元素
//注意点：如果list3的长度 > list4的长度，方法会报错
ArrayList<Integer> list3 = new ArrayList<>();
ArrayList<Integer> list4 = new ArrayList<>();
Collections.addAll(list3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
Collections.addAll(list4, 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
Collections.copy(list4, list3);
System.out.println(list3);
System.out.println(list4);

System.out.println("-------------fill--------------------------");
//把集合中现有的所有数据，都修改为指定数据
ArrayList<Integer> list5 = new ArrayList<>();
Collections.addAll(list5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
Collections.fill(list5, 100);
System.out.println(list5);

System.out.println("-------------max/min--------------------------");
//求最大值或者最小值
ArrayList<Integer> list6 = new ArrayList<>();
Collections.addAll(list6, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
System.out.println(Collections.max(list6));
System.out.println(Collections.min(list6));

System.out.println("-------------max/min指定规则--------------------------");
// String中默认是按照字母的abcdefg顺序进行排列的
// 现在我要求最长的字符串
// 默认的规则无法满足，可以自己指定规则
// 求指定规则的最大值或者最小值
ArrayList<String> list7 = new ArrayList<>();
Collections.addAll(list7, "a","aa","aaa","aaaa");
System.out.println(Collections.max(list7, new Comparator<String>() {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}));

System.out.println("-------------swap--------------------------");
ArrayList<Integer> list8 = new ArrayList<>();
Collections.addAll(list8, 1, 2, 3);
Collections.swap(list8,0,2);
System.out.println(list8);
~~~



----

# 22.练习一：随机点名器的两种实现方法

需求：班级里有N个学生，实现随机点名器

~~~java
//1.定义集合
ArrayList<String> list = new ArrayList<>();
//2.添加数据
Collections.addAll(list,"范闲","范建","范统","杜子腾","杜琦燕","宋合泛","侯笼藤","朱益群","朱穆朗玛峰","袁明媛");
//3.随机点名
// 第一种方式：（以前的写法）
Random r = new Random();
int index = r.nextInt(list.size());
String name = list.get(index);
System.out.println(name);

//第二种方式：打乱
Collections.shuffle(list);
//既然已经打乱了，直接获取到0索引位置的数据就行了
String name = list.get(0);
System.out.println(name);
~~~



---

# 23.练习二：随机点名器的两种实现方法

需求：班级里有N个学生，要求在随机的时候，70%的概率随机到男生，30%的概率随机到女生

这题中，`Random` 是不能直接使用的，我们以前是拿着 `Random` 随机出一堆数据，这种随机数据叫做 `随机点`。

例如范围是 `1 ~20`，如果随机出来的是 `13`，那么这个 `13` 表示的是数字 `13` 还是 `1 ~ 13` 这个范围呢？

很明显，它仅仅只能表示自己 `13` 这个数据。

因此 `Random` 随机出来的是那个点，它不能表示链。

<img src="./assets/image-20240429092950062.png" alt="image-20240429092950062" style="zoom:80%;" />

那我们该怎么实现呢？

我们可以往集合中添加 `7个1、3个0`，此时`7个1` 在整体的数字中占 `70%`，`0占30%`。

然后将集合打乱顺序，打乱完后，从这个集合中抽 `0` 或者 `1`。

- 如果抽到了 `1`，那么就从男生里面随机
- 如果抽到 `0`，那么就从女生里面随机

~~~java
//1.创建集合
ArrayList<Integer> list = new ArrayList<>();
//2.添加数据
Collections.addAll(list,1,1,1,1,1,1,1);
Collections.addAll(list,0,0,0);
//3.打乱集合中的数据
Collections.shuffle(list);
//4.从list集合中随机抽取0或者1
Random r = new Random();
int index = r.nextInt(list.size());
int number = list.get(index);
System.out.println(number);
//5.创建两个集合分别存储男生和女生的名字
ArrayList<String> boyList = new ArrayList<>();
ArrayList<String> girlList = new ArrayList<>();

Collections.addAll(boyList,"范闲","范建","范统","杜子腾","宋合泛","侯笼藤","朱益群","朱穆朗玛峰");
Collections.addAll(girlList,"杜琦燕","袁明媛","李猜","田蜜蜜");

//6.判断此时是从boyList里面抽取还是从girlList里面抽取
if(number == 1){
    //boyList
    int boyIndex = r.nextInt(boyList.size());
    String name = boyList.get(boyIndex);
    System.out.println(name);
}else{
    //girlList
    int girlIndex = r.nextInt(girlList.size());
    String name = girlList.get(girlIndex);
    System.out.println(name);
}
~~~



----

# 24.练习三：自动点名器

需求：班级里有N个学生，被点到的学生不会再被点到。但是如果班级中所有的学生都点完了， 需要重新开启第二轮点名。

```java
//1.定义集合
ArrayList<String> list1 = new ArrayList<>();
//2.添加数据
Collections.addAll(list1, "范闲", "范建", "范统", "杜子腾", "杜琦燕", "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰", "袁明媛");
```

在随机的时候，可以随机一个删一个。

~~~java
Random r = new Random();
int index = r.nextInt(list.size());
String name = list.get(index);
list.remove(name);
~~~

上面随机名字和删除名字其实是可以合成一行的，这是因为 `remove()` 有两个方法

- 根据元素删，返回 `boolean` ，表示当前的元素是否删除成功
- 根据索引删，它会返回被删除的元素

<img src="./assets/image-20240429094501145.png" alt="image-20240429094501145" style="zoom:67%;" />

~~~java
 String name = list.remove(index);
~~~

但如果直接这么写，那么每运行一次程序都会创建一个新的集合，并没有达到题目想要抽取到所有人的目的，因此需要使用循环来改善。

~~~java
Random r = new Random();
for (int i = 0; i < list.size(); i++) {
    int index = r.nextInt(list.size());
    String name = list.get(index);
    list.remove(name);
}
~~~

首先我们需要知道：集合的长度是可以发生变化的，在一开始的时候，集合的长度是 `10`。

满足 `i < 10，即 0 < 10`，第一次进入循环，删除元素成功后，集合的长度就变为了 `9`。

满足 `i < 9，即 0 < 9`，第一次进入循环，删除元素成功后，集合的长度就变为了 `9`。

..............以此类推

由此可见，问题出在：`list.size()` 是变化的。

解决办法：在上面重新定义一个变量。

~~~java
int count = list.size();
Random r = new Random();
for (int i = 0; i < count; i++) {
    int index = r.nextInt(list.size());
    String name = list.get(index);
    list.remove(name);
}
~~~

但是由于题目还有个要求：如果班级中所有的学生都点完了， 需要重新开启第二轮点名。

那么此时删掉的名字就不能真正的删，还需要再拿个集合存起来。

~~~java
//创建一个临时的集合，用来存已经被点到学生的名字
ArrayList<String> list2 = new ArrayList<>();
//外循环：表示轮数
for (int i = 1; i <= 10; i++) {
    System.out.println("=========第" + i + "轮点名开始了======================");
    //3.获取集合的长度
    int count = list1.size();
    //4.随机点名
    Random r = new Random();
    //内循环：每一轮中随机循环抽取的过程
    for (int j = 0; j < count; j++) {
        int index = r.nextInt(list1.size());
        String name = list1.remove(index);
        list2.add(name);
        System.out.println(name);
    }
    //此时表示一轮点名结束
    //将list2的数据全部加到list1中
    list1.addAll(list2);
    list2.clear();
}
~~~



----

# 25.练习四：带权重的随机点名项目

<img src="./assets/image-20240429101110070.png" alt="image-20240429101110070" style="zoom:67%;" />

这一题会涉及到后面的知识点，因此这里先写不了。

其中这里的 `带权重随机算法` 还是很重要的：在以后，我们会学习到微服务架构，那为什么会有微服务呢？

其实就是因为现在上网的人太多了，一台服务器扛不住了，就需要将一个大项目拆分成n个小项目，部署在n个服务器中。

但是这就会有一个小问题：

不想打字了，以后有时间再补



----

# 26.练习五：集合嵌套

需求：定义一个Map集合，键用表示省份名称province，值表示市city，但是市会有多个。

添加完毕后，遍历结果格式如下：江苏省 = 南京市，扬州市，苏州市，无锡市，常州市

之前我们说过，`Map集合` 如果没有特殊要求，那么默认使用 `HashMap`，因为它的效率最高。

~~~java
//1.创建Map集合
HashMap<String, ArrayList<String>> hm = new HashMap<>();

//2.创建单列集合存储市
ArrayList<String> city1 = new ArrayList<>();
city1.add("南京市");
city1.add("扬州市");
city1.add("苏州市");
city1.add("无锡市");
city1.add("常州市");

ArrayList<String> city2 = new ArrayList<>();
city2.add("武汉市");
city2.add("孝感市");
city2.add("十堰市");
city2.add("宜昌市");
city2.add("鄂州市");

ArrayList<String> city3 = new ArrayList<>();
city3.add("石家庄市");
city3.add("唐山市");
city3.add("邢台市");
city3.add("保定市");
city3.add("张家口市");

//3.把省份和多个市添加到map集合
hm.put("江苏省",city1);
hm.put("湖北省",city2);
hm.put("河北省",city3);

Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();
for (Map.Entry<String, ArrayList<String>> entry : entries) {
    //entry依次表示每一个键值对对象
    String key = entry.getKey();
    ArrayList<String> value = entry.getValue();
    StringJoiner sj = new StringJoiner(", ","","");
    for (String city : value) {
        sj.add(city);
    }

    System.out.println(key + " = " + sj);
}
~~~



----

# 27.斗地主 —— 准洗发

## 一、前言

首先来完成控制台版的前三步。

```java
完成斗地主游戏中的以下步骤：
准备牌
洗牌
发牌
// "♦", "♣", "♥", "♠"
// "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"
```

包下的 `APP` 就表示是程序的启动入口

<img src="./assets/image-20240429105337084.png" alt="image-20240429105337084" style="zoom:67%;" />

在以后我们真实写项目的时候，是不会在 `main方法` 中去写一写核心的逻辑的， `main方法` 一般是作为程序的启动入口。

此时我们要在 `main方法` 中做的就是：直接创建游戏的类就行了。

当创建 `PokerGame类` 对象的时候，其实就表示开启了游戏

~~~java
public class App {
    public static void main(String[] args) {
        new PokerGame();
    }
}
~~~

创建对象，实际上会调用 `PokerGame` 中的空参构造，因此我们将 `准备牌、洗牌、发牌、看牌` 写在空参构造中即可。

其中，`准备牌` 的逻辑应该写在构造方法的外面，假设我们在 `APP.java` 中创建了两个 `PokerGame` 的对象，表示我们当前要打两局斗地主，如果将 `准备牌` 写在了构造方法中，那么每打一局游戏都需要 `准备牌`，太浪费了。

因此不管打多少局游戏，都只要准备一副牌就行了，此时就需要用到我们以前学习的知识点了。

静态代码块：随着类的加载而加载，而且只执行一次

~~~java
package com.itheima.doudizhu1;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {
    static {
        //准备牌
    }

    public PokerGame(){
        //洗牌
        
        //发牌
        
        //看牌
    }
}
~~~

----

## 二、准备牌

由于 `牌的花色` 和 `牌上的数字` 个数都是有限的，因此我们可以使用数组存储。

~~~java
//牌盒
static ArrayList<String> list = new ArrayList<>();

//静态代码块
//特点：随着类的加载而在加载的，而且只执行一次。
static {
    //准备牌
    // "♦", "♣", "♥", "♠"
    // "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"
    String[] color = {"♦", "♣", "♥", "♠" };
    String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

    for (String c : color) {
        //c依次表示每一种花色
        for (String n : number) {
            //n 依次表示每一个数字
            list.add(c + n);
        }
    }
    list.add("小王");
    list.add("大王");
}
~~~

-----

## 三、洗牌

~~~java
//洗牌
Collections.shuffle(list);
~~~

----

## 四、发牌

发牌需要准备四个集合，因为底牌需要存起来。

`load`：地主。底牌里面的三张牌就是给地主准备的。

~~~java
ArrayList<String> lord = new ArrayList<>();
ArrayList<String> player1 = new ArrayList<>();
ArrayList<String> player2 = new ArrayList<>();
ArrayList<String> player3 = new ArrayList<>();
~~~

接下来就是发牌。

由于发牌的时候，前三张是底牌，剩下的牌是三个玩家轮流发的，因此这里需要用到牌的序号，因此使用 `普通for + get()` 的方式遍历

~~~java
//遍历牌盒得到每一张牌
for (int i = 0; i < list.size(); i++) {
    //i：索引
    String poker = list.get(i);
    if(i <= 2){
        lord.add(poker);
        continue;
    }

    //给三个玩家轮流发牌
    if(i % 3 == 0){
        player1.add(poker);
    }else if(i % 3 == 1){
        player2.add(poker);
    }else{
        player3.add(poker);
    }
}
~~~

----

## 五、看牌

~~~java
//看牌
lookPoker("底牌",lord);
lookPoker("钢脑壳",player1);
lookPoker("大帅比",player2);
lookPoker("蛋筒",player3);

/*
* 参数一：玩家的名字
* 参数二：每位玩家的牌
* */
public void lookPoker(String name, ArrayList<String> list){
    System.out.print(name + ": ");
    for (String poker : list) {
        System.out.print(poker + " ");
    }
    System.out.println();
}
~~~

---

## 六、完整代码

~~~java
public class App {
    public static void main(String[] args) {
      /*
        完成控制台版的三步：
          准备牌
          洗牌
          发牌
       */
        //从程序的主入口开启斗地主游戏
        new PokerGame();
    }
}

public class PokerGame {
    //牌盒
    //♥3 ♣3
    static ArrayList<String> list = new ArrayList<>();

    //静态代码块
    //特点：随着类的加载而在加载的，而且只执行一次。
    static {
        //准备牌
        // "♦", "♣", "♥", "♠"
        // "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"
        String[] color = {"♦", "♣", "♥", "♠" };
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        for (String c : color) {
            //c依次表示每一种花色
            for (String n : number) {
                //n 依次表示每一个数字
                list.add(c + n);
            }
        }
        list.add("小王");
        list.add("大王");
    }

    public PokerGame(){
        //洗牌
        Collections.shuffle(list);

        //发牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        //遍历牌盒得到每一张牌
        for (int i = 0; i < list.size(); i++) {
            //i：索引
            String poker = list.get(i);
            if(i <= 2){
                lord.add(poker);
                continue;
            }

            //给三个玩家轮流发牌
            if(i % 3 == 0){
                player1.add(poker);
            }else if(i % 3 == 1){
                player2.add(poker);
            }else{
                player3.add(poker);
            }
        }
        //看牌
        lookPoker("底牌",lord);
        lookPoker("钢脑壳",player1);
        lookPoker("大帅比",player2);
        lookPoker("蛋筒",player3);

    }

    /*
    * 参数一：玩家的名字
    * 参数二：每位玩家的牌
    * */
    public void lookPoker(String name, ArrayList<String> list){
        System.out.print(name + ": ");
        for (String poker : list) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
~~~



---

# 28.斗地主 —— 排序方式一：利用序号进行排序

## 一、思路分析

排序的过程中，最让人头疼的是：最小的数字 `2` 反而是最大的，因此我们不好找出它的规律。那怎么办呢？

<img src="./assets/image-20240429113557682.png" alt="image-20240429113557682" style="zoom: 33%;" />

牌没有规律，但是数字是有规律的。因此我们可以将牌按照指定的规则先进行手动的排列，然后再跟 `1 / 2 / 3 ...` 这样的数字一一对应。对应完后，我们就可以认为：数字越大，所对应的牌也就越大。

因此我们需要使用 `Map集合` 将这种对应关系存起来。

那么问题就来了：在 `Map集合` 集合中，是底下的需要作为 `键`，还是上面的牌作为 `键` 呢？

![image-20240429113838891](./assets/image-20240429113838891.png)

其实谁作为键有一个规则，在下面的代码中，我们以谁为主导，谁就作为键。

在刚刚我们说了，我们需要将牌先跟序号对应起来，对应起来的目的：牌的规则我们不好把握，但是下面序号的规则就很好把握。

那么在下面的代码中，我们实际上操作的都是序号，因此我们需要将序号当做 `键`。

与此同时，我们还会创建一个单列集合，用来单独存储牌的序号，这样准备牌的动作我们才算是准备好了。

接下来还有洗牌，所谓洗牌其实洗的就是序号。

发牌发的也是序号，前三个序号作为底牌，后面所有的序号再依次发给三个玩家。

发完后会发现，序号是没有顺序的，我们还需要将序号进行排序。

![image-20240429123817449](./assets/image-20240429123817449.png)

完事后，在看牌的时候，我们就可以拿着序号到一开始的 `Map集合` 中找对应的牌就行了。

![image-20240429123829498](./assets/image-20240429123829498.png)

此时牌就有序了。这种排序思想是利用了编程圈中的：对应思想 —— 如果原始数据的规律非常复杂，我们可以先手动排序让`每一个数据` 跟 `唯一的序号`产生对应关系。

这里的序号就是数字，规律非常简单，后续的所有操作，我们以序号为准。

当真正需要操作原始数据的时候，再通过序号找到原始数据即可。

----

## 二、准备牌

基础代码

```java
public class App {
    public static void main(String[] args) {
        //从程序的主入口开启斗地主游戏
        new PokerGame();
    }
}

public class PokerGame {
    static {
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
    }
}
```

接下来的目的：将序号跟牌产生对应关系。

~~~java
public class PokerGame {
    //牌盒 Map
    //此时我们只要把牌跟序号产生对应关系就可以了，不需要按照序号进行排序，所以只要HashMap就可以了
    //由于在静态代码块中需要用到这个集合，因此集合前面需要加上static
    static HashMap<Integer, String> hm = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();

    static {
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        //序号
        int serialNumber = 1;
        
        for (String c : color) {
            //依次表示每一个数字
            for (String n : number) {
                //依次表示每一个花色
                hm.put(serialNumber, c + n);
                list.add(serialNumber);
                serialNumber++;
            }
        }

        hm.put(serialNumber, "小王");
        list.add(serialNumber);
        serialNumber++;
        hm.put(serialNumber, "大王");
        list.add(serialNumber);
    }
}
~~~

如果跟之前一样，外层循环是花色，内存循环是数字，那么打印结果如下。

思考一下这里面的规律，例如玩家1被分到的序号是：`1 2 3 4 5 14`，通过这个序号，去查到对应的牌，真的就有序了吗？

~~~java
{1=♦3, 2=♦4, 3=♦5, 4=♦6, 5=♦7, 6=♦8, 7=♦9, 8=♦10, 9=♦J, 10=♦Q, 11=♦K, 12=♦A, 13=♦2, 
 14=♣3, 15=♣4, 16=♣5, 17=♣6, 18=♣7, 19=♣8, 20=♣9, 21=♣10, 22=♣J, 23=♣Q, 24=♣K, 25=♣A, 26=♣2, 
 27=♥3, 28=♥4, 29=♥5, 30=♥6, 31=♥7, 32=♥8, 33=♥9, 34=♥10, 35=♥J, 36=♥Q, 37=♥K, 38=♥A, 39=♥2, 
 40=♠3, 41=♠4, 42=♠5, 43=♠6, 44=♠7, 45=♠8, 46=♠9, 47=♠10, 48=♠J, 49=♠Q, 50=♠K, 51=♠A, 52=♠2, 
 53=小王, 54=大王}
~~~

可以发现并不是，因此这种规则其实是不对的。

解决办法：只需要将循环的内外层对调一下就行了

~~~java
//细节
for (String c : color) {
    //依次表示每一个数字
    for (String n : number) {
        //依次表示每一个花色
        hm.put(serialNumber, c + n);
        System.out.println(c + n);
        list.add(serialNumber);
        serialNumber++;
    }
}
~~~

----

## 三、洗牌

此时真正洗的应该是牌的序号

~~~java
public PokerGame() {
    //洗牌
    Collections.shuffle(list);
}
~~~

----

## 四、发牌

发牌我们发的其实也是序号。

在之前我们使用的是 `ArrayList`，但是这里可以使用 `TreeSet` 进行改进，因为 `TreeSet` 是支持排序的。

当我们将序号加入到 `TreeSet` 后，就会按照默认的方式进行排序，`Integer` 中默认的排序方式就是从小到大排列。

~~~java
public PokerGame() {
    //发牌
    TreeSet<Integer> lord = new TreeSet<>();
    TreeSet<Integer> player1 = new TreeSet<>();
    TreeSet<Integer> player2 = new TreeSet<>();
    TreeSet<Integer> player3 = new TreeSet<>();

    for (int i = 0; i < list.size(); i++) {
        //i :依次表示集合中的每一个索引
        //list.get(i)元素：牌的序号
        int serialNumber = list.get(i);

        if(i <= 2){
            lord.add(serialNumber);
            continue;
        }

        if(i % 3 == 0){
            player1.add(serialNumber);
        }else if(i % 3 == 1){
            player2.add(serialNumber);
        }else{
            player3.add(serialNumber);
        }
    }
}
~~~

-----

## 五、看牌

~~~java
//看牌
lookPoker("底牌",lord);
lookPoker("钢脑壳",player1);
lookPoker("大帅比",player2);
lookPoker("蛋筒",player3);

/*
    * 参数一：玩家的名字
    * 参数二：牌的序号
    * */
public void lookPoker(String name, TreeSet<Integer> ts){
    System.out.print(name + ": ");
    //遍历TreeSet集合得到每一个序号，再拿着序号到Map集合中去找真正的牌
    for (int serialNumber : ts) {
        String poker = hm.get(serialNumber);
        System.out.print(poker + " ");
    }
    System.out.println();
}
}
~~~

----

## 六、完整代码

~~~java
package com.itheima.doudizhu2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {

    //牌盒 Map
    //此时我们只要把牌跟序号产生对应关系就可以了，不需要按照序号进行排序，所以只要HashMap就可以了
    static HashMap<Integer, String> hm = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();


    static {
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        //序号
        int serialNumber = 1;
        //细节
        for (String c : color) {
            //依次表示每一个数字
            for (String n : number) {
                //依次表示每一个花色
                hm.put(serialNumber, c + n);
                System.out.println(c + n);
                list.add(serialNumber);
                serialNumber++;
            }
        }

        hm.put(serialNumber, "小王");
        list.add(serialNumber);
        serialNumber++;
        hm.put(serialNumber, "大王");
        list.add(serialNumber);

        System.out.println(hm);
    }


    public PokerGame() {
        //洗牌
        Collections.shuffle(list);

        //发牌
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            //i :依次表示集合中的每一个索引
            //list.get(i)元素：牌的序号
            int serialNumber = list.get(i);

            if(i <= 2){
                lord.add(serialNumber);
                continue;
            }

            if(i % 3 == 0){
                player1.add(serialNumber);
            }else if(i % 3 == 1){
                player2.add(serialNumber);
            }else{
                player3.add(serialNumber);
            }
        }


        //看牌
        lookPoker("底牌",lord);
        lookPoker("钢脑壳",player1);
        lookPoker("大帅比",player2);
        lookPoker("蛋筒",player3);
    }

    /*
    * 参数一：玩家的名字
    * 参数二：牌的序号
    * */
    public void lookPoker(String name, TreeSet<Integer> ts){
        System.out.print(name + ": ");
        //遍历TreeSet集合得到每一个序号，再拿着序号到Map集合中去找真正的牌
        for (int serialNumber : ts) {
            String poker = hm.get(serialNumber);
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
~~~



-----

# 29.斗地主 ——  排序方式二：给每一张牌计算价值

## 一、思路分析

牌越大，价值就越大。

假设有下面一副牌，其中中间的数字是最好计算的，它们的价值就是本身的数字。

再往下，`JQK` 对应的价值是 `11、12、13`。

左边的 `A` 对应的加载是 `14`，`2` 对应的价值是 `5`。

最后就是右边的两个王，小王所对应的是 `16`，大王所对应的是 `17`。

一旦牌有了价值后，我们就可以按照加载给它们进行排序。

![image-20240429132451783](./assets/image-20240429132451783.png)

----

## 二、基础代码

前面的准备牌、洗牌、发牌是一样的

~~~java
public class App {
    public static void main(String[] args) {
        new PokerGame();
    }
}

public class PokerGame {
    //牌盒
    static ArrayList<String> list = new ArrayList<>();

    static {
        //准备牌
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        for (String c : color) {
            for (String n : number) {
                list.add(c + n);
            }
        }
        list.add("小王");
        list.add("大王");
    }

    public PokerGame() {
        //洗牌
        Collections.shuffle(list);

        //发牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);
            //发底牌
            if (i <= 2) {
                lord.add(poker);
                continue;
            }

            //给三个玩家轮流发牌
            if (i % 3 == 0) {
                player1.add(poker);
            } else if (i % 3 == 1) {
                player2.add(poker);
            } else {
                player3.add(poker);
            }
        }
    }
}
~~~

----

## 三、指定牌的价值

由于我们是利用牌的价值给它进行排序的，所以首先第一步，需要先规定好牌的价值。

指定牌的价值的时候我们并没有在集合中添加 `本身牌就是数字` 的牌。

这是因为我们可以拿牌上的数字到Map集合中判断是否存在，存在，获取价值；不存在，本身的数字就是价值。

这样可以让集合存储的数据更少，查询的效率也更高一点。

~~~java
//创建一个集合（键是牌上的数字，值是对应的加载），用来添加牌的价值
static HashMap<String, Integer> hm = new HashMap<>();
public PokerGame() {
    //指定牌的价值
    hm.put("J", 11);
    hm.put("Q", 12);
    hm.put("K", 13);
    hm.put("A", 14);
    hm.put("2", 15);
    hm.put("小王", 50);
    hm.put("大王", 100);
}
~~~

----

## 四、排序

这里我们额外写一个方法来进行排序。

在方法中，我们就可以使用 `Collections` 中的 `sort()` 来进行排序。

如果直接将 `list` 放进去的话，那么它采取的就是默认方式进行排序。

集合的泛型是 `String`，因此默认就是按照 `abcdefg` 这种方式进行排序的，但是我们想要的是按照自己的牌指定的价值进行排序。

因此在参数二的位置就需要传入比较器对象，自己制定排序的规则。

我们可以简单来看一下 `sort()` 底层的源码，跟进看看。

可以发现在底层，它又去调用了 `list` 的 `sort()`，并将比较器对象传递过去

<img src="./assets/image-20240429143748192.png" alt="image-20240429143748192" style="zoom:67%;" />

选中 `sort()` 继续跟进，可以发现在方法的底层，它首先会把集合变成数组，然后再去调用 `Arrays.sort()`。

`Arrays.sort()` 就是使用插入排序和二分查找两个结合的方式进行排序的。

<img src="./assets/image-20240429143822120.png" alt="image-20240429143822120" style="zoom:67%;" />

规则如下

~~~java
负数：o1小 插入到前面
正数：o1大 插入到后面
0：o1的数字跟o2的数字是一样的，需要按照花色再次排序
~~~

代码示例

~~~java
//利用牌的价值进行排序
//参数：集合
//♥5 ♥3 ♥6 ♥7 ♥9
public void order(ArrayList<String> list){
    Collections.sort(list, new Comparator<String>() {
        //Array.sort （插入排序 + 二分查找）
        @Override
        //o1：表示当前要插入到有序序列中的牌
        //o2：表示已经在有序序列中存在的牌
        public int compare(String o1, String o2) {
            //1.计算o1的花色和价值   大王
            String color1 = o1.substring(0, 1);
            int value1 = getValue(o1);

            //2.计算o2的花色和价值
            String color2 = o2.substring(0, 1);
            int value2 = getValue(o2);

            //3.比较o1和o2的价值    
            int i = value1 - value2;
            // 如果两张牌价值是一样的♥3  ♠3，那么就需要比较花色
            return i == 0 ? color1.compareTo(color2) : i;
        }
    });
}

// 由于o1和o2的价值都需要进行计算，因此抽取成方法
//计算牌的价值
//参数：牌
//返回值：价值
public int getValue(String poker){// 例如：♥3
    //获取牌上的数字
    String number = poker.substring(1);//把这里截取出来的结果，让这个结果再Map集合中存在 “ 大王”
    //拿着数字到map集合中判断是否存在
    if(hm.containsKey(number)){
        //存在，获取价值
        return hm.get(number);
    }else{
        //不存在，类型转换
        return Integer.parseInt(number);
    }
}
~~~

排序

~~~java
public PokerGame() {
    //排序
    order(lord);
    order(player1);
    order(player2);
    order(player3);
}
~~~

此时会报错

![image-20240429150725893](./assets/image-20240429150725893.png)

这是因为在截取的时候

~~~java
String color1 = o1.substring(0, 1); // 截出来的是：大 / 小
int value1 = getValue(o1); // 这里传递进去的就是：王
~~~

而且 `王` 在 `集合` 中并不存在，因此就会执行到 `return Integer.parseInt(number);` ，就会导致报错。

解决办法：在集合中添加牌的时候前面多一个空格就行了，这样就可以保证大小王跟上面牌的格式是一样的，将空格认为是大小王的花色。

~~~java
list.add(" 小王");
list.add(" 大王");
~~~

----

## 五、完整代码

~~~java
public class PokerGame {
    //牌盒
    static ArrayList<String> list = new ArrayList<>();

    //创建一个集合，用来添加牌的价值
    static HashMap<String, Integer> hm = new HashMap<>();

    static {
        //准备牌
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        for (String c : color) {
            for (String n : number) {
                list.add(c + n);
            }
        }
        list.add("小王");
        list.add("大王");


        //指定牌的价值
        //牌上的数字到Map集合中判断是否存在
        //存在，获取价值
        //不存在，本身的数字就是价值
        hm.put("J", 11);
        hm.put("Q", 12);
        hm.put("K", 13);
        hm.put("A", 14);
        hm.put("2", 15);
        hm.put("小王", 50);
        hm.put("大王", 100);


    }

    public PokerGame() {
        //洗牌
        Collections.shuffle(list);

        //发牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);
            //发底牌
            if (i <= 2) {
                lord.add(poker);
                continue;
            }

            //给三个玩家轮流发牌
            if (i % 3 == 0) {
                player1.add(poker);
            } else if (i % 3 == 1) {
                player2.add(poker);
            } else {
                player3.add(poker);
            }
        }


        //排序
        order(lord);
        order(player1);
        order(player2);
        order(player3);


        //看牌
        lookPoker("底牌",lord);
        lookPoker("钢脑壳",player1);
        lookPoker("大帅比",player2);
        lookPoker("蛋筒",player3);
    }


    /*
     * 参数一：玩家的名字
     * 参数二：每位玩家的牌
     * */
    public void lookPoker(String name, ArrayList<String> list){
        System.out.print(name + ": ");
        for (String poker : list) {
            System.out.print(poker + " ");
        }
        System.out.println();

    }


    //利用牌的价值进行排序
    //参数：集合
    //♥5 ♥3 ♥6 ♥7 ♥9
    public void order(ArrayList<String> list){
        Collections.sort(list, new Comparator<String>() {
            //Array.sort （插入排序 + 二分查找）
            @Override
            public int compare(String o1, String o2) {
                //o1：表示当前要插入到有序序列中的牌
                //o2：表示已经在有序序列中存在的牌

                //负数：o1小 插入到前面
                //正数：o1大 插入到后面
                //0：o1的数字跟o2的数字是一样的，需要按照花色再次排序

                //1.计算o1的花色和价值   大王
                String color1 = o1.substring(0, 1);
                int value1 = getValue(o1);

                //2.计算o2的花色和价值
                String color2 = o2.substring(0, 1);
                int value2 = getValue(o2);

                //3.比较o1和o2的价值    ♥3  ♠3
                int i = value1 - value2;
                return i == 0 ? color1.compareTo(color2) : i;

            }
        });
    }

    //计算牌的价值
    //参数：牌
    //返回值：价值
    public int getValue(String poker){//♥3
        //获取牌上的数字
        String number = poker.substring(1);//把这里截取出来的结果，让这个结果再Map集合中存在 “ 大王”
        //拿着数字到map集合中判断是否存在
        if(hm.containsKey(number)){
            //存在，获取价值
            return hm.get(number);
        }else{
            //不存在，类型转换
            return Integer.parseInt(number);
        }
    }
}
~~~



-----

# 30.斗地主 —— 登录页面

接下来就要开始写带页面的斗地主游戏了，它包含两个页面：登录页面和游戏主页面。

这个东西因为知识点受限，有的东西我们还没学，因此这里只能完成大约 `40%`，剩余的 `60%` 等学到对应的知识点就能完成了。

<img src="./assets/image-20240429151710790.png" alt="image-20240429151710790" style="zoom: 57%;" />

我们首先来看登录页面。

----

# 31.斗地主 —— 游戏界面

## 一、思路分析

首先我们需要来分析这些界面中有哪些东西，然后才能开始写代码。

这些界面代码不需要大家自己写，但是我们需要知道里面有哪些东西。

它有的东西非常多，但是不要慌，我们一个一个来讲解。

<img src="./assets/image-20240429154338694.png" alt="image-20240429154338694" style="zoom:57%;" />

最重要的肯定是中间的牌盒，一开始我们需要将所有的牌加载到牌盒中，然后才能洗牌、发牌，这个牌盒我们就可以用一个集合来表示。

还有就是三个玩家手上的牌和三张底牌，这个也可以使用集合来表示。因此我们一共需要有四个结合。

只不过三个玩家手上的牌在很多地方都需要使用，因此需要统一管理：我们需要拿一个集合去装它们，这里就会用到集合的嵌套。

在大集合中，`0索引` 就是左边第一个玩家的牌，`1索引` 就是中间我们自己的牌，`2索引` 就是右边玩家的牌。

底牌是不会放到大集合中的，因为底牌不会在很多地方用到，它是作为一个单独的集合放在这里。

![image-20240429154803614](./assets/image-20240429154803614.png)

在后面打牌的时候，我们还需要再用一个集合，将我们打出的牌装起来。

如果不装，就不好判断当前玩家是什么牌型。也不好判断两个玩家之间谁的牌打，谁的牌小。

因此我们还需要再定义三个集合用来装当前打出的牌。

这里有一个小细节：我们每次在打牌的时候，需要注意数据移动的方向。

例如我们打 `红桃三`，那么此时就是从我手上的牌的集合移动到上面的集合中。

<img src="./assets/image-20240429155053085.png" alt="image-20240429155053085" style="zoom:67%;" />

并且这三个集合，我们也需要使用一个大集合进行管理：`0索引` 就是左边第一个玩家打出的牌，`1索引` 就是中间我们自己打出的牌，`2索引` 就是右边玩家打出的牌。

以上就是我们在打牌的过程中所用到的八个集合。

<img src="./assets/image-20240429155241665.png" alt="image-20240429155241665" style="zoom:67%;" />

继续往下，还有提示的文本信息，即这里的倒计时，每一个玩家前面都有，其实就是三个 `JLabel`，我们要使用一个大数组去进行管理。

但是为什么这里使用数组呢？

一般来说数据比较少，不需要进行删除 / 添加操作的，就可以使用数组来进行管理。

但是如果我们需要频繁的删除  / 添加数据，此时就需要用到集合来进行管理了。

跟集合一样，`0索引` 就是左边第一个玩家提示的文字，`1索引` 就是中间我们自己提示的文字，`2索引` 就是右边玩家提示的文字。

<img src="./assets/image-20240429155642768.png" alt="image-20240429155642768" style="zoom:67%;" />

还没完，在我们自己面前，还有四个简单的按钮，只不过这四个按钮不会让他们同时展示出来。

在代码中我们会将这四个按钮分成两组，再用大数组进行管理。

`0索引` 就是左边的按钮，`1索引` 就是右边的按钮。

![image-20240429155850251](./assets/image-20240429155850251.png)

最后一个，左下角地主的图标，这个也是一个 `JLabel`，谁是地主，我们就将这个图标放在谁的前面。

![image-20240429155951029](./assets/image-20240429155951029.png)

----

## 二、代码实现

首先界面代码是不需要你自己写的，我们只需要能看懂即可。

首先在最上面，我们定义了一个静态变量 `container`，它表示JFrame界面中隐藏容器，所有的组件都需要放到隐藏的容器中。

<img src="./assets/image-20240429160324701.png" alt="image-20240429160324701" style="zoom:67%;" />

如果我们没有把它放到成员位置，那以后在添加组件的时候每次都需要去调用 `this.getContentPane()` 获取到隐藏的容器，然后再去调用 `add()` 才能去添加组件。

我觉得每次都这么写太麻烦了，而且每次都需要调用 `this.getContentPane()` 方法，效率比较低。

如果我们不想让这个方法频繁的被调用，此时就可以在 `initJframe()` 中只调用一次这个方法，相当于在一开始的会死后就将隐藏的容器获取出来了，然后将它获取给成员位置的 `container`。

<img src="./assets/image-20240429160645692.png" alt="image-20240429160645692" style="zoom:70%;" />

那么以后我们在添加组件的时候，就不需要去调用方法获取隐藏容器再去调用add了，而是直接使用 `container` 调用 `add()` 就行了，效率会有一丢丢的提升，代码也更简单了。



-----

# 32.斗地主 —— 面向对象设计（Poker）

## 一、属性

面向对象设计：说白了，就是在JavaBean类中要定义几个属性、定义几个方法。

面向对象的设计不能自己想，一定要结合业务场景、业务需求慢慢分析，脱离业务需求去说面向对象的设计就是耍流氓。

现在我们来想一下，在斗地主游戏中，这个牌我们该怎么表示。

首先第一个属性要想到：是牌的名字，在之前我们写的控制台版本中，直接一个字符串就搞定了，但是现在，涉及到图形化界面了就要复杂一些。

<img src="./assets/image-20240429195611491.png" alt="image-20240429195611491" style="zoom:67%;" />

在以前，这张牌的名字是 `♠A`，但是在 `Windows操作系统` 中，它是不允许这种奇奇怪怪的符号当做名字的。

所以要来改一改，我们会用 `数字-数字` 的方式进行表示，前面的数字表示花色，后面的数字就表示牌，因此 `♠A` 的名字就是：`1-1`

<img src="./assets/image-20240429195850315.png" alt="image-20240429195850315" style="zoom:50%;" />

可以发现每张牌的图片也是由这个来命名的

![image-20240429200305732](./assets/image-20240429200305732.png)

---

第二个属性应该是什么呢？

通过玩游戏可以发现，有的牌是正面，但有的牌是反面，因此还需要有一个属性去表示牌的正反面。

正反面由两种状态，这个属性应该是 `boolean`

<img src="./assets/image-20240429200511937.png" alt="image-20240429200511937" style="zoom:67%;" />

----

当我在打牌的时候，需要对牌进行点击，点击完后，它应该会有一个升起的动作，但是不是所有的牌都能点。

因此还需要第三个属性，来表示牌是否可以被点击。

<img src="./assets/image-20240429200815690.png" alt="image-20240429200815690" style="zoom:57%;" />

---

还没完，还有第四个属性需要考虑：我们需要来判断一下，自己的牌是否已经被点击了。

如果牌已经被弹起，再点击它，就会执行降落的操作。

因此这个牌还需要有第四个属性，用来记录当前的牌是否已经被点击。

<img src="./assets/image-20240429201021420.png" alt="image-20240429201021420" style="zoom:50%;" />

----

## 二、方法

方法非常简单，有三个方法：

- 显示牌正面的方法
- 显示牌反面的方法
- 牌被点击后要执行的方法

这个图片是需要交给 `JLabel` 去管理的，因此我们先让 `Poker类` 继承 `JLabel`，表示当前的牌其实也就是一个 `JLabel` 管理容器，它可以管理我们加载进来的每一张牌。

~~~java
public class Poker extends JLabel implements MouseListener {

    //属性
    //1.牌的名字 格式：数字 - 数字
    private String name;

    //2.牌显示正面还是反面
    private boolean up;

    //3.是否可以被点击
    private boolean canClick = false;

    //4.当前的状态，表示当前的牌是否已经被点击
    //如果是没有被点击的状态，此时被点击了，会执行弹起的操作
    //如果是已经被点击的状态，此时被点击了，会执行降落的操作
    private boolean clicked = false;

    // 构造方法这里就不建议写空参构造了，因为每张牌必须有名字，必须有正反面，其他的属性都是有默认值的。
    public Poker(String name,boolean up){
        this.name = name;
        this.up = up;
        //判断当前的牌是显示正面还是反面
        if(this.up){
            //显示正面
            turnFront();
        }else{
            //显示反面
            turnRear();
        }
        //设置牌的宽高
        this.setSize(71,96);
        //把牌显示出来
        this.setVisible(true);
        //给每一张牌添加监听，JLabel只能添加鼠标监听，其他的监听是添加不了的
        this.addMouseListener(this);
    }

    //显示正面
    public void turnFront(){
        //给牌设置正面
        this.setIcon(new ImageIcon("farmerandlord\\image\\poker\\"+name+".png"));
        //修改成员变量
        this.up = true;
    }

    //显示反面
    public void turnRear(){
        //给牌设置反面
        this.setIcon(new ImageIcon("farmerandlord\\image\\poker\\rear.png"));
        //修改成员变量
        this.up = false;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //点击
        //判断当前的牌是否可以被点击
        if(canClick){
            //当牌被点击之后，要么升起，要么降落
            //表示牌的位移像素
            int step = 0;
            if(clicked){
                //表示当前的牌已经被点击
                //降落（y 增加 20像素）
                step = 20;
            }else{
                //表示当前的牌还没有被点击
                //升起 （y 减少 20像素）
                step = -20;
            }
            //需要修改一下clicked变量记录的值
            clicked = !clicked;
            //修改一下牌的位置
            Point from = this.getLocation(); // 获取当前牌的位置
            //创建一个Point的对象，表示结束位置
            Point to = new Point(from.x,from.y + step);
            //把最新的位置设置给牌
            this.setLocation(to);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return up
     */
    public boolean isUp() {
        return up;
    }

    /**
     * 设置
     * @param up
     */
    public void setUp(boolean up) {
        this.up = up;
    }

    /**
     * 获取
     * @return canClick
     */
    public boolean isCanClick() {
        return canClick;
    }

    /**
     * 设置
     * @param canClick
     */
    public void setCanClick(boolean canClick) {
        this.canClick = canClick;
    }

    /**
     * 获取
     * @return clicked
     */
    public boolean isClicked() {
        return clicked;
    }

    /**
     * 设置
     * @param clicked
     */
    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }

    public String toString() {
        return "Poker{name = " + name + ", up = " + up + ", canClick = " + canClick + ", clicked = " + clicked + "}";
    }
}
~~~



----

# ---------------------------------

# day26 集合（Stream流&方法引用）

# 34.不可变集合



## 一、创建不可变集合

不可变集合：不可以被修改的集合。

一旦创建完毕后，长度不能改，内容也不能改。

----

## 二、`创建不可变集合` 的应用场景

如果某个数据不能被修改，把它防御性拷贝到不可变集合中是个很好的实际。

当集合对象被不可信的库调用时，不可变形式是安全的。

简单理解：如果你不想让别人去修改集合中的内容，那么就可以给它去提供一个不可变的集合。

当别人拿到这个不可变的集合后，它只能进行查询操作，是不能修改 / 删除 / 添加的。

这样的场景有很多，例如斗地主游戏中的牌盒，牌盒中装了所有的牌，这些牌是固定的，一共 `54张`。

我不想让别人去修改，那万一别人加个 `3` 进去，那就是出老千了。

因此为了防止别人出老千，我们就可以使用不可变的集合

![image-20240429213634472](./assets/image-20240429213634472.png)

还有斗地主游戏中的出牌规则，这些规则不想增加，也不想删除，也不想让别人修改，也可以使用不可变集合。

<img src="./assets/image-20240429213932604.png" alt="image-20240429213932604" style="zoom:50%;" />

还有用代码获取的操作系统硬件信息，也是不能被修改的。

总而言之，只要你不想让别人去修改集合中的数据，只想让别人进行查询操作的话，这些数据就可以放到不可变集合中。

----

## 三、创建不可变集合的书写格式

在 `List`、`Set`、`Map` 接口中，都存在静态的 `of方法`，可以获取一个不可变的集合。

![image-20240429214446004](./assets/image-20240429214446004.png)

----

## 四、创建不可变的 `List集合`

可以发现这个方法的形参是个可变参数，因此在这个方法里面我们可以传递很多数据。

<img src="./assets/image-20240429215654401.png" alt="image-20240429215654401" style="zoom:67%;" />

~~~java
//一旦创建完毕之后，是无法进行修改的，在下面的代码中，只能进行查询操作
List<String> list = List.of("张三", "李四", "王五", "赵六");

System.out.println(list.get(0));
System.out.println(list.get(1));
System.out.println(list.get(2));
System.out.println(list.get(3));

System.out.println("---------------------------");

for (String s : list) {
    System.out.println(s);
}

System.out.println("---------------------------");


Iterator<String> it = list.iterator();
while(it.hasNext()){
    String s = it.next();
    System.out.println(s);
}
System.out.println("---------------------------");

for (int i = 0; i < list.size(); i++) {
    String s = list.get(i);
    System.out.println(s);
}
System.out.println("---------------------------");

//list.remove("李四");
//list.add("aaa");
list.set(0,"aaa");
}
~~~

----

## 五、创建不可变的 `Set集合` 

可以发现，它的形参跟刚刚的 `List.of()` 是一模一样的，也是一个可变参数，因此我们可以往小括号中传递很多信息。

<img src="./assets/image-20240429215920381.png" alt="image-20240429215920381" style="zoom:67%;" />

~~~java
//一旦创建完毕之后，是无法进行修改的，在下面的代码中，只能进行查询操作
Set<String> set = Set.of("张三", "张三", "李四", "王五", "赵六");

//由于Set集合是没有索引的，因此如果我们想要查询，只能遍历
for (String s : set) {
    System.out.println(s);
}

System.out.println("-----------------------");

Iterator<String> it = set.iterator();
while(it.hasNext()){
    String s = it.next();
    System.out.println(s);
}

System.out.println("-----------------------");
//set.remove("王五");
~~~

-----

## 六、创建不可变的 `Map集合` 



~~~java
~~~





### 1.3 不可变集合分类

* 不可变的list集合
* 不可变的set集合
* 不可变的map集合

### 1.4 不可变的list集合

```java
public class ImmutableDemo1 {
    public static void main(String[] args) {
        /*
            创建不可变的List集合
            "张三", "李四", "王五", "赵六"
        */

        //一旦创建完毕之后，是无法进行修改的，在下面的代码中，只能进行查询操作
        List<String> list = List.of("张三", "李四", "王五", "赵六");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        System.out.println("---------------------------");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("---------------------------");


        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("---------------------------");

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("---------------------------");

        //list.remove("李四");
        //list.add("aaa");
        list.set(0,"aaa");
    }
}
```

### 1.5 不可变的Set集合

```java
public class ImmutableDemo2 {
    public static void main(String[] args) {
        /*
           创建不可变的Set集合
           "张三", "李四", "王五", "赵六"


           细节：
                当我们要获取一个不可变的Set集合时，里面的参数一定要保证唯一性
        */

        //一旦创建完毕之后，是无法进行修改的，在下面的代码中，只能进行查询操作
        Set<String> set = Set.of("张三", "张三", "李四", "王五", "赵六");

        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("-----------------------");

        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        System.out.println("-----------------------");
        //set.remove("王五");
    }
}
```

### 1.6 不可变的Map集合

#### 1.6.1：键值对个数小于等于10

```java
public class ImmutableDemo3 {
    public static void main(String[] args) {
       /*
        创建Map的不可变集合
            细节1：
                键是不能重复的
            细节2：
                Map里面的of方法，参数是有上限的，最多只能传递20个参数，10个键值对
            细节3：
                如果我们要传递多个键值对对象，数量大于10个，在Map接口中还有一个方法
        */

        //一旦创建完毕之后，是无法进行修改的，在下面的代码中，只能进行查询操作
        Map<String, String> map = Map.of("张三", "南京", "张三", "北京", "王五", "上海",
                "赵六", "广州", "孙七", "深圳", "周八", "杭州",
                "吴九", "宁波", "郑十", "苏州", "刘一", "无锡",
                "陈二", "嘉兴");

        Set<String> keys = map.keySet();
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }

        System.out.println("--------------------------");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        System.out.println("--------------------------");
    }
}
```

#### 1.6.2：键值对个数大于10

```java
public class ImmutableDemo4 {
    public static void main(String[] args) {

        /*
            创建Map的不可变集合,键值对的数量超过10个
        */

        //1.创建一个普通的Map集合
        HashMap<String, String> hm = new HashMap<>();
        hm.put("张三", "南京");
        hm.put("李四", "北京");
        hm.put("王五", "上海");
        hm.put("赵六", "北京");
        hm.put("孙七", "深圳");
        hm.put("周八", "杭州");
        hm.put("吴九", "宁波");
        hm.put("郑十", "苏州");
        hm.put("刘一", "无锡");
        hm.put("陈二", "嘉兴");
        hm.put("aaa", "111");

        //2.利用上面的数据来获取一个不可变的集合
/*
        //获取到所有的键值对对象（Entry对象）
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        //把entries变成一个数组
        Map.Entry[] arr1 = new Map.Entry[0];
        //toArray方法在底层会比较集合的长度跟数组的长度两者的大小
        //如果集合的长度 > 数组的长度 ：数据在数组中放不下，此时会根据实际数据的个数，重新创建数组
        //如果集合的长度 <= 数组的长度：数据在数组中放的下，此时不会创建新的数组，而是直接用
        Map.Entry[] arr2 = entries.toArray(arr1);
        //不可变的map集合
        Map map = Map.ofEntries(arr2);
        map.put("bbb","222");*/


        //Map<Object, Object> map = Map.ofEntries(hm.entrySet().toArray(new Map.Entry[0]));

        Map<String, String> map = Map.copyOf(hm);
        map.put("bbb","222");
    }
}
```

## 2.Stream流

### 2.1体验Stream流【理解】

- 案例需求

  按照下面的要求完成集合的创建和遍历

  - 创建一个集合，存储多个字符串元素
  - 把集合中所有以"张"开头的元素存储到一个新的集合
  - 把"张"开头的集合中的长度为3的元素存储到一个新的集合
  - 遍历上一步得到的集合

- 原始方式示例代码

  ```java
  public class MyStream1 {
      public static void main(String[] args) {
          //集合的批量添加
          ArrayList<String> list1 = new ArrayList<>(List.of("张三丰","张无忌","张翠山","王二麻子","张良","谢广坤"));
          //list.add()
  
          //遍历list1把以张开头的元素添加到list2中。
          ArrayList<String> list2 = new ArrayList<>();
          for (String s : list1) {
              if(s.startsWith("张")){
                  list2.add(s);
              }
          }
          //遍历list2集合，把其中长度为3的元素，再添加到list3中。
          ArrayList<String> list3 = new ArrayList<>();
          for (String s : list2) {
              if(s.length() == 3){
                  list3.add(s);
              }
          }
          for (String s : list3) {
              System.out.println(s);
          }      
      }
  }
  ```

- 使用Stream流示例代码

  ```java
  public class StreamDemo {
      public static void main(String[] args) {
          //集合的批量添加
          ArrayList<String> list1 = new ArrayList<>(List.of("张三丰","张无忌","张翠山","王二麻子","张良","谢广坤"));
  
          //Stream流
          list1.stream().filter(s->s.startsWith("张"))
                  .filter(s->s.length() == 3)
                  .forEach(s-> System.out.println(s));
      }
  }
  ```

- Stream流的好处

  - 直接阅读代码的字面意思即可完美展示无关逻辑方式的语义：获取流、过滤姓张、过滤长度为3、逐一打印
  - Stream流把真正的函数式编程风格引入到Java中
  - 代码简洁

### 2.2Stream流的常见生成方式【应用】

- Stream流的思想

  ![01_Stream流思想](./assets/01_Stream流思想-1714397952176-1.png)

- Stream流的三类方法

  - 获取Stream流
    - 创建一条流水线,并把数据放到流水线上准备进行操作
  - 中间方法
    - 流水线上的操作
    - 一次操作完毕之后,还可以继续进行其他操作
  - 终结方法
    - 一个Stream流只能有一个终结方法
    - 是流水线上的最后一个操作

- 生成Stream流的方式

  - Collection体系集合

    使用默认方法stream()生成流， default Stream<E> stream()

  - Map体系集合

    把Map转成Set集合，间接的生成流

  - 数组

    通过Arrays中的静态方法stream生成流

  - 同种数据类型的多个数据

    通过Stream接口的静态方法of(T... values)生成流

- 代码演示

  ```java
  public class StreamDemo {
      public static void main(String[] args) {
          //Collection体系的集合可以使用默认方法stream()生成流
          List<String> list = new ArrayList<String>();
          Stream<String> listStream = list.stream();
  
          Set<String> set = new HashSet<String>();
          Stream<String> setStream = set.stream();
  
          //Map体系的集合间接的生成流
          Map<String,Integer> map = new HashMap<String, Integer>();
          Stream<String> keyStream = map.keySet().stream();
          Stream<Integer> valueStream = map.values().stream();
          Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();
  
          //数组可以通过Arrays中的静态方法stream生成流
          String[] strArray = {"hello","world","java"};
          Stream<String> strArrayStream = Arrays.stream(strArray);
        
        	//同种数据类型的多个数据可以通过Stream接口的静态方法of(T... values)生成流
          Stream<String> strArrayStream2 = Stream.of("hello", "world", "java");
          Stream<Integer> intStream = Stream.of(10, 20, 30);
      }
  }
  ```

### 2.3Stream流中间操作方法【应用】

- 概念

  中间操作的意思是,执行完此方法之后,Stream流依然可以继续执行其他操作

- 常见方法

  | 方法名                                          | 说明                                                       |
  | ----------------------------------------------- | ---------------------------------------------------------- |
  | Stream<T> filter(Predicate predicate)           | 用于对流中的数据进行过滤                                   |
  | Stream<T> limit(long maxSize)                   | 返回此流中的元素组成的流，截取前指定参数个数的数据         |
  | Stream<T> skip(long n)                          | 跳过指定参数个数的数据，返回由该流的剩余元素组成的流       |
  | static <T> Stream<T> concat(Stream a, Stream b) | 合并a和b两个流为一个流                                     |
  | Stream<T> distinct()                            | 返回由该流的不同元素（根据Object.equals(Object) ）组成的流 |

- filter代码演示

  ```java
  public class MyStream3 {
      public static void main(String[] args) {
  //        Stream<T> filter(Predicate predicate)：过滤
  //        Predicate接口中的方法	boolean test(T t)：对给定的参数进行判断，返回一个布尔值
  
          ArrayList<String> list = new ArrayList<>();
          list.add("张三丰");
          list.add("张无忌");
          list.add("张翠山");
          list.add("王二麻子");
          list.add("张良");
          list.add("谢广坤");
  
          //filter方法获取流中的 每一个数据.
          //而test方法中的s,就依次表示流中的每一个数据.
          //我们只要在test方法中对s进行判断就可以了.
          //如果判断的结果为true,则当前的数据留下
          //如果判断的结果为false,则当前数据就不要.
  //        list.stream().filter(
  //                new Predicate<String>() {
  //                    @Override
  //                    public boolean test(String s) {
  //                        boolean result = s.startsWith("张");
  //                        return result;
  //                    }
  //                }
  //        ).forEach(s-> System.out.println(s));
  
          //因为Predicate接口中只有一个抽象方法test
          //所以我们可以使用lambda表达式来简化
  //        list.stream().filter(
  //                (String s)->{
  //                    boolean result = s.startsWith("张");
  //                        return result;
  //                }
  //        ).forEach(s-> System.out.println(s));
  
          list.stream().filter(s ->s.startsWith("张")).forEach(s-> System.out.println(s));
  
      }
  }
  ```

- limit&skip代码演示

  ```java
  public class StreamDemo02 {
      public static void main(String[] args) {
          //创建一个集合，存储多个字符串元素
          ArrayList<String> list = new ArrayList<String>();
  
          list.add("林青霞");
          list.add("张曼玉");
          list.add("王祖贤");
          list.add("柳岩");
          list.add("张敏");
          list.add("张无忌");
  
          //需求1：取前3个数据在控制台输出
          list.stream().limit(3).forEach(s-> System.out.println(s));
          System.out.println("--------");
  
          //需求2：跳过3个元素，把剩下的元素在控制台输出
          list.stream().skip(3).forEach(s-> System.out.println(s));
          System.out.println("--------");
  
          //需求3：跳过2个元素，把剩下的元素中前2个在控制台输出
          list.stream().skip(2).limit(2).forEach(s-> System.out.println(s));
      }
  }
  ```

- concat&distinct代码演示

  ```java
  public class StreamDemo03 {
      public static void main(String[] args) {
          //创建一个集合，存储多个字符串元素
          ArrayList<String> list = new ArrayList<String>();
  
          list.add("林青霞");
          list.add("张曼玉");
          list.add("王祖贤");
          list.add("柳岩");
          list.add("张敏");
          list.add("张无忌");
  
          //需求1：取前4个数据组成一个流
          Stream<String> s1 = list.stream().limit(4);
  
          //需求2：跳过2个数据组成一个流
          Stream<String> s2 = list.stream().skip(2);
  
          //需求3：合并需求1和需求2得到的流，并把结果在控制台输出
  //        Stream.concat(s1,s2).forEach(s-> System.out.println(s));
  
          //需求4：合并需求1和需求2得到的流，并把结果在控制台输出，要求字符串元素不能重复
          Stream.concat(s1,s2).distinct().forEach(s-> System.out.println(s));
      }
  }
  ```

### 2.4Stream流终结操作方法【应用】

- 概念

  终结操作的意思是,执行完此方法之后,Stream流将不能再执行其他操作

- 常见方法

  | 方法名                        | 说明                     |
  | ----------------------------- | ------------------------ |
  | void forEach(Consumer action) | 对此流的每个元素执行操作 |
  | long count()                  | 返回此流中的元素数       |

- 代码演示

  ```java
  public class MyStream5 {
      public static void main(String[] args) {
          ArrayList<String> list = new ArrayList<>();
          list.add("张三丰");
          list.add("张无忌");
          list.add("张翠山");
          list.add("王二麻子");
          list.add("张良");
          list.add("谢广坤");
  
          //method1(list);
          
  //        long count()：返回此流中的元素数
          long count = list.stream().count();
          System.out.println(count);
      }
  
      private static void method1(ArrayList<String> list) {
          //  void forEach(Consumer action)：对此流的每个元素执行操作
          //  Consumer接口中的方法void accept(T t)：对给定的参数执行此操作
          //在forEach方法的底层,会循环获取到流中的每一个数据.
          //并循环调用accept方法,并把每一个数据传递给accept方法
          //s就依次表示了流中的每一个数据.
          //所以,我们只要在accept方法中,写上处理的业务逻辑就可以了.
          list.stream().forEach(
                  new Consumer<String>() {
                      @Override
                      public void accept(String s) {
                          System.out.println(s);
                      }
                  }
          );
        
          System.out.println("====================");
          //lambda表达式的简化格式
          //是因为Consumer接口中,只有一个accept方法
          list.stream().forEach(
                  (String s)->{
                      System.out.println(s);
                  }
          );
          System.out.println("====================");
          //lambda表达式还是可以进一步简化的.
          list.stream().forEach(s->System.out.println(s));
      }
  }
  ```

### 2.5Stream流的收集操作【应用】

- 概念

  对数据使用Stream流的方式操作完毕后,可以把流中的数据收集到集合中

- 常用方法

  | 方法名                         | 说明               |
  | ------------------------------ | ------------------ |
  | R collect(Collector collector) | 把结果收集到集合中 |

- 工具类Collectors提供了具体的收集方式

  | 方法名                                                       | 说明                   |
  | ------------------------------------------------------------ | ---------------------- |
  | public static <T> Collector toList()                         | 把元素收集到List集合中 |
  | public static <T> Collector toSet()                          | 把元素收集到Set集合中  |
  | public static  Collector toMap(Function keyMapper,Function valueMapper) | 把元素收集到Map集合中  |

- 代码演示

  ```java
  // toList和toSet方法演示 
  public class MyStream7 {
      public static void main(String[] args) {
          ArrayList<Integer> list1 = new ArrayList<>();
          for (int i = 1; i <= 10; i++) {
              list1.add(i);
          }
  
          list1.add(10);
          list1.add(10);
          list1.add(10);
          list1.add(10);
          list1.add(10);
  
          //filter负责过滤数据的.
          //collect负责收集数据.
                  //获取流中剩余的数据,但是他不负责创建容器,也不负责把数据添加到容器中.
          //Collectors.toList() : 在底层会创建一个List集合.并把所有的数据添加到List集合中.
          List<Integer> list = list1.stream().filter(number -> number % 2 == 0)
                  .collect(Collectors.toList());
  
          System.out.println(list);
  
      Set<Integer> set = list1.stream().filter(number -> number % 2 == 0)
              .collect(Collectors.toSet());
      System.out.println(set);
  }
  }
  /**
  Stream流的收集方法 toMap方法演示
  创建一个ArrayList集合，并添加以下字符串。字符串中前面是姓名，后面是年龄
  "zhangsan,23"
  "lisi,24"
  "wangwu,25"
  保留年龄大于等于24岁的人，并将结果收集到Map集合中，姓名为键，年龄为值
  */
  public class MyStream8 {
  	public static void main(String[] args) {
        	ArrayList<String> list = new ArrayList<>();
          list.add("zhangsan,23");
          list.add("lisi,24");
          list.add("wangwu,25");
  
          Map<String, Integer> map = list.stream().filter(
                  s -> {
                      String[] split = s.split(",");
                      int age = Integer.parseInt(split[1]);
                      return age >= 24;
                  }
  
           //   collect方法只能获取到流中剩余的每一个数据.
           //在底层不能创建容器,也不能把数据添加到容器当中
  
           //Collectors.toMap 创建一个map集合并将数据添加到集合当中
  
            // s 依次表示流中的每一个数据
  
            //第一个lambda表达式就是如何获取到Map中的键
            //第二个lambda表达式就是如何获取Map中的值
          ).collect(Collectors.toMap(
                  s -> s.split(",")[0],
                  s -> Integer.parseInt(s.split(",")[1]) ));
  
          System.out.println(map);
  	}
  }
  ```

### 2.6Stream流综合练习【应用】

- 案例需求

  现在有两个ArrayList集合，分别存储6名男演员名称和6名女演员名称，要求完成如下的操作

  - 男演员只要名字为3个字的前三人
  - 女演员只要姓林的，并且不要第一个
  - 把过滤后的男演员姓名和女演员姓名合并到一起
  - 把上一步操作后的元素作为构造方法的参数创建演员对象,遍历数据

  演员类Actor已经提供，里面有一个成员变量，一个带参构造方法，以及成员变量对应的get/set方法

- 代码实现

  演员类

  ```java
  public class Actor {
      private String name;
  
      public Actor(String name) {
          this.name = name;
      }
  
      public String getName() {
          return name;
      }
  
      public void setName(String name) {
          this.name = name;
      }
  }
  ```

  测试类

  ```java
  public class StreamTest {
      public static void main(String[] args) {
          //创建集合
          ArrayList<String> manList = new ArrayList<String>();
          manList.add("周润发");
          manList.add("成龙");
          manList.add("刘德华");
          manList.add("吴京");
          manList.add("周星驰");
          manList.add("李连杰");
    
          ArrayList<String> womanList = new ArrayList<String>();
          womanList.add("林心如");
          womanList.add("张曼玉");
          womanList.add("林青霞");
          womanList.add("柳岩");
          womanList.add("林志玲");
          womanList.add("王祖贤");
    
          //男演员只要名字为3个字的前三人
          Stream<String> manStream = manList.stream().filter(s -> s.length() == 3).limit(3);
    
          //女演员只要姓林的，并且不要第一个
          Stream<String> womanStream = womanList.stream().filter(s -> s.startsWith("林")).skip(1);
    
          //把过滤后的男演员姓名和女演员姓名合并到一起
          Stream<String> stream = Stream.concat(manStream, womanStream);
    
        	// 将流中的数据封装成Actor对象之后打印
        	stream.forEach(name -> {
              Actor actor = new Actor(name);
              System.out.println(actor);
          }); 
      }
  }
  ```

## 3.方法引用

### 3.1体验方法引用【理解】

- 方法引用的出现原因

  在使用Lambda表达式的时候，我们实际上传递进去的代码就是一种解决方案：拿参数做操作

  那么考虑一种情况：如果我们在Lambda中所指定的操作方案，已经有地方存在相同方案，那是否还有必要再写重复逻辑呢？答案肯定是没有必要

  那我们又是如何使用已经存在的方案的呢？

  这就是我们要讲解的方法引用，我们是通过方法引用来使用已经存在的方案

- 代码演示

  ```java
  public interface Printable {
      void printString(String s);
  }
  
  public class PrintableDemo {
      public static void main(String[] args) {
          //在主方法中调用usePrintable方法
  //        usePrintable((String s) -> {
  //            System.out.println(s);
  //        });
  	    //Lambda简化写法
          usePrintable(s -> System.out.println(s));
  
          //方法引用
          usePrintable(System.out::println);
  
      }
  
      private static void usePrintable(Printable p) {
          p.printString("爱生活爱Java");
      }
  }
  
  ```

### 3.2方法引用符【理解】

- 方法引用符

  ::  该符号为引用运算符，而它所在的表达式被称为方法引用

- 推导与省略

  - 如果使用Lambda，那么根据“可推导就是可省略”的原则，无需指定参数类型，也无需指定的重载形式，它们都将被自动推导
  - 如果使用方法引用，也是同样可以根据上下文进行推导
  - 方法引用是Lambda的孪生兄弟

### 3.3引用类方法【应用】

​	引用类方法，其实就是引用类的静态方法

- 格式

  类名::静态方法

- 范例

  Integer::parseInt

  Integer类的方法：public static int parseInt(String s) 将此String转换为int类型数据

- 练习描述

  - 定义一个接口(Converter)，里面定义一个抽象方法 int convert(String s);
  - 定义一个测试类(ConverterDemo)，在测试类中提供两个方法
    - 一个方法是：useConverter(Converter c)
    - 一个方法是主方法，在主方法中调用useConverter方法

- 代码演示

  ```java
  public interface Converter {
      int convert(String s);
  }
  
  public class ConverterDemo {
      public static void main(String[] args) {
  
  		//Lambda写法
          useConverter(s -> Integer.parseInt(s));
  
          //引用类方法
          useConverter(Integer::parseInt);
  
      }
  
      private static void useConverter(Converter c) {
          int number = c.convert("666");
          System.out.println(number);
      }
  }
  ```

- 使用说明

  Lambda表达式被类方法替代的时候，它的形式参数全部传递给静态方法作为参数

### 3.4引用对象的实例方法【应用】

​	引用对象的实例方法，其实就引用类中的成员方法

- 格式

  对象::成员方法

- 范例

  "HelloWorld"::toUpperCase

    String类中的方法：public String toUpperCase() 将此String所有字符转换为大写

- 练习描述

  - 定义一个类(PrintString)，里面定义一个方法

    public void printUpper(String s)：把字符串参数变成大写的数据，然后在控制台输出

  - 定义一个接口(Printer)，里面定义一个抽象方法

    void printUpperCase(String s)

  - 定义一个测试类(PrinterDemo)，在测试类中提供两个方法

    - 一个方法是：usePrinter(Printer p)
    - 一个方法是主方法，在主方法中调用usePrinter方法

- 代码演示

  ```java
  public class PrintString {
      //把字符串参数变成大写的数据，然后在控制台输出
      public void printUpper(String s) {
          String result = s.toUpperCase();
          System.out.println(result);
      }
  }
  
  public interface Printer {
      void printUpperCase(String s);
  }
  
  public class PrinterDemo {
      public static void main(String[] args) {
  
  		//Lambda简化写法
          usePrinter(s -> System.out.println(s.toUpperCase()));
  
          //引用对象的实例方法
          PrintString ps = new PrintString();
          usePrinter(ps::printUpper);
  
      }
  
      private static void usePrinter(Printer p) {
          p.printUpperCase("HelloWorld");
      }
  }
  
  ```

- 使用说明

  Lambda表达式被对象的实例方法替代的时候，它的形式参数全部传递给该方法作为参数

### 3.5引用类的实例方法【应用】

​	引用类的实例方法，其实就是引用类中的成员方法

- 格式

  类名::成员方法

- 范例

  String::substring

  public String substring(int beginIndex,int endIndex) 

  从beginIndex开始到endIndex结束，截取字符串。返回一个子串，子串的长度为endIndex-beginIndex

- 练习描述

  - 定义一个接口(MyString)，里面定义一个抽象方法：

    String mySubString(String s,int x,int y);

  - 定义一个测试类(MyStringDemo)，在测试类中提供两个方法

    - 一个方法是：useMyString(MyString my)
    - 一个方法是主方法，在主方法中调用useMyString方法

- 代码演示

  ```java
  public interface MyString {
      String mySubString(String s,int x,int y);
  }
  
  public class MyStringDemo {
      public static void main(String[] args) {
  		//Lambda简化写法
          useMyString((s,x,y) -> s.substring(x,y));
  
          //引用类的实例方法
          useMyString(String::substring);
  
      }
  
      private static void useMyString(MyString my) {
          String s = my.mySubString("HelloWorld", 2, 5);
          System.out.println(s);
      }
  }
  ```

- 使用说明

  ​    Lambda表达式被类的实例方法替代的时候
  ​    第一个参数作为调用者
  ​    后面的参数全部传递给该方法作为参数

### 3.6引用构造器【应用】

​	引用构造器，其实就是引用构造方法

- l格式

  类名::new

- 范例

  Student::new

- 练习描述

  - 定义一个类(Student)，里面有两个成员变量(name,age)

    并提供无参构造方法和带参构造方法，以及成员变量对应的get和set方法

  - 定义一个接口(StudentBuilder)，里面定义一个抽象方法

    Student build(String name,int age);

  - 定义一个测试类(StudentDemo)，在测试类中提供两个方法

    - 一个方法是：useStudentBuilder(StudentBuilder s)
    - 一个方法是主方法，在主方法中调用useStudentBuilder方法

- 代码演示

  ```java
  public class Student {
      private String name;
      private int age;
  
      public Student() {
      }
  
      public Student(String name, int age) {
          this.name = name;
          this.age = age;
      }
  
      public String getName() {
          return name;
      }
  
      public void setName(String name) {
          this.name = name;
      }
  
      public int getAge() {
          return age;
      }
  
      public void setAge(int age) {
          this.age = age;
      }
  }
  
  public interface StudentBuilder {
      Student build(String name,int age);
  }
  
  public class StudentDemo {
      public static void main(String[] args) {
  
  		//Lambda简化写法
          useStudentBuilder((name,age) -> new Student(name,age));
  
          //引用构造器
          useStudentBuilder(Student::new);
  
      }
  
      private static void useStudentBuilder(StudentBuilder sb) {
          Student s = sb.build("林青霞", 30);
          System.out.println(s.getName() + "," + s.getAge());
      }
  }
  ```

- 使用说明

  Lambda表达式被构造器替代的时候，它的形式参数全部传递给构造器作为参数





















































