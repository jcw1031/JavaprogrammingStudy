package classPractice;
import java.util.Scanner;
class Odd{
    int sum=0, n;
    public Odd(int n){
        this.n=n;
    }
    public int sum() {
        for (int i = 1; i < n + 1; i++) {
            if(i%2!=0)
                sum += i;
        }
        return sum;
    }
}

class Even extends Odd{
    public Even(int n){
        super(n);
    }

    @Override
    public int sum() {
        for(int i=1;i<n+1;i++){
            if(i%2==0)
                sum+=i;
        }
        return sum;
    }
}
public class OddEvenTest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("n : ");
        int n=s.nextInt();
        Even e=new Even(n);
        System.out.println("Even : "+e.sum());
        Odd o=new Odd(n);
        System.out.println("Odd : "+o.sum());
    }
}
