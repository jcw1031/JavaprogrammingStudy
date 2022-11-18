package chapter20.exercises1;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
        Socket socket = null;

        try {
            socket = new Socket("127.0.0.1", 9999);
            System.out.println(socket);
            System.out.println("서버에 접속하였습니다...");
            System.out.print("서버의 시간 : ");

            ReceiveThread receiveThread = new ReceiveThread(socket);
            receiveThread.start();

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
