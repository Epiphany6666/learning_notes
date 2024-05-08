package test6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10010);
        while (true) {
            Socket socket = ss.accept();
            new Thread(new MyRunnable(socket)).start();
        }
    }
}
