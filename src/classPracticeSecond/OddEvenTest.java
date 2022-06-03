package classPracticeSecond;
import java.util.*;

class Odd{
    int n;
    int sum=0;
    public Odd(int n){
        this.n=n;
    }

    public int sum(){
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }

}
class OddEven extends Odd{
    public OddEven(int n){
        super(n);
    }
    public int sum(){
        for(int i=0;i<=n;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        return sum;
    }
}

public class OddEvenTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("n : ");
        int n=s.nextInt();
        Odd o = new Odd(n);
        OddEven e = new OddEven(n);

        System.out.println(o.sum());
        System.out.println(e.sum());
    }
}
