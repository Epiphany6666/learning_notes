package myfile;

import java.io.File;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {
        /**
         * 需求：在当前模块下的aaa文件夹中创建一个a.txt文件
         */
        File file = new File("mydate\\aaa");
        file.mkdirs();
        File file1 = new File(file, "a.txt");
        boolean b = file1.createNewFile();
        System.out.println(b);
    }
}
