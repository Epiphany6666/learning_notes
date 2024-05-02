package myio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) {
        //1.创建对象
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("D:\\itheima\\b.mp4");
            fos = new FileOutputStream("myio\\copy.mp4");
            //2.拷贝
            int len;
            byte[] bytes = new byte[1024 * 1024 * 5];
            while((len = fis.read(bytes)) != -1){
                fos.write(bytes,0,len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fos.close();
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
