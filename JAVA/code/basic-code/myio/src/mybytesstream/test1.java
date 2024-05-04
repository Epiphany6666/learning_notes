package mybytesstream;

import java.io.*;

public class test1 {
    /**
     * 拷贝一个文件夹，考虑子文件夹
     */
    public static void main(String[] args) throws IOException {
        File file = new File("");
        copyFiles(file);
    }

    private static void copyFiles(File src) throws IOException {
        File[] files = src.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    FileInputStream fis = new FileInputStream("");
                    FileOutputStream fos = new FileOutputStream(new File("拷贝的目的地", file.getName()));
                    byte[] bytes = new byte[1024 * 1024 * 5];
                    int len;
                    while ((len = fis.read(bytes)) != -1) {
                        fos.write(bytes, 0, len);
                    }
                } else {
                    copyFiles(file);
                }
            }
        }
    }
}
