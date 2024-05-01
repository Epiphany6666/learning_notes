# 	day24 集合（Map&可变参数&集合工具类）

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

**此时 `putIfAbsent` 本身不重要，主要的是在这里主要是想和大家传递一个思想：**

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

细节：当我们要获取一个不可变的Set集合时，里面的参数一定要保证唯一性，否则就会报错

<img src="./assets/image-20240430065645597.png" alt="image-20240430065645597" style="zoom:80%;" />

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

Java会把第一个参数和第二个参数认为是一个键值对对象，第三个参数和第四个参数认为是一个键值对对象.......

<img src="./assets/image-20240430065852710.png" alt="image-20240430065852710" style="zoom:80%;" />

### 细节1：键是不能重复的，如果重复就会报错。

----

### 细节2：Map里面的of方法，参数是有上限的，最多只能传递20个参数，即10个键值对。

`List` 跟 `Set` 能传递多个，就是因为它的形参是 `可变参数`。

但是 `Map`，选中 `Map` 跟进，搜索 `of()`，可以发现它并没有带可变参数的 `of()`。

<img src="./assets/image-20240430070632698.png" alt="image-20240430070632698" style="zoom:67%;" />

参数最多的就是 `20个参数`。

<img src="./assets/image-20240430070723205.png" alt="image-20240430070723205" style="zoom:67%;" />

那为什么它没有设计带有可变参数的方法呢？我们自己来写个方法试试。

如果我们想让 `Map` 的 `of方法` 也能接收多个键和值，那么键和值都需要写成可变参数。

但键和值的类型不确定，因此可以使用泛型方法来解决，写完就会发现立马报错：`Vararg parameter must be the last in the list`（必须在形参的最后）。

<img src="./assets/image-20240430071224132.png" alt="image-20240430071224132" style="zoom:67%;" />

~~~java
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
~~~

----

### 细节3：如果我们要传递多个键值对对象，数量大于10个，在Map接口中还有一个方法。

我们可以将 `键值` 看做是一个整体，传递给 `ofEntries()`，这个方法就可以给你返回一个不可变集合。

<img src="./assets/image-20240430071438703.png" alt="image-20240430071438703" style="zoom:80%;" />

~~~java
//创建一个普通的Map集合
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
~~~

利用上面的数据来获取一个不可变的集合，首先需要获取到所有的键值对对象（Entry对象）

~~~java
Set<Map.Entry<String, String>> entries = hm.entrySet();
~~~

由于`ofEntries方法`的形参是一个可变参数，可变参数实际上就是一个数组，因此我们需要把entries变成一个数组。

我们可以用 `entries` 调用里面的 `toArray()`，`to：变成，array：数组`。

首先来调用一下没有参数的 `toArray()`，没有参数就表示没有指定类型，那么它返回的就是 `Object类型` 的。

但此时我们想要给这个数组指定类型，就可以使用下面的第二个带形参的方法，我们需要对这个数组指定类型。

<img src="./assets/image-20240430072817743.png" alt="image-20240430072817743" style="zoom:67%;" />

~~~java
//toArray方法在底层会比较集合的长度跟数组的长度两者的大小
//如果集合的长度 > 数组的长度 ：数据在数组中放不下，此时会根据实际数据的个数，重新创建数组
//如果集合的长度 <= 数组的长度：数据在数组中放的下，此时不会创建新的数组，而是直接用
//假设数组初始化长度为20，11个键值对会填满前11个位置，后面的9个默认初始化值为null
//因此数组的长度直接写0就行了，我们不用去关心它的长度，因为底层它会自己判断8
Map.Entry[] arr = entries.toArray(new Map.Entry[0]);
//不可变的map集合
//可变参数实际上就是一个数组，因此我们直接将数组传递过去也是可以的
Map map = Map.ofEntries(arr);
map.put("bbb","222"); // 这行代码会报错
~~~

---

上面这种写法代码太多太麻烦了，我们试着将它简化一下

~~~java
Map<Object, Object> map = Map.ofEntries(hm.entrySet().toArray(new Map.Entry[0]));
~~~

----

### `Map.copyOf()`

但是这样写还是太麻烦了，因此Java给我们在 `Map接口` 中还提供了一个 `copyOf()`。

在这个方法中它会做一个判断

~~~java
static <K, V> Map<K, V> copyOf(Map<? extends K, ? extends V> map) {
    // 当你传过来的 Map集合 就是一个不可变的集合，那么它直接把本身的集合给你返回
    if (map instanceof ImmutableCollections.AbstractImmutableMap) {
        return (Map<K,V>)map;
    } else { // 但如果你传递过来的 Map集合 是可变的，这段代码就跟我们刚刚写的一模一样
        return (Map<K,V>)Map.ofEntries(map.entrySet().toArray(new Entry[0]));
    }
}
~~~

因此在以后，如果我们要生成不可变的 `Map集合` 直接使用 `copyOf` 就行了，只不过它是在 `JDK10` 的时候才出现的。

<img src="./assets/image-20240430074351587.png" alt="image-20240430074351587" style="zoom:80%;" />

~~~java
Map<String, String> map = Map.copyOf(hm);
map.put("bbb","222"); // 报错
~~~

----

## 七、总结

1、不可变集合的特点？

定义完成后只能查询，不能修改 / 添加 / 删除

2、如何创建不可变集合？

`List`、`Set`、`Map` 接口中，都存在静态的 `of()` 可以创建不可变集合

3、三种方式的细节

- `List`：直接用

- `Set`：元素不能重复

- `Map`：元素不能重复、键值对数量最多是10个，超过10个用 `ofEntries方法`

  如果你的JDK版本大于等于10，可以用 `copyOf()` 简化代码

-----

# 35.初爽 `Stream流`

案例需求

按照下面的要求完成集合的创建和遍历

- 创建一个集合，存储多个字符串元素
- 把集合中所有以"张"开头的元素存储到一个新的集合
- 把"张"开头的集合中的长度为3的元素存储到一个新的集合
- 遍历上一步得到的集合

~~~java
ArrayList<String> list1 = new ArrayList<>();
list1.add("张无忌");
list1.add("周芷若");
list1.add("赵敏");
list1.add("张强");
list1.add("张三丰");

//1.把所有以“张”开头的元素存储到新集合中
ArrayList<String> list2 = new ArrayList<>();
for (String name : list1) {
    if(name.startsWith("张")){
        list2.add(name);
    }
}
//2.把“张”开头的，长度为3的元素再存储到新集合中
ArrayList<String> list3 = new ArrayList<>();
for (String name : list2) {
    if(name.length() == 3){
        list3.add(name);
    }
}

//3.遍历打印最终结果
for (String name : list3) {
    System.out.println(name);
}
~~~

运行上面代码，结果是对的，但是代码太多太繁杂了。

等今天我们学习完 `Stream流` 后，这个代码就非常简单了

~~~java
list1.stream().filter(name->name.startsWith("张")).filter(name -> name.length() == 3).forEach(name-> System.out.println(name));
~~~



----

# 36.`Stream流` 的思想

## 一、什么是流？

这个 `流` 我们可以把它理解成：工厂的流水线。

假设现在有这么一条制造饮料的流水线，首先需要将空瓶子放到流水线上，进行第一步操作：检查瓶子，不合格的牌子就要丢掉。

再进行第二步：消毒；消完毒后再进行第三部：灌装，然后密封、包装出厂。

![image-20240430081011960](./assets/image-20240430081011960.png)

Java中的 `Stream流` 跟它的思想是一样，以刚刚的练习为例。

首先将要操作的数据都放到流水线上，然后进行过滤操作，留下以张开头的，其他的数据舍弃不要。

然后进行长度的过滤，将长度为 `3` 的留下，其他的数据舍弃不要。

最后进行输出操作。

<img src="./assets/image-20240430081735014.png" alt="image-20240430081735014" style="zoom:80%;" />

---

`Steam流` 在使用的时候一般会结合 `Lambda表达式` 去简化集合、数组的操作

## 二、`Stream流` 的使用步骤

1、先得到一条 `Steam流`(流水线) ，并把数据放到流水线上

2、利用 `Steam流` 中的API进行各种操作

例如过滤、转换、统计、打印 等等，这些操作又可以分为两种：`中间方法` 和 `终结方法`

`中间方法`：方法调用完毕后，还可以调用其他方法

`终结方法`：也就是 `Steam流` 中的最后一步，方法调用完毕后，不能再调用其他方法了。

因此完整的 `Steam流` 的使用步骤如下

① 获取 `Stream流对象` （先得到一条 `Steam流`(流水线) ，并把数据放到流水线上）

② 使用 **中间方法** 对流水线上的数据进行操作

③ 使用 **终结方法** 对流水线上的数据进行操作

----

# 获取 `Stream流`

如何获取一条流水线，并将数据放上去呢？

不同的情况会有不同的处理方案。

单列集合利用 `Collection` 中的默认方法 `steam()`，这样就可以获取到一条流水线，并把集合中的数据放到流水线上。

双列集合是不能直接使用 `steam()`，它需要通过 `keySet()` / `entrySet` 先转成单列集合，再获取 `Steam流`。

数组可以使用 `Arrays` 中的静态方法 `steam()`。

如果是 `一堆零散的数据`，也就是说这些数据是没有放到 `集合 / 数组` 中的，这些数据可以使用 `Steam接口` 中的 `of()` 来进行处理，但是这些数据需要是同种数据类型的。

![image-20240430083216759](./assets/image-20240430083216759.png)

----

## 一、单列集合获取Stream流

方法的返回值就是一个 `Steam流`，并且流水线上的数据就是 `字符串`。

<img src="./assets/image-20240430083909290.png" alt="image-20240430083909290" style="zoom:87%;" />

~~~java
ArrayList<String> list = new ArrayList<>();
Collections.addAll(list,"a","b","c","d","e");
//获取到一条流水线，并把集合中的数据放到流水线上
Stream<String> stream1 = list.stream();
//使用终结方法打印一下流水线上的所有数据
stream1.forEach(new Consumer<String>() {
    @Override
    public void accept(String s) {
        //s:依次表示流水线上的每一个数据
        System.out.println(s);
    }
});
~~~

上面的写法不是最终代码，我们一般会直接采取链式编程

~~~java
list.stream().forEach(s -> System.out.println(s));
~~~

----

## 二、双列集合获取 `Steam流`

双列集合是不能直接使用 `steam()`，它需要通过 `keySet()` / `entrySet` 先转成单列集合，再获取 `Steam流`。

~~~java
//1.创建双列集合
HashMap<String,Integer> hm = new HashMap<>();
//2.添加数据
hm.put("aaa",111);
hm.put("bbb",222);
hm.put("ccc",333);
hm.put("ddd",444);

//第一种获取stream流
hm.keySet().stream().forEach(s -> System.out.println(s));

//第二种获取stream流，相当于是将所有的键值对对象放到了Steam流中
hm.entrySet().stream().forEach(s-> System.out.println(s));
~~~

----

## 三、数组获取 `Steam流`

数组无论是基本数据类型还是引用数据类型，都是可以使用 `Steam流` 的。

如果数组是`基本数据类型`的，调用的就是下面的这些方法。

如果数组是`引用数据类`型的，那么它调用的就是上面带有泛型的泛型方法。

<img src="./assets/image-20240430084625862.png" alt="image-20240430084625862" style="zoom:80%;" />

~~~java
//1.创建数组
int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
String[] arr2 = {"a","b","c"};
//2.获取stream流
Arrays.stream(arr1).forEach(s-> System.out.println(s));
System.out.println("============================");
Arrays.stream(arr2).forEach(s-> System.out.println(s));
~~~

---

## 四、`一堆零散的数据` 获取 `Steam流`

前提条件：这些 `零散的数据` 需要是同种数据类型。

方法的形参是 `可变参数`，并且返回的是一个 `Steam流`。

<img src="./assets/image-20240430085001281.png" alt="image-20240430085001281" style="zoom:80%;" />

`引用数据类型` 和 `基本数据类型` 都是支持的

~~~java
Stream.of(1,2,3,4,5).forEach(s-> System.out.println(s));
Stream.of("a","b","c","d","e").forEach(s-> System.out.println(s));
~~~

----

## 五、`Steam` 中的静态方法 `of()` 的细节

很多课程中，如果想要获取数组中的  `Steam流` ，会建议大家使用 `Stream.of()`，也就是下面 `一堆零散的数据` 的处理方案。

它会这么将是因为 `Stream.of()` 的形参是一个可变参数，可变参数的底层其实就是一个数组，因此如果直接将数组传递给这个方法，看上去好像也没有问题。

<img src="./assets/image-20240430085001281.png" alt="image-20240430085001281" style="zoom:80%;" />

用起来发现，这种方式好像也没问题，但是这种方式是错误的。

~~~java
Stream.of(arr2).forEach(s-> System.out.println(s));
~~~

因为数组不仅仅只有引用数据类型，还有基本数据类型的数组，如果我们将`基本数据类型的数组`传入进去，这个时候就会有问题了。

可以发现打印出来的是一个地址值。

~~~java
Stream.of(arr1).forEach(s-> System.out.println(s));//[I@41629346
~~~

这个就是 `Steam` 中的静态方法 `of()` 里面的一个小细节：方法的形参是一个可变参数，可以传递一堆零散的数据，也可以传递数组。

但是数组必须是引用数据类型的，如果传递基本数据类型，它是不会整体自动装箱的，它是会把整个数组当做一个元素，放到Stream当中。但我们真正想要的是将数组里面的数据放到 `Stream流` 中，而不是将数组这个整体放到 `Stream流` 中。

在以后，我们要获取 `Steam流`，需要想好是 `单列集合还是双列集合、数组、一堆零散的数据`，这四种方式它的用法是不一样的，两者之间不能互相混用。



-----

# 37.`Stream流`的中间方法

概念：中间操作的意思是,执行完此方法之后,Stream流依然可以继续执行其他操作

## 一、总述

常见方法会有以下六个

| 方法名                                            | 说明                                       |
| ------------------------------------------------- | ------------------------------------------ |
| `Stream<T> filter(Predicate predicate)`           | 过滤                                       |
| `Stream<T> limit(long maxSize)`                   | 获取前几个元素                             |
| `Stream<T> skip(long n)`                          | 跳过前几个元素                             |
| `Stream<T> distinct()`                            | 元素去重，依赖(`hashCode()` 和 `equals()`) |
| `static <T> Stream<T> concat(Stream a, Stream b)` | 合并a和b两个流为一个大流                   |
| `Stream<R> map(Function<T, R> mapper)`            | 转换流中的数据类型                         |

注意1：中间方法会返回新的 `Stream流`，原来的 `Steam流` 只能使用一次，建议使用链式编程

注意2：修改 `Steam流` 中的数据，是不会影响原来集合或者数组中的数据

----

## 二、过滤

~~~java
Stream<T> filter(Predicate predicate)
~~~

方法的形参是 `Predicate`，选中它跟进，可以发现它是一个函数式接口。

<img src="./assets/image-20240430092043367.png" alt="image-20240430092043367" style="zoom:87%;" />

我们先使用匿名内部类，然后再使用 `Lambda表达式` 简化

~~~java
ArrayList<String> list = new ArrayList<>();
Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");

//filter   过滤  把张开头的留下，其余数据过滤不要
list.stream().filter(new Predicate<String>() {
    @Override
    public boolean test(String s) {
        //如果返回值为true，表示当前数据留下
        //如果返回值为false，表示当前数据舍弃不要
        return s.startsWith("张");
    }
}).forEach(s -> System.out.println(s));
~~~

简化为 `Lambda表达式`

~~~java
list.stream()
    .filter(s -> s.startsWith("张"))
    .filter(s -> s.length() == 3)
    .forEach(s -> System.out.println(s));
~~~

----

## 注意1：中间方法会返回新的 `Stream流`，原来的 `Steam流` 只能使用一次，建议使用链式编程

例如下面不用链式编程，而是直接获取到返回值为 `stream1`，然后再使用 `stream1` 来进行过滤。

过滤完成后，再将数据打印，可以发现是没有任何的问题的。

~~~java
Stream<String> stream1 = list.stream().filter(s -> s.startsWith("张"));
Stream<String> stream2 = stream1.filter(s -> s.length() == 3);
stream2.forEach(s -> System.out.println(s));
~~~

但是在下面的代码中，如果还想再次使用 `stream1`，可以发现就会报错：`stream has already been operated upon or closed（流已经关闭了）`

![image-20240430092957105](./assets/image-20240430092957105.png)

原因是因为，在 `42行` 这里，`stream1` 已经用过了，就不能再次使用了。

**所以一定要切记：原来的 `Steam流` 只能使用一次。**

既然只能使用一次，那么我们就没有必要再去用一个变量去记录了，因此**建议使用链式编程。**

因此当 `Stream流` 写熟了后发现，所以的操作一行就搞定了，代码非常的简单。

但是代码变少了也会有一个小弊端：代码的阅读性降低。

因此我们一般都会将链式编程的每一个操作都折行，这样就会提高代码的阅读性。

~~~java
list.stream()
    .filter(s -> s.startsWith("张"))
    .filter(s -> s.length() == 3)
    .forEach(s -> System.out.println(s));
~~~

----

## 注意2：修改 `Steam流` 中的数据，是不会影响原来集合或者数组中的数据

例如上面我们对集合做了两次过滤，此时再来打印集合，此时集合里面的数据是不会改变的。

----

## 三、获取前几个元素

`maxSize` 跟索引没有关系，就是字面意思：几个元素

~~~java
Stream<T> limit(long maxSize)
~~~

代码示例

~~~java
// "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤"
list.stream().limit(3).forEach(s -> System.out.println(s)); // 张无忌 周芷若 赵敏 
~~~

-----

## 四、跳过前几个元素

参数 `n` 表示的也是个数

~~~java
Stream<T> skip(long n)
~~~

代码示例

~~~java
// "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤"
list.stream().skip(4).forEach(s -> System.out.println(s)); // 张三丰 张翠山 张良 王二麻子 谢广坤 
~~~

----

## 五、`limit` 和 `skip` 练习

```
课堂练习：在 "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤" 中获取以下元素
"张强", "张三丰", "张翠山"
```

代码示例

~~~java
//第一种思路：
//先获取前面6个元素："张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山",
//然后跳过前面3个元素
list.stream().limit(6).skip(3).forEach(s -> System.out.println(s));

//第二种思路：
//先跳过3个元素："张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤"
//然后再获取前面3个元素："张强", "张三丰", "张翠山"
list.stream().skip(3).limit(3).forEach(s -> System.out.println(s));
~~~

----

## 六、元素去重

~~~java
Stream<T> distinct()
~~~

代码示例

~~~java
ArrayList<String> list1 = new ArrayList<>();
Collections.addAll(list1, "张无忌","张无忌","张无忌", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");
list1.stream().distinct().forEach(s -> System.out.println(s));
~~~

PS：`distinct()` 在底层是依赖 `hashCode()` 和 `equals()` 进行去重的。

由于在 `String` 中，Java已经帮我们重写好了这两个方法，因此我们直接使用就行了。

但如果集合中装的是 `自定义对象`，那么一定要手动重写。

我们可以简单看一下 `distinct()` 里面的源码，源码非常的复杂，我们只需要找里面的核心点就行了。

选中 `distinct()` <kbd>ctrl + b</kbd>，如果直接 <kbd>ctrl +b</kbd> ，那么它就是跳到接口里面的方法。

<img src="./assets/image-20240430095559034.png" alt="image-20240430095559034" style="zoom:67%;" />

而我们需要看的是它的实体类，因此需要采用以下方法，或者 <kbd>ctrl + alt + b</kbd>

<img src="./assets/image-20240430095637839.png" alt="image-20240430095637839" style="zoom:67%;" />

它底层会调用 `makeRef()`，继续跟进

<img src="./assets/image-20240430144721811.png" alt="image-20240430144721811" style="zoom:80%;" />

点进去后，可以发现它的源码超级多，但不要慌，我们真正看的是里面的一个核心点：`keys = new HashSet<>(keys);`。

所以我们就知道，在底层是通过 `HashSet` 进行去重的。

<img src="./assets/image-20240430144821310.png" alt="image-20240430144821310" style="zoom:80%;" />

`HashSet` 在存储自定义元素的时候，需要重写 `hashCode()` 和 `equals()`。

----

## 七、合并a和b两个流为一个大流

**在合并的时候，尽可能要保证两个流中的数据类型是一致的。**

如果第一个流数据类型是 `a`，第二个流数据类型是 `b`，那么这个时候在合并的时候，它的类型就是 `a` 跟 `b` 共同的父类了，这样就相当于它做了一个类型的提升，在提升之后，它是无法使用子类里面的特有功能的。

~~~java
static <T> Stream<T> concat(Stream a, Stream b)
~~~

这个方法是 `Stream` 里面的静态方法，所以在使用的时候需要使用类名调用

~~~java
ArrayList<String> list1 = new ArrayList<>();
Collections.addAll(list1, "张无忌","张无忌","张无忌", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");

ArrayList<String> list2 = new ArrayList<>();
Collections.addAll(list2, "周芷若", "赵敏");

// 方法参数中传递需要合并的两个流，程序运行完毕发现，前面是第一个流里面的数据，后面就是第二个流中的
Stream.concat(list1.stream(),list2.stream()).forEach(s -> System.out.println(s)); // 张无忌 张无忌 张无忌 张强 张三丰 张翠山 张良 王二麻子 谢广坤 周芷若 赵敏 
~~~

-----

## 八、转换流中的数据类型

~~~java
Stream<R> map(Function<T, R> mapper)
~~~

需求：只获取里面的年龄并进行打印

~~~java
ArrayList<String> list = new ArrayList<>();
Collections.addAll(list, "张无忌-15", "周芷若-14", "赵敏-13", "张强-20", "张三丰-100", "张翠山-40", "张良-35", "王二麻子-37", "谢广坤-41");
~~~

分析：流里面原本的数据是 `String` 类型的，最终我需要获得 `int` 类型的。

因此需求其实就是将 `String` 变成 `int类型`。

`map()` 的形参是 `Function`，而 `Function` 又是函数式接口。接口中有一个 `apply()`

<img src="./assets/image-20240430150416812.png" alt="image-20240430150416812" style="zoom:67%;" />

在 `Function` 中有两个泛型：

- 第一个类型：流中原本的数据类型
- 第二个类型：要转成之后的类型

`apply`的 `形参s`：依次表示流里面的每一个数据；`返回值`：表示转换之后的数据。

我们的需求是将字符串变成 `int类型`，但是不能直接将 `int` 写在泛型里，因为泛型里面不能写基本数据类型。

<img src="./assets/image-20240430151307912.png" alt="image-20240430151307912" style="zoom:67%;" />

因此正确写法应该是写成：`Integer`，同样 `apply()` 的返回值需要与 `Function` 的泛型相对应，这两个都表示转换之后的类型。

<img src="./assets/image-20240430151431118.png" alt="image-20240430151431118" style="zoom:80%;" />

~~~java
list.stream().map(new Function<String, Integer>() {
    @Override
    public Integer apply(String s) {
        String[] arr = s.split("-");
        String ageString = arr[1];
        int age = Integer.parseInt(ageString);
        return age;
    }
})
    //当map方法执行完毕之后，流上的数据就变成了整数
	//所以在下面forEach当中，s依次表示流里面操作完毕后的每一个数据，这个数据现在就是整数了
    .forEach(s-> System.out.println(s));
~~~

改成 `Lambda表达式`

~~~java
list.stream()
    .map(s-> Integer.parseInt(s.split("-")[1]))
    .forEach(s-> System.out.println(s));
~~~



-----

# 38.`Stream流`的终结方法

概念：终结操作的意思是,执行完此方法之后,Stream流将不能再执行其他操作

## 一、总述

常见的终结方法会有以下四个

| 方法名                          | 说明                       |
| ------------------------------- | -------------------------- |
| `void forEach(Consumer action)` | 遍历                       |
| `long count()`                  | 统计                       |
| `toArray()`                     | 收集流中的数据，放到数组中 |
| `collect(Collector collector)`  | 收集流中的数据，放到集合中 |

思考为什么要收集？

我们使用 `Stream流` 可以用来处理 `集合 / 数组` 中的数据，那你处理完了之后，肯定要将这些数据保存起来，因此我们需要将它们收集起来。

---

## 二、遍历

~~~java
void forEach(Consumer action)
~~~

代码示例

~~~java
ArrayList<String> list = new ArrayList<>();
Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");

//用list调用stream()获取到一个流水线，并把集合里面的数据放到流水线上
list.stream()
~~~

可以发现 `forEach()` 的返回值是 `void`，因此调用 `forEach()` 结束后就不能调用流里面的其他方法了，它是终结方法。

<img src="./assets/image-20240430153920243.png" alt="image-20240430153920243" style="zoom:80%;" />

跟进 `forEach()` ，可以发现它的形参是 `Consumer`，继续跟进 `Consumer`。

发现它是一个函数式接口，因此一会我们会将它改写成 `Lambda表达式`。

<img src="./assets/image-20240430153734914.png" alt="image-20240430153734914" style="zoom:80%;" />

我们先写匿名内部类

~~~java
//Consumer的泛型：表示流中数据的类型
//accept方法的形参s：依次表示流里面的每一个数据
//方法体：对每一个数据的处理操作（打印）
list.stream().forEach(new Consumer<String>() {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
});
~~~

改写为 `Lambda表达式`

~~~java
list.stream().forEach(s -> System.out.println(s));
~~~

----

## 三、统计

~~~java
long count()
~~~

`count()` 的返回值是一个 `long类型` 的整数，因此 `count()` 结束后，也不能再调用流里面的其他方法了，它也是一个终结方法。

<img src="./assets/image-20240430154059261.png" alt="image-20240430154059261" style="zoom:80%;" />

~~~java
long count = list.stream().count();
System.out.println(count); // 9
~~~

----

## 四、收集流中的数据，放到数组中

~~~java
toArray()
~~~

调用 `toArray()` 的时候会有两个，最简单的是空参的，表示我们需要收集到 `Object类型` 的数组中。

但是我们需要的是放到具体类型的数组中，就可以使用下面的方法。

<img src="./assets/image-20240430154335652.png" alt="image-20240430154335652" style="zoom:80%;" />

首先来讲最简单的空参，返回的是 `Object类型` 的数组中。

~~~java
Object[] arr1 = list.stream().toArray();
System.out.println(Arrays.toString(arr1));
~~~

接下来讲有参的，跟进 `toArray()` 往下滑

![image-20240430154757072](./assets/image-20240430154757072.png)

点击 `IntFunction`，可以发现它也是一个函数式接口

<img src="./assets/image-20240430154841984.png" alt="image-20240430154841984" style="zoom:80%;" />

这里先写匿名内部类

~~~~~java
list.stream().toArray(new IntFunction<? extends Object[]>() {
    @Override
    public Object[] apply(int value) {
        return new Object[0];
    }
});
~~~~~

这个接口相对来将比较复杂。

`IntFunction` 的泛型是 `? extends Object[]`，前面的 `? extends Object` 表示数据的类型，后面的 `[]` 表示数组，因此这个整体就表示具体类型的数组。

由于我们要的是 `String` 类型的，因此写 `String[]` 就行了。

~~~java
list.stream().toArray(new IntFunction<String[]>() {
    @Override
    public Object[] apply(int value) {
        return new Object[0];
    }
});
~~~

接下来看里面的 `apply()`。

```
apply的形参:流中数据的个数，要跟数组的长度保持一致
apply的返回值：具体类型的数组，这个需要跟IntFunction的泛型类型对应
方法体：就是创建数组
```

```java
toArray方法的参数的作用：负责创建一个指定类型的数组
toArray方法的底层，会依次得到流里面的每一个数据，并把数据放到数组当中
toArray方法的返回值：是一个装着流里面所有数据的数组
```

~~~java
String[] arr = list.stream().toArray(new IntFunction<String[]>() {
    @Override
    public String[] apply(int value) {
        return new String[value];
    }
});
System.out.println(Arrays.toString(arr)); // [张无忌, 周芷若, 赵敏, 张强, 张三丰, 张翠山, 张良, 王二麻子, 谢广坤]
~~~

改写成 `Lambda表达式`

~~~java
String[] arr2 = list.stream().toArray(value -> new String[value]);
System.out.println(Arrays.toString(arr2)); // [张无忌, 周芷若, 赵敏, 张强, 张三丰, 张翠山, 张良, 王二麻子, 谢广坤]
~~~

PS：如果需要转为基本数据类型的数组，泛型是不能写基本数据类型的，只能转为它的包装类

<img src="./assets/image-20240501095451388.png" alt="image-20240501095451388" style="zoom:80%;" />

~~~java
list.stream().toArray(new IntFunction<Integer[]>() {
    @Override
    public Integer[] apply(int value) {
        return new Integer[0];
    }
});
~~~

-----

## 五、收集流中的数据，放到集合中

这个方法可以收集到 `单列集合List / Set`、`双列集合Map`

~~~java
collect(Collector collector)
~~~

准备数据

~~~java
ArrayList<String> list = new ArrayList<>();
Collections.addAll(list, "张无忌-男-15", "周芷若-女-14", "赵敏-女-13", "张强-男-20",
        "张三丰-男-100", "张翠山-男-40", "张良-男-35", "王二麻子-男-37", "谢广坤-男-41");
~~~

### 1）收集到 `List集合` 当中

需求：我要把所有的男性收集起来

PS：我们在比较的时候也可以将 `s.split("-")[1]` 放在前面跟 `"男"` 进行比较也是可以的，只不过我们在比较的时候有一个习惯：能用这种固定数据去调用的尽量就使用固定数据调用，因为前面的不可能是 `null`，但是后面的 `s.split("-")[1]` 就有可能是不确定的，不确定的东西就有可能是 `null`，`null` 的话就会导致空指针异常。

~~~java
List<String> newList1 = list.stream()
    .filter(s -> "男".equals(s.split("-")[1]))
    // Collectors是Stream里面的工具类，它里面有个静态方法叫：tolist()，这个方法底层可以帮我们创建一个ArrayList集合，这样就可以将流里面所有的数据都放到这个ArrayList集合中了
    .collect(Collectors.toList());
System.out.println(newList1); // [张无忌-男-15, 张强-男-20, 张三丰-男-100, 张翠山-男-40, 张良-男-35, 王二麻子-男-37, 谢广坤-男-41]
~~~

----

### 2）收集到 `Set集合` 当中

~~~java
Set<String> newList2 = list.stream().filter(s -> "男".equals(s.split("-")[1]))
    // toSet() 底层会帮我们创建一个HashSet集合，并将流里面的数据放到这个HashSet集合中
    .collect(Collectors.toSet());
System.out.println(newList2);
~~~

****

### 3）收集到 `List集合`、`Set集合` 中的区别

当我将 `list` 集合中的数据改为

~~~java
"张无忌-男-15", "张无忌-男-15", "周芷若-女-14", "赵敏-女-13", "张强-男-20",
        "张三丰-男-100", "张翠山-男-40", "张良-男-35", "王二麻子-男-37", "谢广坤-男-41"
~~~

此时数据就重复了，这时我们将 `newList1` 和 `newList2` 同时打印。

可以发现如果将数据收集到 `HashSet` 中，数据会去重。

~~~java
System.out.println(newList1); // [张无忌-男-15, 张无忌-男-15, 张强-男-20, 张三丰-男-100, 张翠山-男-40, 张良-男-35, 王二麻子-男-37, 谢广坤-男-41]
System.out.println(newList2); // [张强-男-20, 张良-男-35, 张三丰-男-100, 张无忌-男-15, 谢广坤-男-41, 张翠山-男-40, 王二麻子-男-37]
~~~

----

### 4）收集到 `Map集合` 当中

收集到 `Map` 时，需要规定一件事情：谁作为键，谁作为值。

```
需求：
我要把所有的男性收集起来
键：姓名。 值：年龄。
性别就不要了，因为既然是将所有的男性收集起来，那么收集起来的肯定是男性。
```

在 `toMap()` 中，我们需要传入键和值的规则

~~~java
//收集Map集合当中
//谁作为键,谁作为值.
//我要把所有的男性收集起来
//键：姓名。 值：年龄
Map<String, Integer> map = list.stream()
    .filter(s -> "男".equals(s.split("-")[1]))
    .collect(键的规则, 值的规则);
~~~

跟进 `toMap()` 看一下，可以发现集合中有两个形参，形参一：`keyMapper`（键的规则），形参二：`valueMapper`(值的规则)。

在底下有一段代码，虽然我们看不懂，但是可以猜。

`HashMap::new`：`new` 了一个 `HashMap`，然后将键、值的规则传递进去，传递给 `uniqKeysMapAccumulator()`

<img src="./assets/image-20240430162916018.png" alt="image-20240430162916018" style="zoom:80%;" />

跟进 `uniqKeysMapAccumulator()`，可以看见它里面调用了 `putIfAbsent()`，将数据添加到 `Map集合` 中。

<img src="./assets/image-20240430163233187.png" alt="image-20240430163233187" style="zoom:80%;" />

`Function接口` 和 `apply()` 的对应关系如下

<img src="./assets/image-20240430164619339.png" alt="image-20240430164619339" style="zoom:67%;" />

**注意点：如果我们要收集到Map集合当中，键不能重复，否则会报错。**

![image-20240430164745484](./assets/image-20240430164745484.png)

报错的原因就是因为它底层调用了 `putIfAbsent()`，这个方法里面会做一个判断：根据键先找值，如果值为 `null`，表示当前的键是不存在的，此时就将数据添加到 `Map集合` 中，但是在添加第二次的时候，这里的 `v` 就不是 `null` 了，直接返回 `v`。

<img src="./assets/image-20240430164959096.png" alt="image-20240430164959096" style="zoom:80%;" />

<kbd>ctrl + alt + ←</kbd> 返回上一步，可以发现它在下面又做了一个判断：如果 `u` 不是 `null`，它就会产生异常

<img src="./assets/image-20240430165221007.png" alt="image-20240430165221007" style="zoom:67%;" />

~~~java
Map<String, Integer> map = list.stream()
        .filter(s -> "男".equals(s.split("-")[1]))
        /*
         *   toMap : 参数一表示键的生成规则
         *           参数二表示值的生成规则
         *
         * 参数一：
         *       Function泛型一：表示流中每一个数据的类型
         *               泛型二：表示Map集合中键的数据类型
         *
         *        方法apply形参：依次表示流里面的每一个数据
         *               方法体：生成键的代码
         *               返回值：已经生成的键
         *
         *
         * 参数二：
         *        Function泛型一：表示流中每一个数据的类型
         *                泛型二：表示Map集合中值的数据类型
         *
         *       方法apply形参：依次表示流里面的每一个数据
         *               方法体：生成值的代码
         *               返回值：已经生成的值
         *
         * */
        .collect(Collectors.toMap(new Function<String, String>() {
                                      @Override
                                      public String apply(String s) {
                                          //张无忌-男-15
                                          return s.split("-")[0];
                                      }
                                  },
                new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s.split("-")[2]);
                    }
                }));
~~~

改写为 `lambda表达式`

~~~java
Map<String, Integer> map2 = list.stream()
    .filter(s -> "男".equals(s.split("-")[1]))
    .collect(Collectors.toMap(
        s -> s.split("-")[0],
        s -> Integer.parseInt(s.split("-")[2])));
~~~

----

# `Stream流` 总结

**1、`Stream流` 的作用**

结合了 `Lambda表达式` 去简化集合、数组的操作

**2、`Stream流` 的使用步骤**

① 获取 `Stream流对象` （先得到一条 `Steam流`(流水线) ，并把数据放到流水线上）

② 使用 **中间方法** 对流水线上的数据进行操作

③ 使用 **终结方法** 对流水线上的数据进行操作

**3、如何获取 `Stream流对象`**

单列集合利用 `Collection` 中的默认方法 `steam()`，这样就可以获取到一条流水线，并把集合中的数据放到流水线上。

双列集合是不能直接使用 `steam()`，它需要通过 `keySet()` / `entrySet` 先转成单列集合，再获取 `Steam流`。

数组可以使用 `Arrays` 中的静态方法 `steam()`。

如果是 `一堆零散的数据`，也就是说这些数据是没有放到 `集合 / 数组` 中的，这些数据可以使用 `Steam接口` 中的 `of()` 来进行处理，但是这些数据需要是同种数据类型的。

![image-20240430083216759](./assets/image-20240430083216759.png)

**4、常见方法**

中间方法：filter、limit、skip、distinct、concat、map

终结方法：forEach、count、collect

----

# --------------------------------------------

# 40.练习：数据过滤

~~~java
定义一个集合，并添加一些整数  1,2,3,4,5,6,7,8,9,10
过滤奇数，只留下偶数。
并将结果保存起来
~~~

代码示例

~~~java
//1. 定义一个集合
ArrayList<Integer> list = new ArrayList<>();
//2.添加一些整数
Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//3.过滤奇数，只留下偶数
//进行判断，如果是偶数，返回true 保留
List<Integer> newList = list.stream()
    .filter(n -> n % 2 == 0)
    .collect(Collectors.toList());
//4.打印集合
System.out.println(newList);
~~~



----

# 41.练习：数据操作1

~~~java
创建一个ArrayList集合，并添加以下字符串，字符串中前面是姓名，后面是年龄
    "zhangsan,23",
    "lisi,24",
    "wangwu,25"
保留年龄大于等于24岁的人，并将结果收集到Map集合中，姓名为键，年龄为值
~~~

代码示例

~~~java
//1.创建一个ArrayList集合
ArrayList<String> list = new ArrayList<>();
//2.添加以下字符串
list.add("zhangsan,23");
list.add("lisi,24");
list.add("wangwu,25");
//3.保留年龄大于等于24岁的人
list.stream()
    .filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
    .collect(Collectors.toMap(new Function<String, String>() {
        @Override
        public String apply(String s) {
            return s.split(",")[0];
        }
    }, new Function<String, Integer>() {
        @Override
        public Integer apply(String s) {
            return Integer.parseInt(s.split(",")[1]);
        }
    }));

Map<String, Integer> map = list.stream()
    .filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
    .collect(Collectors.toMap(
        s -> s.split(",")[0],
        s -> Integer.parseInt(s.split(",")[1])));

System.out.println(map);
~~~



-----

# 42.练习：数据操作2

~~~java
现在有两个ArrayList集合，分别存储6名男演员的名字和年龄以及6名女演员的名字和年龄。
姓名和年龄中间用逗号隔开。
比如：张三,23
要求完成如下的操作：
1，男演员只要名字为3个字的前两人
2，女演员只要姓杨的，并且不要第一个
3，把过滤后的男演员姓名和女演员姓名合并到一起
4，将上一步的演员信息封装成Actor对象。
5，将所有的演员对象都保存到List集合中。
备注：演员类Actor，属性有：name，age
男演员：  "蔡坤坤,24" , "叶齁咸,23", "刘不甜,22", "吴签,24", "谷嘉,30", "肖梁梁,27"
女演员：  "赵小颖,35" , "杨颖,36", "高元元,43", "张天天,31", "刘诗,35", "杨小幂,33"
~~~

代码示例

~~~java
//1.创建两个ArrayList集合
ArrayList<String> manList = new ArrayList<>();
ArrayList<String> womenList = new ArrayList<>();
//2.添加数据
Collections.addAll(manList, "蔡坤坤,24", "叶齁咸,23", "刘不甜,22", "吴签,24", "谷嘉,30", "肖梁梁,27");
Collections.addAll(womenList, "赵小颖,35", "杨颖,36", "高元元,43", "张天天,31", "刘诗,35", "杨小幂,33");
//3.男演员只要名字为3个字的前两人
Stream<String> stream1 = manList.stream()
    .filter(s -> s.split(",")[0].length() == 3)
    .limit(2);
//4.女演员只要姓杨的，并且不要第一个
Stream<String> stream2 = womenList.stream()
    .filter(s -> s.split(",")[0].startsWith("杨"))
    .skip(1);
//5.把过滤后的男演员姓名和女演员姓名合并到一起
//演员信息封装成Actor对象。

//String -> Actor对象 （类型转换）
Stream.concat(stream1,stream2).map(new Function<String, Actor>() {
    @Override
    public Actor apply(String s) {
        //"赵小颖,35"
        String name = s.split(",")[0];
        int age = Integer.parseInt(s.split(",")[1]);
        return new Actor(name,age);
    }
}).forEach(s-> System.out.println(s));

// 变成Lambda表达式
List<Actor> list = Stream.concat(stream1, stream2)
    .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
    .collect(Collectors.toList());
System.out.println(list);
~~~



-----

# 43.方法引用概述

很多人在学习方法引用的时候都会觉得非常的反人类，并且很多老师都会觉得它很奇葩。

但是并不是这样的，当你写熟了以后，你就会觉得这种写法太香了。

方法引用非常的重要，并且在以后会经常用到。

## 一、概述

`方法引用` 可以分成两个词语理解：1、方法：就是以前学习的方法；2、引用：把已经有的方法拿过来用，把它当做函数式接口中抽象方法的方法体。

总而言之一句话：**方法引用就是把已经有的方法拿过来用，当做函数式接口中抽象方法的方法体。**

例如 `Arrays` 中的 `sort()`，正常书写的时候，第一个参数表示要排序的数组；第二个参数表示排序的规则，在代码中，需要传递 `Comparator接口` 的实现类对象。

<img src="./assets/image-20240430192921283.png" alt="image-20240430192921283" style="zoom:67%;" />

又因为 `Comparator` 是一个函数式接口，因此我们可以使用 `lambda表达式` 进行简化。

但其实 `lambda表达式` 还不是最简单的，它还可以进一步简化。

这里的排序规则我们甚至不用写，可以把已经存在的方法直接拿过来用，即将这个已经存在的方法当做是函数式接口中抽象方法的方法体。

假设我们现在有已经写好的 `subtraction()`，那么在 `sort()` 的第二个参数中，我们就可以直接去使用它，这就是方法引用。

<img src="./assets/image-20240430192209918.png" alt="image-20240430192209918" style="zoom:57%;" />

但是并不是所有的方法都能引用的，需要满足一下的四个条件才可以。

1、应用处必须是函数式接口

剩下来的三个要求是对被引用的方法有一个限制。

1、被引用的方法必须是已经存在的

如果它没有存在，那么还需要自己写，非常的麻烦

2、被引用方法的形参和返回值需要跟抽象方法保持一致

3、被引用方法的功能要满足当前的需求

例如之前的 `Comparator接口` 中的 `compare()` 功能是返回一个作为判断的整数，那么被引用的方法的功能也应该是返回一个作为判断的整数。

----

## 二、代码示例

需求：创建一个数组，进行倒序排列

~~~java
Integer[] arr = {3, 5, 4, 1, 6, 2};
~~~

匿名内部类

~~~java
Arrays.sort(arr, new Comparator<Integer>() {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
});
~~~

因为第二个参数的类型Comparator是一个函数式接口，因此可以使用 `lambda表达式` 进行简化。

~~~java
Arrays.sort(arr, (Integer o1, Integer o2)->{
    return o2 - o1;
});
~~~

lambda表达式简化格式

~~~java
Arrays.sort(arr, (o1, o2) -> o2 - o1);
~~~

方法引用

~~~java
//1.引用处需要是函数式接口
//2.被引用的方法需要已经存在
//3.被引用方法的形参和返回值需要跟抽象方法的形参和返回值保持一致
//4.被引用方法的功能需要满足当前的要求

//由于下面是一个静态方法，我们以前调用的时候是：FunctionDemo1.subtraction()，其中FunctionDemo1是类名，subtraction是方法名。
//现在在方法引用里面也是一样的
//表示引用FunctionDemo1类里面的subtraction方法
//把这个方法当做抽象方法的方法体
Arrays.sort(arr, FunctionDemo1::subtraction);

System.out.println(Arrays.toString(arr));

//被引用的方法可以是Java已经写好的，也可以是一些第三方的工具类
public static int subtraction(int num1, int num2) {
    return num2 - num1;
}
~~~

-----

## 三、总结

**1、什么是方法引用？**

方法引用就是把已经有的方法拿过来用，当做函数式接口中抽象方法的方法体。

**2、`::` 是什么符号？**

`::`  该符号为引用运算符，而它所在的表达式被称为方法引用

**3、方法引用时要注意什么？**

- 应用处必须是函数式接口

剩下来的三个要求是对被引用的方法有一个限制。

- 被引用的方法必须是已经存在的

  如果它没有存在，那么还需要自己写，非常的麻烦

- 被引用方法的形参和返回值需要跟抽象方法保持一致

- 被引用方法的功能要满足当前的需求

  例如之前的 `Comparator接口` 中的 `compare()` 功能是返回一个作为判断的整数，那么被引用的方法的功能也应该是返回一个作为判断的整数。



-----

方法引用的分类如下图

<img src="./assets/image-20240430193558927.png" alt="image-20240430193558927" style="zoom:80%;" />

----

# 44.引用静态方法

## 一、概念

格式：`类名::静态方法`

示例：`Integer::parseInt`

这个格式其实很好理解，我们以前在调用静态方法的时候也是使用类名直接调用，只不过以前是用 `.` 进行调用的，现在就是使用 `::` 进行调用。

我们利用这个格式来写一个小练习。

----

## 二、练习

```
集合中有以下数字，要求把他们都变成int类型
"1","2","3","4","5"
```

首先创建集合并添加元素

~~~java
ArrayList<String> list = new ArrayList<>();
Collections.addAll(list,"1","2","3","4","5");
~~~

以前的方式也可以完成，但是这样写里面没有函数式接口，用不了方法引用。

~~~java
ArrayList<Integer> list2 = new ArrayList<>();
for (String s : list) {
    int i = Integer.parseInt(s);
    list2.add(i);
}
~~~

接下来使用方法引用来操作。

~~~java
//2.把他们都变成int类型
list.stream().map(new Function<String, Integer>() {
    @Override
    public Integer apply(String s) {
        int i = Integer.parseInt(s);
        return i;
    }
}).forEach(s -> System.out.println(s));
//1.方法需要已经存在
//2.方法的形参和返回值需要跟抽象方法的形参和返回值保持一致
//3.方法的功能需要把形参的字符串转换成整数
//在Java中是存在满足以上条件的方法的，例如Integer里面的parseInt()
list.stream()
    // 将parseInt()直接当做是map()形参中接口的抽象方法的方法体
    .map(Integer::parseInt)
    .forEach(s-> System.out.println(s));
~~~



-----

# 45.引用成员方法

## 一、概述

格式：`对象::成员方法`

这个格式也很好理解，你要想：在之前我们调用成员方法的时候，都是使用对象去调用的，只不过以前是用 `.` 进行调用的，现在就是使用 `::` 进行调用。

在引用成员方法的时候有三种情况需要我们知道

① 其他类：`其他类对象::方法名`

② 本类：`this::方法名`

③ 父类：`super::方法名`

----

## 二、练习一

集合中有一些名字，按照要求过滤数据。

数据："张无忌","周芷若","赵敏","张强","张三丰"

要求：只要以张开头，而且名字是3个字的

~~~java
//1.创建集合
ArrayList<String> list = new ArrayList<>();
//2.添加数据
Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰");
//3.过滤数据（只要以张开头，而且名字是3个字的）
list.stream().filter(s->s.startsWith("张")).filter(s->s.length() == 3).forEach(s-> System.out.println(s));

list.stream().filter(new Predicate<String>() {
    @Override
    public boolean test(String s) {
        return s.startsWith("张") && s.length() == 3;
    }
}).forEach(s-> System.out.println(s));
~~~

接下来改为方法引用，要思考：有没有这样的方法，它的形参是字符串，返回值是 `boolean`，而且方法里面做的事情跟我现在写的代码是一样的呢？

很显然，Java并没有提供这样的方法，这个时候就可以自己写一个。

新建一个类 `StringOperation.java`

~~~java
public class StringOperation {
    public boolean stringJudge(String s){
        return s.startsWith("张") && s.length() == 3;
    }
}
~~~

① 其他类：`其他类对象::方法名`

~~~java
StringOperation so = new StringOperation();
list.stream().filter(so::stringJudge)
    .forEach(s-> System.out.println(s));
~~~

② 本类：`this::方法名`

如果直接在 `main方法` 中直接用 `this` 调用下面的方法，会直接报错，因为静态方法中没有 `this`！！！

<img src="./assets/image-20240430202200123.png" alt="image-20240430202200123" style="zoom:80%;" />

因此如果你想要引用本类的非静态方法，那么引用处必须在非静态的方法中。

但静态方法中没有 `this` 怎么办呢？这个时候你只能创建本类的对象。

~~~java
//静态方法中是没有this的
list.stream().filter(new FunctionDemo3()::stringJudge)
    .forEach(s-> System.out.println(s));
~~~

`this::方法名` 、`super::方法名` 会放在第二个练习中讲解，因为这两种方式引用处不能是静态方法，因为在静态方法里面是没有 `this` 也是没有 `super` 的。

-----

## 二、练习二

GUI界面中点击事件的方法引用写法

基础代码

**App.java**

~~~java
public class App {
    public static void main(String[] args) {
        new LoginJFrame();
    }
}
~~~

**LoginJFrame.java**

~~~java
public class LoginJFrame extends JFrame {
    JButton go = new JButton("Go");

    public LoginJFrame() {
        //设置图标
        setIconImage(Toolkit.getDefaultToolkit().getImage("myfunction\\image\\logo.jpg"));

        //设置界面
        initJframe();

        //添加组件
        initView();

        //界面显示出来
        this.setVisible(true);

    }

    //添加组件
    public void initView() {
        JLabel image = new JLabel(new ImageIcon("myfunction\\image\\kit.jpg"));
        image.setBounds(100,50,174,174);
        this.getContentPane().add(image);

        go.setFont(new Font(null,1,20));
        go.setBounds(120,274,150,50);
        go.setBackground(Color.WHITE);

        this.getContentPane().add(go);

    }

    //设置界面
    public void initJframe() {
        //设置标题
        this.setTitle("随机点名器");
        //设置大小
        this.setSize(400, 500);
        //设置关闭模式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗口无法进行调节
        this.setResizable(false);
        //界面居中
        this.setLocationRelativeTo(null);
        //取消内部默认居中放置
        this.setLayout(null);
        //设置背景颜色
        this.getContentPane().setBackground(Color.white);
        this.setAlwaysOnTop(true);//置顶
    }
}
~~~

需求：点击go之后，在控制台有数据打印

<img src="./assets/image-20240430203851196.png" alt="image-20240430203851196" style="zoom:50%;" />

根据之前所学，我们应该给 `GO` 这个 `JButton` 添加一个点击事件。

在之前做法，是将本类 `implements ActionListener`，`go.addActionListener(this);` 表示当我们点击 `Go按钮` 后，就会执行本类里面所对应的 `actionPerformed` 方法。

~~~java
public class LoginJFrame extends JFrame implements ActionListener {
    JButton go = new JButton("Go");

    public LoginJFrame() {
        .....
    }

    //添加组件
    public void initView() {
        ....
        go.addActionListener(this);
    }

    //设置界面
    public void initJframe() {
        .....
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == go) {
            System.out.println("Go按钮被点击了");
        }
    }
}
~~~

那现在我们要用方法引用去做，此时就非常的简单了。

---

### 1）本类成员方法引用

此时我们就不需要实现 `ActionListener接口` 了。

`go.addActionListener()` 的形参其实是一个接口

<img src="./assets/image-20240501081657384.png" alt="image-20240501081657384" style="zoom:80%;" />

跟进 `ActionListener` 看看，虽然在 `ActionListener` 上面没有加 `@FunctionInterface`，但是它本身是一个接口，里面也只有一个抽象方法，因此它也是一个函数式接口。

<img src="./assets/image-20240501081730985.png" alt="image-20240501081730985" style="zoom:80%;" />

既然它是函数式接口，那么就可以在 `go.addActionListener()` 中去写方法引用了。

`ActionListener接口` 有一个 `actionPerformed()`，因此我们需要去找一个方法，它的形参是 `ActionEvent`，返回值是 `void`，方法里面干的事情就是我们这个方法里面做的判断。

Java没有给我们提供，我们可以自己写，假设我们写了一个 `method()`，此时就可以使用方法引用了。

表示当我们点击了 `go按钮` 时，就会执行 `this(本类)` 里面的 `method()`。

~~~java
public class LoginJFrame extends JFrame {
    //添加组件
    public void initView() {
        ....
        go.addActionListener(this::method);
    }
    
    public void method(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == go) {
            System.out.println("Go按钮被点击了");
        }
    }
}
~~~

这样书写可以让我们的代码阅读性得到提高。

例如这个界面中有很多独立的按钮，这样每个按钮我都可以写一个独立的方法：第一个按钮被点击了，我就执行 `method1()`；第二个按钮被点击了，我就执行 `method2()` 里面的代码。

这样来讲，代码更加的独立，以后代码要修改了，有BUG了，其他点击的逻辑就不需要看了，直接看对应的方法就行了。

并且在方法里我们也不需要判断了，因为我们知道，只有当 `go` 被点击的时候，才会执行 `method1()`。

~~~java
public void method1(ActionEvent e) {
    System.out.println("Go1按钮被点击了");
}

public void method2(ActionEvent e) {
    System.out.println("Go2按钮被点击了");
}

public void method3(ActionEvent e) {
    System.out.println("Go3按钮被点击了");
}
~~~

但是如果 `method1()` 不在本类，而是在父类里面，该怎么办呢？

----

### 2）父类成员方法引用

例如我们新写一个 `MyJFrame类`

~~~java
public class MyJFrame extends JFrame {
    public void method1(ActionEvent e) {
        System.out.println("go按钮被点击了");
    }
}
~~~

然后在 `LoginJFrame` 中继承 `MyJFrame`，并且使用 `super::方法名` 来引用父类的成员方法。

下面代码就表示我们引用的是父类中的 `method1()`

~~~java
public class LoginJFrame extends MyJFrame {
    //添加组件
    public void initView() {
        go.addActionListener(super::method1);
    }
}
~~~



----

# 47.引用构造方法

在引用之前，需要想明白一件事：我们为什么要引用构造方法？其实很简单，就是为了创建对象。

格式：`类名::new`

范例：`Student::new`

```
需求：集合里面存储姓名和年龄，要求封装成Student对象并收集到List集合中
```



~~~java
//1.创建集合对象
ArrayList<String> list = new ArrayList<>();
//2.添加数据
Collections.addAll(list, "张无忌,15", "周芷若,14", "赵敏,13", "张强,20", "张三丰,100", "张翠山,40", "张良,35", "王二麻子,37", "谢广坤,41");
//3.封装成Student对象并收集到List集合中
//String --> Student
List<Student> newList = list.stream().map(new Function<String, Student>() {
    @Override
    public Student apply(String s) {
        String[] arr = s.split(",");
        String name = arr[0];
        int age = Integer.parseInt(arr[1]);
        return new Student(name, age);
    }
}).collect(Collectors.toList());
System.out.println(newList);
~~~

接下来改写成 `方法引用`。

如果我们直接在 `map()` 中写 `Student::new`，那么会直接报错，但是又没有全部报错，只有 `new` 的地方报错了。

<img src="./assets/image-20240501085438313.png" alt="image-20240501085438313" style="zoom:80%;" />

此时就需要来对照一下 `方法引用的规则` 了。

`map()` 有函数式接口，满足；`被引用的方法必须存在`，这里就是构造方法，存在，因此满足。

但是，可以发现 `第3点` 和 `第4点` 就不满足了，`Studnet类` 中并没有形参是 `String` 的构造方法，因此在刚刚调用 `new` 的时候就报错了。

![image-20240501085615601](./assets/image-20240501085615601.png)

因此我们需要在 `Student` 中加一个构造。

这里会有一个疑问， `方法引用的规则` 要求返回值也需要保持一致，但是构造方法没有返回值怎么办？

你要想，构造方法运行完后，对象就已经有了，所以使用构造方法的时候，返回值不需要管，你只要能保证构造方法结束后，生成的对象跟抽象方法的返回值保持一致就行了。

~~~java
public Student(String str) {
    // 从str中获取name跟age，并将它赋值给成员变量的name跟age
    String[] arr = str.split(",");
    this.name = arr[0];
    this.age = Integer.parseInt(arr[1]);
}
~~~

最终代码

~~~java
List<Student> newList2 = list.stream().map(Student::new).collect(Collectors.toList());
System.out.println(newList2);
~~~

接下来带着大家看一下 `Collectors` 中 `toList()` 的源码，可以发现就是我们刚刚学习的，在底层它也是使用方法引用创建了 `ArrayList` 的对象，然后将每一个数据使用  `List` 中的 `add()` 添加到集合中。

<img src="./assets/image-20240501090417436.png" alt="image-20240501090417436" style="zoom:80%;" />



-----

# 48.类名引用成员方法

## 一、介绍

格式：`类名::成员方法`

范例：`String::substring`（表示我现在要引用的就是字符串里面的 `substring()`）

练习：集合里面一些字符串，要求变成大写后进行输出

~~~java
//1.创建集合对象
ArrayList<String> list = new ArrayList<>();
//2.添加数据
Collections.addAll(list, "aaa", "bbb", "ccc", "ddd");
//3.变成大写后进行输出
//String --> String
list.stream().map(new Function<String, String>() {
    @Override
    public String apply(String s) {
        return s.toUpperCase();
    }
}).forEach(s -> System.out.println(s));
~~~

使用 `方法引用`

~~~java
//map(String::toUpperCase)
//拿着流里面的每一个数据，去调用String类中的toUpperCase方法，方法的返回值就是转换之后的结果。
list.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));
~~~

----

## 二、规则

写完后，我们应该是有疑问的，我们将 `toUpperCase()` 和 `apply()` 对比一下。

在之前我们说过，`被引用方法的返回值` 需要跟 `抽象方法里面的形参跟返回值` 保持一致。

但是对比后发现，被引用的方法没有形参！既然形参对应不起来，那为什么可以引用？

![image-20240501092458338](./assets/image-20240501092458338.png)

因此接下来需要说一下这种方法引用它自己的规则，注意这个规则是这种方式独有的。

```java
1.需要有函数式接口
2.被引用的方法必须已经存在
3.被引用方法的形参，需要跟抽象方法的第二个形参到最后一个形参保持一致，返回值需要保持一致。
4.被引用方法的功能需要满足当前的需求

抽象方法形参的详解：
第一个参数：表示被引用方法的调用者，决定了可以引用哪些类中的方法
            在Stream流当中，第一个参数一般都表示流里面的每一个数据。
            假设流里面的数据是字符串，那么使用这种方式进行方法引用，只能引用String这个类中的方法
```

这里主要的是来看第三个规则：被引用方法的形参，需要跟抽象方法的第二个形参到最后一个形参保持一致，返回值需要保持一致。

```
第二个参数到最后一个参数：跟被引用方法的形参保持一致，如果没有第二个参数，说明被引用的方法需要是无参的成员方法
```

这个时候我们就可以对比着看，首先来看抽象方法，发现它只有一个形参，并没有第二个形参，因此它被引用的方法必须是无参的成员方法，返回值需要保持一致，并且方法的功能也是满足我们的需求的，因此 `toUpperCse()` 是满足规则的。

<img src="./assets/image-20240501093202822.png" alt="image-20240501093202822" style="zoom:80%;" />

接下来解释 `抽象方法的形参`，我们这种方式去引用方法，不是所有类里面的方法都可以引用的。

~~~java
第一个参数：表示被引用方法的调用者，决定了可以引用哪些类中的方法
            在Stream流当中，第一个参数一般都表示流里面的每一个数据。
            假设流里面的数据是字符串，那么使用这种方式进行方法引用，只能引用String这个类中的方法
~~~

例如这个例子，`apply()` 中第一个参数是 `String`，它就决定了只能引用 `String` 里面的抽象方法。

<img src="./assets/image-20240501093524997.png" alt="image-20240501093524997" style="zoom:67%;" />

~~~java
局限性：
    不能引用所有类中的成员方法。
    是跟抽象方法的第一个形参有关，这个形参是什么类型的，那么就只能引用这个类中的方法。
//拿着流里面的每一个数据，去调用String类中的toUpperCase方法，方法的返回值就是转换之后的结果。
list.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));
~~~



-----

# 49.引用数组的构造方法

格式：`数据类型[]::new`

范例：`int[]::new`，目的是创建一个 `int类型` 的数组

练习：集合中存储一些整数，收集到数组当中。

在Java底层其实有一个类，专门用来描述数组，它里面也有构造方法，当我们创建数组的时候，其实就是调用了这个构造方法。

现在我们只需要知道：引用数组的构造方法就是为了创建一个数组就行了。

~~~java
//1.创建集合并添加元素
ArrayList<Integer> list = new ArrayList<>();
Collections.addAll(list, 1, 2, 3, 4, 5);
//2.收集到数组当中
Integer[] arr = list.stream().toArray(new IntFunction<Integer[]>() {
    @Override
    public Integer[] apply(int value) {
        return new Integer[value];
    }
});
~~~

接下来就需要改写为 `方法引用` 了，在底层有一个小小的细节：创建的数组的类型，需要跟流中数据的类型保持一致。

<img src="./assets/image-20240501095725988.png" alt="image-20240501095725988" style="zoom:67%;" />

~~~java
Integer[] arr2 = list.stream()
    // 此时它会去创建一个Integer类型的数组，长度和流里面数组的个数是一样的，并把流里面的数据放到数组中
    .toArray(Integer[]::new);
System.out.println(Arrays.toString(arr2));
~~~

----

# 方法引用总结

**1、什么是方法引用？**

方法引用就是把已经有的方法拿过来用，当做函数式接口中抽象方法的方法体。

**2、`::` 是什么符号？**

`::`  该符号为引用运算符，而它所在的表达式被称为方法引用

**3、方法引用时要注意什么？**

- 应用处必须是函数式接口

剩下来的三个要求是对被引用的方法有一个限制。

- 被引用的方法必须是已经存在的

  如果它没有存在，那么还需要自己写，非常的麻烦

- 被引用方法的形参和返回值需要跟抽象方法保持一致

- 被引用方法的功能要满足当前的需求

  例如之前的 `Comparator接口` 中的 `compare()` 功能是返回一个作为判断的整数，那么被引用的方法的功能也应该是返回一个作为判断的整数。

----

方法引用一共分为以下五种

<img src="./assets/image-20240501100055057.png" alt="image-20240501100055057" style="zoom:67%;" />



-----

# 50.练习一

```
需求：
     集合中存储一些字符串的数据，比如："张无忌,15", "周芷若,14", "赵敏,13", "张强,20", "张三丰,100", "张翠山,40", "张良,35", "王二麻子,37", "谢广坤,41"。
     收集到Student类型的数组当中
```

~~~java
//1.创建集合并添加元素
ArrayList<String> list = new ArrayList<>();
Collections.addAll(list, "张无忌,15", "周芷若,14", "赵敏,13", "张强,20", "张三丰,100", "张翠山,40", "张良,35", "王二麻子,37", "谢广坤,41");
//2.先把字符串变成Student对象，然后再把Student对象收集起来
Student[] arr = list.stream().map(Student::new).toArray(Student[]::new);
//打印数组
System.out.println(Arrays.toString(arr));
~~~

----

# 51.练习二

```
需求：
    创建集合添加学生对象
    学生对象属性：name，age
    list.add(new Student("zhangsan",23));
    list.add(new Student("lisi",24));
    list.add(new Student("wangwu",25));
要求：
    获取姓名并放到数组当中
    使用方法引用完成
```



~~~java
//1.创建集合
ArrayList<Student> list = new ArrayList<>();
//2.添加元素
list.add(new Student("zhangsan",23));
list.add(new Student("lisi",24));
list.add(new Student("wangwu",25));
//3.获取姓名并放到数组当中
String[] arr = list.stream().map(new Function<Student, String>() {
    @Override
    public String apply(Student student) {
        return student.getName();
    }
}).toArray(String[]::new);
~~~

如果该改写为方法引用，我们需要知道有没有这样的一个方法满足我的要求？

可以发现是有的，在 `Student` 里面有一个 `getName()`，因此一会我们可以直接引用这个方法。

剩下来要考虑的就是：这个方法的格式跟抽象方法是不是满足。

形参虽然不一样，但是没关系，返回值是一样的！

我们在调用这种普通成员方法的时候，有两种方式：

1、`对象::方法名`，这种方式要求形参、返回值完全一样

2、`类名::方法名`，这种方式只要求：被引用的方法是跟抽象方法第二个形参后面的保持一致

由于这里没有第二个参数，因此它所引用的成员方法只能是空参的。

而且 `apply()` 的第一个形参是 `Student`，它只能调用 `Student` 里面的方法。

![image-20240501104412117](./assets/image-20240501104412117.png)

~~~java
String[] arr = list.stream().map(Student::getName).toArray(String[]::new);
System.out.println(Arrays.toString(arr));
~~~



----

# ---------------------------

# day27 IO（异常&File&综合案例）

# 52. 异常

## 一、引入

异常：就是代表程序可能出现的问题。

误区：我们现在学习的异常，不是让我们以后写代码不出现异常，而是程序出了异常之后，如何处理。

<img src="./assets/image-20240501105522285.png" alt="image-20240501105522285" style="zoom:80%;" />

在Java中有很多很多的异常，这些异常组成了异常的继承体系。

最上层的是 `Throwable`，下面有两个子类 `Error`、`Exception`，`Exception` 就是我们经常所说的异常。

<img src="./assets/image-20240501105745218.png" alt="image-20240501105745218" style="zoom:50%;" />

---

## 二、`Error`

`Error`：代表的系统级别错误（属于严重问题）。

例如：内存溢出，这就是由于内存不足而导致的错误，是属于硬件的问题，代码层面不需要管，也管不了。

系统一旦出现问题，`sun公司` 会把这些错误封装成 `Error对象`。

`Error` 是给 `sun公司` 自己用的，不是给我们程序员用的，因此我们开发人员不用管它。

-----

## 三、`Exception`

跟我们开发相关的就是右边的 `Exception`。

`Exception`：叫做异常，代表程序可能出现的问题。

当程序出现异常后，我们通常会用 `Exception` 以及它的子类来封装程序出现的问题。

程序出现问题又会分为两类

**1、`RuntimeException` 和 `它的子类`，这个我们会称之为 `运行时异常`。**

`运行时异常`：`RuntimeException及其子类`，编译阶段不会出现异常提醒。如果代码有问题，是在运行的时候出现的异常（如：数组索引越界异常）

**2、另一类，就是除了 `RuntimeException` 以外的所有异常，我们会称之为 `编译时异常`。**

编译时异常：编译阶段就会出现异常提醒的。（如：日期解析异常）

因此，在异常体系中，真正需要我们学习的，就是 `Exception和它的子类`。

<img src="./assets/image-20240501111921228.png" alt="image-20240501111921228" style="zoom:50%;" />

---

## 四、总结

**1、异常是什么？**

异常：就是代表程序可能出现的问题。

**2、异常体系的最上层父类是谁？异常分为几类？**

异常体系的最上层父类是 `Exception`，`Exception` 才是异常。

异常分为两类：编译时异常、运行时异常。

**3、编译时异常和运行时异常的区别？**

- 编译时异常：没有继承 `RuntimeException` 的异常，而是直接继承于 `Exception`。编译阶段就会有错误提示。
- 运行时异常：`RuntimeException本身和子类` 。编译阶段是没有错误提示的，而是运行的时候出现的。



---

# 53.编译时异常和运行时异常

编译时异常和运行时异常，它们两个有什么区别呢？我们先写个代码，再画个图，就恍然大悟了。

## 一、代码

### 1）编译时异常

~~~java
//编译时异常
String time = "2030年1月1日";
SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
Date date = sdf.parse(time);
System.out.println(date);
~~~

`parse()` 解析方法会有一条红色波浪线

<img src="./assets/image-20240501112253847.png" alt="image-20240501112253847" style="zoom:80%;" />

想要让代码成功运行，我们需要用鼠标点一下方法，<kbd>alt + 回车</kbd> ，然后选择第一个，这才可以。

![image-20240501112416594](./assets/image-20240501112416594.png)

我们是这样的呢？其实就是因为 `parse()` 底层有 `ParseException`，这个异常就是编译时期异常。

编译时期异常在编译阶段，必须要手动处理，否则代码报错。

-----

### 2）运行时异常

在之前我们遇到的索引越界，就是一个标准的运行时期异常。

~~~java
int[] arr = {1,2,3,4,5};
System.out.println(arr[10]); // ArrayIndexOutOfBoundsException
~~~

运行时异常在编译阶段是不会出现问题的，只有当真正运行的时候才会出现问题。

<img src="./assets/image-20240501112744570.png" alt="image-20240501112744570" style="zoom:80%;" />

运行时异常在编译阶段是不需要处理的，是代码运行时出现的异常。

---

## 二、画图

一开始我们写的是Java文件，如果我想要运行代码，首先通过 `javac` 进行编译，编译成字节码文件，这个阶段叫做编译阶段。

在这个阶段中要处理的异常叫做：编译时异常。

例如我们刚刚书写的 `ParseException`(日期解析日常)，你不处理，代码就报错，这就是它最大的特点。

---

编译完后，需要通过 `java命令` 去运行代码，那么在运行时出现的异常就是：运行时异常。

它是 `RuntimeException本身及其子类`，运行时异常它在编译阶段不需要处理，而是代码运行时出现的异常。

例如 `ArrayIndexOutOfBoundsException`(数组索引越界异常)，就算代码真的有问题了真的越界了，编译阶段也不会出现问题，只有代码运行的时候才会出现的异常。

<img src="./assets/image-20240501113647757.png" alt="image-20240501113647757" style="zoom:50%;" />

----

## 三、扩展

你觉得Java为什么这么设计呢？为什么要分`编译时异常`和`运行时异常`呢？为什么不能把所有的异常都归为一类呢？

其实是有原因的，在编译的时候Java是不会运行代码的，只会检查语法是否错误，或者做一些性能的优化。

例如定义变量的类型错了，这个就是语法错误，在编译的时候Java会检查。

<img src="./assets/image-20240501113805883.png" alt="image-20240501113805883" style="zoom:50%;" />

再比如说字符串拼接的优化机制：在编译之后，等号的右边就变成了最终的结果 `"abc"`。

![image-20240501113931814](./assets/image-20240501113931814.png)

但是如果遇到索引越界，在编译的时候它是不知道的。

例如以下代码，先获取一个随机数，再根据随机数创建相应长度的数组，获取 `10索引` 上的元素，此时只有当代码真正运行了，才能确认代码的长度，才能确定索引是否超出范围。

因此像这种运行时发生的异常，是不能放到编译时的，只能在运行的时候才能确定它是否真的超出范围。

因此，索引越界异常是属于运行时发生的异常。

----

那这样问题又来了，那为什么不把所有的异常都放在下面的运行时呢？

![image-20240501114316768](./assets/image-20240501114316768.png)

因为编译型异常更多的在于提醒程序员检查本地信息，告诉程序员：如果有问题就会出现异常。

例如：日期解析日常，`parse()` 方法底层会涉及到本地时区的相关信息。

再比如说，后面我们会用 `IO` 去读取本地文件的数据，而这个文件 `a.txt` 也是在本地操作系统中的，因此在这个代码中，它也会有编译时异常，用来提醒程序员检查本地的 `a.txt` 是否真的存在。

而下面运行时期异常，它的核心不在于提醒，它就是由于代码出错而导致程序出现的问题。

----

## 四、这两种异常在开发中都包含哪些呢？

我们可以打开一下 `API帮助文档` 看一下。

搜索 `Exception` ，这里显示的所有的都是异常，其中 `RuntimeException` 就是运行时异常。

而除了 `RuntimeException` 以外，所有的都是编译时异常。

![image-20240501115041469](./assets/image-20240501115041469.png)

点进 `RuntimeException` 看一下，可以发现它也有很多子类。

 `RuntimeException` 所有的子类都是运行时异常，都是由于我们在代码中参数写错了而出现的异常。

![image-20240501115418322](./assets/image-20240501115418322.png)

以 `IndexOutOfBoundsException` 为例，点进去看一下，可以发现它下面还有两个子类

<img src="./assets/image-20240501115506731.png" alt="image-20240501115506731" style="zoom:67%;" />

----

## 五、总结

运行时异常和编译时异常的区别？

编译时异常，在语法中，它是直接继承 `Exception`：除了 `RuntimeException和它的子类`，其他都是编译时异常。编译阶段需要进行处理，作用在于提醒程序员。

运行时异常：`RuntimeException本身和所有子类` 都是运行时异常。在编译阶段是不会报错的，是程序运行时出现的异常。

这种异常一般是由于程序员代码写错了，参数传递错误代理的问题。



-----

# 54.异常在代码中的两个作用

作用一：查询bug的关键信息

作用二：作为方法内部的一种特殊返回值，以便通知调用者底层的执行情况

---

## 作用一：查询bug的关键信息

~~~java
Student[] arr = new Student[3];// null null null

String name = arr[0].getName();
System.out.println(name);
~~~

上面这段代码就会报异常。

在看报错信息的时候，不要去看上面的蓝色部分和下面的蓝色部分，蓝色的是我们程序在运行时候的一些环境信息，需要去管它。

我们只要看中间红色的这一段就行了。

挨个来读一下：`Exception 异常` `in 在` `thread 线程` `main`，即：异常在 `main` 中出现了一个 `NullPointerException(空指针异常)` ，后面还有一堆：`Cannot invoke "com.itheima.a01myexception.Student.getName()" because "arr[0]" is null`，这一堆是异常的信息：`不能运行Student中的getName()方法 因为 arr[0] 是空的 `。

下面还有一行，这一行表示异常所在的地方：`at com.itheima.a01myexception.ExceptionDemo2.main(ExceptionDemo2.java:12)`，`在` `com.itheima.a01myexception 包名` `ExceptionDemo2 类名` `main 方法名` `ExceptionDemo2.java:12 异常所在的行数`，用鼠标点击就能跳到对应的行数。

![image-20240501121611349](./assets/image-20240501121611349.png)

那为什么 `arr[0]` 是 `null` 呢？一开始存储了一个数组，数组里面是引用数据类型，引用数据类型的初始化值就是 `null`，用 `null` 调用 `getName()` 就会报异常。

----

## 作用二：作为方法内部的一种特殊返回值，以便通知调用者底层的执行情况

**测试类**

要求年龄：（同学） 18~40岁

~~~java
//1.创建学生对象
Student s1 = new Student();
s1.setAge(50);
~~~

**Student.java**

~~~java
/**
* 设置
* @param age
*/
public void setAge(int age) {
    if(age < 18 || age > 40){
        // 之前我们是直接打印在控制台，但是直接打印的效果其实是不好的
        //因为就算赋的值超过范围，但是setAge()并没有将赋值的结果告诉给调用者，而是直接把结果打印在控制台。
        //System.out.println("年龄超出范围");
        //此时就可以使用异常解决，在setAge()中直接给调用者返回一个异常
        //throw可以理解为：抛出。这里由于是因为参数出错而导致的问题，因此我们直接抛出RuntimeException即可
        throw new RuntimeException();
    } else{
        this.age = age;
    }
}
~~~

此时它就不会在控制台中打印了，而是将信息交给调用处 `s1.setAge(50);`，此时这行代码就知道了50赋值失败。

这里它就可以进行选择了，它有两种选择方式：1、自己悄悄处理；2、打印在控制台上。

默认是打印在控制台的。

<img src="./assets/image-20240501133810464.png" alt="image-20240501133810464" style="zoom:67%;" />



-----

# 异常的处理方式

在Java中有三种需要我们知道

1、JVM默认的处理方式

如果我们在代码中没有写任何的处理方式，那么代码会将异常交给虚拟机进行处理，虚拟机会有一套默认的处理方式。

2、自己处理

3、也可以交给调用者处理，交给调用者就叫做：抛出异常

# 55.JVM虚拟机默认处理异常的方式

JVM虚拟机默认处理异常的方式：把异常的名称，异常的原因及异常出现的位置等信息输出在了控制台，而且是以红色字体打印在控制台的。

程序在这个时候就会停止了，下面的代码不会再执行了。

~~~java
System.out.println("狂踹瘸子那条好腿");
System.out.println(2/0);//算术异常 ArithmeticException
System.out.println("是秃子终会发光");
System.out.println("火鸡味锅巴");
~~~

<img src="./assets/image-20240501134353030.png" alt="image-20240501134353030" style="zoom:80%;" />



----

# 56.自己处理异常（捕获异常）

`自己处理异常` 这种方式也叫作 `捕获异常`。

~~~java
try {
    可能出现异常的代码;
} catch(异常类名 变量名) { //try里面会出什么异常，这里就需要写什么异常
    异常的处理代码;
}
~~~

目的：当代码出现异常时，可以让程序继续往下执行，不会停止虚拟机。

如下代码，如果不进行任何处理，那么一定会报数组索引越界异常的。

出现异常后，它会采取虚拟机默认的处理方案，将错误信息打印在控制台，并停止虚拟机的运行。

~~~java
int[] arr = {1, 2, 3, 4, 5, 6};
System.out.println(arr[10]);
System.out.println("看看我执行了吗？"); // 不会执行
~~~

接下来我们用 `try-catch` 的方式来处理

~~~java
int[] arr = {1, 2, 3, 4, 5, 6};
try{
    //可能出现异常的代码;
    System.out.println(arr[10]);//此处出现了异常，底层程序就会在这里创建一个ArrayIndexOutOfBoundsException对象
    //相当于 new ArrayIndexOutOfBoundsException();
    //拿着这个对象到catch的小括号中对比，看括号中的变量是否可以接收这个对象
    //如果能被接收，就表示该异常就被捕获（抓住），执行catch里面对应的代码
    //当catch里面所有的代码执行完毕，继续执行try...catch体系下面的其他代码
} catch(ArrayIndexOutOfBoundsException e){
    //如果出现了ArrayIndexOutOfBoundsException异常，我该如何处理
    System.out.println("索引越界了");
}
System.out.println("看看我执行了吗？"); // 执行
~~~



----

# 57.捕获异常灵魂四问（①②）

```

灵魂二问：如果try中可能会遇到多个问题，怎么执行？
```

## 灵魂一问：如果try中没有遇到问题，怎么执行？

如果try中没有遇到问题，会把try里面所有的代码全部执行完毕，不会执行catch里面的代码

注意：只有当出现了异常才会执行catch里面的代码

~~~java
int[] arr = {1, 2, 3, 4, 5, 6};

try {
    System.out.println(arr[0]);//1
} catch(ArrayIndexOutOfBoundsException e){
    System.out.println("索引越界了");  // 没执行
}

System.out.println("看看我执行了吗？");// 执行了
~~~

----

## 灵魂二问：如果try中可能会遇到多个问题，怎么执行？

下面代码有两句话可能会出异常，但是在 `catch` 中只捕获了 `ArrayIndexOutOfBoundsException`，你觉得代码会出问题吗？

```java
int[] arr = {1, 2, 3, 4, 5, 6};
try{
    System.out.println(arr[10]);// 这里会报ArrayIndexOutOfBoundsException
    System.out.println(2/0);// 这里会报ArithmeticException（算数异常）
}catch(ArrayIndexOutOfBoundsException e){
    System.out.println("索引越界了");
}

System.out.println("看看我执行了吗？");
```

程序运行结果如下。

代码执行过程如下：先创建数组，然后执行 `try` 里面的代码，在执行到第一句话的时候就已经出问题了，因此此时在底层会创建 `ArrayIndexOutOfBoundsException` 的对象，然后直接跳转到 `catch` 里面，下面的代码就不会再走了，因此就执行 `索引越界了`，当这句话执行完毕后，整个 `try-catch` 体系就结束了，最后执行 `看看我执行了吗？`

<img src="./assets/image-20240501140610339.png" alt="image-20240501140610339" style="zoom:67%;" />

但是这个并不是我们最为标准的答案，最为标准的答案应该是：在 `try` 中可能会遇到多个问题，那么我们就需要写多个 `catch` 与之对应，即不同的异常我们会有不同的处理方案。

~~~java
细节：如果我们要捕获多个异常，这些异常中如果存在父子关系的话，那么父类一定要写在下面（例如Exception就是异常的父类，需要写在最下面）
~~~

如果将父类异常直接写在最下面，就会直接报错。

`try-catch` 的运行规则：首先运行第 `22行` 的代码进行打印，但这行代码已经出异常了，因此Java在底层会创建一个 `ArrayIndexOutOfBoundsException` 的对象，然后拿着这个对象到下面的 `catch` 中进行匹配，它匹配的时候是从上往下一次匹配的，此时第一个 `Exception e` 就已经匹配上了，这就相当于 `Exception e = new ArrayIndexOutOfBoundsException()`，这就是继承的多态，这种方式完全可以接受，因此就会直接执行 `Exception e` 里面的代码。

这样的话，所有的异常都是可以被 `Exception` 接收的，那么下面的 `catch` 永远执行不到了。

<img src="./assets/image-20240501141426164.png" alt="image-20240501141426164" style="zoom:67%;" />

~~~java
int[] arr = {1, 2, 3, 4, 5, 6};

try {
    System.out.println(arr[10]);//ArrayIndexOutOfBoundsException
    System.out.println(2 / 0);//ArithmeticException
    String s = null;
    System.out.println(s.equals("abc"));
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("索引越界了");
} catch (NullPointerException e) {
    System.out.println("空指针异常");
} catch (Exception e) {
    System.out.println("Exception");
}

System.out.println("看看我执行了吗？");
~~~

---

## 扩展

在JDK7以前，异常都是需要分开书写的，一个 `catch` 里面只能处理一个异常信息。

但是JDK7及JDK7以后，我们可以在catch中同时捕获多个异常，中间用 `|` 进行隔开，表示如果出现了A异常或者B异常的话，采取同一种处理方案。

PS：是 `|`，不是 `||`

~~~java
try {
    System.out.println(arr[10]);//ArrayIndexOutOfBoundsException
    System.out.println(2 / 0);//ArithmeticException
    String s = null;
    System.out.println(s.equals("abc"));
} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
    System.out.println("索引越界了");
} catch (NullPointerException e) {
    System.out.println("空指针异常");
} catch (Exception e) {
    System.out.println("Exception");
}
~~~



----

# 58.捕获异常灵魂四问（③④）

## 灵魂三问：如果try中遇到的问题没有被捕获，怎么执行？

`try` 中可能会有 `ArrayIndexOutOfBoundsException异常`，但是在 `catch` 中并没有捕获到，我捕获的是 `NullPointerException`

~~~java
try {
    System.out.println(arr[10]);// ArrayIndexOutOfBoundsException
} catch (NullPointerException e) {
    System.out.println("空指针异常");
}

System.out.println("看看我执行了吗？");
~~~

运行结束后，可以发现它将异常信息以红色的字体打印在了控制台，而且下面的 `看看我执行了吗？` 并没有打印出来。

这个就是虚拟机默认处理异常的方式。

<img src="./assets/image-20240501143613931.png" alt="image-20240501143613931" style="zoom:67%;" />

因此，如果try中遇到的问题没有被捕获，相当于try...catch的代码白写了，最终还是会交给虚拟机进行处理。

接下来我们说一下它的执行过程：首先创建一个数组，然后在 `15行` 的时候出异常了，此时就会在这创建一个 `ArrayIndexOutOfBoundsException` 的对象，然后就会去看，下面有没有一个 `catch` 能接收这个对象，首先会用 `NullPointerException` 是否能接收，发现接受不了，他们两个没有父子关系。

然后再往下，发现没有其他的 `catch` 来接受 `ArrayIndexOutOfBoundsException` 了，因此最终它就会将异常信息交给虚拟机进行处理。

而虚拟机的处理方案就是：将异常的信息以红色的字体打印在控制台，并且停止程序的运行。

---

## 灵魂四问：如果try中遇到了问题，那么try下面的其他代码还会执行吗？

如果try中遇到了问题，下面的代码就不会执行了，直接跳转到对应的catch当中，执行catch里面的语句体。

但是如果没有对应catch与之匹配，那么还是会交给虚拟机进行处理。

~~~java
int[] arr = {1, 2, 3, 4, 5, 6};

try{
    System.out.println(arr[10]);
    System.out.println("看看我执行了吗？... try"); // 不执行
}catch(ArrayIndexOutOfBoundsException e){
    System.out.println("索引越界了"); // 执行
}

System.out.println("看看我执行了吗？... 其他代码"); // 执行
~~~

执行流程

<img src="./assets/image-20240501144216702.png" alt="image-20240501144216702" style="zoom:67%;" />



----

# 59.异常中的常见方法

## 一、引入

在刚刚我们已经学习了 `try-catch` 中自己捕获异常的方式。

在 `catch` 中我们对异常的处理，其实就写了一个输出语句而已。

<img src="./assets/image-20240501144415841.png" alt="image-20240501144415841" style="zoom:67%;" />

但是这不是很专业，IDEA中默认其实是用异常对象 `e` 调用了一个方法 `printStackTrace()`

<img src="./assets/image-20240501144542812.png" alt="image-20240501144542812" style="zoom:67%;" />

这个方法是异常中常见方法之一。

----

## 二、常见方法

异常中一共有三个常见方法，这些方法是定义在 `Throwable` 中的。

最常用的就是第一个方法，其他两个方法了解一下即可。

* `public void printStackTrace()`：把异常的错误信息输出在控制台

* `public String getMessage()`：返回此 `throwable` 的详细信息字符串

* `public String toString()`：返回此可抛出的简短描述

----

## 三、IDEA自动生成 `try-catch`

选中有可能出异常的代码，<kbd>ctrl + alt + T</kbd> 就会提示 `Surround With`，让你选择你想用哪个语句块去包裹这块代码.

点击第6个，可以发现它直接就自动生成了。

![image-20240501145354315](./assets/image-20240501145354315.png)

----

## 四、`public String getMessage()`

首先我们需要改一下里面的代码，在 `catch` 的形参中直接捕获的是 `Exception`，这个异常太大了，我们应该捕获实际出现的。

~~~java
int[] arr = {1, 2, 3, 4, 5, 6};
try {
    System.out.println(arr[10]);
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println(e.getMessage());
}
System.out.println("看看我执行了吗？");
~~~

程序运行结果如下：`Index 10 out of bounds for length 6`（10索引已经超过了长度为6的数组）

<img src="./assets/image-20240501145727815.png" alt="image-20240501145727815" style="zoom:67%;" />

----

## 五、`public String toString()`

返回此可抛出的简短描述

~~~java
int[] arr = {1, 2, 3, 4, 5, 6};
try {
    System.out.println(arr[10]);
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println(e.toString());
}
System.out.println("看看我执行了吗？");
~~~

可以发现它出现的是异常的名字和简短信息。

<img src="./assets/image-20240501145829981.png" alt="image-20240501145829981" style="zoom:80%;" />

----

## 六、`public void printStackTrace()`

这个方法是没有返回值的，因此我们直接调用那就行了。

~~~java
int[] arr = {1, 2, 3, 4, 5, 6};
try {
    System.out.println(arr[10]);
} catch (ArrayIndexOutOfBoundsException e) {
    e.printStackTrace();
}
System.out.println("看看我执行了吗？");
~~~

程序执行结果如下：以红色的字体打印在控制台，但是这行代码不会结束虚拟机，它仅仅是做了一个打印的操作。

1、以红色的字体打印

2、打印的信息已经包含了上面的 `getMessage()` 和 `toString()` 的结果，并且还多了一个 `异常所在的位置`

因此在以后， `printStackTrace()` 是我们最长用的，因为它所包含的信息是最多的。

<img src="./assets/image-20240501150011960.png" alt="image-20240501150011960" style="zoom:67%;" />

----

## 七、为什么 `printStackTrace()` 是以红色的字体打印的？

跟进 `printStackTrace()`。

在以前我们写输出语句的时候是 `System.out`，这个跟 `System.err` 有什么不一样呢？

可以发现它在底层是用 `System.err.println()` 进行输出，把异常的错误信息以红色字体输出在控制台中。

细节：仅仅是打印信息，不会停止程序运行。

<img src="./assets/image-20240501150328176.png" alt="image-20240501150328176" style="zoom:80%;" />

~~~java
//正常的输出语句
System.out.println(123);

//错误的输出语句（但是这个错误不是说代码错误了，而是用来打印错误信息）
System.err.println(123);
~~~

程序运行效果如下，`System.err` 会将小括号里面的内容以红色的字体进行打印。

<img src="./assets/image-20240501150442061.png" alt="image-20240501150442061" style="zoom:67%;" />

关于这种错误的输出语句方式我们了解一下就行了，我们一般是不会自己用的，都是Java的底层，或者第三方框架使用的。

而且它里面有一个小细节：当错误的输出语句跟正常的数据语句在一起打印的时候，它打印的顺序跟代码里的顺序有可能是不一样的。

多运行几次，可以发现这次跑到上面去了，要解释这个原因需要学习完多线程的知识。

<img src="./assets/image-20240501150733114.png" alt="image-20240501150733114" style="zoom:67%;" />



-----

# 60.抛出异常

## 一、概念

抛出异常会涉及到两个关键字：`throws`、`throw`。

1、`throws`

写在方法定义处，表示声明一个异常。告诉调用者，使用本方法可能会出现哪些异常。

例如以下代码，方法的后面可以加 `throws + 异常的类名` ，如果有多个异常，那么异常与异常之间应该使用逗号来进行隔开。

PS：：编译时异常必须要手动写上，运行时异常可以省略不写。

2、`throw`

写在方法内，表示结束方法，用来手动抛出异常对象，将异常对象交给调用者处理，方法中下面的代码不会再执行了。

![image-20240501155710940](./assets/image-20240501155710940.png)

-----

## 二、代码示例

需求：定义一个方法求数组的最大值

以前我们是下面这样写的

~~~java
public static void main(String[] args) {
    int[] arr = null;
    int max = 0;
    max = getMax(arr);
    System.out.println(max);
}

public static int getMax(int[] arr) {
    System.out.println("看看我执行了吗？");
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}
~~~

但是这个代码可能会有一些问题。

1、假设 `arr` 是 `null` 呢？ 

~~~java
int[] arr = null;
~~~

此时下面的方法能正常运行吗？肯定是不行的

2、假设传递长度为 `0` 的数组，也无法遍历

虽然说这样写是没有任何意义的，但是我们不能确定被人一定不会这么写。

~~~java
int[] arr = new int[0];
~~~

因此为了提高代码的健壮性，我们需要对 `getMax()` 进行以下改进。

~~~java
public static int getMax(int[] arr){
    if(arr == null){
        //手动创建一个异常对象，并把这个异常交给方法的调用者处理
        //此时方法就会结束，下面的代码不会再执行了
        throw new NullPointerException();
    }
    
    if(arr.length == 0){
        //它的意义其实跟上面是一样的，手动创建一个异常对象，并把这个异常交给方法的调用者处理
        //此时方法就会结束，下面的代码不会再执行了
        throw new ArrayIndexOutOfBoundsException();
    }

    System.out.println("看看我执行了吗？"); // 未执行
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if(arr[i] > max){
            max = arr[i];
        }
    }
    return max;
}
~~~

还没完，在方法的后面其实还可以再加 `throws`，也就是说告诉调用者，本方法有可能会出哪些异常

~~~java
public static int getMax(int[] arr) throws NullPointerException,ArrayIndexOutOfBoundsException {
}
~~~

但是 `NullPointerException,ArrayIndexOutOfBoundsException` 这两个异常又是 `RuntimeException` 的子类。

<img src="./assets/image-20240501160943469.png" alt="image-20240501160943469" style="zoom:80%;" />

因此这两个异常都是运行时异常，运行时异常我们是不需要手动声明的，这个可以省略不写。

~~~java
public static int getMax(int[] arr)/* throws NullPointerException,ArrayIndexOutOfBoundsException*/{
}
~~~

当代码真的出现这个异常了，我们需要将异常交给调用者处理，此时调用者是不能直接不管的，因此这样的话最终就会将异常交给虚拟机处理，虚拟机的处理方案就是：停止程序，并把异常信息打印在控制台，这种方式的弊端就是：下面的代码就执行不了了，程序会结束。

所以在调用处我们最好这么干：将有可能出现异常的代码选中，<kbd>ctrl + alt + T</kbd> 选择 `try-catch` 进行捕获。

在捕获的时候我们可以将空指针异常、索引越界异常进行捕获。

~~~java
int[] arr = null;
int max = 0;
try {
    // 在调用处接收到下面发送过来的异常后，就会跳转到对应的catch里面执行对应的代码
    // 这样做的好处是：就是这里的代码出异常了，但程序并没有停止，它会继续往下执行其他的代码
    max = getMax(arr);
} catch (NullPointerException e) {
    System.out.println("空指针异常");
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("索引越界异常");
}
System.out.println(max);

------------------------------------------

public static int getMax(int[] arr)/* throws NullPointerException,ArrayIndexOutOfBoundsException*/{
    if(arr == null){
        //手动创建一个异常对象，并把这个异常交给方法的调用者处理
        //此时方法就会结束，下面的代码不会再执行了
        throw new NullPointerException();
    }

    if(arr.length == 0){
        //手动创建一个异常对象，并把这个异常交给方法的调用者处理
        //此时方法就会结束，下面的代码不会再执行了
        throw new ArrayIndexOutOfBoundsException();
    }


    System.out.println("看看我执行了吗？");
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if(arr[i] > max){
            max = arr[i];
        }
    }
    return max;
}
~~~

---

# 三种异常处理方式总结

1、如果你不管，它就会采取虚拟机默认处理异常的方式：把异常的名称，异常的原因及异常出现的位置等信息输出在了控制台，而且是以红色字体打印在控制台的。

2、`try-catch`(捕获异常)：一般用在调用处，它的目的是就算代码出错，也能让代码继续往下运行。

3、抛出：`throw、throws`

在方法中，出现异常了，方法就没有继续运行下去的意义了，此时我们采取 `抛出处理`，交给调用者进行处理。

目的：让该方法结束运行，并告诉调用者方法中出现了问题。

在调用处我们一般都是捕获异常，目的就是让程序能继续运行下去。



-----

# 61.练习：键盘录入数据

~~~java
需求：
    键盘录入自己心仪的女朋友姓名和年龄。
    姓名的长度在 3 - 10之间，
    年龄的范围为 18 - 40岁,
    超出这个范围是异常数据不能赋值，需要重新录入,一直录到正确为止。
提示：
    需要考虑用户在键盘录入时的所有情况。
    比如：录入年龄时超出范围，录入年龄时录入了abc等情况
~~~

写代码前，需要知道 `抛出` 和  `捕获` 的核心思想。

`抛出`：告诉调用者出错了，因此抛出更多是写在方法里面。

`捕获`：捕获更多的是写在方法的调用处，它的核心是让程序不要停止，程序能继续运行下去。

**测试类**

~~~java
//1.创建键盘录入的对象
Scanner sc = new Scanner(System.in);
//2.创建女朋友的对象
GirlFriend gf = new GirlFriend();
//3.接收女朋友的姓名
System.out.println("请输入你心仪的女朋友的名字");
String name = sc.nextLine();
gf.setName(name);
System.out.println("请输入你心仪的女朋友的年龄");
String ageStr = sc.nextLine();
int age = Integer.parseInt(ageStr);
gf.setAge(age);

//5.打印
System.out.println(gf);
~~~

在上面代码中，如果年龄输入字符，是会报错的。

因此我们需要对这种情况进行处理，还需要对题目进行处理。

~~~java
String ageStr = sc.nextLine();
// 办法一：我们在这里写if判断是没有问题的，但是当数据量比较多的时候，这种写法太过于繁琐
if (name.length() >= 3 && name.length() <= 10) {
    gf.setName(name);
}
int age = Integer.parseInt(ageStr);
gf.setAge(age);
~~~

那该怎么办呢？在JavaBean中，有一个 `set方法`，此时我们就可以将这些判断写在 `set方法` 里面了。



**GirlFriend.java**

~~~java
public void setName(String name)  {
    int len = name.length();
    if(len < 3 || len > 10){
        throw new RuntimeException();
    }
    this.name = name;
}

public void setAge(int age) {
    if(age < 18 || age > 40){
        throw new RuntimeException();
    }
    this.age = age;
}
~~~



~~~java
//1.创建键盘录入的对象
Scanner sc = new Scanner(System.in);
//2.创建女朋友的对象
GirlFriend gf = new GirlFriend();
while (true) {
    //3.接收女朋友的姓名
    try {
        System.out.println("请输入你心仪的女朋友的名字");
        String name = sc.nextLine();
        gf.setName(name);
        //4.接收女朋友的年龄
        System.out.println("请输入你心仪的女朋友的年龄");
        // 这里不用nextInt()是因为如果它输入字符就会报错
        // 所以此时采取nextLine()，不管你录什么哪怕录的是abc，先录入到系统中，然后再来进行转换 / 判断，如果有问题，再让你重新录就行了
        String ageStr = sc.nextLine();
        int age = Integer.parseInt(ageStr);
        gf.setAge(age);
        //如果所有的数据都是正确的，那么跳出循环
        break;
    } catch (NumberFormatException e) {
        System.out.println("年龄的格式有误，请输入数字");
        //continue;
    } catch (RuntimeException e) {
        System.out.println("姓名的长度或者年龄的范围有误");
        //continue;
    }
}
//5.打印
System.out.println(gf);
~~~



-----











## 1.1 异常概念

异常，就是不正常的意思。在生活中:医生说,你的身体某个部位有异常,该部位和正常相比有点不同,该部位的功能将受影响.在程序中的意思就是：

* **异常** ：指的是程序在执行过程中，出现的非正常的情况，最终会导致JVM的非正常停止。

在Java等面向对象的编程语言中，异常本身是一个类，产生异常就是创建异常对象并抛出了一个异常对象。Java处理异常的方式是中断处理。

> 异常指的并不是语法错误,语法错了,编译不通过,不会产生字节码文件,根本不能运行.

## 1.2 异常体系

异常机制其实是帮助我们**找到**程序中的问题，异常的根类是`java.lang.Throwable`，其下有两个子类：`java.lang.Error`与`java.lang.Exception`，平常所说的异常指`java.lang.Exception`。

![](./../../../课/黑马/JAVA/入门到起飞（下）/day27-IO(异常&File&综合案例）/笔记/imgs/异常体系.png)

**Throwable体系：**

* **Error**:严重错误Error，无法通过处理的错误，只能事先避免，好比绝症。
* **Exception**:表示异常，异常产生后程序员可以通过代码的方式纠正，使程序继续运行，是必须要处理的。好比感冒、阑尾炎。

**Throwable中的常用方法：**

* 


***出现异常,不要紧张,把异常的简单类名,拷贝到API中去查。***

![](./../../../课/黑马/JAVA/入门到起飞（下）/day27-IO(异常&File&综合案例）/笔记/imgs/简单的异常查看.bmp)

## 1.3 异常分类

我们平常说的异常就是指Exception，因为这类异常一旦出现，我们就要对代码进行更正，修复程序。

**异常(Exception)的分类**:根据在编译时期还是运行时期去检查异常?

* **编译时期异常**:checked异常。在编译时期,就会检查,如果没有处理异常,则编译失败。(如日期格式化异常)
* **运行时期异常**:runtime异常。在运行时期,检查异常.在编译时期,运行异常不会编译器检测(不报错)。(如数学异常)

​    ![](./../../../课/黑马/JAVA/入门到起飞（下）/day27-IO(异常&File&综合案例）/笔记/imgs/异常的分类.png)

## 1.4 异常的产生过程解析

先运行下面的程序，程序会产生一个数组索引越界异常ArrayIndexOfBoundsException。我们通过图解来解析下异常产生的过程。

 工具类

```java
public class ArrayTools {
    // 对给定的数组通过给定的角标获取元素。
    public static int getElement(int[] arr, int index) {
        int element = arr[index];
        return element;
    }
}
```

 测试类

```java
public class ExceptionDemo {
    public static void main(String[] args) {
        int[] arr = { 34, 12, 67 };
        intnum = ArrayTools.getElement(arr, 4)
        System.out.println("num=" + num);
        System.out.println("over");
    }
}
```

上述程序执行过程图解：

 ![](./../../../课/黑马/JAVA/入门到起飞（下）/day27-IO(异常&File&综合案例）/笔记/imgs/异常产生过程.png)

## 1.5 抛出异常throw

在编写程序时，我们必须要考虑程序出现问题的情况。比如，在定义方法时，方法需要接受参数。那么，当调用方法使用接受到的参数时，首先需要先对参数数据进行合法的判断，数据若不合法，就应该告诉调用者，传递合法的数据进来。这时需要使用抛出异常的方式来告诉调用者。

在java中，提供了一个**throw**关键字，它用来抛出一个指定的异常对象。那么，抛出一个异常具体如何操作呢？

1. 创建一个异常对象。封装一些提示信息(信息可以自己编写)。

2. 需要将这个异常对象告知给调用者。怎么告知呢？怎么将这个异常对象传递到调用者处呢？通过关键字throw就可以完成。throw 异常对象。

   throw**用在方法内**，用来抛出一个异常对象，将这个异常对象传递到调用者处，并结束当前方法的执行。

**使用格式：**

```
throw new 异常类名(参数);
```

 例如：

```java
throw new NullPointerException("要访问的arr数组不存在");

throw new ArrayIndexOutOfBoundsException("该索引在数组中不存在，已超出范围");
```

学习完抛出异常的格式后，我们通过下面程序演示下throw的使用。

```java
public class ThrowDemo {
    public static void main(String[] args) {
        //创建一个数组 
        int[] arr = {2,4,52,2};
        //根据索引找对应的元素 
        int index = 4;
        int element = getElement(arr, index);

        System.out.println(element);
        System.out.println("over");
    }
    /*
     * 根据 索引找到数组中对应的元素
     */
    public static int getElement(int[] arr,int index){ 
       	//判断  索引是否越界
        if(index<0 || index>arr.length-1){
             /*
             判断条件如果满足，当执行完throw抛出异常对象后，方法已经无法继续运算。
             这时就会结束当前方法的执行，并将异常告知给调用者。这时就需要通过异常来解决。 
              */
             throw new ArrayIndexOutOfBoundsException("哥们，角标越界了```");
        }
        int element = arr[index];
        return element;
    }
}
```

> 注意：如果产生了问题，我们就会throw将问题描述类即异常进行抛出，也就是将问题返回给该方法的调用者。
>
> 那么对于调用者来说，该怎么处理呢？一种是进行捕获处理，另一种就是继续讲问题声明出去，使用throws声明处理。

## 1.6 声明异常throws

**声明异常**：将问题标识出来，报告给调用者。如果方法内通过throw抛出了编译时异常，而没有捕获处理（稍后讲解该方式），那么必须通过throws进行声明，让调用者去处理。

关键字**throws**运用于方法声明之上,用于表示当前方法不处理异常,而是提醒该方法的调用者来处理异常(抛出异常).

**声明异常格式：**

```
修饰符 返回值类型 方法名(参数) throws 异常类名1,异常类名2…{   }	
```

声明异常的代码演示：

```java
public class ThrowsDemo {
    public static void main(String[] args) throws FileNotFoundException {
        read("a.txt");
    }

    // 如果定义功能时有问题发生需要报告给调用者。可以通过在方法上使用throws关键字进行声明
    public static void read(String path) throws FileNotFoundException {
        if (!path.equals("a.txt")) {//如果不是 a.txt这个文件 
            // 我假设  如果不是 a.txt 认为 该文件不存在 是一个错误 也就是异常  throw
            throw new FileNotFoundException("文件不存在");
        }
    }
}
```

throws用于进行异常类的声明，若该方法可能有多种异常情况产生，那么在throws后面可以写多个异常类，用逗号隔开。

```java
public class ThrowsDemo2 {
    public static void main(String[] args) throws IOException {
        read("a.txt");
    }

    public static void read(String path)throws FileNotFoundException, IOException {
        if (!path.equals("a.txt")) {//如果不是 a.txt这个文件 
            // 我假设  如果不是 a.txt 认为 该文件不存在 是一个错误 也就是异常  throw
            throw new FileNotFoundException("文件不存在");
        }
        if (!path.equals("b.txt")) {
            throw new IOException();
        }
    }
}
```

## 1.7 捕获异常try…catch

如果异常出现的话,会立刻终止程序,所以我们得处理异常:

1. 该方法不处理,而是声明抛出,由该方法的调用者来处理(throws)。
2. 在方法中使用try-catch的语句块来处理异常。

**try-catch**的方式就是捕获异常。

* **捕获异常**：Java中对异常有针对性的语句进行捕获，可以对出现的异常进行指定方式的处理。

捕获异常语法如下：

```java
try{
     编写可能会出现异常的代码
}catch(异常类型  e){
     处理异常的代码
     //记录日志/打印异常信息/继续抛出异常
}
```

**try：**该代码块中编写可能产生异常的代码。

**catch：**用来进行某种异常的捕获，实现对捕获到的异常进行处理。

> 注意:try和catch都不能单独使用,必须连用。

演示如下：

```java
public class TryCatchDemo {
    public static void main(String[] args) {
        try {// 当产生异常时，必须有处理方式。要么捕获，要么声明。
            read("b.txt");
        } catch (FileNotFoundException e) {// 括号中需要定义什么呢？
          	//try中抛出的是什么异常，在括号中就定义什么异常类型
            System.out.println(e);
        }
        System.out.println("over");
    }
    /*
     *
     * 我们 当前的这个方法中 有异常  有编译期异常
     */
    public static void read(String path) throws FileNotFoundException {
        if (!path.equals("a.txt")) {//如果不是 a.txt这个文件 
            // 我假设  如果不是 a.txt 认为 该文件不存在 是一个错误 也就是异常  throw
            throw new FileNotFoundException("文件不存在");
        }
    }
}
```

如何获取异常信息：

Throwable类中定义了一些查看方法:

* `public String getMessage()`:获取异常的描述信息,原因(提示给用户的时候,就提示错误原因。


* `public String toString()`:获取异常的类型和异常描述信息(不用)。
* `public void printStackTrace()`:打印异常的跟踪栈信息并输出到控制台。

​            *包含了异常的类型,异常的原因,还包括异常出现的位置,在开发和调试阶段,都得使用printStackTrace。*

在开发中呢也可以在catch将编译期异常转换成运行期异常处理。

多个异常使用捕获又该如何处理呢？

1. 多个异常分别处理。
2. 多个异常一次捕获，多次处理。
3. 多个异常一次捕获一次处理。

一般我们是使用一次捕获多次处理方式，格式如下：

```java
try{
     编写可能会出现异常的代码
}catch(异常类型A  e){  当try中出现A类型异常,就用该catch来捕获.
     处理异常的代码
     //记录日志/打印异常信息/继续抛出异常
}catch(异常类型B  e){  当try中出现B类型异常,就用该catch来捕获.
     处理异常的代码
     //记录日志/打印异常信息/继续抛出异常
}
```

> 注意:这种异常处理方式，要求多个catch中的异常不能相同，并且若catch中的多个异常之间有子父类异常的关系，那么子类异常要求在上面的catch处理，父类异常在下面的catch处理。

## 1.8 finally 代码块

**finally**：有一些特定的代码无论异常是否发生，都需要执行。另外，因为异常会引发程序跳转，导致有些语句执行不到。而finally就是解决这个问题的，在finally代码块中存放的代码都是一定会被执行的。

什么时候的代码必须最终执行？

当我们在try语句块中打开了一些物理资源(磁盘文件/网络连接/数据库连接等),我们都得在使用完之后,最终关闭打开的资源。

finally的语法:

 try...catch....finally:自身需要处理异常,最终还得关闭资源。

> 注意:finally不能单独使用。

比如在我们之后学习的IO流中，当打开了一个关联文件的资源，最后程序不管结果如何，都需要把这个资源关闭掉。

finally代码参考如下：

```java
public class TryCatchDemo4 {
    public static void main(String[] args) {
        try {
            read("a.txt");
        } catch (FileNotFoundException e) {
            //抓取到的是编译期异常  抛出去的是运行期 
            throw new RuntimeException(e);
        } finally {
            System.out.println("不管程序怎样，这里都将会被执行。");
        }
        System.out.println("over");
    }
    /*
     *
     * 我们 当前的这个方法中 有异常  有编译期异常
     */
    public static void read(String path) throws FileNotFoundException {
        if (!path.equals("a.txt")) {//如果不是 a.txt这个文件 
            // 我假设  如果不是 a.txt 认为 该文件不存在 是一个错误 也就是异常  throw
            throw new FileNotFoundException("文件不存在");
        }
    }
}
```

> 当只有在try或者catch中调用退出JVM的相关方法,此时finally才不会执行,否则finally永远会执行。

## 1.9 异常注意事项

* 运行时异常被抛出可以不处理。即不捕获也不声明抛出。
* 如果父类抛出了多个异常,子类覆盖父类方法时,只能抛出相同的异常或者是他的子集。
* 父类方法没有抛出异常，子类覆盖父类该方法时也不可抛出异常。此时子类产生该异常，只能捕获处理，不能声明抛出
* 当多异常处理时，捕获处理，前边的类不能是后边类的父类
* 在try/catch后可以追加finally代码块，其中的代码一定会被执行，通常用于资源回收。

## 1.10 概述

**为什么需要自定义异常类:**

我们说了Java中不同的异常类,分别表示着某一种具体的异常情况,那么在开发中总是有些异常情况是SUN没有定义好的,此时我们根据自己业务的异常情况来定义异常类。,例如年龄负数问题,考试成绩负数问题。

在上述代码中，发现这些异常都是JDK内部定义好的，但是实际开发中也会出现很多异常,这些异常很可能在JDK中没有定义过,例如年龄负数问题,考试成绩负数问题.那么能不能自己定义异常呢？

**什么是自定义异常类:**

在开发中根据自己业务的异常情况来定义异常类.

自定义一个业务逻辑异常: **LoginException**。一个登陆异常类。

**异常类如何定义:**

1. 自定义一个编译期异常: 自定义类 并继承于`java.lang.Exception`。
2. 自定义一个运行时期的异常类:自定义类 并继承于`java.lang.RuntimeException`。

## 1.11 自定义异常的练习

要求：我们模拟登陆操作，如果用户名已存在，则抛出异常并提示：亲，该用户名已经被注册。

首先定义一个登陆异常类LoginException：

```java
// 业务逻辑异常
public class LoginException extends Exception {
    /**
     * 空参构造
     */
    public LoginException() {
    }

    /**
     *
     * @param message 表示异常提示
     */
    public LoginException(String message) {
        super(message);
    }
}
```

模拟登陆操作，使用数组模拟数据库中存储的数据，并提供当前注册账号是否存在方法用于判断。

```java
public class Demo {
    // 模拟数据库中已存在账号
    private static String[] names = {"bill","hill","jill"};
   
    public static void main(String[] args) {     
        //调用方法
        try{
            // 可能出现异常的代码
            checkUsername("nill");
            System.out.println("注册成功");//如果没有异常就是注册成功
        } catch(LoginException e) {
            //处理异常
            e.printStackTrace();
        }
    }

    //判断当前注册账号是否存在
    //因为是编译期异常，又想调用者去处理 所以声明该异常
    public static boolean checkUsername(String uname) throws LoginException {
        for (String name : names) {
            if(name.equals(uname)){//如果名字在这里面 就抛出登陆异常
                throw new LoginException("亲"+name+"已经被注册了！");
            }
        }
        return true;
    }
}
```

# 2. File类

## 2.1 概述

`java.io.File` 类是文件和目录路径名的抽象表示，主要用于文件和目录的创建、查找和删除等操作。

## 2.2 构造方法

- `public File(String pathname) ` ：通过将给定的**路径名字符串**转换为抽象路径名来创建新的 File实例。  
- `public File(String parent, String child) ` ：从**父路径名字符串和子路径名字符串**创建新的 File实例。
- `public File(File parent, String child)` ：从**父抽象路径名和子路径名字符串**创建新的 File实例。  
- 构造举例，代码如下：

```java
// 文件路径名
String pathname = "D:\\aaa.txt";
File file1 = new File(pathname); 

// 文件路径名
String pathname2 = "D:\\aaa\\bbb.txt";
File file2 = new File(pathname2); 

// 通过父路径和子路径字符串
 String parent = "d:\\aaa";
 String child = "bbb.txt";
 File file3 = new File(parent, child);

// 通过父级File对象和子路径字符串
File parentDir = new File("d:\\aaa");
String child = "bbb.txt";
File file4 = new File(parentDir, child);
```

> 小贴士：
>
> 1. 一个File对象代表硬盘中实际存在的一个文件或者目录。
> 2. 无论该路径下是否存在文件或者目录，都不影响File对象的创建。

## 2.3 常用方法

### 获取功能的方法

- `public String getAbsolutePath() ` ：返回此File的绝对路径名字符串。

- ` public String getPath() ` ：将此File转换为路径名字符串。 

- `public String getName()`  ：返回由此File表示的文件或目录的名称。  

- `public long length()`  ：返回由此File表示的文件的长度。 

  方法演示，代码如下：

  ```java
  public class FileGet {
      public static void main(String[] args) {
          File f = new File("d:/aaa/bbb.java");     
          System.out.println("文件绝对路径:"+f.getAbsolutePath());
          System.out.println("文件构造路径:"+f.getPath());
          System.out.println("文件名称:"+f.getName());
          System.out.println("文件长度:"+f.length()+"字节");
  
          File f2 = new File("d:/aaa");     
          System.out.println("目录绝对路径:"+f2.getAbsolutePath());
          System.out.println("目录构造路径:"+f2.getPath());
          System.out.println("目录名称:"+f2.getName());
          System.out.println("目录长度:"+f2.length());
      }
  }
  输出结果：
  文件绝对路径:d:\aaa\bbb.java
  文件构造路径:d:\aaa\bbb.java
  文件名称:bbb.java
  文件长度:636字节
  
  目录绝对路径:d:\aaa
  目录构造路径:d:\aaa
  目录名称:aaa
  目录长度:4096
  ```

> API中说明：length()，表示文件的长度。但是File对象表示目录，则返回值未指定。

### 绝对路径和相对路径

- **绝对路径**：从盘符开始的路径，这是一个完整的路径。
- **相对路径**：相对于项目目录的路径，这是一个便捷的路径，开发中经常使用。

```java
public class FilePath {
    public static void main(String[] args) {
      	// D盘下的bbb.java文件
        File f = new File("D:\\bbb.java");
        System.out.println(f.getAbsolutePath());
      	
		// 项目下的bbb.java文件
        File f2 = new File("bbb.java");
        System.out.println(f2.getAbsolutePath());
    }
}
输出结果：
D:\bbb.java
D:\idea_project_test4\bbb.java
```

### 判断功能的方法

- `public boolean exists()` ：此File表示的文件或目录是否实际存在。
- `public boolean isDirectory()` ：此File表示的是否为目录。
- `public boolean isFile()` ：此File表示的是否为文件。

方法演示，代码如下：

```java
public class FileIs {
    public static void main(String[] args) {
        File f = new File("d:\\aaa\\bbb.java");
        File f2 = new File("d:\\aaa");
      	// 判断是否存在
        System.out.println("d:\\aaa\\bbb.java 是否存在:"+f.exists());
        System.out.println("d:\\aaa 是否存在:"+f2.exists());
      	// 判断是文件还是目录
        System.out.println("d:\\aaa 文件?:"+f2.isFile());
        System.out.println("d:\\aaa 目录?:"+f2.isDirectory());
    }
}
输出结果：
d:\aaa\bbb.java 是否存在:true
d:\aaa 是否存在:true
d:\aaa 文件?:false
d:\aaa 目录?:true
```

### 创建删除功能的方法

- `public boolean createNewFile()` ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。 
- `public boolean delete()` ：删除由此File表示的文件或目录。  
- `public boolean mkdir()` ：创建由此File表示的目录。
- `public boolean mkdirs()` ：创建由此File表示的目录，包括任何必需但不存在的父目录。

方法演示，代码如下：

```java
public class FileCreateDelete {
    public static void main(String[] args) throws IOException {
        // 文件的创建
        File f = new File("aaa.txt");
        System.out.println("是否存在:"+f.exists()); // false
        System.out.println("是否创建:"+f.createNewFile()); // true
        System.out.println("是否存在:"+f.exists()); // true
		
     	// 目录的创建
      	File f2= new File("newDir");	
        System.out.println("是否存在:"+f2.exists());// false
        System.out.println("是否创建:"+f2.mkdir());	// true
        System.out.println("是否存在:"+f2.exists());// true

		// 创建多级目录
      	File f3= new File("newDira\\newDirb");
        System.out.println(f3.mkdir());// false
        File f4= new File("newDira\\newDirb");
        System.out.println(f4.mkdirs());// true
      
      	// 文件的删除
       	System.out.println(f.delete());// true
      
      	// 目录的删除
        System.out.println(f2.delete());// true
        System.out.println(f4.delete());// false
    }
}
```

> API中说明：delete方法，如果此File表示目录，则目录必须为空才能删除。

## 2.4 目录的遍历

- `public String[] list()` ：返回一个String数组，表示该File目录中的所有子文件或目录。
- `public File[] listFiles()` ：返回一个File数组，表示该File目录中的所有的子文件或目录。  

```java
public class FileFor {
    public static void main(String[] args) {
        File dir = new File("d:\\java_code");
      
      	//获取当前目录下的文件以及文件夹的名称。
		String[] names = dir.list();
		for(String name : names){
			System.out.println(name);
		}
        //获取当前目录下的文件以及文件夹对象，只要拿到了文件对象，那么就可以获取更多信息
        File[] files = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
```

> 小贴士：
>
> 调用listFiles方法的File对象，表示的必须是实际存在的目录，否则返回null，无法进行遍历。

## 2.5 综合练习

#### 练习1：创建文件夹

​	在当前模块下的aaa文件夹中创建一个a.txt文件

代码实现：

```java
public class Test1 {
    public static void main(String[] args) throws IOException {
        //需求：在当前模块下的aaa文件夹中创建一个a.txt文件

        //1.创建a.txt的父级路径
        File file = new File("myfile\\aaa");
        //2.创建父级路径
        //如果aaa是存在的，那么此时创建失败的。
        //如果aaa是不存在的，那么此时创建成功的。
        file.mkdirs();
        //3.拼接父级路径和子级路径
        File src = new File(file,"a.txt");
        boolean b = src.createNewFile();
        if(b){
            System.out.println("创建成功");
        }else{
            System.out.println("创建失败");
        }
    }
}
```

#### 练习2：查找文件（不考虑子文件夹）

​	定义一个方法找某一个文件夹中，是否有以avi结尾的电影（暂时不需要考虑子文件夹）

代码示例：

```java
public class Test2 {
    public static void main(String[] args) {
        /*需求：
             定义一个方法找某一个文件夹中，是否有以avi结尾的电影。
	        （暂时不需要考虑子文件夹）
        */

        File file = new File("D:\\aaa\\bbb");
        boolean b = haveAVI(file);
        System.out.println(b);
    }
    /*
    * 作用：用来找某一个文件夹中，是否有以avi结尾的电影
    * 形参：要查找的文件夹
    * 返回值：查找的结果  存在true  不存在false
    * */
    public static boolean haveAVI(File file){// D:\\aaa
        //1.进入aaa文件夹，而且要获取里面所有的内容
        File[] files = file.listFiles();
        //2.遍历数组获取里面的每一个元素
        for (File f : files) {
            //f：依次表示aaa文件夹里面每一个文件或者文件夹的路径
            if(f.isFile() && f.getName().endsWith(".avi")){
                return true;
            }
        }
        //3.如果循环结束之后还没有找到，直接返回false
        return false;
    }
}
```

### 练习3：（考虑子文件夹）

​	找到电脑中所有以avi结尾的电影。（需要考虑子文件夹）

代码示例：

```java
public class Test3 {
    public static void main(String[] args) {
        /* 需求：
        找到电脑中所有以avi结尾的电影。（需要考虑子文件夹）


        套路：
            1，进入文件夹
            2，遍历数组
            3，判断
            4，判断

        */

        findAVI();

    }

    public static void findAVI(){
        //获取本地所有的盘符
        File[] arr = File.listRoots();
        for (File f : arr) {
            findAVI(f);
        }
    }

    public static void findAVI(File src){//"C:\\
        //1.进入文件夹src
        File[] files = src.listFiles();
        //2.遍历数组,依次得到src里面每一个文件或者文件夹
        if(files != null){
            for (File file : files) {
                if(file.isFile()){
                    //3，判断，如果是文件，就可以执行题目的业务逻辑
                    String name = file.getName();
                    if(name.endsWith(".avi")){
                        System.out.println(file);
                    }
                }else{
                    //4，判断，如果是文件夹，就可以递归
                    //细节：再次调用本方法的时候，参数一定要是src的次一级路径
                    findAVI(file);
                }
            }
        }
    }
}
```

### 练习4：删除多级文件夹

需求： 如果我们要删除一个有内容的文件夹
	   1.先删除文件夹里面所有的内容
           2.再删除自己

代码示例：

```java
public class Test4 {
    public static void main(String[] args) {
        /*
           删除一个多级文件夹
           如果我们要删除一个有内容的文件夹
           1.先删除文件夹里面所有的内容
           2.再删除自己
        */

        File file = new File("D:\\aaa\\src");
        delete(file);

    }

    /*
    * 作用：删除src文件夹
    * 参数：要删除的文件夹
    * */
    public static void delete(File src){
        //1.先删除文件夹里面所有的内容
        //进入src
        File[] files = src.listFiles();
        //遍历
        for (File file : files) {
            //判断,如果是文件，删除
            if(file.isFile()){
                file.delete();
            }else {
                //判断,如果是文件夹，就递归
                delete(file);
            }
        }
        //2.再删除自己
        src.delete();
    }
}
```

### 练习5：统计大小

​	需求：统计一个文件夹的总大小

代码示例：

```java
public class Test5 {
    public static void main(String[] args) {
       /*需求：
            统计一个文件夹的总大小
      */


        File file = new File("D:\\aaa\\src");

        long len = getLen(file);
        System.out.println(len);//4919189
    }

    /*
    * 作用：
    *       统计一个文件夹的总大小
    * 参数：
    *       表示要统计的那个文件夹
    * 返回值：
    *       统计之后的结果
    *
    * 文件夹的总大小：
    *       说白了，文件夹里面所有文件的大小
    * */
    public static long getLen(File src){
        //1.定义变量进行累加
        long len = 0;
        //2.进入src文件夹
        File[] files = src.listFiles();
        //3.遍历数组
        for (File file : files) {
            //4.判断
            if(file.isFile()){
                //我们就把当前文件的大小累加到len当中
                len = len + file.length();
            }else{
                //判断，如果是文件夹就递归
                len = len + getLen(file);
            }
        }
        return len;
    }
}
```

### 练习6：统计文件个数

  需求：统计一个文件夹中每种文件的个数并打印。（考虑子文件夹）
            打印格式如下：
            txt:3个
            doc:4个
            jpg:6个

代码示例：

```java
public class Test6 {
    public static void main(String[] args) throws IOException {
        /*
            需求：统计一个文件夹中每种文件的个数并打印。（考虑子文件夹）
            打印格式如下：
            txt:3个
            doc:4个
            jpg:6个
        */
        File file = new File("D:\\aaa\\src");
        HashMap<String, Integer> hm = getCount(file);
        System.out.println(hm);
    }

    /*
    * 作用：
    *       统计一个文件夹中每种文件的个数
    * 参数：
    *       要统计的那个文件夹
    * 返回值：
    *       用来统计map集合
    *       键：后缀名 值：次数
    *
    *       a.txt
    *       a.a.txt
    *       aaa（不需要统计的）
    *
    *
    * */
    public static HashMap<String,Integer> getCount(File src){
        //1.定义集合用来统计
        HashMap<String,Integer> hm = new HashMap<>();
        //2.进入src文件夹
        File[] files = src.listFiles();
        //3.遍历数组
        for (File file : files) {
            //4.判断，如果是文件，统计
            if(file.isFile()){
                //a.txt
                String name = file.getName();
                String[] arr = name.split("\\.");
                if(arr.length >= 2){
                    String endName = arr[arr.length - 1];
                    if(hm.containsKey(endName)){
                        //存在
                        int count = hm.get(endName);
                        count++;
                        hm.put(endName,count);
                    }else{
                        //不存在
                        hm.put(endName,1);
                    }
                }
            }else{
                //5.判断，如果是文件夹，递归
                //sonMap里面是子文件中每一种文件的个数
                HashMap<String, Integer> sonMap = getCount(file);
                //hm:  txt=1  jpg=2  doc=3
                //sonMap: txt=3 jpg=1
                //遍历sonMap把里面的值累加到hm当中
                Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();
                for (Map.Entry<String, Integer> entry : entries) {
                    String key = entry.getKey();
                    int value = entry.getValue();
                    if(hm.containsKey(key)){
                        //存在
                        int count = hm.get(key);
                        count = count + value;
                        hm.put(key,count);
                    }else{
                        //不存在
                        hm.put(key,value);
                    }
                }
            }
        }
        return hm;
    }
}
```





















