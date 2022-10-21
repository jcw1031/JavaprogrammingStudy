import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n;
        int count = 3;
        n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n ; i++) {
            count+=4;
            for (int j = 1; j <= n-1 ; j++) {
                count+=2;
            }
        }
        System.out.println(count);
    }
}