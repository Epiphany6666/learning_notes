package mybufferedstreamtest;

import java.io.*;

public class test1 {
    public static void main(String[] args) throws IOException {
        /**
         * 四种拷贝方式效率对比
         */
        //1.字节流（一次读取一个字节）
        long start1 = System.currentTimeMillis();
        FileInputStream fis1 = new FileInputStream("myio\\a.txt");
        FileOutputStream fos1 = new FileOutputStream("myio\\b.txt");

        int b;
        while ((b = fis1.read()) != -1) {
            fos1.write(b);
        }

        fos1.close();
        fis1.close();
        long end1 = System.currentTimeMillis();
        System.out.println("字节流（一次读取一个字节）：" + (end1 - start1));



        //2。字节流（一次读取一个字节数组）
        long start2 = System.currentTimeMillis();
        FileInputStream fis2 = new FileInputStream("myio//a.txt");
        FileOutputStream fos2 = new FileOutputStream("myio//b.txt");

        // 一次读取一个byte数组
        byte[] bytes = new byte[1024 * 1024 * 5];
        int len;
        while ((len = fis2.read(bytes)) != -1) {
            fos2.write(bytes, 0, len);
        }

        fos2.close();
        fis2.close();
        long end2 = System.currentTimeMillis();
        System.out.println("字节流（一次读取一个字节数组）：" + (end2 - start2));

        //3.字节缓冲流（一次读取一个字节）
        long start3 = System.currentTimeMillis();
        BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream("myio//a.txt"));
        BufferedOutputStream bos1 = new BufferedOutputStream(new FileOutputStream("myio//b.txt"));

        int ch;
        while ((ch = bis1.read()) != -1) {
            bos1.write(ch);
        }

        bos1.close();
        bis1.close();
        long end3 = System.currentTimeMillis();
        System.out.println("字节缓冲流（一次读取一个字节）：" + (end3 - start3));

        //4。字节缓冲流（一次读取一个字节数组）
        long start4 = System.currentTimeMillis();
        BufferedInputStream bis2 = new BufferedInputStream(new FileInputStream("myio//a.txt"));
        BufferedOutputStream bos2 = new BufferedOutputStream(new FileOutputStream("myio//b.txt"));

        int l;
        while ((l = bis2.read(bytes)) != -1) {
            bos2.write(bytes, 0, l);
        }
        bos2.close();
        bis2.close();
        long end4 = System.currentTimeMillis();
        System.out.println("字节缓冲流（一次读取一个字节数组）：" + (end4 - start4));
    }
}
