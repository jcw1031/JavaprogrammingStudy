package chapter17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Exercises2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        HashMap<String, Double> map = new HashMap<>();

        String name;
        double score;
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());

            name = st.nextToken();
            score = Double.parseDouble(st.nextToken());

            map.put(name, score);
        }
        double standard;
        System.out.print("기준 : ");
        standard = Double.parseDouble(br.readLine());

        for(String key : map.keySet()){
            if(map.get(key) >= standard){
                sb.append(key+" ");
            }
        }

        System.out.println(sb);
    }
}
