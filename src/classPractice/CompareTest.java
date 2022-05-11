package classPractice;
import java.util.*;

public class CompareTest {
    public static void main(String[] args) {
        int a, b;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        System.out.println("두 수 중 큰 값 : "+((a>b)?a:b));
    }
}
