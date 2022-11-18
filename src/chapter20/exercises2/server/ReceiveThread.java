package chapter20.exercises2.server;

import java.io.*;
import java.net.Socket;

public class ReceiveThread extends Thread{
    Socket socket;

    public ReceiveThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
