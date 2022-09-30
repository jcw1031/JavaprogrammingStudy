package chapter16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;
import java.util.StringTokenizer;

public class Practice4Time{
    public static void main(String[] args) throws IOException {
        String birth;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("1번째 날짜 : ");
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        int firstYear = Integer.parseInt(st.nextToken());
        int firstMonth =Integer.parseInt(st.nextToken());
        int firstDay = Integer.parseInt(st.nextToken());

        System.out.print("2번째 날짜 : ");
        st = new StringTokenizer(br.readLine(), "-");
        int secondYear = Integer.parseInt(st.nextToken());
        int secondMonth =Integer.parseInt(st.nextToken());
        int secondDay = Integer.parseInt(st.nextToken());

        LocalDate ld1 = LocalDate.of(firstYear, firstMonth, firstDay);
        LocalDate ld2 = LocalDate.of(secondYear, secondMonth, secondDay);

        Period p = ld1.until(ld2);
        System.out.println("날짜의 차이는 "+p);
    }
}
