package myfile;


import java.io.File;

public class demo4 {
    /**
     * 删除一个多级文件夹
     * 如果我们要删除一个有内容的文件夹
     * 1.先删除文件夹里面所有的内容
     * 2.再删除自己
     */
    public static void main(String[] args) {
        String path = "E:\\learning_notes\\JAVA\\下\\assets";
        delete(new File(path));
    }

    private static boolean delete(File path) {
        if (path.delete()) return true;
        for (File file : path.listFiles()) {
            return delete(file);
        }
        path.delete();
        return false;
    }
}
