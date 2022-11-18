package chapter20.exercises1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;

        try {
            System.out.println("타임서버입니다.");
            serverSocket = new ServerSocket(9999);
            socket = serverSocket.accept();
            System.out.println("연결되었습니다.");
            System.out.println("500ms마다 수를 보냅니다.");

            SendThread sendThread = new SendThread(socket);

            sendThread.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
