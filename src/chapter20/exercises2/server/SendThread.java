package chapter20.exercises2.server;

import java.net.Socket;

public class SendThread extends Thread{
    Socket socket;

    public SendThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

    }
}
