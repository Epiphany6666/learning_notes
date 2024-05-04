package mybytesstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringJoiner;

public class test3 {
    /**
     * 文本文件中有以下的数据：
     *     2-1-9-4-7-8
     * 将文件中的数据进行排序，变成以下的数据：
     *     1-2-4-7-8-9
     * @param args
     */
    public static void main(String[] args) throws IOException {
//        FileWriter fw = new FileWriter("myio\\a.txt");
//        fw.write("2-1-9-4-7-8");
        FileReader fr = new FileReader("myio\\a.txt");
        StringBuilder sb = new StringBuilder();
        int b;
        while ((b = fr.read()) != -1) {
            sb.append((char)b);
        }
        System.out.println(sb);
        fr.close();
//        fw.close();
        Integer[] arr = Arrays.stream(sb.toString().split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);
        FileWriter fw = new FileWriter("myio\\a.txt");
//        fw.write(arr.toString().replace(",", "-").substring(1, len - 1));

    }
}
