package mytreemap;

import java.util.Comparator;
import java.util.TreeMap;

public class mytreemap {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        tm.put(4, "dka");
        tm.put(2, "jad");
        tm.put(1, "jldjfal");
        System.out.println(tm);

    }
}
