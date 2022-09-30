package chapter16;

import java.util.StringTokenizer;

public class Practice2 {
    public static void main(String[] args) {
        String str = "대한민국 서울시+마포구+공덕동 185번지)";

        StringTokenizer st = new StringTokenizer(str, " +");
        StringTokenizer st2;
        StringBuilder sb = new StringBuilder();

        int count = 0;
        while(st.hasMoreTokens()){
            count++;
            /*st2 = new StringTokenizer(st.nextToken()+"\n");
            *//*count+=st2.countTokens();
            while(st2.hasMoreTokens()) {
                sb.append(st2.nextToken()+"\n");
            }*/
            sb.append(st.nextToken()+"\n");
        }
        System.out.println(sb);
        System.out.println(count);
    }
}
