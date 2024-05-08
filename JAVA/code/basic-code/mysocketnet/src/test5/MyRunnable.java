package test5;

import java.io.*;
import java.net.Socket;

public class MyRunnable implements Runnable{
    public MyRunnable() {
    }

    @Override
    public void run() {
        Socket socket = null;
        try {
            socket = new Socket("127.0.0.1", 10010);
            BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("mysocketnet\\数组.png"));
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
            //回写数据
            socket.shutdownOutput();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("上传成功");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
