package chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExercises3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int[] input = new int[3];

        for(int i=0;i<3;i++){
            try{
                input[i] = sc.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("정수 아님. 다시 입력.");
                Object garbage = sc.next();
                i--;
            }
        }
    }
}
