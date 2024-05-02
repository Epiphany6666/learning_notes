package myfile;

import java.io.File;

public class demo3 {
    /**
     * 需求：
     *      找到电脑中所有以avi结尾的电影。（需要考虑子文件夹）
     */
    public static void main(String[] args) {
        File[] arr = File.listRoots();
        System.out.println(getAVI(arr));
    }

    private static boolean getAVI(File[] arr) {

        for (File file : arr) {
            if (file.isFile()) {
                if (file.getName().endsWith(".avi")) return false;
            } else {
                if (file.listFiles() == null) {
                    System.out.println(file);
                    return false;
                }
                return getAVI(file.listFiles());
            }
        }
        return false;
    }
}
