package myarrays;

import java.util.Arrays;
import java.util.Comparator;

public class demo5 {
    public static void main(String[] args) {
        // 1.创建三个女朋友的对象
        GirlFriend girlFriend1 = new GirlFriend("xiaoshishi", 18, 1.67);
        GirlFriend girlFriend2 = new GirlFriend("xiaodandan", 19, 1.72);
        GirlFriend girlFriend3 = new GirlFriend("xiaohuihui", 19, 1.78);

        // 2.定义数组存储女朋友的信息
        GirlFriend[] arr = new GirlFriend[3];

        // 3.利用Arrays中的sort方法进行排序
        /*Arrays.sort(arr, new Comparator<GirlFriend>() {
            @Override
            public int compare(GirlFriend o1, GirlFriend o2) {
                // 按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序
                double tmp = o1.getAge() - o2.getAge();
                tmp = tmp == 0 ? o1.getHeight() - o2.getHeight() : tmp;
                tmp = tmp == 0 ? o1.getName().compareTo(o2.getName()) : tmp;
                if (tmp > 0) {
                    return 1;
                } else if (tmp < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });*/


        Arrays.sort(arr, (GirlFriend o1, GirlFriend o2) -> {
                // 按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序
                double tmp = o1.getAge() - o2.getAge();
                tmp = tmp == 0 ? o1.getHeight() - o2.getHeight() : tmp;
                tmp = tmp == 0 ? o1.getName().compareTo(o2.getName()) : tmp;
                if (tmp > 0) {
                    return 1;
                } else if (tmp < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        );
    }
}

class GirlFriend {
    private String name;
    private int age;
    private double height;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
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
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * 设置
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    public String toString() {
        return "GirlFriend{name = " + name + ", age = " + age + ", height = " + height + "}";
    }
}