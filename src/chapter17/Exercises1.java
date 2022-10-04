package chapter17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Exercises1 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();

        String key;
        int value;
        while(true){
            System.out.print("국가와 인구 : ");
            st = new StringTokenizer(br.readLine());
            key = st.nextToken();
            if(key.equals("그만")){
                break;
            }
            value = Integer.parseInt(st.nextToken());
            map.put(key, value);
        }

        String search;
        while(true){
            System.out.print("인구 검색 : ");
            search = br.readLine();
            if(search.equals("그만")){
                break;
            }
            System.out.println(map.get(search));
        }
    }
}
