package chapter20;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPSocketReceive {
    public static void main(String[] args) {
        try {
            DatagramSocket dSocket = new DatagramSocket(9999);

            for (int i = 0; i < 10; i++) {
                byte[] buffer = new byte[9];
                DatagramPacket dPacket = new DatagramPacket(buffer, buffer.length);
                dSocket.receive(dPacket);

                String str = new String(dPacket.getData());
                System.out.println(str);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
