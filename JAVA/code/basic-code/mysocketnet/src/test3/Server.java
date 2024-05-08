package test3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10010);
        Socket socket = ss.accept();
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
        ss.close();
    }
}
