package chapter17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class Exercises3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Vector<Integer> vector = new Vector<>();

        int rainfall;
        while(true){
            System.out.print("강수량 : ");
            rainfall = Integer.parseInt(br.readLine());
            if(rainfall == 0){
                break;
            }
            vector.add(rainfall);
            System.out.println(vector);
            int avg = 0;
            for(int i=0;i<vector.size();i++){
                avg+=vector.get(i);
            }
            avg = avg/vector.size();
            System.out.println("현재 평균 : "+avg);
        }
    }
}
