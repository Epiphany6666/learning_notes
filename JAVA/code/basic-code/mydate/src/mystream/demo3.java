package mystream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class demo3 {
    public static void main(String[] args) {
        List<String> girlActor = new ArrayList<>();
        List<String> boyActor = new ArrayList<>();
        Collections.addAll(girlActor, "赵小颖,35" , "杨颖,36", "高元元,43", "张天天,31", "刘诗,35", "杨小幂,33");
        Collections.addAll(boyActor, "蔡坤坤,24" , "叶齁咸,23", "刘不甜,22", "吴签,24", "谷嘉,30", "肖梁梁,27");

        Stream stream1 = girlActor.stream()
                .skip(1)
                .filter(s -> s.split(",")[0].startsWith("杨"));

        Stream stream2 = boyActor.stream()
                .filter(s -> s.split(",")[0].length() == 3)
                .limit(2);

        Stream.concat(stream1, stream2)
                        .map(new Function<String, Actor>() {
                            @Override
                            public Actor apply(String s) {
                                return new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1]));
                            }
                        })
                                .forEach(s -> System.out.println(s));

//        Stream.concat(girlActor.stream(), boyActor.stream())
//                .forEach(s -> System.out.println(s.split(",")[0]));
//
//        List<Actor> actors = new ArrayList<>();
//                Stream.concat(girlActor.stream(), boyActor.stream())
//                .forEach(s -> actors.add(new Actor()));
//        System.out.println(actors);
    }
}
