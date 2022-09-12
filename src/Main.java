import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        int start = 0, end = 99;
        int[] bound = new int[100];
        int answer = random.nextInt(100);

        System.out.println("수를 결정했음. 맞춰보셈");

        int count = 1;
        while(true){
            System.out.println(start+"~"+end);
            try {
                System.out.print(count+">> ");
                int input = Integer.parseInt(br.readLine());
                bound[input-start] = 0;
                if(input == answer){
                    System.out.println("정답");
                    break;
                }
                else if(input > answer){
                    System.out.println("더 낮게");
                    end = input;
                    bound = new int[end+1];
                }
                else{
                    System.out.println("더 높게");
                    start = input;
                    bound = new int[end-start+1];
                }
                count++;
            }
            catch(NumberFormatException e){
                System.out.println("정수만 입력하셈");
                continue;
            }
            catch(IndexOutOfBoundsException e){
                System.out.println("범위를 벗어남");
                continue;
            }
        }
    }
}

