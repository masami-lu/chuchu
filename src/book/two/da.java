package book.two;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class da {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("116.1.3.238",8888, InetAddress.getLocalHost(),8808);
        System.out.println("链接成功！");
        socket.close();
    }
}
