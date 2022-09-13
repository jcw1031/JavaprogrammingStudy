import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        FileOutputStream fos = new FileOutputStream("data.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeChar('a');
        dos.writeBoolean(true);
        dos.writeLong(Long.MAX_VALUE);

        dos.close();
        fos.close();
    }
}