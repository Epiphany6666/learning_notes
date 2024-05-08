package test1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10010);
        OutputStream os = socket.getOutputStream();
        while (true) {
            byte[] data = "你好你好".getBytes();
            os.write(data);
        }
    }
}
