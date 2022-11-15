package chapter20;

import java.io.IOException;
import java.net.*;

public class UDPSocketSend {
    public static void main(String[] args) {
        try {
            DatagramSocket dSocket = new DatagramSocket();
            String message = "asfasfsdf";
            byte[] buffer = message.getBytes();

            DatagramPacket dPacket = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(), 9999);
            dSocket.send(dPacket);
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
