package classPractice;
class Max{
    public int test(int a, int b){
        return a>b?a:b;
    }
    public double test(double a, double b){
        return a>b?a:b;
    }
}
public class MaxValueTest {
    public static void main(String[] args) {
        Max mt=new Max();
        int r=mt.test(4, 6);
        double dr=mt.test(4.2, 6.1);
        System.out.println("정수 중 큰 값 : "+r);
        System.out.println("실수 중 큰 값 : "+dr);
    }
}
