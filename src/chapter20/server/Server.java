package chapter20.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args){
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            Socket socket = serverSocket.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("연결");

            while (true) {
                String input = in.readLine();
                if (input.equalsIgnoreCase("bye")) {
                    System.out.println("연결 종료");
                    break;
                }

                System.out.println("클라이언트 >> " + input);
                System.out.print("전송할 메시지 :  ");
                String output = br.readLine();

                out.write(output);
                out.flush();
            }

            socket.close();
            br.close();
            out.close();
            in.close();
            serverSocket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
