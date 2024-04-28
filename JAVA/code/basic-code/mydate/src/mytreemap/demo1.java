package mytreemap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class demo1 {
    public static void main(String[] args) {
        TreeMap<Character, Integer> tm = new TreeMap<>();
        String str = "aababcabcdabcde";
        for (char c : str.toCharArray()) {
            tm.put(c, tm.getOrDefault(c, 0) + 1);
        }
        Set<Map.Entry<Character, Integer>> entries = tm.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            System.out.print(entry.getKey() + "（" + entry.getValue() + "）");
        }
    }
}
