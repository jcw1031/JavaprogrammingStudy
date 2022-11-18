package chapter20.exercises1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceiveThread extends Thread {
    private Socket socket;

    public ReceiveThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            while (true) {
                String input = in.readLine();

                if (input == null) {
                    break;
                }

                if(input != null) {
                    System.out.print(input + "  ");
                }

                if (!socket.isConnected()) {
                    break;
                }
            }
            System.out.println("종료");
            socket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

