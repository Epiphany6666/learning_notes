package a02upddemo1;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class send {
    public static void main(String[] args) throws IOException {
        boolean flag = true;
        DatagramSocket ds = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        while (flag) {
            String str = sc.nextLine();
            if ("886".equals(str)) flag = false;
            byte[] bytes = str.getBytes();
            InetAddress address = InetAddress.getByName("127.0.0.1");
            int port = 10086;
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);
            ds.send(dp);
        }
        ds.close();
    }
}
