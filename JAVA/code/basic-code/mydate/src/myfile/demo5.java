package myfile;

import java.io.File;

public class demo5 {
    /**
     * 需求：
     *    统计一个文件夹的总大小
     */
    public static void main(String[] args) {
        String path = "E:\\learning_notes\\JAVA\\下\\assets";
        count(new File(path));
    }

    private static long count(File file) {
        if (file.isFile()) return file.length();
        long len = 0;
        for (File f : file.listFiles()) {
            len += count(f);
        }
        return 0;
    }
}
