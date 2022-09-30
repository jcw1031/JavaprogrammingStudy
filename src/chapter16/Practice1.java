package chapter16;

import java.util.StringTokenizer;

public class Practice1 {
    public static void main(String[] args) {
        String str = "public static void main(String[] args)";
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(str);

        int count = 0;
        while(st.hasMoreTokens()){
            count++;
            sb.append(st.nextToken()+"\n");
        }
        System.out.println(sb);
        System.out.println("총 토큰 수 : "+count);
    }
}
