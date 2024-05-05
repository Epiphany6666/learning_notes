package myzipstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class demo1 {
    public static void main(String[] args) throws IOException {

        //1.创建一个File表示要解压的压缩包
        File src = new File("D:\\aaa\\bbb\\aaa.zip");
        //2.创建一个File表示解压的目的地
        System.out.println(src.getParentFile());

        //调用方法
//        unzip(src, dest);

    }

    //定义一个方法用来解压
    public static void unzip(File src, File dest) throws IOException {
        new File("D:\\aaa");
    }
}
