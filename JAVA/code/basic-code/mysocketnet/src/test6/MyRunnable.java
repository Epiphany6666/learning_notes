package test6;

import java.io.*;
import java.net.Socket;

public class MyRunnable implements Runnable{
    Socket socket;

    public MyRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("mysocketnet\\copy.png"));
            byte[] bytes = new byte[1024];
            int b;
            while ((b = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, b);
            }
            bos.close();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("上传成功");
            bw.newLine();
            bw.flush();
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
