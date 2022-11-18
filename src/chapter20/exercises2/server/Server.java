package chapter20.exercises2.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;

        try {
            serverSocket = new ServerSocket(9999);

            while (true) {
            socket = serverSocket.accept();
            SendThread sendThread = new SendThread(socket);
            ReceiveThread receiveThread = new ReceiveThread(socket);

            sendThread.start();
            receiveThread.start();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
