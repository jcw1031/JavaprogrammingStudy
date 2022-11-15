package chapter20;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPSocketServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            Socket socket = serverSocket.accept();

            /*DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            for (int j = 0; j < 10; j++) {
                dos.writeInt(j);
            }*/
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}