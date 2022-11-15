package chapter20;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class TCPSocketClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
            System.out.println(socket);
            /*DataInputStream dis = new DataInputStream(socket.getInputStream());
            for (int i = 0; i < 10; i++) {
                int j = dis.readInt();
                System.out.println(j);
            }*/
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
