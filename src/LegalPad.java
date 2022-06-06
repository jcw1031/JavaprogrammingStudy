import java.util.*;

class Odd{
    int sum=0;
    int n;
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
        for(int i=1;i<=n;i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

public class LegalPad{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("n : ");
        int n=s.nextInt();

        Odd o=new Odd(n);
        System.out.println(o.sum());

        o=new OddEven(n);
        System.out.println(o.sum());
    }
}