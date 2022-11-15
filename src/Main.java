import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Main{
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://localhost:8080/user/search/all");
        URLConnection urlConnection = url.openConnection();
        System.out.println(urlConnection.getContentType());

        InputStream inputStream = urlConnection.getInputStream();

        int i = 500;
        int c;
        while(((c = inputStream.read()) != -1) &&(--i > 0)){
            System.out.print((char)c);
        }
        inputStream.close();

    }
}