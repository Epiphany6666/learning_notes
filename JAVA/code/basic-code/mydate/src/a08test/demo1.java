package a08test;

import java.util.*;
import java.util.function.BiConsumer;

public class demo1 {
    public static void main(String[] args) {
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
        hm.put("江苏省", city1);
        hm.put("湖北省", city2);
        hm.put("河北省", city3);

        // 键找值
        Set<String> set1 = hm.keySet();
        for (String province : set1) {
            StringBuilder sb = new StringBuilder();
            sb.append(province + " = ");
            StringJoiner sj = new StringJoiner("，");
            for (String city : hm.get(province)) {
                sj.add(city);
            }
            sb.append(sj.toString());
            System.out.println(sb.toString());
        }

        // 一次性获取所有键值
        for (Map.Entry<String, ArrayList<String>> entry : hm.entrySet()) {
            String province = entry.getKey();
            ArrayList<String> city = entry.getValue();
            StringBuilder sb = new StringBuilder();
            sb.append(province + " = ");
            StringJoiner sj = new StringJoiner("，");
            for (String c : city) {
                sj.add(c);
            }
            sb.append(sj.toString());
            System.out.println(sb.toString());
        }

        // Lambda表达式
        hm.forEach((province, city) -> {
            StringBuilder sb = new StringBuilder();
            sb.append(province + " = ");
            StringJoiner sj = new StringJoiner("，");
            for (String c : city) {
                sj.add(c);
            }
            sb.append(sj.toString());
            System.out.println(sb.toString());
        });
    }
}
