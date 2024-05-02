package myfile;

import java.io.File;

public class demo2 {
    /**
     * 需求：
     *    定义一个方法找某一个文件夹中，是否有以avi结尾的电影。
     *   （暂时不需要考虑子文件夹）
     */
    public static void main(String[] args) {
        String path = "E:\\learning_notes\\JAVA\\下\\assets";
        System.out.println(findAVI(path));
    }

    private static boolean findAVI(String path) {
        File file = new File(path);
        String[] list = file.list();
        for (String f : list) {
            if (f.endsWith(".avi")) {
                return true;
            }
        }
        return false;
    }
}
