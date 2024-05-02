package myfile;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo6 {
    /**
     * 需求：统计一个文件夹中每种文件的个数并打印。（考虑子文件夹）
     * 打印格式如下：
     * txt:3个
     * doc:4个
     * jpg:6个
     */
    public static void main(String[] args) {
        String path = "E:\\learning_notes\\JAVA\\下\\assets";
        File file = new File(path);
        Map<String, Integer> map = new HashMap<>();
        for (File f : file.listFiles()) {
            int idx = f.getName().lastIndexOf(".");
            String end = f.getName().substring(idx + 1);
            map.put(end, map.getOrDefault(end, 0) + 1);
        }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + "：" + entry.getValue() + "个");
        }
    }
}
