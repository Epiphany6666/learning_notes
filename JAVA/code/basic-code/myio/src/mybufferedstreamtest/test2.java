package mybufferedstreamtest;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test2 {
    /**
     * 需求：把《出师表》的文章顺序进行恢复到一个新文件中。
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myio//csb.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("myio//csb1.txt"));

        List<String> list = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        Collections.sort(list, (i, j) -> (i.charAt(0) - j.charAt(0)));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
