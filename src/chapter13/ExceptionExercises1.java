package chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionExercises1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int dividend;
        int divisor;

        while(true){
            System.out.print("나뉨수 : ");
            dividend = Integer.parseInt(br.readLine());
            System.out.print("나눗수 : ");
            try{
                divisor = Integer.parseInt(br.readLine());
                System.out.println("몫 : "+dividend/divisor);
                break;
            }
            catch(ArithmeticException e){
                System.out.println("0으로 나눌 수 없습니다.");
            }
        }
    }
}
